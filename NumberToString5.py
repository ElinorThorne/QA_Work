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

num = int(input("Please input any number between 1 and 9999:\n"))
word = ""

if(num>=1000):
	word = ("%s %s thousand " %(word + one(int(num/1000))))
	num = num%1000

if(num>=100):
	word = ("%s %s hundred and " %(word + one(int(num/100))))
	num = num%100

if(num>=10):
	word = ("%s %s" %(word + ty(int(num/10)*10)))
	num = num%10

if(num>=1):
	word = ("%s %s" %(word + one(num))

print(word)


