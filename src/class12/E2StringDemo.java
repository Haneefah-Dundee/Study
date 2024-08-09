package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String userName="Admin";
        String passWord="pass123";

        //write a code to check the userName and password
        // if the userName and password are less than 8 charac then "Signup Successful"
        // else "userName and password cant be more than 8 characters"

        if(userName.length()<8 && passWord.length()<8){
            System.out.println("Signup Successful");

        }else{
            System.out.println("userName and password cant be more than 8 characters");
        }
    }
}
