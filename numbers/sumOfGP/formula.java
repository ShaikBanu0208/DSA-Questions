import java.util.*;

public class formula {
    public static float findSumOfAPSeries(float n,float a,float d){
        float sum= a * ((float) Math.pow(d, n) - 1) / (d - 1);
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
