package class13;

public class ArrayUtilUseBooleanToAddElse {
    public static void main(String[] args) {
//write a logic to search if a num is in an array
        int [] arr={10,20,45,89};

int numSearch=100;
boolean found=false;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==numSearch){

                System.out.println("number found");
                found=true;
                // break it when number is found
                break;
            }

        }if(!found){
            System.out.println("number not present");
        }
    }
}
