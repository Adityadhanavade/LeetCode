class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        
        //hasmap
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

        for(int item : nums)
        {
            if(map.containsKey(item))
            {
                map.put(item, map.get(item)+1);
            }
            else
            {
                map.put(item, 1);
            }
        }

        ArrayList<Integer> arrlst = new ArrayList<>();
        for(Map.Entry<Integer,Integer> item : map.entrySet())
        {   int limit = 0;

            while(limit < k && item.getValue() > limit)
            {
                arrlst.add(item.getKey());
                limit++;
            }
        }

        int arr[] = new int[arrlst.size()];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=arrlst.get(i);
        }
        return arr;
    }
}