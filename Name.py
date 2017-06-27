class Name:

	def message(self):
		#print("x")
		self.add(7)

	def add(self, a, b):
		c = a + b
		print(c)

	def add(self, *a):
		c = 0
		for x in a:
			c = c + x
		print(c)

	def add(self, a, b=0, c=0, d=0):
		print("You're here")
		c = 0
		c = a + b + c + d
		print(c)

ref=Name()
ref.message()


