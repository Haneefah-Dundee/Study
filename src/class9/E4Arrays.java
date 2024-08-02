package class9;

public class E4Arrays {
    public static void main(String[] args){
        /*
        create an array of Strings, atore 5 names in it . print all the names with the help
        of a for loop and while loop
         */

        String [] names={"Jane","Hansel","Bob"," Mary"," Tom"};

        for (int i = 0; i < names.length ; i++) {
            System.out.print(names[i]+" ");

        }
        System.out.println();

        int j =0;
        while (j< names.length){
            System.out.print(names[j]+" ");
            j++;
        }
    }
}
