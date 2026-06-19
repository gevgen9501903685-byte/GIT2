package книга;

public class Vegetarian extends AEater{
    String getBroccoli(){
        return "broccoli";
    }
    String getCorn(){
        return "corn";
    }

    @Override
    String order(IChef r, Integer n) {
        return r.cookVeggie(this,n);
    }
}
