package class9;

public class E5Array {
    public static void main(String[] args) {
        /*
        write a loop that starts from 0 and it goes to 5 and print only even numbers.
        then create an array of char and you have to print char on even index
         */
        for (int i = 0; i <=5; i++) {
            if(i%2==0)
            {System.out.print(i+" ");
            }


        }

        System.out.println();
        char [] charac={'@','*','$','#','+','=','y'};
        for (int j = 0; j < charac.length; j++) {//you can say j+=2 and remove if statement **More cleaner
            if(j%2==0)
            {System.out.print(charac[j]+" ");
            }


        }


    }
}
