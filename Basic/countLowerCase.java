/* Find number of lower case in a string
 * AriJIt = 3
 */
import java.util.*;

public class countLowerCase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
