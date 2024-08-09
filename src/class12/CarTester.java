package class12;

public class CarTester {
    public static void main(String[] args) {


    Car car =new Car();
    car.color="Black";
    car.brand="Toyota";
    car.maxSpeed=350;
    car.isFast=true;
    car.isGas=false;
    car.speed();
    car.turn();
    car.breaks();

    Car car2 =new Car();
    car2.color="pink";
    car2.brand="Toyota";
    car2.maxSpeed=350;
    car2.isFast=true;
    car2.isGas=true;
    car2.speed();
    car2.turn();
    car2.breaks();


}
}