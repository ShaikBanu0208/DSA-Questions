import java.util.*;
public class palindrome {
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
        int n=sc.nextInt();
        if(isPalin(n)){
            System.out.println(n+" is a palindrome");
        }else{
            System.out.println(n+" is not a palindrome");
        }
    }
}
