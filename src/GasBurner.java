public class GasBurner
{
    private String gasType;
    /**
     * Constructor for GasBurner.
     */
    public GasBurner()
    {
        gasType = "";
    }
    /**
     * Checks for spark.
     * 
     * @return boolean
     */
    public boolean spark()
    {
        return true;
    }
    /**
     * Getter for gasType.
     * 
     * @return gasType
     */
    public String getGasType()
    {
        return gasType;
    }
    /**
     * Increases gas flow.
     */
    public void increaseGasFlow()
    {

    }
    /**
    * Decreases gas flow.
    */
    public void decreaseGasFlow()
    {

    }
}
