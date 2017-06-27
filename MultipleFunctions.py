#def execute():
print("1: +\n2: -\n3: /\n4: *\n5: Timestable\n6: Quit\n")
start = int(input("Enter your choice: "))
a = input("Enter first no: ")
b = input("Enter second no: ")

#a = int(input("Enter a number between 1-6"))
#print(menu(a))

#if(start >= 1 and start <=6):
		
def add(a,b):
	c = a+b
	return c

def subtract(a,b):
	c = a-b
	return c

def divide(a,b):
	c = a/b
	return c

def multiply(a,b):
	c = a*b
	return c

def timestable(a,b):
	if a < b:
		for x in range(a, b+1):
			for y in range(1,11):
				return y
	else:
		for x in range(a, b-1,-1):
			for y in range(1,11):
				return y

def quit():
	sys.exit()

#def menu(x):

	#for case in swithc(x):
	#	if case(1): 
	#		x = "add"
	#		break...
	#	if case(2): 
	#		x = "subtract"
	#		break...
	#	if case(3): 
	#		x = "divide"
	#		break...
	#	if case(4): 
	#		x = "multiply"
	#		break...
	#	if case(5): 
	#		x = "timestable"
	#		break...
	##	if case(6): 
	#		x = "quit"
	#		break...

