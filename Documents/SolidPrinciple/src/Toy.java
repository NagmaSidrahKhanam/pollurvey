
 interface ToyBuilder {


    public void flytoy();
    public void movetoy();
    public void flymovetoy();
    public  void stationarytoy();

}

  public class Toy  implements ToyBuilder{

     private int id;
     private float price;
     private String color;
     private String category;
     private int height;
     private int width;
     private int weight;

     @Override
     public void flymovetoy() {
         System.out.println("Toys have flying feature");

     }

      @Override
      public void movetoy() {

      }

      @Override
      public void flytoy() {

      }

      @Override
      public void stationarytoy() {

      }
  }