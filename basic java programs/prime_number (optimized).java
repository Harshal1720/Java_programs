import java.util.Scanner;

public class prime_number
 {
     public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        
       //System.out.println( check_prime(a)); 
       if(check_prime(a)==true)
       {
        System.out.println(" Prime Number !!!!!!!!");
       }
       else
        {
        System.out.println("Not a Prime Number");
       }
    }



    public static boolean check_prime(int n)
{
    
        if(n==2)
        {
        return true;
        }
        for(int i=2; i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    
    
}



}
