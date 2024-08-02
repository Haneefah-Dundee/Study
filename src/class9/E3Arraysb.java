package class9;

public class E3Arraysb {
    public static void main(String[] args) {
        double [] numbers={10.5, 5.5, 0.05, 100.5, 586};

        int i =4;
        System.out.println(numbers[i]); //output 586

        for (int j = 0; j < numbers.length ; j++) //.length tells us how much elements in the array
        {
            System.out.print(numbers[j]+" ");//
            // we can use loop to access array
        }

    }
}
