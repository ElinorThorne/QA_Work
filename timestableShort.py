frm, to = int(input("Times table from?: ")), int(input("Times table to?: "))
print( "\nTimestable of %d\n" %frm)
if frm < to:
	for x in range(frm, to+1):
		for y in range(1,11):
			print( "%d x %d = %d" %(x, y, x*y))
else:
	for x in range(frm, to-1,-1):
		for y in range(1,11):
			print( "%d x %d = %d" %(x, y, x*y))


	