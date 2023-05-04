import random
import sys
import warnings
from hypothesis.errors import NonInteractiveExampleWarning
from hypothesisClasses.Fornecedor import fornecedor_gen
from hypothesisClasses.Casa import casa_gen
from hypothesisClasses.Divisao import divisao_gen
from hypothesisClasses.SmartSpeaker import smartSpeaker_gen
from hypothesisClasses.SmartCamera import smartCamera_gen
from hypothesisClasses.SmartBulb import smartBulb_gen


# guarda os nomes dos fornecedores que escrevemos no principio do ficheiro para os usar na geracao das casas
nomes_forn = []
disp_generators = [smartCamera_gen, smartBulb_gen, smartSpeaker_gen]


def generate_logs():
	with open("py_logs.txt", 'w') as file:
		# gerar fornecedores primeiro para guardar os nomes,e inseri-los no ficheiro(15 fornecedores)
		for i in range(1, 15):
			f = fornecedor_gen().example()
			nomes_forn.append(f.nome)
			file.write(f.__str__())
		# gerar combinacoes de casas, divisoes e dispositivos(10-30 casas com 5-10 divisoes e 1-5 dispositivos)
		for i in range(1, random.randrange(11, 31)):
			casa = casa_gen(random.choice(nomes_forn)).example()
			file.write(casa.__str__())
			for j in range(1, random.randrange(6, 11)):
				divisao = divisao_gen().example()
				file.write(divisao.__str__())
				for k in range(1, random.randrange(2, 5)):
					dispositivo = random.choice(disp_generators)().example()
					file.write(dispositivo.__str__())


if __name__ == '__main__':
	with warnings.catch_warnings():
		warnings.filterwarnings("ignore", category=NonInteractiveExampleWarning)
		generate_logs()
