st = input("Please input a String:\n")
lower = "abcdefghijklmnopqrstuvwxyz"
upper = "ABCDEFGHIJKLMNOPQRSTUVWYZ"
count = 0
y=[]

for x in st:
	for y in lower:
		if y == x:
			count = count +1
			print("%s = %d" %(y, count))


