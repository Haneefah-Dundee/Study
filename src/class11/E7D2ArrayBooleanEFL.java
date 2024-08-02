package class11;

public class E7D2ArrayBooleanEFL {
    public static void main(String[] args) {
        boolean[][] arr={{true,false,true,true,false},
                         {true,false,false,false,false}};
        //use loop to count how many times we have true in 2Darray

        int sum=0;
        for(boolean [] row:arr){
            for(boolean element:row){
                if(element){
                    sum++;
                }
            }
        }System.out.println(sum);



    }
}
