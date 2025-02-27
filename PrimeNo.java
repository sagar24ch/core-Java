import java.util.Scanner;
class PrimeNo{
    public static void main(String arg[])
    {
        int n,i,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to check");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0){
                count=count+1;
            }
        }
        if(count==2)
            System.out.println("Given no is prime");
        else
        System.out.println("number is not a prime");
    }
}