package class15;

public class E1 {
    //create a method that takes a #, call it size, as input and creates an array of
    // of that size.
    //say 10 and  RETURN THE ARRAY CALL THE METHOD createArray
    //also take the number you want to fill the array with
    //eg: createArray(5)=>{10,10,10,10,10}

    
    int [] createArray(int size, int fillValue){
        
        int [] array=new int[size];

        for (int i = 0; i <size ; i++) {
            
            array[i]=fillValue;
            
        }return array;
    }

    public static void main(String[] args) {
        E1 obj=new E1();
        
        int[] ar=obj.createArray(6,10);

        for (int i = 0; i <ar.length ; i++) {

            System.out.print(ar[i]+" ");
            
        }
    }
}






