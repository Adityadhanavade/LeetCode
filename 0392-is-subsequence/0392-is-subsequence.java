class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        {
            return true;
        }
        StringBuilder str = new StringBuilder();
        int index = 0;
        for(int i=0; i<t.length(); i++)
        {
            char ch = t.charAt(i);
            if(index < s.length() && s.charAt(index) == ch)
            {
                index++;
                str.append(ch);
            }
        }

        if(s.equals(str.toString()))
        {
            return true;
        }
        return false;
    }
}