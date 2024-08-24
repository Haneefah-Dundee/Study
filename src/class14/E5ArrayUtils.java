package class14;

public class E5ArrayUtils {
    /*
    create a method, call it contains. it should take an array of int and int number.
    In the body it should search the array for that number, if number is present
    method should return true, otherwise return false. Call the method and test it. for below input
    {10,20,45} , int num 20

    return type: boolean
    method name: contains
    parameter: int [] arr, int num
     */

    boolean contains(int []arr,int num){
        boolean isFound=false;
        for (int i = 0; i < arr.length ; i++) {
            if(num==arr[i]){
                isFound=true;
                break;//once its true we break, so it won't search the others.

            }

        }return isFound;//
    }

    public static void main(String[] args) {

        E5ArrayUtils obj=new E5ArrayUtils();
        int [] ar={10,20,45};
        int numSearch=20;
       boolean result= obj.contains(ar,numSearch);
        System.out.println(result);
    }
}
