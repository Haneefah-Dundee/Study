package class12;

public class Car {
    String color;
    String brand;
    int maxSpeed;
    boolean isFast;
    boolean isGas;


    void speed(){
        System.out.println(color+" "+brand+" Is going fast");
    }

    void breaks(){
        System.out.println("Is slowing down");
    }
      void turn(){
        System.out.println("Is turning left");
    }

}
