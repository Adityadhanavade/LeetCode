class Solution {

    HashMap<String, Boolean> memo = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {

        return solve(s, wordDict);
    }

    public boolean solve(String s, List<String> wordDict)
    {
        // BASE CASE
        if(s.length() == 0)
        {
            return true;
        }

        // already solved?
        if(memo.containsKey(s))
        {
            return memo.get(s);
        }

        // try every word
        for(String item : wordDict)
        {
            // does string start with current word?
            if(s.startsWith(item))
            {
                // remaining string
                String remaining =
                        s.substring(item.length());

                // recursive call
                if(solve(remaining, wordDict))
                {
                    memo.put(s, true);
                    return true;
                }
            }
        }

        // store failed state
        memo.put(s, false);

        return false;
    }
}


/*
boolean solve(String s)
{
    // base case

    // traverse dict

        // if word matches

            // remaining string

            // recursive call

}
*/


/*

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        //first we create array of Charc
        StringBuilder str = new StringBuilder("");
       
       //create the empty list helper 
       List<String> helperList = new ArrayList<>();

        //Treverse the List
        for(String item : wordDict)
        {
            //check/match item with wordDict
            if(wordDict.contains(item) && !(helperList.contains(item)))
            {   
                helperList.add(item);
                str.append(item);
            }
        }

        if(str.length() == s.length())
        return true;

        return false;
    }
}

*/