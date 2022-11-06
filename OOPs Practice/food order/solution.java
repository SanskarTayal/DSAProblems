import java.util.*;


public class solution {
    public static void main(String[] args) {
        List<Object> items= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        order takeorder= new order();
        items=takeorder.orderitems(n);
        makebill bill= new makebill();
        int price=bill.makebilll(items);
        System.out.println(price);
        sc.close();
        
        
    }
}
