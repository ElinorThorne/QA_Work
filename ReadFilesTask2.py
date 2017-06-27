#homework: replace String

source = input("Source: ")
destination = input("Destination: ")
replace = input("Search for: ")
wth = input("Replace with: ")

f = open(source, "r")
msg = f.read()
temp = ""
tempWord = ""

for x in range(len(msg)):
	if x+len(replace) <= len(msg):
		tempWord = chr+len(rep3254
			lace)
	if tempWord == replace:
		temp += wth
	else:
		temp += chr

f = open(destination, "w")
f.write(temp)
f.close()

f = open(destination, "r")
print(f.read())
