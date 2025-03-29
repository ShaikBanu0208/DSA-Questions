package sumOfAP;
import java.util.*;
public class brute {
    public static float findSumOfAPSeries(int n,float a,float d){
        float sum=0;
        for(int i=1;i<=n;i++){
            sum+=a;
            a=a+d;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        float a=sc.nextFloat();
        float d=sc.nextFloat();
        float ans=findSumOfAPSeries(n,a,d);
        System.out.println(ans);
        sc.close();
    }
}
