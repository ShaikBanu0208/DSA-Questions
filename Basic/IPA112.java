/*
 * Reverse a number
 * input:12345
 * output:54321
 */
import java.util.*;
 class IPA112{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
            ans=ans*10+n%10;
            n=n/10;
        }
        System.out.println(ans);
    }
}