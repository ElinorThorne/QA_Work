source = input("Source: ")
destination = input("Destination: ")
replace = input("Search for: ")
wth = input("Replace with: ")

f = open(source, "r")
msg = f.read()
temp = ""

for chr in msg:
	if chr != replace:
		temp += chr
	else:
		temp += wth

f = open(destination, "w")
f.write(temp)
f.close()

f = open(destination, "r")
print(f.read())
