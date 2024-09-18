public class Stove extends Burner
{
    private Burner[] burners;
    public Stove()
    {
        burners = new Burner[0];
    }
    public boolean hookUp()
    {
        return true;
    }
    public void setBurnerTemp(int burner, double temp)
    {
        
    }
    public boolean isHot()
    {
        return true;
    }
    public boolean isHot(int burner)
    {
        return true;
    }
    public double getBurnerTemp(int burner)
    {
        return burner;
    }
    public Burner getBurner(int burner)
    {
        return burners[burner];
    }
}
