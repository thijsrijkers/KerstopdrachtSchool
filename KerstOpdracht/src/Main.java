import ProductToSell.*;

public class Main {
    public static void main(String[] args)
    {
        Tree boom = new Tree(TreeEnum.Plastic);
        System.out.println("Prijs van boom is "+ boom.GetPrice());

        Light light = new Light(LengthOfLightEnum.tenMeter, LightEnum.RGB);
        boom.AddLightToTree(light);

        System.out.println("Deze licht in boom is dit "+ boom.GetLightType());
        System.out.println("Deze lengte van dit boom is dit "+ boom.GetLengthLight());
    }
}

