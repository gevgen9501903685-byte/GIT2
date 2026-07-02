package книга;

public class Chefwong implements IChef{

    static final Chefwong singl = new Chefwong();

    private Chefwong(){}

    public String cookVeggie(Vegetarian h, Integer n){
        return n + " порция " +h.getCorn() + "," + h.getSalt();
    }
    public String cookMeat(Carnivore h, Integer n){
        return n + " порция "+ h.getMeat() + ","+h.getPepper();
    }
}
