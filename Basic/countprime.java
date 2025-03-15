/*
 * /* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
 import java.util.*;

public class countprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            int n=Integer.parseInt(String.valueOf(str.charAt(i)));
            if(isPrime(n)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
