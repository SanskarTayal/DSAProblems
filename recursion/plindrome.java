
import java.util.*;
class Solution{
public static void  main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    System.out.println(palin(s,0,s.length()));
    sc.close();
}
public static boolean palin (String s,int i, int n)
{
    if(i>=n/2)
    return true;
    if(s.charAt(i)!=s.charAt(n-i-1))
    return false;
return palin(s,i+1,n);
}
}