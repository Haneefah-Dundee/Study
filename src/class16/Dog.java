package class16;

public class Dog {
    String name;
    String color;
    String breed;

    static int age;

    void bark(){
        System.out.println(name+" is barking");
    }

    void printInfo(){
        if(breed.equals("German")){
            System.out.println(name+" "+color+" i can work for NYPD");
        }else{
            System.out.println(name+" I can be a pet");
        }
    }

     static void printInfo2(){
        if (age<10){
            System.out.println("Young Dog");
        }else{
            System.out.println("Old Dog");
        }
     }

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.breed="German";
        obj.color="Black";
        obj.name="Jack";

        Dog obj2 = new Dog();
        obj.breed="Poodle";
        obj.color="White";
        obj.name="Winnie";

        //instance method behave differently depending on which object calls it
        obj.printInfo();
        obj2.printInfo();

        //Can call a static method/variable directly from the class
        Dog.age=20;
        Dog.printInfo2();
        obj.age=30;
        //Dog.printInfo();  cannot call directly a non static method

        //static method remains the same across all methods
        //cannot use instance variables in a static method







    }
}
