package class7;

public class E9WhileLoop {
    public static void main(String[] args) {
        //print 25  10 5
        int counter=25;

        while(counter>=5){
            if(counter!=15 && counter!=20){// use logical operator to exclude
                System.out.print(counter+" ");}
            counter-=5;
        }
    }
}
