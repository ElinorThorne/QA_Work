one = input("Times table from?: ")
two = input("Times table to?: ")

frm = int(one)
to = int(two)

print( "\nTimestable of %d\n" %frm)

if frm < to:
	for x in range(frm, to+1):
		for y in range(1,11):
			result = x * y
			print( "%d x %d = %d" %(x, y, result))
else:
	for x in range(frm, to-1,-1):
		for y in range(1,11):
			result = x * y
			print( "%d x %d = %d" %(x, y, result))