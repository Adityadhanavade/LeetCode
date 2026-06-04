class Solution {
    public String reorderSpaces(String text) {

        int totalspaces = 0;
        boolean flag = true;
        int words = 0;
        //count the spaces and word's form the text.
        for(int i=0; i<text.length();i++)
        {
            if(text.charAt(i)==' ')
            {   flag = true;
                totalspaces++;
            }
            if(text.charAt(i)!=' '&& flag)
            {
                words++;
                flag = false;
            }

        }
        //if words = 1 then may cause of exception divideby/0.
        if(words>1)
        {
            int spacesgap =  totalspaces / (words-1);
            int remeaningspaces = totalspaces % (words-1);

            String arr[] = text.trim().split("\\s+");
            StringBuilder strb = new StringBuilder();

            for(int i=0; i<arr.length; i++)
            {
                strb.append(arr[i]);
                int cnt = 0;
                while(spacesgap>cnt  && i != arr.length-1)
                {
                    strb.append(" ");
                    cnt++;
                }
            }
            if(strb.length() != text.length())
            {
                int count = 0;
                while(count < remeaningspaces)
                {
                    strb.append(" ");
                    count++;
                }
            }

            return strb.toString();
            
        }
        else
        {//beacuse text contains at least one word and i.e. commitied in que.
            StringBuilder strb = new StringBuilder(text.trim());
            
            int cnt=0;
            while(totalspaces>cnt)
            {
                strb.append(" ");
                cnt++;
            }
            return strb.toString();
        }

     
    }
}