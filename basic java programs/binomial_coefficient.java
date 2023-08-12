import java.util.Scanner;

public class binomial_coefficient{


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

         System.out.println("Enter the value of r: ");
        int r = sc.nextInt();


        binCoeffn(n,r);
}

public static int factorial(int n)
{
    int fact=1;
    for(int i=1; i<=n;i++)
    fact*=i;

    return fact;
}
public static void  binCoeffn(int n,int r)
{
    int fact_n=factorial(n);
    int fact_r=factorial(r);
    int fact_nmr=factorial(n-r);

    int binCoeff=fact_n/(fact_r*fact_nmr);
    System.out.println("Binomial Coefficient is "+binCoeff); 
}

}