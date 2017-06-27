class FridaysQuestion:

	def NestedException(self):
			try:
				f = open("ABC.txt", "w")
				try:
					msg = f.read()
					print(msg)
				finally:
					
					print("Computer is done")
					f.close()
			except RuntimeError:
				print("Computer will not comply")
			except Exception:
				print("Computer says NO!")
			except IOError:
				print("Computer says maybe")
			except:
				print("Computer has given up")
			finally:
				print("Computer is so completely done")

ref = FridaysQuestion()
ref.NestedException()