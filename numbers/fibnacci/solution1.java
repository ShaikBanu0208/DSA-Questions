import java.util.*;

public class solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println(0);
        }else{
            int fibo[]=new int[n+1];
            fibo[0]=0;
            fibo[1]=1;
            for(int i=2;i<=n;i++){
                fibo[i]=fibo[i-1]+fibo[i-2];
            }
            System.out.println("Fibnacci Series upto "+n+" terms");
            for(int i=0;i<=n;i++){
                System.out.print(fibo[i]+" ");
            }
        }
    }
}
