package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="knlHOYFNsdehfgNBctrw8975$%@i*4mW";
        //no replacement will remove characters
        System.out.println(str.replaceAll("[a-z]",""));
        // ^ not operator similar to !
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        //replace all except whats in the code
        System.out.println(str.replaceAll("[^ai1dBkl]",""));
    }
}
