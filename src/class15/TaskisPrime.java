package class15;

public class TaskisPrime {
    //write a method to return whether a given number is prime or not
    //Note/; Prime # divisible only by itself and 1

  boolean isPrime(int givenNum){

    boolean isItPrime=true;
    if(givenNum<=1){
      isItPrime=false;
    }
    if(givenNum==2){
      isItPrime=true;
    }
    for (int i = 2; i <givenNum ; i++) {
      if(givenNum%i==0
      ){
        isItPrime=false;
        break;

      }

    }return isItPrime;
  }

  public static void main(String[] args) {
    TaskisPrime obj = new TaskisPrime();
    int num=997;
    boolean primeCheck=obj.isPrime(num);
    System.out.println(primeCheck);
  }
}
