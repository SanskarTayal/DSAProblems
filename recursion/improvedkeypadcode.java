public class solution {

	public static void printKeypad(int input){
		pritntCombinations(input,"");
		return;
	}
	public static void pritntCombinations(int input,String curstr)
	{
		if(input==0)
		{
		System.out.println(curstr);
		return;
		}
		String[] curarray=tellsequence(input%10);
		for(int i=0;i<curarray.length;i++)
		{
			//System.out.println(curarray[i]);
			pritntCombinations(input/10,curarray[i]+curstr);
		}
	}
	public static String[] tellsequence(int n)
	{
		if(n<=1||n>9)
		return null;
		switch(n){
			case 2:
			{
				String[] output={"a","b","c"};
				return output;
			}
			case 3:
			{
				String[] output={"d","e","f"};
				return output;
			}
			 case 4:
			{
				String[] output={"g","h","i"};
				return output;
			}
			case 5:
			{
				String[] output={"j","k","l"};
				return output;
			}
			case 6:
			{
				String[] output={"m","n","o"};
				return output;
			}
			case 7:
			{
				String[] output={"p","q","r","s"};
				return output;
			}
			case 8:
			{
				String[] output={"t","u","v"};
				return output;
			}
			case 9:
			{
				String[] output={"w","x","y","z"};
				return output;
			}

				
		}
		String[] output={"w","x","y","z"};
				return output;		
	}
}
