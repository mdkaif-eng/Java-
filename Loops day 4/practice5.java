public class practice5 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println("i=" +i);
        }
        System.out.println("i after the loop =" + i);
    }
}


//Ans- Scope  of variable is reffered to  part to the  program where the variable can be used.
//in this program variable i is declared in the for loop. so scope of variable is limited to the for loop only that is between(and)
//of the for  loop. there is a display statment after the for loop where varible i is used which means i is used out of scope. This lead to compilation errors.
//the program given will not run and give an error instead to correct the program,the variable i needs to be declared outside the  for loop   