/*
 * /*Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/
import java.util.*;
class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=countdigits(n);
        if(checkArmstrong(n,t)){
            System.out.println("Given number is Armstrong number");
        }else{
            System.out.println("Given number is not a Armstrong number");
        }
    }
    public static int countdigits(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n=n/10;
        }
        return cnt;
    }
    public static boolean checkArmstrong(int n,int t){
        int sum=0,temp=n;
        while(temp>0){
            int r=temp%10;
            sum=sum+(int) (Math.pow(r,t));
            temp=temp/10;
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}