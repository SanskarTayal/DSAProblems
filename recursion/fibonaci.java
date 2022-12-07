
import java.util.*;
class olution{
public static void  main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    System.out.println(fibo(s));
    sc.close();
}
public static int fibo (int i)
{
    if(i<=1)
    return i;
    return fibo(i-1)+fibo(i-2);
}
}