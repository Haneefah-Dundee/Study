package class15;

public class SyntaxEmployees {
    //create a class called SyntaxEmployees
    //Create 3 variables: empID, salary and set the CEO to Sumair
    //Create 2 objects of the class
    //set the value of empID and salary for each objects
    //print the value of empID,salary and CEO of each objects

    String empID;
    int salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployees obj =new SyntaxEmployees();
        String empID1=obj.empID="7890U";
        int salary1=obj.salary=450000;
        System.out.println(empID1);
        System.out.println(salary1);
        System.out.println(SyntaxEmployees.CEO);


        SyntaxEmployees obj1 =new SyntaxEmployees();
        String empID2=obj1.empID="7891P";
        int salary2=obj1.salary=50000;
        System.out.println(empID2);
        System.out.println(salary2);
        System.out.println(SyntaxEmployees.CEO);//obj1.CEO not preferred since its static

    }
}
