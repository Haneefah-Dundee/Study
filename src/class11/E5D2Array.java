package class11;

public class E5D2Array {
    public static void main(String[] args) {
        int [][] arr={{10,20,30,40,50},
                      {1,2,3,4,5},
                      {5,5,5,5,5},
                      {10,8,6,4,2}};

        //use loop to count how many numbers in above are even
        int sum=0;
        for (int m = 0; m < arr.length ; m++) {

        int [] row=arr[m];
        for (int i = 0; i < row.length; i++) {
            if(row[i]%2==0){
                sum=sum+1;
            }

        }

        }System.out.println(sum);

    }
}
