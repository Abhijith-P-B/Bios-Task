n = int(input("Enter list size:"))

numbers = []

print("Enter the elements:")
for i in range(n):
    value = int(input())
    numbers.append(value)

print("List elements are:", numbers)

print("Enter target value:")
target = int(input())

found = False

for i in range(len(numbers)):
    for j in range(i + 1, len(numbers)):
        xor_value = numbers[i] ^ numbers[j]
        if xor_value == target:
            print(numbers[i], "^", numbers[j], "=", xor_value)
            found = True

if found == False:
    print("No XOR pair found!")