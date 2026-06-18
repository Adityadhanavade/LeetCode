class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //queue
        char QueueArr[] = strs[0].toCharArray();
        int end = QueueArr.length;

        for(int i=1; i<strs.length; i++)
        {   //traversal 
            int cnt = 0;

            //cnt < end avoid case if arr[0] = "" contains empty string
            while(cnt < end && cnt < strs[i].length() 
                             && QueueArr[cnt] == strs[i].charAt(cnt))
            {
               // if(strs[i].charAt(next) == QueueArr[end] && QueueArr[end]!='0')
                    cnt++;
        
            }
            end = cnt;
        }

        if(end == 0)
            return "";
        
        return new String(QueueArr,0,end);
    }
}