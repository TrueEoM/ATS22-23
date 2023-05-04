import hypothesis.strategies as st
from hypothesis.errors import NonInteractiveExampleWarning
import warnings


class SmartCamera:
	def __init__(self, resX, resY, tamanho, consumo, id):
		self.resX = resX
		self.resY = resY
		self.tamanho = tamanho
		self.consumo = consumo
		self.id = id

	def __str__(self):
		return "SmartCamera:(" + str(self.resX) + "x" + str(self.resY) + ")," + str(self.tamanho) + "," + format(self.consumo, ".2f") + ",camera" + self.id + "\n"


def smartCamera_gen():
	resX = st.integers(200, 5000)
	resY = st.integers(200, 5000)
	tamanho = st.integers(min_value=0, max_value=200)
	consumo = st.floats(min_value=0.00, max_value=10.00)
	id = st.text(alphabet=st.characters(min_codepoint=48, max_codepoint=57), min_size=1, max_size=10)
	return st.builds(SmartCamera, resX, resY, tamanho, consumo,  id)


def teste():
	for i in range(1, 10):
		f = smartCamera_gen().example()
		print(f)


if __name__ == '__main__':
	with warnings.catch_warnings():
		warnings.filterwarnings("ignore", category=NonInteractiveExampleWarning)
		teste()
