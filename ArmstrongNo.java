import java.util.Scanner;
public class ArmstrongNo {
    public static void main(String as[])
    {
        int n,r,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        n=sc.nextInt();
        int a=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==a){
            System.out.println("Armstrong Number");
        }
        else
        System.out.println("Not an Armstrong Number");
    }
}
