//write a program to print the multication table of number'N',entered by the user. 

import java.util.*;

public class practice4 {
    public static void printMultiplicaticationTable(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for(int i=1;i<=10; i++){
            System.out.println(n + "*" + i + "=" +n *i);

        }
    }
    public static void main(String[] s) {
        printMultiplicaticationTable(5);


        
    }
}
