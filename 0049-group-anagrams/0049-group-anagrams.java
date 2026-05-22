class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
       
        // traverse the whole array
        for(int i=0; i<strs.length; i++)
        {
            // convert string into char array
             char ch[] = strs[i].toCharArray();

             // sort character array
            Arrays.sort(ch);

            // create sorted string
            String sortedstr = new String(ch);

            ArrayList<String> list;

            // if group already exists
            if(map.containsKey(sortedstr))
            {
                // get old list from map
                list = map.get(sortedstr);

                // add current string into same group
                list.add(strs[i]);
            }
            else
            {
                // create new group
                list = new ArrayList<>();

                // add current string
                list.add(strs[i]);

                // store new group in map
                map.put(sortedstr, list);
            }
        }

        // return all grouped lists
        return new ArrayList<>(map.values());
    }
}