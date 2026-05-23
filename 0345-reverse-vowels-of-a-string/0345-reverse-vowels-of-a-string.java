class Solution {
    public String reverseVowels(String s) {
        
        //treverse the start and with end
        int start = 0; 
        int end  = s.length()-1;
        boolean flagstart = false;
        boolean flagend = false;
        char charr[] = s.toCharArray(); 
        while(start<end)
        {   
            char startch = s.charAt(start);
            char endch = s.charAt(end);

            if(startch == 'a' || startch =='A' || startch == 'e' || startch == 'E' || startch == 'i' ||  startch == 'I' || startch == 'o' || startch == 'O' || startch == 'u' || startch == 'U'){
                flagstart = true;
            }

            if( endch == 'a' || endch =='A' || endch == 'e' || endch == 'E' || endch == 'i' ||  endch == 'I' || endch == 'o' || endch == 'O' || endch == 'u' || endch == 'U')
            {
                flagend = true;
            }

            if(flagend && flagstart)
            {
                char temp = charr[start];
                charr[start] = charr[end];
                charr[end] = temp;
                flagstart = false;
                flagend = false;
                start++;
                end--;
            }
            else if(flagstart && !flagend)
            {
                end--;
            }
            else if(flagend && !flagstart)
            {
                start++;
            }
            else
            {
                start++;
                end--;
            }
        }
        return new String(charr);
    }
}