def ASCII(a):
	f = open(a, "r")
	msg = f.read()
	mylist = []
	for chr in msg:
		for x in range(f.length()):
			mylist.append(x)
		mytuple = tuple(mylist)
	print(mytuple)	

def Key(a):
	ch = ord(a[0:1])
	return ch

def Encrypt(a, b):
	print(a)
	print(b)

#get inputs
fileName = input("Document name: ")
password = input("Password: ")

#turn file to ASCII Code
tempFile = (ASCII(fileName))

#get 1st char of password
key = Key(password)

#multiply ASCII file with Key
Encrypt(a = tempFile, b = key)

