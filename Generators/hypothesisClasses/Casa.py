import hypothesis.strategies as st
from hypothesis.errors import NonInteractiveExampleWarning
from hypothesisClasses.Fornecedor import fornecedor_gen
from random import choice
import warnings
import string


class Casa:
	def __init__(self, dono, nif, fornecedor, id, localidade, cod_postal, num_porta):
		self.dono = dono
		self.nif = nif
		self.fornecedor = fornecedor
		self.id = id
		self.localidade = localidade
		self.cod_postal = cod_postal
		self.num_porta = num_porta

	def __str__(self):
		return "Casa:" + self.dono + "," + str(self.nif) + "," + self.fornecedor + "," + "casa" + str(self.id) + "," \
			+ self.localidade + " " + self.cod_postal[0] + "-" + self.cod_postal[1] + " " + "nº" + str(self.num_porta) + "\n"


def casa_gen(fornecedor):
	dono = st.text(alphabet=string.ascii_letters + ' ', min_size=10, max_size=30)
	nif = st.text(alphabet='0123456789', min_size=9, max_size=9)
	# fornecedor é passado como argumento dos que foram gerados antes
	id = st.integers(min_value=1, max_value=100000)
	localidade = st.text(alphabet=string.ascii_letters, min_size=5, max_size=16)
	cod_postal = st.tuples(st.text(alphabet='0123456789', min_size=4, max_size=4), st.text(alphabet='0123456789', min_size=3, max_size=3))  # (####, ###)
	num_porta = st.integers(min_value=1, max_value=999)
	return st.builds(Casa, dono, nif, st.just(fornecedor), id, localidade, cod_postal, num_porta)


def teste():
	fornList = []
	for i in range(1, 10):
		f = fornecedor_gen().example()
		nome = f.nome
		fornList.append(nome)
	for i in range(1, 10):
		f = choice(fornList)
		c = casa_gen(f).example()
		print(c)


if __name__ == '__main__':
	with warnings.catch_warnings():
		warnings.filterwarnings("ignore", category=NonInteractiveExampleWarning)
		teste()