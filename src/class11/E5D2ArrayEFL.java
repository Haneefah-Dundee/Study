package class11;

public class E5D2ArrayEFL {
    public static void main(String[] args) {
        int [][] arr={{10,20,30,40,50},
                      {1,2,3,4,5},
                      {5,5,5,5,5},
                      {10,8,6,4,2}};

        //use loop to count how many numbers in above are even ENHANCED FOR LOOP
        int sum=0;
        for(int [] row:arr){
            for(int element:row){
                if(element%2==0){
                    sum++;
                }
            }
        }
        System.out.println(sum);

    }
}
