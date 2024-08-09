package class13;

public class E2StringDemoRepAllRegex {
    public static void main(String[] args) {
        String str="njkaLhIPy@!opGHmeY";
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[0-9]","%"));
        System.out.println(str.replaceAll("[a-z0-9]","%"));
        System.out.println(str.replaceAll("[a-zA-Z]","%"));
        System.out.println(str.replaceAll("[a-k]","@"));

        //computer follow the Ascii Table
        char c='A';
        c++;
        System.out.println(c);//B
        System.out.println("============================");
        for (int i = 0; i < 10; i++) {
            System.out.print(c+++" ");

        }
    }
}
