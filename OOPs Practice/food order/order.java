import java.util.*;
public class order {
    public List<Object> orderitems(int n)  
    {
        Scanner sc= new Scanner(System.in);
        List<Object> lst= new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            if(sc.nextLine()=="pizza")
            {
            pizza piz=new pizza();
            lst.add(piz);
            System.out.println(piz.getPrice());
        
            }
            else if(sc.nextLine()=="burger")
            {
                burger bur= new burger();
                lst.add(bur);
            
            }
        }
        sc.close();
        return lst;
    }
}
