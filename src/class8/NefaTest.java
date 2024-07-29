package class8;

public class NefaTest {
    public static void main(String[] args) {
        //write a loop to add all the even 3s from 1 to 30


        int sum=0;
        int counter=1;

        while(counter<=30){
            if(counter%2==0){
                sum+=counter;

            }counter++;
        }
        System.out.println(sum);

        System.out.println("++++++++++++++FOR LOOP");

        int sum1=0;
        for(int i=1;i<=30;i++){
            if(i%2==0){
                sum1+=i;
            }
        }
        System.out.println(sum1);
    }
}
