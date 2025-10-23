# Program to find the largest number in an array

# Input: array of numbers
numbers = []

# Get number of elements from the user
n = int(input("Enter the number of elements in the array: "))

# Get elements of the array
for i in range(n):
    num = float(input(f"Enter number {i+1}: "))
    numbers.append(num)

# Find the largest number
largest = numbers[0]
for num in numbers:
    if num > largest:
        largest = num

# Output the result
print("\nThe largest number in the array is:", largest)
