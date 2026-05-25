class Solution {
    public int passwordStrength(String password) {

        int cnt = 0;

        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if(set.contains(ch))
                continue;

            set.add(ch);

            if(ch >= 'a' && ch <= 'z') 
            {
                cnt += 1;
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                cnt += 2;
            }
            else if(ch >= '0' && ch <= '9') 
            {
                cnt += 3;
            }
            else if(ch == '!' || ch == '@' || ch == '#' || ch == '$') 
            {
                cnt += 5;
            }
        }

        return cnt;
    }
}

/*
class Solution {
    public int passwordStrength(String password) {
        
        int cnt = 0;
        ArrayList<Character> arrlst = new ArrayList<>();
        for(int i=0; i<password.length(); i++)
        {   
            char ch = password.charAt(i);
            if(ch >= 'a' && ch <= 'z' && !(arrlst.contains(ch)))
            {
                arrlst.add(ch);
                cnt += 1;
            }
            else if(ch >='A' && ch <='Z' && !(arrlst.contains(ch)))
            {
                arrlst.add(ch);
                cnt += 2;
            }
            else if(ch >= '0' && ch <= '9' && !(arrlst.contains(ch)))
            {
                cnt += 3;
                arrlst.add(ch);
            }
            else if((ch == '!' || ch == '@' || ch == '#' || ch == '$') && !(arrlst.contains(ch)))
            {
                cnt += 5;
                arrlst.add(ch);
            }
        }
        return cnt;
    }
}

*/