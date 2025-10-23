# Program to store even numbers from one array to another

# Input: array of numbers
numbers = []

# Get number of elements from the user
n = int(input("Enter the number of elements in the array: "))

# Get elements of the array
for i in range(n):
    num = int(input(f"Enter number {i+1}: "))
    numbers.append(num)

# Create a new array to store even numbers
even_numbers = []

# Check each number and store even ones
for num in numbers:
    if num % 2 == 0:
        even_numbers.append(num)

# Output the result
print("\nOriginal array:", numbers)
print("Even numbers array:", even_numbers)
