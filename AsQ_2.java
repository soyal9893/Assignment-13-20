class bike{
    int tyer;
    int speed;
    String name;
}
class car{
    int tyer;
    int speed;
    String name;
}
class truck{
    int tyer;
    int speed;
    String name;
}
//create different objects like 1)bike 2)car, 3)trek
public class AsQ_2 {
    public static void main(String[] args) {
     bike b=new bike();
     car c= new car();
     truck t=new truck();
     b.name="honda CBZ";
     b.speed=250;
     b.tyer=2;
     c.name="honda city";
     c.speed=290;
     c.tyer=4;
     t.name="tata jambo";
     t.speed=150;
     t.tyer=54;
        System.out.println(b.name);


    }
}
