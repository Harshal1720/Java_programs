import java.util.Scanner;

public class sumofdigits {

    public static void sumofdigits(int a) {
        int myNum = a;
        int sum = 0;
        while (a > 0) {

            sum = sum + (a % 10);
            a = a / 10;
        }
        System.out.println("The sum of digits  of no. " + myNum + " is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        sumofdigits(a);

    }
}
