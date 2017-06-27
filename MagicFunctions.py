class One:
	def __init__(self, a, b, c):
		self.A = a
		self.B = b
		self.C = c
		
	def __add__(self, r):
		x = One(0, 0, 0)
		x.A = self.A + r.A
		x.B = self.B + r.B
		x.C = self.C + r.C
		return x

	def __sub__(self, r):
		x = One(0, 0, 0)
		x.A = self.A - r.A
		x.B = self.B - r.B
		x.C = self.C - r.C
		return x

	def __str__(self):
		#x = One(0, 0, 0)
		return "hello my friends"  


Y = One(1, 2, 3)
Z = One(10, 20, 30)

i = Y + Z
print("%d" % i.A)
print(i)