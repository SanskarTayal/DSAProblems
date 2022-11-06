public class hotstar implements OTTPlatform {
    private int rate=1;
    private int hours=5;
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
        System.out.println("Hotstar allows viewing hours in multiples of 5 only");
        return false;
        }
        return true;
    }
}
