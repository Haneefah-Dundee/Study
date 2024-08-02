package class9;

public class E8Arrays {
    public static void main(String[] args) {

       //print all the #s from 6-0 in reverse order
        //PRINT THIS IN REVERSE ORDER ALSO {'A','B','C','D','E','F'}

        for (int i = 6; i >=0 ; i--) {
            System.out.print(i+" ");

        }
        System.out.println();

        char [] characs={'A','B','C','D','E','F'};

        for (int k=characs.length-1; k>=0 ; k--) {
            System.out.print(characs[k]+" ");

        }
    }
}
