package книга;

public class ChefZung implements IChef{

    static final ChefZung singl = new ChefZung();

    private ChefZung(){}

    public String cookVeggie(Vegetarian h, Integer n){
        return n + "порция " +h.getCorn() + "," + h.getSalt();
    }
    public String cookMeat(Carnivore h, Integer n){
        return n + " порция "+ h.getMeat() + ","+h.getPepper()
                +", " + h.getSalt();
    }
}
