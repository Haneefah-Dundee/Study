package class14;

public class E1Methods {

    void printWord(String word){
        System.out.println(word);
        //void: method return type. can be any datatype, class, objects such as arrays.
        //printWord: name of the method
        //(String word): parameters or input
        //{   }: body of method. add code to be executed.
    }


    public static void main(String[] args) {
        E1Methods obj = new E1Methods();//"new E1Methods" responsible for
        // creating an object of the class
        obj.printWord("Java");



    }
}
