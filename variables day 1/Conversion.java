import java.util.*;
public class Conversion{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //possible to long to long because  both of have 8byte
     /*    long a=24;
        long b=a; */

        //this is not possible because long has 8 byte and int has 4 byte  
        long a=26;
        int b=a;
        System.out.println(b);

    }
}