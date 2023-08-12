import java.util.*;

public class dec_to_bin {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the decimal number: ");
    int a = sc.nextInt();
    dectobin(a);

  }

  public static void dectobin(int decNum) 
  {
    int myNum = decNum;
    int binNum = 0;
    int power = 0;

    while (decNum > 0) 
    {
      int rem = decNum % 2;
      binNum = binNum + (rem * (int) Math.pow(10, power));
      power++;

      decNum /= 2;
    }

    System.out.println("Binary number of " + myNum + "  is " + binNum);
  }
}
