package class15;

public class E3 {
    //create a method that takes an Array as input
    //it adds all the numbers from the array and returns the sum.
    //name of method is sumArr
    //eg sumArr({10,10,10})=> output=30;

    int sumArr(int [] array){

        int sum=0;
        for (int i = 0; i <array.length ; i++) {

            sum=sum+array[i];

        }return sum;


    }

    public static void main(String[] args) {
        E3 obj=new E3();
        int [ ] ar={10,20,50,40};

        int total=obj.sumArr(ar);
        System.out.println(total);
    }
}
