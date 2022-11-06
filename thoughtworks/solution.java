import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Viewing Hours For Netflix: ");
        int a= sc.nextInt();
        System.out.println("Viewing Hours for Amazon Prime");
        int b=sc.nextInt();
        System.out.println("Viewing Hours for Hotstar");
        int c=sc.nextInt();
        sc.close();
        check che=new check();
        if(che.valid(a,b,c)!=true)
        return;
        Calculate sum= new Calculate();
        sum.Calc(a, b, c);
        return;

    }
}