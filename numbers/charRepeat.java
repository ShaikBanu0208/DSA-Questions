// aabbbcc = a2b3c2
// abbccc = a1b2c3
import java.util.*;
public class charRepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=s.charAt(0);
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(ch==s.charAt(i)){
                cnt++;
            }else{
                System.out.println(ch+" "+cnt);
                ch=s.charAt(i);
                cnt=0;
                i--;
            }
            if(ch==s.charAt(s.length()-1) && i==s.length()-1){
                System.out.println(ch+" "+cnt);
            }
        }
    }
}
