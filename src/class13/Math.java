package class13;

public class Math {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void multiple(int a, int b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Math obj=new Math();
        obj.add(3,5);
        System.out.println("==========================================================");
        obj.multiple(2,9);
    }
}
