public class Hollowrectangle{
    public static void Hollow_rectangle(int totrows, int totcols){
        //outer loop
        for(int i=1; i<=totrows; i++){
            //inner loop
            for(int j=1; j<=totcols; j++){
                //cell-(i,j)
                if(i == 1 | i == totrows  || j == 1 | j == totcols){
                    //boundary cell
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[]args){
        Hollow_rectangle(4,5);
         
    }
    }