package ProductToSell;

public class Tree
{
    private Light lightBelongingToTree;
    private TreeEnum treeType;
    private double priceTree;

    public Tree(TreeEnum treeType)
    {
        this.treeType = treeType;
        this.priceTree = GetPriceFromType();
    }

    public void AddLightToTree(Light light)
    {
        this.lightBelongingToTree = light;
    }

    public double GetPrice()
    {
        return priceTree;
    }

    public String GetLightType()
    {
        return lightBelongingToTree.GetLightType().toString();
    }

    public String GetLengthLight()
    {
        return lightBelongingToTree.GetLength().toString();
    }

    private double GetPriceFromType()
    {
        switch(treeType)
        {
            case BlueSpruce:
                return 25.00;
            case Plastic:
                return 10.00;
            case Nordmann:
                return 30.00;
            case NordwaySpruce:
                return 20.00;
            default:
                return 0;
        }
    }
}
