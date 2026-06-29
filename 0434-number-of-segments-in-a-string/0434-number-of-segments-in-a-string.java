class Solution {
    public int countSegments(String s) {
        if(s.length()==0)
        return 0;

        boolean flag = false;
        int cnt = 1;
        for(int i=0; i<s.length(); i++)
        {   
           
           if( s.charAt(i) != ' ')
           {
             flag = true;
           }
           else if(flag && s.charAt(i)==' ')
           {
                flag = false;
                cnt++;
           }

        }

        if(cnt == 1 && flag == false)
        return 0;

        if(s.charAt(s.length()-1)==' ')
        cnt--;
        
        return cnt;
    }
}