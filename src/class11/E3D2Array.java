package class11;

public class E3D2Array {
    public static void main(String[] args) {
        String [][] names={{"Sarah","Artem","Lean","Samir"},
                           {"Farwa","Ann","Alina","Semir"}};

//Another way to print names. ENHANCED FOR LOOP.

        for(String [] nameArr:names){
            for(String rowName:nameArr){
                System.out.print(rowName+" ");
            }System.out.println();
        }

    }
}
