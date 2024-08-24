package class14;

public class E2MethodArray {
    /*
    create a method that will take an int array call it sumArr
     return the sum of all the element from that array, create
     the object of the class and call the method
     STEPS:
     1.return type
     2.name of the method
     3.parameter
     4.body
      */

    int sumArr(int [] arr){
        int arrSum=0;
        for (int i = 0; i <arr.length ; i++) {
            arrSum=arrSum+arr[i];

        }
        return arrSum;
    }

    public static void main(String[] args) {
        E2MethodArray obj = new E2MethodArray();

        int[] ar={10,20,30,40};
        int e=obj.sumArr(ar);
        System.out.println(e);
    }

}
