package class13;

public class Printer {

        //method can be static
        void printSomething(){
                System.out.println("Hello Java");
                System.out.println("Hello Java");
                System.out.println("Hello Java");
                System.out.println("Hello Java");
        }
//method can by dynamic or parameterized // user can pass something in it
        void printWord(String word){
                System.out.println(word);
                System.out.println(word);
                System.out.println(word);
                System.out.println(word);
        }
        void printWordManyTimes(String word,int number){
                for (int i = 0; i <number ; i++) {
                        System.out.println(word);

                }
        }

}
