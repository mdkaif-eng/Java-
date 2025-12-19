public class Binomialcoefficient6{

     public static int factorial(int n){
        int  fact = 1;   //declare
        for (int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
     }
    
    public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n / (fact_r * fact_nmr );
        return bincoeff;

    }
    public static void main (String []args){
        System.out.println(bincoeff(5, 1));
    }
}  