import java.util.*;
public class countpalindrome {
    public static boolean isPalin(int n){
        int sum=0,temp=n;
        while(temp>0){
            int r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if(sum==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int cnt=0;
        for(int i=m;i<=n;i++){
            if(isPalin(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
