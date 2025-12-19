//Swapping using call by value
//If this swapping was done inside the function then....

public class Callbyvalue1 {


    public static void swap(int a , int b){
        

        //swap
        int temp=a;

        a=b;
        b=temp;
        System.out.println("a=" +a);
        System.out.println("b="+b); u
    }


    public static void main(String[] args) {
        //swap -values exchange
        int a=7;
        int b=19;
        swap(a,b);

    }

}
        
