class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //we use map to store frequency of elements.
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        //first calculate the frequency of the elements 
        for(int i : nums)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }

        //we first store the unique frequency to sort
        ArrayList<Map.Entry<Integer,Integer>> arrlst = new ArrayList<>(map.entrySet());
        //sort the frequecy
        Collections.sort(arrlst,new MyComparator());

        int arr[] = new int[k];

        //here we finding the k most frequecy from last 
        for(int i=0; i<k; i++)
        {
            arr[i] = arrlst.get(i).getKey();
        }

        return arr;
    }
}


class MyComparator implements Comparator<Map.Entry<Integer,Integer>>
{
    public int compare(Map.Entry<Integer,Integer> obj1, Map.Entry<Integer,Integer> obj2)
    {   
        //arrange decending order.
        return obj2.getValue() - obj1.getValue();
    }
}