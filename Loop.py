def isVowel(x):
	x = x.upper()
	if (x == "A" or x == "E" or x == "I" or x == "O" or x == "U"):
		return True
	return False

s1 = "QA Consulting"
s2 = "Office For National Statistics"
s3 = ""
s4 = ""

for x in s1:
	if isVowel(x):
		s3 += x

for x in s2:
	if not isVowel(x):
		s4 += x

print("The vowels in '%s' are: %s" %(s1, s3))
print("The consonants in '%s' are: %s" %(s2, s4))