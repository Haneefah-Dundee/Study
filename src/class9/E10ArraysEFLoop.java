package class9;

public class E10ArraysEFLoop {
    public static void main(String[] args) {
        int [] numbers={45,50,20,30,-50,45};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");

        }

        System.out.println();

// enhanced for loop of the above

        for (int number : numbers) {
            System.out.print(number+" ");}

        }
}
