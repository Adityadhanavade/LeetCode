class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder strb = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                strb.append(Character.toLowerCase(ch));
            }
        }
        
        return isPailandrome(strb.toString());
    }

    public static boolean isPailandrome(String str)
    {
        int start = 0;
        int end = str.length()-1;
        while(start < end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}