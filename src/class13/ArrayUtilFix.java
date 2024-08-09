package class13;

public class ArrayUtilFix {
    public static void main(String[] args) {
//write a logic to searcg if a num is in an array
        int[] arr = {10, 20, 45, 89};
        int[] arr1 = {12, 32, 455, 889};

        int numSearch = 45;
        int numSearch1 = 4;
        ArrayUtilFix obj=new ArrayUtilFix();
        obj.searchArray(arr,numSearch);
        obj.searchArray(arr1,numSearch1);




        }void searchArray ( int[] ar, int a){

     for (int i = 0; i < ar.length ; i++) {
        if(ar[i]==a){

            System.out.println("number found");
            break;
        }
     }
    }
}