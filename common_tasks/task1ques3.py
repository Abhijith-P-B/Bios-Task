a = input("enter string\n")
letters=list(a)
l=0
r=len(a)-1
while l<r:
    if not letters[l].isalpha() :
        l += 1
    elif not letters[r].isalpha() :
        r -=1
    else:
        temp=letters[l]
        letters[l]=letters[r]
        letters[r]=temp
        l+=1
        r-=1
        
print("".join(letters))
    