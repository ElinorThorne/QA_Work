#homework: replace String

source = input("Source: ")
destination = input("Destination: ")
key = 50
#replace = input("Search for: ")
#wth = input("Replace with: ")

f = open(source, "r")
msg = f.read()
temp = ""

for chr in msg:
	d = ord(chr)
	temp += string(d)

f = open(destination, "w")
f.write(temp)
f.close()

f = open(destination, "r")
print(f.read())
