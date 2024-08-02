package class9;

public class E12Arrays {
    public static void main(String[] args) {
        //two ways to create arrays

        int [] numbers=new int[5];//an array of integer is created with size 5
        int num=50;
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=num;
            num=num+10;
            }

       /* numbers[0]=50;
        numbers[1]=60;
        numbers[2]=70;
        numbers[3]=80;
        numbers[4]=90;
        // do this with the help of loop*/

        for(int nums:numbers){
            System.out.print(nums+" ");
        }



    }
}
