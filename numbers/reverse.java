import java.util.*;
public class reverse {
    public static int reverseNumber(int n){
        int ans=0;
        while(n>0){
            int temp=n%10;
            ans=ans*10+temp;
            n=n/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=reverseNumber(n);
        System.out.println(ans);
    }
}
