/* Find the characters in odd position of a string which are consonent
 * 
 * Input: Arijit Ghosh
 * Output: hs
 */
import java.util.*;

public class consonentoddposition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                char c=str.charAt(i);
                if(!(c=='a'||c=='A' || c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')){
                    System.out.print(c);
                }else{
                    continue;
                }
            }
        }
    }
}
