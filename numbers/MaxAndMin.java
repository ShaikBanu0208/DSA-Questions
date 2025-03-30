import java.util.*;
public class MaxAndMin {
    public static int findminimum(int n){
        int mini=Integer.MAX_VALUE;
        while(n>0){
            int temp=n%10;
            if(temp<mini){
                mini=temp;
            }
            n=n/10;
        }
        return mini;
    }
    public static int findmaximum(int n){
        int maxi=Integer.MIN_VALUE;
        while(n>0){
            int temp=n%10;
            if(temp>maxi){
                maxi=temp;
            }
            n=n/10;
        }
        return maxi;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mini=findminimum(n);
        int maxi=findmaximum(n);
        System.out.println("Minimum digit of a number:"+mini);
        System.out.println("Maximum digit of a number:"+maxi);
    }
}
