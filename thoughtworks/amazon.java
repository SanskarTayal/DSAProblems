public class amazon implements OTTPlatform{
    private int rate= 2;
    private int hours= 5;
    public int getRate()
    {
        return this.rate;
    }
    public int getHours()
    {
        return this.hours;
    }
    public boolean check(int a)
    {
        if(a%hours!=0)
        {
        System.out.println("Amazon Prime allows viewing hours in multiples of 5 only");
        return false;
        }
        return true;
    }
}
