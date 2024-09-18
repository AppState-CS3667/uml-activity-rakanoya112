public abstract class Burner
{
    private double diameter;
    private double maxTemp;
    private double minTemp;
    private boolean isHot;
    /**
     * Constructor for Burner
     * 
     * @param maxTemp double
     * @param minTemp double
     * @param diameter double
     */
    public Burner(double maxTemp, double minTemp, double diameter)
    {
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.diameter = diameter;
    }
    /**
     * Turns burner on. 
     * 
     * @return boolean
     */
    public boolean TurnOn()
    {
        return true;
    }
    /**
     * Turns burner off.
     * 
     * @return boolean
     */
    public boolean turnOff()
    {
        return true;
    }
    /**
     * Increases temp.
     */
    public void increaseTemp()
    {

    }
    /**
     * Decreases temp.
     */
    public void decreaseTemp()
    {

    }
    /**
     * Getter for diameter.
     * 
     * @return diameter 
     */
    public double getDiameter()
    {
        return diameter;
    }
    /**
     * Getter for maxTemp.
     * 
     * @return maxTemp
     */
    public double getMaxTemp()
    {
        return maxTemp;
    }
    /**
     * Getter for minTemp.
     * 
     * @return minTemp
     */
    public double getMinTemp()
    {
        return minTemp;
    }
    /**
     * Getter for isHot.
     * 
     * @return isHot
     */
    public boolean isHot()
    {
        return isHot;
    }
}
