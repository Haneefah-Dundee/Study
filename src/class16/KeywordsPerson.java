package class16;

public class KeywordsPerson {
    private String password;
    //private keyword restrict the variable from been accessed by other class

    //static field/method can be private
      static double balance=12000;
     private void printPassword(){
        System.out.println(password);
    }

    private static  void printBalance(){
        System.out.println(balance);
    }
    public static void main(String[] args) {
        KeywordsPerson obj=new KeywordsPerson();
        obj.password="12345";// can access it because in the same class
        obj.printPassword();
        System.out.println(KeywordsPerson.balance);
    }
}// refer to Person Tester
