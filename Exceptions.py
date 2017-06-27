class Exceptions:
	
	def SimplyTry(self):
		try:
			c = 4 / 2
		
		except Exception:
			print("Exception error")

		except ArithmeticError:
			print("Arithmetic error")

		else:
			print("The result is %d" %c)

		finally:
			print("Hi Jane!")


	def MulipleExceptions(self):
		try:
			c = 4 / 0
		
		except(SystemError, ArithmeticError):
			print("First error")

		except Exception:
			print("Second error")

		else:
			print(int(c))

		finally:
			print("Third")


	def WorkingExample(self):
		try:
			f = open("Testfile", "w" )
			f.write("This is my test file for exception handling!")
		except IOError:
			print("Error: Computer says no")
		else:
			print("Written content in the file successfully")
			f.close()


	def BrokenExample(self):
		try:
			f = open("Testfile", "r" )
			f.write("This is my test file for exception handling!")
		except IOError:
			print("Error: Computer says no")
		else:
			print("Written content in the file successfully")
			f.close()


	def NoExceptions(self):
		try:
			c = 4 / 0

		except:
			print("Computer says no with no specific reason")

		else:
			print("The result is %d" %c)


	



	def NestedException(self):
		try:
			f = write("elinor", "r")
			try:
				msg = f.read()
				print(msg)
			finally:
				print("Computer is done")
				f.close()
		except RuntimeError:
			print("Computer will not comply")
		except IOError:
			print("Computer says maybe")
		except Exception:
			print("Computer says NO!")
		finally:
			print("Computer is so completely done")


	def RaiseException(self):
		try:
			raise Exception("Spam", "Eggs")
		except Exception as inst:
			#print (type(inst))
			#print (inst.args)
			print (inst)
			x, y = inst.args
			print ("%s = " %x)
			print ("%s = " %y)

	def NumberFormatException(self):
		try:
			x = int("a")
			print("Yay!")
			#break
		except ValueError:
			print("Ooops! There was a problem")
		finally:
			print("It's the FINAL countdown!")

ref = Exceptions()
#ref.SimplyTry()
#ref.WorkingExample()
#ref.BrokenExample()
#ref.NoExceptions()
#ref.NestedException()
#ref.MulipleExceptions()
ref.RaiseException()
#ref.NumberFormatException()
