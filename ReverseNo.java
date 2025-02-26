import java.util.Scanner;
public class ReverseNo {
    public static void main(String as[])
    {
        int n,r,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the numbar");
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        System.out.println("Reverse= "+sum);
    }
    
}
