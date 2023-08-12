import java.util.Scanner;

public class isPalindrome
 {
        

       public static boolean ispalindrome(int n)
       {
        int num=n;
        int reverse=0;
        while(num!=0)
        {
            int reminder = num%10;
            reverse= reverse*10 + reminder;
            num=num/10;
        }

        if(n==reverse)
        {
            return true;
        }   
        else
        {
            return false;
        }
    
    }

       public static void main(String[] args)
        {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        if (ispalindrome(a))
        {
            System.out.println("The given number is palindrome !!!!!");
        }
        else
        {
            System.out.println("The given number is not palindrome ");
        }
     
    }
}
