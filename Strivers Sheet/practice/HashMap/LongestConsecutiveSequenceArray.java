import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(arr[0]);
        ArrayList<Integer> list1= new ArrayList<>();

        int start=arr[0];
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],true);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]-1))
            {
                map.put(arr[i],false);
            }
        }
        for(Integer i:arr)
        {
            if(map.get(i)==true)
            {
                int tempstart=i;
                int len=0;
                while(map.containsKey(tempstart+len))
                {
                 //   System.out.println(len);
                    len++;
                    
                }
                if(len>max)
                {
                    
                // list[0]=tempstart;
                // list[1]=tempstart+len;
                max=len;
                start=tempstart;
               // System.out.println(tempstart+" "+tempstart+len);
                }
                
            }
        }
        if(max-1>0)
                {
                    list1.add(start);
                    list1.add(start+max-1);
                    return list1;
                }
        return list;

    }
}