import java.util.*;
public class makebill {
    int makebilll(List<Object> orde){
    int sum=0;
    for(int i=0;i<orde.size();i++)
    {
        sum+=(((pizza)orde.get(i)).getPrice());
    }
    return sum;
}
}
