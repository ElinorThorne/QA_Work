class Results:
	def __init__(this, x, y, z):
		this.__chem = 0
		this.__phy = 0
		this.__math = 0

		#check and loop
		this.Physics(int(input("Phy: ")))

		#check and loop
		this.Chemistry(int(input("Che: ")))

		#check and loop
		this.Mathematics(int(input("Math: ")))

	def Physics(self, p):

		if(p>=0 and p<=150):
			self.__phy = p
		else:
			print("Please check the amount for Physics and try again")

	def Chemistry(self, c):
		if(c>=0 and c<=150):
			self.__chem = c
		else:
			print("Please check the amount for Chemistry and try again")

	def Mathematics(self, m):
		if(m>=0 and m<=150):
			self.__math = m
		else:
			print("Please check the amount for Mathematics and try again")

	def Calculations(self):
			self.total = self.__phy + self.__chem + self.__math
			print(self.total)


Peter = Results(75, 15, 150)
Peter.Calculations()