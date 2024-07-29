package class3;

public class E7StringConcat {
    public static void main(String[] args) {

        String firstName=" Jill";
        String lastName=" Jones";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

        String text=firstName+10; //concat results is a String no matter the other datatype attached
        System.out.println(text);
        // only addition in concat with Strings, no minus.,
    }
}
