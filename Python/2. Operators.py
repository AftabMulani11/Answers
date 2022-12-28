#1. Write a function for arithmetic operators(+,-,*,/)
def add(a, b):
    c = a + b
    print(c)
def sub(a, b):
    c = a - b
    print(c)
def mul(a, b):
    c = a * b
    print(c)
def div(a, b):
    c = a / b
    print(c)

a = 40
b = 30
add(a, b)
sub(a, b)
mul(a, b)
div(a, b)

#2. Write a method for increment and decrement operators(++, --)
c=0
c+=1
c=c+1
print('The Value of Count is',c)
print("INCREMENTED operator")
for i in range(0, 6):
    print(i)

print("\n DECREMENTED operator")
for i in range(6, -1, -1):
    print(i)

#3. Write a program to find the two numbers equal or not
a = int(input("Enter first number:"))
b = int(input("Enter second number:"))

if(a == b):
    print('Numbers are equal')
else:
    print("Numbers are not equal")

#4. Program for relational operators (<,<==, >, >==)
a = int(input("Enter first number:"))
b = int(input("Enter second number:"))

if (a < b):
    print('a is smaller than b')
elif (a <= b):
    print('a is smaller than or equal to b')
elif (a > b):
    print('a is bigger than b')
else:
    print('a is bigger than or equal b')

#5. Print the smaller and larger number
a = [4, 55, 6, 89, 7, 5]
c = min(a)
d = max(a)
print("smaller number is %d", c)
print("larger number is %d", d)
