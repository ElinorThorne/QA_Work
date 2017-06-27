
from os import path

f = open("first.txt", "w")
f.write("Hello")
f.close()

print("File Exists: %s" %str(path.exists("first.txt")))
print("Size of the file:%s" %str(path.getsize("first.txt")))
print("is it a file:%s" %str(path.isfile("first.txt")))
print("Is it a folder:%s" %str(path.isdir("first.txt")))
print("The actual path of the file:%s" %str(path.realpath("first.txt")))
print("The split path of the file:%s" %str(path.split(path.realpath("first.txt"))))
head,tail=path.split(path.realpath("first.txt"))
print ("Head: %s" %head)
print ("Tail: %s" %tail)