#1. Write a program to print your name
print("AFTAB")

#2. Write a program for a Single line comment and multi-line comments

#This is the example of Single line comment you can use # for single line comment

''' This is the example of Multi Line comment
you can place anything in this block for multi line comment '''

#3. Define variables for different Data Types int, Boolean, char, float, double and print on the Console
a = 5
d = 10 > 9
c = 'hello'
b = 5.25
e = 5 ** 6

print(type(a))
print(type(b))
print(type(c))
print(type(d))
print(type(e))
 
#4. Define the local and Global variables with the same name and print both variables and understand the scope of the variables
a = 'This is the example of global variable'
def Local():
    a = 'This is an example of local variable'
    print(a)

def Global():
    a = 'Global veriable'
    print(a)
    
if __name__ == "__main__":
    Local()
    Global()
