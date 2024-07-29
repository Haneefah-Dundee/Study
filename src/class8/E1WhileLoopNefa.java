package class8;

public class E1WhileLoopNefa {
    public static void main(String[] args) {
        //print whole numbers from 15-30

        for(int i=15;i<=30;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        int counter=15;
        while(counter<=30){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();

        int doCounter=15;
        do{
            System.out.print(doCounter+" ");
        doCounter++;}
        while(doCounter<=30);
    }
}
