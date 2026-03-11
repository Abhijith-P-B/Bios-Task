def check_anagram(word1, word2):
    lword1 = word1.lower()
    lword2 = word2.lower()

    if len(word1) != len(word2):
        print("Not anagrams")
    else:
        s1 = sorted(lword1)
        s2 = sorted(lword2)

        if s1 == s2:
            print("They are anagrams")
        else:
            print("Not anagrams")

word1 = input("Enter First Word: ")
word2 = input("Enter Second Word: ")

check_anagram(word1, word2)