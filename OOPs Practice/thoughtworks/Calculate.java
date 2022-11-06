public class Calculate{
    void Calc(int a,int b,int c){
    netflix net= new netflix();
    amazon ama= new amazon();
    hotstar hot= new hotstar();
    int sum=a/net.getHours()*net.getRate()+b/ama.getHours()*ama.getRate()+c/hot.getHours()*hot.getRate();
   
    System.out.println("The amount should be paid:"+sum);
    
}
}
