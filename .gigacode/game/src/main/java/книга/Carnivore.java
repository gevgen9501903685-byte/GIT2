package книга;

public class Carnivore extends AEater{

    String getMeat(){
        return "steak";
    }
    String getChicken(){
        return "Chicken";
    }
    String getDog(){
        return "Dog";
    }


    @Override
    String order(IChef r, Integer n) {
        return r.cookMeat(this,n);
    }
}
