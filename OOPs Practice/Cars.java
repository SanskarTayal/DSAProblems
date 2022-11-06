public class Cars implements carsFunctions{
int wheels;
int topspeed;
int price;
String company;
Cars()
{

}
Cars(int wheel, int topspeed, int price,String company){
    this.wheels=wheel;
    this.topspeed=topspeed;
    this.price=price;
    this.company=company;
}
void print(){
    System.out.println("The brans name is"+this.company);
}
public void run()
{
System.out.println("This car runs at a top speed of "+ this.topspeed );
}
@Override
public void breaking() {
    System.out.println("This car brakes in 2 seconds");
}
}
