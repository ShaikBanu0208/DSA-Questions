import java.util.*;

public class countUpperCase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}