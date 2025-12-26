








import java.util.*;
public class practice4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Input a integar: ");
        int digit= sc.nextInt();
        System.out.println("The sum is " +sumDigits(digits));

        
    }
    public static in sumDigits(int n){
        int sumDigits= 0;
        while(n > 0 ){
            int lastDigit = n % 10;
            sumofDigits +=lastDigit;
            n /= 10;
        }
        return sumofDigits;
    }
}