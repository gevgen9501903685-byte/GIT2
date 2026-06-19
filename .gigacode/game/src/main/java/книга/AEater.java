package книга;

public abstract class AEater {

    String getSalt(){
        return "salt";
    }
    String getPepper(){
        return "pepper";
    }
    abstract String order(IChef r, Integer n);
}
