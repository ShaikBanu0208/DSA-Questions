/*
 * 5
 * [2,5,1,3,0]
 * OUTPUT-5
 */
import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=findlargest(arr,n);
        System.out.println(largest);
    }
    public static int findlargest(int[] arr,int n){
        int maxi=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
}
