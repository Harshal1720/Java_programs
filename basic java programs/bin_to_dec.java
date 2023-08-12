import java.util.Scanner;

public class bin_to_dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number: ");
        int a = sc.nextInt();
        bin_to_dec(a);


}

public static void bin_to_dec(int binNum)
{
    int myNum =binNum;
    int decNum = 0;
    int power=0;

    while(binNum>0)
    {
      int lastdigit=binNum%10;
      decNum=decNum+(lastdigit* (int)Math.pow(2,power));
      power++;

      binNum/=10;
    }
   
    System.out.println("Decimal number of given "+myNum +" binary NO. is "+decNum);
}

}


