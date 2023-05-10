import Test.QuickCheck
import System.Environment

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

data SmartSpeaker = SmartSpeaker Int String String Float String

instance Arbitrary SmartSpeaker where 
    arbitrary = genSmartSpeaker

instance Show SmartSpeaker where
    show (SmartSpeaker a b c d e) = show a ++ "," ++ b ++ "," ++ c ++ "," ++ show d ++ "," ++ e

genSmartSpeaker :: Gen SmartSpeaker
genSmartSpeaker = do volume <- choose (0,100)
                     estacao <- listOf1 $ choose('a','z')
                     marca <- listOf1 $ choose('a','z')
                     consumo <- choose(0.0,10.0)
                     id <- listOf1 $ elements "123456789" 
                     return (SmartSpeaker volume estacao marca consumo ("Speaker"++id))

data Divisao = Divisao String [SmartCamera] [SmartSpeaker] [SmartBulb]

instance Arbitrary Divisao where 
    arbitrary = genDivisoes

instance Show Divisao where
    show (Divisao a dev1 dev2 dev3) = "Divisao:" ++ a ++ "\n" ++ aux dev1 ++ aux dev2 ++ aux dev3    
        where aux (h:[]) = show h
              aux (h:t) = show h ++ "\n" ++ aux t

genDivisoes :: Gen Divisao
genDivisoes = do d <- listOf1 $ choose('a','z')
                 dev1 <- listOf1 $ genSmartCamera
                 dev2 <- listOf1 $ genSmartBulb
                 dev3 <- listOf1 $ genSmartSpeaker
                 return (Divisao d dev1 dev3 dev2)

data Casa = Casa String String String String String [Divisao]

instance Arbitrary Casa where 
    arbitrary = genCasa

instance Show Casa where
    show (Casa prop nif forn id morada divs) = "Casa:" ++ prop ++ "," ++ nif ++ "," ++ forn ++ "," ++ id ++ "," ++ morada ++ "\n" ++ aux divs
        where aux (h:[]) = show h
              aux (h:t) = show h ++ "\n" ++ aux t

genCasa :: Gen Casa
genCasa = do proprietario <- listOf1 $ choose('a','z')
             nif <- vectorOf 9 $ elements "123456789"
             fornecedor <- elements fornecedores
             id <- listOf1 $ elements "123456789"
             morada <- listOf1 $ choose('a','z')
             divs <- listOf1 $ arbitrary
             return (Casa proprietario nif fornecedor ("Casa"++id) morada divs)

main = do
    fornecedor <- generate (vectorOf 10 genFornecedor)
    houses <- generate (vectorOf 10 genCasa)
    writeFile "smart_home_data.txt" (unlines (map show fornecedor))
    appendFile "smart_home_data.txt" (unlines (map show houses))