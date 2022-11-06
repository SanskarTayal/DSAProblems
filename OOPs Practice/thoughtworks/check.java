public class check {

    netflix net= new netflix();
    amazon ama= new amazon();
    hotstar hot= new hotstar();
    public boolean valid(int a,int b,int c)
    {
        return(net.check(a)&&ama.check(b)&&hot.check(c));
    }
    
}
