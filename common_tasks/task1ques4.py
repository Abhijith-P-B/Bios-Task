word_1=input("First Word:")
word_2=input("Second_input:")
lword1=word_1.lower()
lword2=word_2.lower()

if len(word_1) != len(word_2):
    print("Not anagrams")
    
else:
    s1=sorted(lword1)
    s2=sorted(lword2)

    if s1 == s2:
        print("They are anagrams")
    else:
        print("Not anagrams")
    