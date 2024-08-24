package class16;

public class Cat {
    private String name;
    private String breed;
    private String color;

    //indirect access to private variables
    public void printInfo(String password){
        if(password.equals("pass1234")){
            System.out.println(name);
        }
        else{
            System.out.println("incorrect password");
        }
    }
}
