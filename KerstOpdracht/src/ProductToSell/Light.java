package ProductToSell;

public class Light
{
    private LengthOfLightEnum length;
    private LightEnum lightType;
    private double priceLight;

    public Light(LengthOfLightEnum length, LightEnum lightType)
    {
        this.lightType = lightType;
        this.length = length;

        this.priceLight = GetPriceBasedOnLength();
    }

    public LightEnum GetLightType()
    {
        return lightType;
    }

    public LengthOfLightEnum GetLength()
    {
        return length;
    }

    private double GetPriceBasedOnLength()
    {
        double currentPrice = 0;
        int cm = 0;

        switch(length)
        {
            case oneMeter:
                cm = 100;
                break;
            case tenMeter:
                cm = 1000;
                break;
            case fiveMeter:
                cm = 500;
                break;
            case thirtyMeter:
                cm = 3000;
                break;
        }

        switch(lightType)
        {
            case RGB:
                currentPrice = 5+ (0.03 * cm);
                break;
            case White:
                currentPrice = 8+(0.05 * cm);
                break;
            case RGBMobileApp:
                currentPrice = 9.50+(0.08 * cm);
                break;
            case RGBFlickering:
                currentPrice = 95+(0.6 * cm);
                break;
        }

        return currentPrice;
    }
}
