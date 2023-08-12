import java.util.Scanner;

public class Iseven {
   
   
    public static boolean isEven(int a) 
    {
        
    
         
            if(a%2==0)
            return true;
            else 
            return false;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        if(isEven(a))
        {
            System.out.println("even number");
        }
        else 
        System.out.println("odd number");

    }
}
