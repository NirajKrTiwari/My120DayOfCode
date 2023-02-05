/*
LeetCode Link:https://leetcode.com/problems/longest-common-prefix/description/
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
          Arrays.sort(strs);
        int l=0,r=0;
        String pre=strs[0];
        for(int i=1;i<strs.length;i++){
            for(int j=0;j<strs[i].length();j++){
                if(j>pre.length() || pre.length()==j){
                    break;
                }
                if(pre.charAt(j)==strs[i].charAt(j)){
                    continue;
                }
                else{
                    pre=pre.substring(0,j);
                }
            }
        }
        return pre;
    }
    }