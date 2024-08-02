package class10;

public class task {
    public static void main(String[] args) {
        //From an array of integer find the largest number

        int [] numbers={10,20,50,40,30};

        int largest=numbers[0];
       for (int num:numbers){
           if (num>largest){largest=num;}
       }
        System.out.println(largest);
    }
}
