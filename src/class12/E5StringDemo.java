package class12;

public class E5StringDemo {
    public static void main(String[] args) {
        String name="   ";
        System.out.println(name.isEmpty());// does not read blank spaces
        System.out.println(name.isBlank());//read blank spaces
    }
}
