/* Find Characters of a string at odd index
 * Arijit = rjt
 * priyanka = ryna
*/
import java.util.*;
public class charoddplaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=1;i<str.length();i+=2){
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
