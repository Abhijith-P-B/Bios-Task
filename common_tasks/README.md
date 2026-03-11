# WRITE-UPS FOR COMMON TASKS

## Finding all pairs in a list whose XOR is equal to a given target

In this task I learned about bitwise XOR operation and how to apply it to Python using ^ operator. The XOR operation compares binary representation of two numbers and return 1 if bits are
different, 0 if they are same.

I applied this knowledge to find pairs of numbers from the list if their XOR value equals target value. This task was an introduction to bitwise operators and how to use them in simple
algorithmic problems.

## Checking whether a string is a palindrome

I created a straightforward program for this task to determine if a given string is a palindrome. First, I  used the list() function to transform a string input from the user 
into a list of characters. I then reversed the list using Python's slicing function [::-1]. I compared the reversed list with the original list after it had been reversed. The string is 
recognized as a palindrome if both lists are identical and it reads the same both forward and backward. If not, the software indicates that the string is not a palindrome.

## Reversing only the alphabets in a string without changing the position of special characters

For completing this task, I created a program that would only reverse the alphabetic characters in a string while maintaining the original positions of all non-alphabetic characters.
In order to modify individual elements, the program first takes a string input from the user and transforms it into a list of characters.

I did the programing using two pointers, with one pointer beginning at the string's beginning (l) and the other at its end (r). Using the isalpha() method, the program determined whether 
the characters at these positions are alphabetic. The left pointer advances if the character on the left is not a letter.

Similarly, the right pointer advances backward if the character on the right is not a letter. Both pointers move in the direction of the center when both characters are alphabetic.
Until the two pointers collide, this process is repeated. Lastly, "".join() is used to join the list of characters back into a string, which is then printed.

## Taking two strings and returns True if they are anagrams of each other, and False otherwise

I created a function to determine whether two given words are anagrams for this task. When two words are passed in, the function check_anagram() compares them to see if they have the same 
characters in a different order.

In order to prevent letter case differences from affecting the comparison, both words are first converted to lowercase inside the function using the lower() method. 
Since words with different lengths cannot be anagrams, the function then determines whether the two words' lengths are equal.

I then used the sorted function() to sort the characters of both words. Sorting puts each word's letters in alphabetical order. After sorting, the results are 
compared; if they are equal, both words are anagrams because they contain the same characters. If not, the function concludes that the words are not anagrams.



Yeah thats about it for the write ups for the common tasks.
