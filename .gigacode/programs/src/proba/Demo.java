package proba;

public class Demo {
    public static void main(String[] args) {
        Proba pt = new Proba();
    }



}
class Text{
    public void show(){
        System.out.println("Hai");
    }
}
class Proba{

    {
        Text pt= new Text();
        pt.show();
    }

}