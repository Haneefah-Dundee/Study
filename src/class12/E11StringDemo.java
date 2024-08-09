package class12;

public class E11StringDemo {
    public static void main(String[] args) {
        String name="Today is Saturday";
        //what is the index of a specific letter
        System.out.println(name.indexOf('i'));
        System.out.println(name.indexOf('a'));//start search from left to right return first
        System.out.println(name.indexOf('a',4));//specify which index to start search

        //write a code that will print the index of all a's
        System.out.println("==================================");

        for (int i = 0; i <name.length(); i++) {
            if(name.charAt(i)=='a'){
                System.out.print(i+" ");
            }

        }
    }
}
