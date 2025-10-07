// write a program to find the factorial of any number entered by the user .


import java.util.*;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number; //To hold the number 
        int fact =1; // To hold factorial
         System.out.println("Enter the positive integer : ");
          number = sc.nextInt();
          for(int i=1; i<=number ;  i++){
            fact *= i;

          }

          System.out.println(" Factorial is : "+ fact);
        
    }
}
