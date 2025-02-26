import java.util.Scanner;
public class Fact {
    public static void main(String as[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        n=sc.nextInt();
        /*int fact=1;
        for(i=2;i<=n;i++){
            fact=fact*i;
        }*/
        int fact=n;
        for(i=n-1;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the no is "+fact);
    }
    
}
