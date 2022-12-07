public class solution {

	public static String[] keypad(int n){
		if(n==0){
		String[] ans= new String[1];
		ans[0]="";
		return ans;
		}
		String[] previousoutput=keypad(n/10);
		int curnum=n%10;
		String[] curnumlist=tellsequence(curnum);
		String[] newoutput=new String[previousoutput.length*curnumlist.length];
		int k=0;
		for(int i=0;i<curnumlist.length;i++)
		{
			for(int j=0;j<previousoutput.length;j++)
			{
				newoutput[k]=previousoutput[j]+curnumlist[i];
				k++;
			}
		}
		return newoutput;
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
		return null;		
	}
}
