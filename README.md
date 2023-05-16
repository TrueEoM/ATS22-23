Elementos do Grupo:
Tom ́as Ferreira de Sousa Dias - A89486
Pedro Alexandre da Silva Oliveira - A98712
Eduardo Fernando Cruz Henriques - A9318

• /Generators
        – /HypothesisClasses
                ∗ Casa.py
                ∗ Divisao.py
                ∗ Fornecedor.py
                ∗ SmartBulb.py
                ∗ SmartCamera.py
                ∗ SmartSpeaker.py
        – generator.py
        – generators.hs
• /src
        – /main/java
                ∗ /Model/... (CODIGO FONTE)
                ∗ Main.java
                ∗ Menu.java
                ∗ UI.java
        – /test
                ∗ ... (CODIGO TESTES)
• /target
        – /pit-reports
        ∗ index.html
• pom.xml
• README.txt


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        MANUAL DA APLICAÇÃO DE CASAS INTELIGENTES - ANÁLISE DE PROJETOS 22-23
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

ESTRUTURA PRINCIPAL:

A-> Geração de logs;

B-> Funcionalidades e uso de aplicação;

%%%%%%%%
% A- GERAÇÃO DE FICHEIROS DE LOGS
%%%%%%%%

Nota: Os parâmetros dos geradores(quantidade de casas, divisões e dispositivos) terão de ser ajustados no código, em ambos os métodos de geração de ficheiros.
O ficheiro de logs contém a lista de fornecedores existentes nas primeiras X linhas, sendo X o nº de fornecedores. Depois irá começar a gerar as casas. 

1) Navegar para a diretoria /Generators
2) Escolher gerador a utilizar
2.1)[Haskell - quickCheck]
        2.1.1) Carregar o ficheiro "generators.hs" no GHCI
        2.2.1) Executar main. O ficheiro de logs será gerado na diretoria /Generators com o nome "logs.txt"
2.2)[Python - Hypothesis]
        2.2.1) Carregar o ficheiro "generator.py" no python3(terminal), ou no Pycharm/Vscode. O ficheiro vai ter de aceder ás classes dentro
        da diretoria \hypothesisClasses
        2.2.2) Executar main. O ficheiro de logs será gerado na diretoria /Generators com o nome "py_logs.txt"
           


%%%%%%%%
% B -APP PRINCIPAL
%%%%%%%%

A aplicação é executada pelo Main.java. A versão mínima do Java necessária é o Java 8.

O menu imprimido no ecrã quando a aplicação é executada é o seguinte:

 ***********************************-SmartHouses-***************************************
| * 1 -Casa que mais gastou num período de tempo
| * 2 -Comercializador com maior volume de facturação
| * 3 -Listagem de facturas emitidas por um comercializador
| * 4 -Ordenação dos maiores consumidores de energia durante um período de tempo
| * 5 -Casas
| * 6 -Fornecedores
| * 7 -Salvar estado
| * 8 -Carregar estado
| * 9 -Carregar do ficheiro logs.txt
| * 10 -Alterar data
| * 11 -Automatizar
| * 12 -Sair da aplicação
_______________________________________________________________________________________
Digite a opção:

As opções disponíveis para digitar são:

%%%
%1 -Casa que mais gastou num período de tempo
%%%

Digitar a data de início, e depois a data de fim (formato AAAA-MM-DD HH:HH).
 Exemplo:
  2000-01-01 00:00
  2001-04-03 13:00

%%%
%2 -Comercializador com maior volume de facturação
%%%

Digitar a data de início, e depois a data de fim (formato AAAA-MM-DD HH:HH).
 Exemplo:
  2003-10-10 01:01
  2003-12-12 02:02

%%%
%3 -Listagem de facturas emitidas por um comercializador
%%%

Digitar ID do fornecedor. Fornecedores disponiveis:

EDP Comercial
Galp Energia
Iberdrola
Endesa
Gold Energy
Coopernico
Enat
YIce"
MEO Energia
Muon
Luzboa
Energia Simples"
SU Electricidade
EDA

%%%
%4 -Ordenação dos maiores consumidores de energia durante um período de tempo
%%%

(mesmos parametros que opcao 1 e 2)

%%%
%5 -Casas
%%%

Digite o ID da casa. São disponibilizadas várias informações sobre a casa.
 Exemplo:
  casa1


%%%
%6 -Fornecedores
%%%

Digite o ID do fornecedor. São disponibilizadas várias informações sobre a casa.

%%%
%7 -Salvar estado
%%%

(indisponivel - nao foi implementado corretamente)

%%%
%8 -Carregar estado
%%%

(indisponivel - nao foi implementado corretamente)

%%%
%9 -Carregar a partir de logs.txt
%%%

Carregar dados a partir de um ficheiro. Terá de ser colocado na diretoria root do projeto(WORKING_DIRECTORY).

Por exemplo:

ATS22-23/logs.txt

O formato dos ficheiros está no relatório, ou pode usar os geradores de logs para gerar os ficheiros (explicados na secção a seguir)

%%%
%10 - Alterar data
%%%

Alterar a data atual. Por defeito, a data atual será a data presente.

%%%
%11 - Automatizar
%%%

Carregar as instruções a partir de um ficheiro e o ficheiro irá tentar executá-las.Terá de ser colocado na diretoria root do projeto(WORKING_DIRECTORY).

Por exemplo:

ATS22-23/simulacao.txt

Estrutura possível de um ficheiro de simulação:

2022-07-18 11:08,casa,casa14,ligaDesliga,bulb284,on
2022-07-19 12:23,casa,casa2,ligaDesliga,cam20,On
2022-07-19 15:00,casa,casa13,setAllDevicesHome,,on
2022-07-20 15:00,casa,casa2,setAllDevicesHome,Sala de Estar,on
2022-07-21 15:00,casa,casa2,adicionaBulb,aaa,1,3,2.4,Sala de Estar,on
2022-07-21 18:00,casa,casa2,removeDispositivo,aaa,,Sim
2022-07-21 21:00,casa,casa2,adicionaCamera,aaa,1,(3x4),2.4,Quarto,on
2022-07-21 22:00,casa,casa2,adicionaSpeaker,bbb,10,Goodis,Cidade FM,2.4,Quarto,on
2022-07-22 18:00,casa,casa2,removeDispositivo,aaa,Sala de Estar 2,nao
2022-07-23 22:00,casa,casa17,alteraFornecedor,EDP Comercial,false
2022-08-19 12:23,casa,casa6,tonBulb,bulb128,1,false
2022-08-21 12:23,casa,casa6,volSpk,speaker33,1,false

%%%
%12 -Sair da aplicação
%%%

Sair