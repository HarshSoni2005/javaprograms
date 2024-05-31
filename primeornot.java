import java.util.*;
public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isprime = true;
        for (int i=2;i<=num-1;i++)
        {
            if (num%i==0)
            {
                isprime=false;
            }
        }
        if (isprime == true)
        {
            System.out.println(num+" IS PRIME");
        }
        else if (isprime == false)
        {
            System.out.println(num+" IS NOT PRIME");
        }
        sc.close();
    }
}
