package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
        //create a boolean variable store true in it;
        //write a loop that runs as long as it is summer
        //create a temp variable store 85 and inside the loop check the temp
        //if it is less than 100 print" lovely summer"
        //if it exceeds 100 print "its very hot and break the loop with break keyword"

      boolean isSummer=true;
      int temp=85;

      while(isSummer){
          if(temp<100){
              System.out.println("Lovely summer");
          }
          else{
              System.out.println("Too Hot");
              break;
          }temp++;
      }
    }
}
