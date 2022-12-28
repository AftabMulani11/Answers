Dict = dict([(1,'Aftab'), (2,'Atharva'), (3,'Rakesh'), (4,'Karan'), (5,'Ayan')])
print("I get the following Dictionary",Dict)

#1.1. Adding the values in dictionary 
a = "samruddhi"
Dict[6] = a
print("\n I added %s in Dictionary"%a)
print("\n updated dictionary is:",Dict)

#1.2. Updating the values in dictionary
Dict[3] = 'Asma'
print("\n I updated the Dictionary with new value")
print("\n updated dictionary is:",Dict)

#1.3. Accessing the value in dictionary
print("\n This is your value",Dict[1])

#1.4. Create a nested loop dictionary
Dict1 = {1: 'Aftab', 2: 'Atharva',
        3:{'Age' : 18, 'Branch' : 'CTIS', 'Year' : 'Fourth Year'}}
print("\n Nested loop Dictionary:",Dict1)

#1.5. Access the values of nested loop dictionary
print("\n Perticular value of nested Dictionary is:",Dict1[2])

#1.6. Print the keys present in a particular dictionary
print(Dict.keys())

#1.7. Delete a value from a dictionary
del Dict[6]
print("\n I deleted the value from dictionary")
print("\n updated dictionary is:",Dict)