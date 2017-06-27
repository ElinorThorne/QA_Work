def ASCII(a):
	f = open(a, "r")
	msg = f.read()
	numbers=[]
	for chr in msg:
		x = ord(chr)
		numbers.append(x)
	return numbers

def Key(a):
	ch = ord(a[0:1])
	return ch

def Encrypt(a, b):
	multiplied = []
	for i in a:
		x = a*b
		multiplied.append(x)
	return multiplied

def Deduct(a):
	deducted = []
	for i in a:
		if i >= 127:
			x = a - 127
			deducted.append(x)
		else:
			deducted.append(x)
	return deducted

#get inputs
fileName = input("Document name: ")
password = input("Password: ")

#turn file to ASCII Code
tempFile = (ASCII(fileName))

#get 1st char of password
key = Key(password)

#multiply ASCII file with Key
multip = Encrypt(a = tempFile, b = key)

#deduct 126
print(Deduct(multip))

