public class netflix implements OTTPlatform{
    private int rate = 10;
    private int hours= 10;
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
            System.out.println("Netflix allows viewing hours in multiples of 10 only");
        return false;
        }
        return true;
    }
    public void printhours()
    {
        System.out.println("hello");
    }

}
