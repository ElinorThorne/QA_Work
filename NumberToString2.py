def thousand(x):
	a = ones(x/1000)
	word = ("%s thousand " %a)
	x = x%1000
	hundred(x)
	return word

def hundred(x):
	a = ones(x/100)
	word = ("%s hundred " %a)
	x = x%100
	ten(x)
	return word

def ten(x):
	a = ty(x/10)
	word = ("")
	x = x%10
	one(x)
	return word

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
	return y.get(x)

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
	return y.get(x)


def choice(x):
	if(x>=1000):
		thousand(x)
	elif(x>=100):
		hundred(x)
	elif(x>=10):
		ten(x)
	elif(x>=1):
		one(x)


num = int(input("Please input any number between 1 and 9999:\n"))
word = ""

print(choice(num))

