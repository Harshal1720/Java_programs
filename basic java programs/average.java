import java.util.Scanner;

public class average
 {
   
 public static void avg(int a, int b , int c)
    {
        int avg = (a + b + c) / 3;
       System.out.println("Average of three no. is " + avg);
        // return avg;
    }




    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

      //  int a, b, c;

        System.out.println("Enter three numbers: ");
      int   a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        avg(a, b, c);

    }
    
 }