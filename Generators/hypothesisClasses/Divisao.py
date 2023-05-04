import hypothesis.strategies as st
from hypothesis.errors import NonInteractiveExampleWarning
import warnings
import string


class Divisao:
	def __init__(self, nome, num):
		self.nome = nome
		self.num = num

	def __str__(self):
		return "Divisao:" + self.nome + " " + str(self.num) + "\n"


def divisao_gen():
	nome = st.text(alphabet=string.ascii_letters + ' ', min_size=6, max_size=14)
	num = st.integers(1, 3)
	return st.builds(Divisao, nome, num)


def teste():
	for i in range(1, 10):
		f = divisao_gen().example()
		print(f)


if __name__ == '__main__':
	with warnings.catch_warnings():
		warnings.filterwarnings("ignore", category=NonInteractiveExampleWarning)
		teste()
