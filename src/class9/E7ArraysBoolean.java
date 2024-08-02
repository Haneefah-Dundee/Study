package class9;

public class E7ArraysBoolean {
    public static void main(String[] args) {
        boolean [] flags={true,false,true,false,false,true};
        //write a loop to count how many in the array are false

        int sum=0;
        for (int i = 0; i < flags.length ; i++) {
            if(flags[i]==false){
                sum=sum+1;
            }

        }
        System.out.println(sum);
    }
}
