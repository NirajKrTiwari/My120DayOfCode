/*
Find duplicate elements in the given array
-------------------------------------------
Test Case 1:
Input:
Number of elements you want to enter in array:
4
Enter element
2
3
1
4
Output:
No Duplicate Value

Test Case 2:
Input:
Number of elements you want to enter in array:
5
Enter element
1
22
44
1
6
Output:
Duplicate elements is 1
 */
import java.util.Scanner;
class Solution {
    public void findDuplicate(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    System.out.println("Duplicate elements is "+nums[i]);
                    return;
                }
            }
        }
        System.out.println("No Duplicate Value");
    }
}
public class DuplicateArrayElements {
    public static void main(String[] args) {
        Solution obj = new Solution();
        Scanner in=new Scanner(System.in);
        System.out.println("Number of elements you want to enter in array:");
        int n=in.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter element");
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }
        obj.findDuplicate(nums);
    }
}
