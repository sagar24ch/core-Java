import java.util.Scanner;
public class palindromNo {
    public static void main(String as[])
    {
        int n,r,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no to check");
        n=sc.nextInt();
        int a=n;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==a){
            System.out.println("Number is palindrom");
        }
        else{
            System.out.println("Number is not a plindrom"); 
        }
    }
    
}
