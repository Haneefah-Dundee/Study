package class9;

public class E11ArraysTwoTypes {
    public static void main(String[] args) {
        //two ways to create arrays

        int [] numbers=new int[5];//an array of integer is created with size 5
        numbers[0]=50;
        numbers[1]=92;
        numbers[2]=4;
        numbers[3]=3;
        numbers[4]=62;

        for(int num:numbers){
            System.out.println(num);
        }



    }
}
