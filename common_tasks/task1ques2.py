a = input("enter string")
b=list(a)
if b[::-1]==b:
    print("palindrome")
else:
    print("not a palindrome")
