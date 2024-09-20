public class ElectricBurner extends Burner
{
    private double voltReq;
    private double ampReq;
    /**
     * Constructor for ElectricBurner.
     * 
     * @param voltReq double
     */
    public ElectricBurner(double voltReq)
    {
        super(0, 0, 0);
        this.voltReq  = voltReq;
    }
    /**
     * Increases current temp.
     */
    public void increaseCurrent()
    {

    }
    /**
     * Decreases current volt.
     */
    public void decreaseCurrent()
    {

    }
    /**
     * Getter for voltReq.
     * 
     * @return voltReq
     */
    public double getVoltReq()
    {
        return voltReq;
    }
}
