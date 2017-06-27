numbers=[]
def ASCII(a):
	f = open(a, "r")
	msg = f.read()
	temp = ""
	for chr in msg:
		x = ord(chr)
		temp = temp + ("%d " %x)
		numbers.append(x)

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
for a in numbers:
		print(",%d" %(a+69))
#get 1st char of password
key = Key(password)

#multiply ASCII file with Key
Encrypt(a = tempFile, b = key)

#use key to multiply everything in folder
#Multiply(a = ch, b = file )

