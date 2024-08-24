package class14;

public class E4MethodsAdd {
    /*
    create a method to add 2 int numbers and it should return the result when called.
    methods name should be add.
    return type: int
    method name:add
    parameters : 2 int numbers
    body: add the numbers
     */

    int add(int a,int b){
        int sum=a+b;
        return sum;
    }


    public static void main(String[] args) {
        E4MethodsAdd obj=new E4MethodsAdd();
        int num1=10;
        int num2=70;
        int m=obj.add(num1,num2);
        System.out.println(m);

    }
}
