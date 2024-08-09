package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String name="LEANDRORrrr";
       // System.out.println(name.charAt(0));

        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();

    int sum=0;
        //count how many times R appear in this loop
        for (int m = 0; m <name.length(); m++) {
            if(name.charAt(m)=='r'||name.charAt(m)=='R'){

                sum++;
            }
        }
        System.out.println(sum);


    }
}
