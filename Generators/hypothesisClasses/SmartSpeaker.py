import hypothesis.strategies as st
import string
from hypothesis.errors import NonInteractiveExampleWarning
import warnings


class SmartSpeaker:
	def __init__(self, volume, estacao, marca, consumo, id):
		self.volume = volume
		self.estacao = estacao
		self.marca = marca
		self.consumo = consumo
		self.id = id

	def __str__(self):
		return "SmartSpeaker:" + str(self.volume) + "," + self.estacao + "," + self.marca + "," + format(self.consumo, ".2f") + ",speaker" + self.id + "\n"


def smartSpeaker_gen():
	volume = st.integers(0, 100)
	estacao = st.text(alphabet=string.ascii_letters + '0123456789', min_size=5, max_size=16)
	marca = st.text(alphabet=string.ascii_letters + '0123456789', min_size=2, max_size=8)
	consumo = st.floats(min_value=0.00, max_value=10.00)
	id = st.text(alphabet=st.characters(min_codepoint=48, max_codepoint=57), min_size=1, max_size=10)
	return st.builds(SmartSpeaker, volume, estacao, marca, consumo, id)


def teste():
	for i in range(1, 10):
		f = smartSpeaker_gen().example()
		print(f)


if __name__ == '__main__':
	with warnings.catch_warnings():
		warnings.filterwarnings("ignore", category=NonInteractiveExampleWarning)
		teste()
