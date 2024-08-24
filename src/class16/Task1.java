package class16;

public class Task1 {
    //create a method that will accept an array as parameters and
    // will return the sum of all elements from the array
    //Methis should be visible only within same package
    // and  access by creating an instance of the class

    int sum(int [] ar){

        int totalSum=0;
        for (int i = 0; i < ar.length ; i++) {
            totalSum=totalSum+ar[i];

        }
        return totalSum;
    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        int[] array={10,20,30,40};
        int finalSum=obj.sum(array);
        System.out.println(finalSum);
    }
}
