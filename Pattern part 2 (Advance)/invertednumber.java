public class invertednumber{
    public static void Inverted_rotated_half_pyramid_number(int n){
        for(int i=1; i<=n; i++){
            //inner number
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
        public static void main (String[]args){
            Inverted_rotated_half_pyramid_number(5);
        
    }
}