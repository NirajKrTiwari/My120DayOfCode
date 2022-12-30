Find first node of loop in a linked list
-----------------------------------------
Write a function that checks whether a given Linked List contains a loop. If the loop is present then it returns point to the first node of the loop. Else it returns "No loop available".

TestCase 1:

Input:
N = 3
value[] = {1,3,4}
X = 2
Output: Loop starting node is 3
Explanation: The link list looks like
1 -> 3 -> 4
     ^    |
     |____|    


TestCase 2:

Input:
N = 4
value[] = {1,8,3,4}
X = 0
Output: No loop available
Explanation: The Linked list does not 
contains any loop.
