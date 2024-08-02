package class11;

public class E6D2ArrayForLoop {
    public static void main(String[] args) {
        int [][] arr={{10,20,30,40,50},
                      {1,2,3,4,5},
                      {5,5,5,5,5},
                      {10,8,6,4,2}};

        //use loop to sum the numbers in each row and print each

        for (int m = 0; m < arr.length ; m++) {

       int [] row=arr[m];
       int sum=0;// Initialize sum to 0 for each row
        for (int i = 0; i < row.length ; i++) {
            sum=sum+row[i];

        }System.out.println(sum);
        }

    }
}
