package class3;

public class E8StringConcat {
    public static void main(String[] args) {
        System.out.println("Leo"+10+10);
        //java execute from top to bottom...left to right. so Leo10 1st then +10
        System.out.println(10+10+"Leo");
        System.out.println("Leo"+(10+10));//parentheses gives priority to addition

        System.out.println(2*2+3);//7/ math rules determine the order. PEMDAS
        System.out.println(2+2*3);//8
        System.out.println((2+2)*3);//12
    }
}
