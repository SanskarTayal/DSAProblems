import java.util.*;
public class solution {
    public static void main(String args[])
    {
        Sanskar san= new Sanskar();
        san.setter("Sanskar Tayal");
        san.getName();
        Cars honda= new Cars(4,500,20000,"Honda");
        System.out.println(honda.topspeed);
        List<Cars> lst= new ArrayList<>();
        lst.add(honda);
        lst.get(0).breaking();
    }

    
}
