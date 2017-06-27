#class Results:
#	def __init__(self):
#		print("Hello")
#
#x = Results()

#class Results:
#	def __init__(this, x, y, z):
#		this.phy = x
#		this.chem = y
#		this.math = z
#
#	def Calc(me):
#		me.result = me.phy + me.chem + me.math  
#
#	def showCalc(self):
#		print(self.result)
#
#x = Results(15, 16, 19)
#x.Calc()
#x.showCalc()

class Results:
	def __init__(self, x=0):
		this.__phy = x

	def Physics(self, p):
		if( p>=0 and p<=150):
			self.__phy = p
		else:
			print("NO!")

	def Calc(self):
		me.result = me.phy

	def showCalc(self):
		print(self.result)

x = Results(15)
x.Calc()
x.showCalc()