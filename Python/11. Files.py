file1 = open("info.txt","r")
data = file1.read()
print(data)
print()

file2 = open("Blank.txt","w")
a = 'Python is great language for learning'
file2.write(a)
print()

file3 = open("HW.txt","r+")
print(file3.readline(11))
print()
