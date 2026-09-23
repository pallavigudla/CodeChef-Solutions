class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            char leftchar = s.charAt(left);
            char rightchar = s.charAt(right);
            if(!Character.isLetterOrDigit(leftchar)){
                left++;
            } 
            else if(!Character.isLetterOrDigit(rightchar)){
                right--;
            } 
            else {
                if(Character.toLowerCase(leftchar)==Character.toLowerCase(rightchar)){
                    left++;
                    right--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}