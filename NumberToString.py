def ones(x):
	y={}
	y[1] = "one"
	y[2] = "two"
	y[3] = "three"
	y[4] = "four"
	y[5] = "five"
	y[6] = "six"	
	y[7] = "seven"
	y[8] = "eight"
	y[9] = "nine"
	y[10] = "ten"
	y[11] = "eleven"
	y[12] = "twelve"
	y[13] = "thirteen"
	y[14] = "forteen"
	y[15] = "fifteen"
	y[16] = "sixteen"
	y[17] = "seventeen"
	y[18] = "eighteen"
	y[19] = "nineteen"

	for i in y.keys():
		if x == i:
			x = i
	print(y.get(x))
	

num = int(input("Please input any number between 1 and 9999:\n"))
word = ""

a = int(num/1000)
print(a)
#ones(a/1000)
