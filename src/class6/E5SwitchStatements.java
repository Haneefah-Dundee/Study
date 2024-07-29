package class6;

public class E5SwitchStatements {
    public static void main(String[] args) {

      //  double num = 10.5;  not compatible

       // switch(num){}

        char gender='l';

        switch(gender){
            case 'F':
                System.out.println("I am a girl");
                break;
            case 'M':
                System.out.println("Im a boy");
                break;
            default:
                System.out.println("Invalid Gender");
        }
    }
}
