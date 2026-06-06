class Solution {
    public int compress(char[] chars) {
        if(chars.length<2)
            return 1;
        
        // char ch;
        int cnt = 1;
        int index=0;
        // StringBuilder str = new StringBuilder();

        for(int i=0; i<chars.length-1; i++)
        {   
            // ch = chars[i];
            if(chars[i]==chars[i+1])
            {
                cnt++;
            }
            else
            {
                if(cnt>1 && cnt<10)
                {
                    // str.append(chars[i]);
                    // str.append(cnt);
                    chars[index]=chars[i];
                    index++;
                    if(cnt>1)
                    {
                        String scnt = String.valueOf(cnt);
                        for(int j=0; j<scnt.length(); j++)
                        {
                            // str.append(scnt.charAt(j));
                            chars[index]=scnt.charAt(j);
                            index++;
                        }
                    }
                    cnt = 1;
                }
                else if(cnt>1 && cnt>=10)
                {   
                    // str.append(chars[i]);
                    chars[index]=chars[i];
                    index++;
                    String scnt = String.valueOf(cnt);
                    for(int j=0; j<scnt.length(); j++)
                    {
                        // str.append(scnt.charAt(j));
                        chars[index]=scnt.charAt(j);
                        index++;
                    }
                    cnt = 1;
                }
                else
                {
                    chars[index]=chars[i];
                    index++;

                    cnt = 1;
                }
            }
        }

        if(cnt>1)
        {
            chars[index]=chars[chars.length-1];
            index++;
             if(cnt>1)
            {
                String scnt = String.valueOf(cnt);
                for(int j=0; j<scnt.length(); j++)
                {
                    // str.append(scnt.charAt(j));
                    chars[index]=scnt.charAt(j);
                    index++;
                }
            }
        }
        else
        {
            chars[index]=chars[chars.length-1];
            index++;
            if(cnt>1)
            {
                String scnt = String.valueOf(cnt);
                for(int j=0; j<scnt.length(); j++)
                {
                    // str.append(scnt.charAt(j));
                    chars[index]=scnt.charAt(j);
                    index++;
                }
            }

        }

        // for(int i=0; i<str.length(); i++)
        // {
        //     chars[i] = str.charAt(i);
        // }
        return index;
    }
}




/*

class Solution {
    public int compress(char[] chars) {
        if(chars.length<2)
            return 1;
        
        // char ch;
        int cnt = 1;
        StringBuilder str = new StringBuilder();

        for(int i=0; i<chars.length-1; i++)
        {   
            // ch = chars[i];
            if(chars[i]==chars[i+1])
            {
                cnt++;
            }
            else
            {
                if(cnt>1 && cnt<10)
                {
                    str.append(chars[i]);
                    str.append(cnt);
                    cnt = 1;
                }
                else if(cnt>1 && cnt>=10)
                {   
                    str.append(chars[i]);
                    String scnt = String.valueOf(cnt);
                    for(int j=0; j<scnt.length(); j++)
                    {
                        str.append(scnt.charAt(j));
                    }
                    cnt = 1;
                }
                else
                {
                    str.append(chars[i]);
                    cnt = 1;
                }
            }
        }

        if(cnt>1)
        {
            str.append(chars[chars.length-1]);
            str.append(cnt);
        }
        else
        {
            str.append(chars[chars.length-1]);
        }

        for(int i=0; i<str.length(); i++)
        {
            chars[i] = str.charAt(i);
        }
        return str.length();
    }
}

*/