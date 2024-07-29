package class8;

public class E3ForLoop {
    public static void main(String[] args) {
        int counter=1;
        int sum=0;

        while (counter<=30){
            if(counter % 2 ==0){
                sum=sum+counter;

            }  counter++;
        }System.out.println(sum);


        System.out.println("==============OR ForLoop=============");

        int add=0;
        for(int i=1;i<=30;i++){
            if(i%2==0){
                add+=i;
            }
        }
        System.out.println(add);

    }
    }
