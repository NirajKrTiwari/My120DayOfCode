/*
Leet Code Link:https://leetcode.com/problems/product-of-array-except-self/description/
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int[nums.length];
        int post=1,pre=1;
        
            for(int i=0;i<nums.length;i++)
            {
                a[i]=pre;
                pre=pre*nums[i];
            }
            for(int i=nums.length-1;i>=0;i--)
            {
                a[i]=a[i]*post;
                post=post*nums[i];
            }  
        return a;
    }
}