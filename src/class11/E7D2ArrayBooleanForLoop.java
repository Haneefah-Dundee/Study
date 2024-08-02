package class11;

public class E7D2ArrayBooleanForLoop {
    public static void main(String[] args) {
        boolean[][] arr={{true,false,true,true,false},
                         {true,false,false,true,false,false}};
        //use loop to count how many times we have true in 2D array

        int sum=0;
        for (int m = 0; m < arr.length; m++) {
        boolean [] row=arr[m];
        for (int i = 0; i < row.length ; i++) {
            if(row[i]){
                sum++;
            }

        }
         }System.out.println(sum);
    }
}
