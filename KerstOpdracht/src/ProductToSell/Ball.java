package ProductToSell;

public class Ball
{
    private double priceBall;
    private double thiccnessOfBall;
    private ColorBall color;

    public Ball(double priceBall, ColorBall color, double thiccnessInCm) throws ChristmasBallTooBigException {
        this.priceBall = priceBall;
        this.color = color;
        this.thiccnessOfBall = GetThiccness(thiccnessInCm);
    }

    public double GetThiccness(double value)throws ChristmasBallTooBigException
    {
        try
        {
            if(value <= 30.0)
            {
                return value;
            }
        } catch (Exception e)
        {
            throw new ChristmasBallTooBigException();
        }

        return 0.0;
    }
}
