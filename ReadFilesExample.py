f = open("ABC.txt", "w")
f.write("Hello my friends\n")
f.close()

f = open("ABC.txt", "a")
f.write("How are you?\n")
f.close()

f = open("ABC.txt", "r")
print(f.read())