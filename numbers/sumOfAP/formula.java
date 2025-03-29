import java.util.*;

public class formula {
    public static float findSumOfAPSeries(float n,float a,float d){
        float sum=(n / 2) * (2* a + (n - 1) * d);
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextInt();sc.nextLine();
        float a=sc.nextFloat();
        float d=sc.nextFloat();
        float ans=findSumOfAPSeries(n,a,d);
        System.out.println(ans);
    }
}
