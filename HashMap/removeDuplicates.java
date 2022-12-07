public import java.util.*;

public class Solution {

	public static String uniqueChar(String str){
		HashSet<Character> set = new HashSet<>();
		int len=str.length();
		String stri="";
		for(int i=0;i<len;i++)
		{
			if(set.contains(str.charAt(i)))
			continue;
			else
			{
			stri=stri+str.charAt(i);
			set.add(str.charAt(i));
			}
		}
	return stri;
	}
} removeDuplicates {
    
}
