import hypothesis.strategies as st
from hypothesis.errors import NonInteractiveExampleWarning
import warnings

L_temps = ["Warm", "Hot", "Cold"]


class SmartBulb:
	def __init__(self, temp, dim, intensidade, id):
		self.temp = temp
		self.dim = dim
		self.intens = intensidade
		self.id = id

	def __str__(self):
		return "SmartBulb:" + self.temp + "," + str(self.dim) + "," + format(self.intens, ".2f") + ",bulb" + self.id + "\n"


def smartBulb_gen():
	temp = st.sampled_from(L_temps)
	dim = st.integers(min_value=0, max_value=20)
	intens = st.floats(min_value=0.00, max_value=10.00)
	id = st.text(alphabet=st.characters(min_codepoint=48, max_codepoint=57),min_size=1, max_size=10)
	return st.builds(SmartBulb, temp, dim, intens, id)


def teste():
	for i in range(1, 10):
		f = smartBulb_gen().example()
		print(f)



if __name__ == '__main__':
	with warnings.catch_warnings():
		warnings.filterwarnings("ignore", category=NonInteractiveExampleWarning)
		teste()
