import java.util.Scanner;
public class practice1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("input first number: ");
        double x = sc.nextDouble();
        System.out.print("input second number: ");
        double y = sc.nextDouble();
        System.out.print("input third number: ");
        double z = sc.nextDouble();
        System.out.print("the average value is " +average(x, y, z)+"\n");

    }
    public static double average(double x, double y, double z){
        return (x + y + z) / 3;
    }
}