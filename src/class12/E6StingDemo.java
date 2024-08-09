package class12;

public class E6StingDemo {
    public static void main(String[] args) {
        String name="Justin";
        System.out.println(name.equals("Jemma"));
        System.out.println(name.equals("Justin"));
        System.out.println(name.equalsIgnoreCase("JustiN"));
        System.out.println(!name.equalsIgnoreCase("JustiN"));// not equals
    }
}
