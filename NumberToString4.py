def thousand(x):
	print("%s thousand " %(one(int(x/1000))))
	x = x%1000
	hundred(x)	
	#return word

def hundred(x):
	print("%s hundred and " %(one(int(x/100))))
	x = x%100
	ten(x)
	#print(word)
	#return word

def ten(x):
	print("%s" %(ty(int(x/10)*10)))
	x = x%10
	one(x)
	#print(word)	
	#return word

def ty(x):
	y={}
	y[20] = "twenty"
	y[30] = "thirty"
	y[40] = "forty"
	y[50] = "fifty"
	y[60] = "sixty"
	y[70] = "seventy"	
	y[80] = "eighty"
	y[90] = "ninety"

	for i in y.keys():
		if x == i:
			x = i
	print(y.get(x))
	#return y.get(x)

def one(x):
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
	#return y.get(x)

num = int(input("Please input any number between 1 and 9999:\n"))
word = ""

(thousand(num))
#print(thousand(num))
#print(one(num/1000))

