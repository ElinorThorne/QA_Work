class Inheritance:
	class Grandma:
		def msg(self):
			print("Joyce")

	class Mum(Grandma):
		def mumMsg(self):
			super.msg()
			print("Sue")

	class Child(Mum, Grandma):
		def meMsg(self):
			super.mumMsg()
			print("Elinor")

cl = Child()
c1.meMsg()

