#Longest Repeating Character Replacement
------------------------------------------------
Given a string S and an integer K. In one operation, you are allowed to choose any character of the string and change it to any other uppercase English character.You can perform this operation atmost K times.
Return the length of the longest substring containing same letter you can get after performing the above operations.
Note : S consists of only uppercase English letters.

TestCase 1:

Input :
S = "ABBA"
K = 2
Output: 4
Explanation: Replace the 2 occurrences of 'A' with 2 'B's or vice-versa.

TestCase 2:

Input :
S = "AABAABB"
k = 2
Output: 6
Explanation: Replace the occurrence of 'B' with 'A' and form "AAAAAAB".
The substring "AAAAAA" has the most extended repeating letters, which is 6.