def ASCII(a):
	f = open(a, "r")
	msg = f.read()
	#temp = ""
	numbers=[]
	for chr in msg:
		x = ord(chr)
		#temp = temp + ("%d " %x)
		numbers.append(x)
	f.close()
	return numbers

def Key(a):
	ch = ord(a[0:1])
	return ch

def Encrypt(a, b):
	print("ASCII File:\n %s" %a)
	print("Key:\n %d" %b)

#get inputs
fileName = input("Document name: ")
password = input("Password: ")

#turn file to ASCII Code
tempFile = (ASCII(fileName))

#get 1st char of password
key = Key(password)

#multiply ASCII file with Key
Encrypt(a = tempFile, b = key)

