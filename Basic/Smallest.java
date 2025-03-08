

/*
 * Find smallest number in an array
 * arr[]={2,5,1,3,0}
 * output-0
*/
import java.util.*;
public class Smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Find smallest number
        int mini=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        System.out.println(mini);
    }
}
