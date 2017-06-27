import sys 

def add(a,b):
	c = a+b
	print("The result is: %d" %c)

def subtract(a,b):
	c = a-b
	print("The result is: %d" %c)

def divide(a,b):
	c = a/b
	print("The result is: %d" %c)

def multiply(a,b):
	c = a*b
	print("The result is: %d" %c)

def timestable(a,b):
	if a < b:
		for x in range(a, b+1):
			for y in range(1,11):
				print( "%d x %d = %d" %(x, y, x*y))
	else:
		for x in range(a, b-1,-1):
			for y in range(1,11):
				print( "%d x %d = %d" %(x, y, x*y))

def quit():
	sys.exit()

def menu(x):
	if x == 6:
		quit()

	else:
		a = int(input("Enter first no: "))
		b = int(input("Enter second no: "))
		
		if x == 1:
			add(a,b)
		if x == 2:
			subtract(a,b)
		if x == 3:
			divide(a,b)
		if x == 4:
			multiply(a,b)
		if x == 5:
			timestable(a,b)
	


print("1: +\n2: -\n3: /\n4: *\n5: Timestable\n6: Quit\n")
start = int(input("Enter your choice: "))
menu(start)