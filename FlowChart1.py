no1 = input("Please enter a number between 1 and 1,000: \n")
x = int(no1)

if x>100:
	print("A")
	if x>500:
		print("1")
	else:
		print("2")
else:
	print("B")
	if x<50:
		print("4")
	else:
		print("3")