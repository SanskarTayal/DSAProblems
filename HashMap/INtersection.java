import java.util.*;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    if (arr1.length == 0 || arr2.length == 0)
			return;
		HashSet<Integer> set= new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(set.contains(arr2[i]))
			{
				System.out.print(arr2[i]+" ");
				set.remove(arr2[i]);
			}
		}
	}

}




import java.util.*;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    if (arr1.length == 0 || arr2.length == 0)
			return;
		HashMap<Integer, Integer> harr1 = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (harr1.containsKey(arr1[i]))
				harr1.put(arr1[i], harr1.get(arr1[i]) + 1);
			else
				harr1.put(arr1[i], 1);
		}
	Arrays.sort(arr2);
		for (int i = 0; i < arr2.length; i++) {
		
			if (harr1.containsKey(arr2[i])) {
				if (harr1.get(arr2[i]) != 0) {

					System.out.print(arr2[i]+" ");
					harr1.put(arr2[i], harr1.get(arr2[i]) - 1);
				}
			} else
				continue;

		}
	}

}