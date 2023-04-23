import Test.QuickCheck

fornecedores :: [String]
fornecedores = ["EDP Comercial","Galp Energia","Iberdrola","Endesa","Gold Energy","Coopernico","Enat","YIce","Meo Energia","Muon","Luzboa","Energia Simples","SU Eletricidade","EDA"]

genFornecedor :: Gen (String,Float)
genFornecedor =  do s <- elements fornecedores
                    f <- choose(0.0,1.0)
                    return (s,f)

genSmartBulb :: Gen (String,Int,Float,String)
genSmartBulb = do mode <- elements ["Warm","Neutral","Cold"]
                  dim <- choose (0,20)
                  intensidade <- choose (0.0,10.0)
                  id <- listOf1 $ elements "123456789" 
                  return (mode,dim,intensidade,"Bulb" ++ id)

data Resolucao = Resolucao Int Int 

instance Arbitrary Resolucao where 
    arbitrary = genResolucao

instance Show Resolucao where
    show (Resolucao x y) = show x ++ "x" ++ show y

genResolucao = do res1 <- choose(1,5000)
                  res2 <- choose(1,5000)
                  return (Resolucao res1 res2)

genSmartCamera :: Gen (Resolucao,Int,Float,String)
genSmartCamera = do res <- arbitrary
                    tamanho <- choose(0,200)
                    consumo <- choose(0.0,10.0)
                    id <- listOf1 $ elements "123456789" 
                    return (res,tamanho,consumo, "Camera" ++ id)

genSmartSpeaker :: Gen (Int,String,String,Float,String)
genSmartSpeaker = do volume <- choose (0,100)
                     estacao <- listOf1 $ choose('a','z')
                     marca <- listOf1 $ choose('a','z')
                     consumo <- choose(0.0,10.0)
                     id <- listOf1 $ elements "123456789" 
                     return (volume,estacao,marca,consumo,"Speaker"++id)

genDivisoes :: Gen String
genDivisoes = do d <- listOf1 $ choose('a','z')
                 return ("Divisao:" ++ d)

genCasa :: Gen (String,String,String,String,String)
genCasa = do proprietario <- listOf1 $ choose('a','z')
             nif <- vectorOf 9 $ elements "123456789"
             fornecedor <- elements fornecedores
             id <- listOf1 $ elements "123456789"
             morada <- listOf1 $ choose('a','z')
             return (proprietario,nif,fornecedor,"Casa"++id,morada)
            