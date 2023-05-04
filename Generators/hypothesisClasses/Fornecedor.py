import hypothesis.strategies as st
from hypothesis.errors import NonInteractiveExampleWarning
import warnings

L_fornecedores = ["EDP Comercial", "Galp Energia", "Iberdrola", "Endesa", "Gold Energy", "Coopernico", "Enat", "YIce",
                  "Meo Energia", "Muon", "Luzboa", "Energia Simples", "SU Eletricidade", "EDA"]


class Fornecedor:
	def __init__(self, nome, imposto):
		self.nome = str(nome)
		self.imposto = imposto

	def __str__(self):
		return "Fornecedor:" + str(self.nome) + "," + format(self.imposto, ".2f") + "\n"


def fornecedor_gen():
	nome = st.sampled_from(L_fornecedores)
	imposto = st.floats(min_value=0.20, max_value=1.00)
	return st.builds(Fornecedor, nome, imposto)


def teste():
	fornList = []
	for i in range(1, 10):
		f = fornecedor_gen().example()
		print(f)


if __name__ == '__main__':
	with warnings.catch_warnings():
		warnings.filterwarnings("ignore", category=NonInteractiveExampleWarning)
		teste()
