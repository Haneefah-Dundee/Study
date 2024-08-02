package class11;

public class E2D2Array {
    public static void main(String[] args) {
        String [][] names={{"Sarah","Artem","Lean","Samir"},
                           {"Farwa","Ann","Alina","Semir"}};


        for (int m = 0; m < names.length ; m++) {
        String[]nRow=names[m];
        for (int i = 0; i < nRow.length ; i++) {
            System.out.print(nRow[i]+" ");

        }
        System.out.println();
        }
    }
}
