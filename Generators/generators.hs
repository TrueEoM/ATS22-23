import Test.QuickCheck

fornecedores :: [String]
fornecedores = ["EDP Comercial","Galp Energia","Iberdrola","Endesa","Gold Energy","Coopernico","Enat","YIce","Meo Energia","Muon","Luzboa","Energia Simples","SU Eletricidade","EDA"]

data Fornecedor = Fornecedor String Float

instance Arbitrary Fornecedor where 
    arbitrary = genFornecedor

instance Show Fornecedor where
    show (Fornecedor x y) = x ++ "," ++ show y

genFornecedor :: Gen Fornecedor
genFornecedor =  do s <- elements fornecedores
                    f <- choose(0.0,1.0)
                    return (Fornecedor s f)

data SmartBulb = SmartBulb String Int Float String

instance Arbitrary SmartBulb where 
    arbitrary = genSmartBulb

instance Show SmartBulb where
    show (SmartBulb a b c d) = a ++ "," ++ show b ++ "," ++ show c ++ "," ++ d

genSmartBulb :: Gen SmartBulb
genSmartBulb = do mode <- elements ["Warm","Neutral","Cold"]
                  dim <- choose (0,20)
                  intensidade <- choose (0.0,10.0)
                  id <- listOf1 $ elements "123456789" 
                  return (SmartBulb mode dim intensidade ("Bulb" ++ id))

data Resolucao = Resolucao Int Int 

instance Arbitrary Resolucao where 
    arbitrary = genResolucao

instance Show Resolucao where
    show (Resolucao x y) = show x ++ "x" ++ show y

genResolucao = do res1 <- choose(1,5000)
                  res2 <- choose(1,5000)
                  return (Resolucao res1 res2)

data SmartCamera = SmartCamera Resolucao Int Float String

instance Arbitrary SmartCamera where 
    arbitrary = genSmartCamera

instance Show SmartCamera where
    show (SmartCamera a b c d) = show a ++ "," ++ show b ++ "," ++ show c ++ "," ++ d

genSmartCamera :: Gen SmartCamera
genSmartCamera = do res <- arbitrary
                    tamanho <- choose(0,200)
                    consumo <- choose(0.0,10.0)
                    id <- listOf1 $ elements "123456789" 
                    return (SmartCamera res tamanho consumo ("Camera" ++ id))

genSmartSpeaker :: Gen (Int,String,String,Float,String)
genSmartSpeaker = do volume <- choose (0,100)
                     estacao <- listOf1 $ choose('a','z')
                     marca <- listOf1 $ choose('a','z')
                     consumo <- choose(0.0,10.0)
                     id <- listOf1 $ elements "123456789" 
                     return (volume,estacao,marca,consumo,"Speaker"++id)

data SmartDevice = SmartCamera | SmartSpeaker | SmartBulb

data Divisao = Divisao String [SmartDevice]

instance Arbitrary Divisao where 
    arbitrary = genDivisoes

instance Show Divisao where
    show (Divisao a) = "Divisao:" ++ a

genDivisoes :: Gen Divisao
genDivisoes = do d <- listOf1 $ choose('a','z')
                 dev <- (listOf1 $ genSmartCamera) ++ (listOf1 $ genSmartBulb) ++ (listOf1 $ genSmartSpeaker)
                 return (Divisao d dev)

data Casa = Casa String String String String String [Divisao]

instance Arbitrary Casa where 
    arbitrary = genCasa

instance Show Casa where
    show (Casa prop nif forn id morada divs) = "Casa:" ++ prop ++ "," ++ nif ++ "," ++ forn ++ "," ++ id ++ "," ++ morada ++ show divs

genCasa :: Gen Casa
genCasa = do proprietario <- listOf1 $ choose('a','z')
             nif <- vectorOf 9 $ elements "123456789"
             fornecedor <- elements fornecedores
             id <- listOf1 $ elements "123456789"
             morada <- listOf1 $ choose('a','z')
             divs <- listOf1 $ arbitrary
             return (Casa proprietario nif fornecedor ("Casa"++id) morada divs)


createForn :: Int -> String
auxForn n = show genFornecedor ++ "\n" ++ auxForn n-1

createCasas :: Int -> String
createLog n = show genCasa ++ "\n" ++ createCasas n-1

main = do
    [path, n] <- getArgs
    s <- createForn n ++ "\n" ++ createCasas n
    show s
