#1. Write a program to generate Arithmetic Exception without exception handling
a = [1, 2, 3]
try:
    print ("Second element = ",a[1])
    print ("Fourth element = ",a[3])
except:
    print ("An error occurred")

#2. Handle the Arithmetic exception using try-catch block
a = [1, 2, 3]
b = [3, 2, 1]
try:
    a == b
except:
    print("They are not equal")
else:
    print("Both Equal") 

#7. Write a program with finally block
try:
    k = 5/0
    print(k)
except ZeroDivisionError:
    print("Can't divide by zero")
finally:
    print('This is always executed')                 