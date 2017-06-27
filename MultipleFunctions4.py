import sys 

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

	elif( x in (1,2,3,4,5)):
		a = int(input("Enter first no: "))
		b = int(input("Enter second no: "))
		
		if x == 1:
			print("The result is: %d" %add(a,b))
			msg()
		if x == 2:
			print("The result is: %d" %subtract(a,b))
			msg()
		if x == 3:
			print("The result is: %d" %divide(a,b))
			msg()
		if x == 4:
			print("The result is: %d" %multiply(a,b))
			msg()
		if x == 5:
			timestable(a,b)
			msg()

def msg():
	cont = input("Would you like to repeat the process? Y/N: ")
	true(cont)

def verify(x):
	y = True
	if x >=1 and x <=6:
		y = True
	else:
		print("You got here")
		y = False
	return y

def true(x):
	y = true

	if x == "Y":
		y = true
	else:
		execute()
	
def execute():
	print("\nTOP MENU\n1: +\n2: -\n3: /\n4: *\n5: Timestable\n6: Quit\n")
	start = int(input("Enter your choice: "))
	while True:
	start = int(input("Enter your choice: "))
	if not verify(start):
		pass
	else:	
		menu(start)
	

print("TOP MENU\n1: +\n2: -\n3: /\n4: *\n5: Timestable\n6: Quit\n")

while True:
	start = int(input("Enter your choice: "))
	if not verify(start):
		pass
	else:	
		menu(start)

	