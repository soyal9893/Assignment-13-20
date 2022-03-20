class dog{
   public void speak(){
       System.out.println("woof, woof !");
   }
   public static class beagle extends dog{
       public void speak(){
           System.out.println("arf,arf!");
       }
   }
}
public class AsQ_7 {
    public static void main(String[] args) {
        System.out.println("hello");
        dog d= new dog();
        d.speak();
        dog b=new dog.beagle();
        b.speak();
    }

}
