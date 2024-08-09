package class12;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //Store username, password and confirm password from a user. check following req.
        //Username and password cannot be empty; if so message it
        //password should be minimun 8 charac. if less message"password is too short;
        //password cannot contain username if so message
        //password should match confirmed password if not "passwords do not match"
        //Only after all req men then message "your username and password has been created

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your username");
        String userName=scan.next();
        System.out.println("Please enter your password");
        String passWord=scan.next();

        if(userName.isEmpty()||passWord.isEmpty()){//better to use .isBlank() over .isEmpty()
            System.out.println("Username and password cannot be empty");
        }
        else if(passWord.length()<8){
            System.out.println("password is too short");
        }
        else if(passWord.contains(userName)){
            System.out.println("password cannot contain username");
        }
       else if(!passWord.equals("Killian325")){
            System.out.println("passwords do not match");
        }
       else{
            System.out.println("your username and password has been created");
        }


    }
}
