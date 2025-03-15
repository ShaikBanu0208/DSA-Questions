/* Count the words in a sentence which are start with vowel. 
 * 
 * Input: Arijit is student of MCA
 * Output: 3
 * 
 * Input: Sara plays tennis
 * Output: No such words
*/
import java.util.*;
public class countWordsVowel {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String[] words=str.split(" ");
    int cnt=0;
    for(int i=0;i<words.length;i++){
        if(words[i]!=""){
            char ch=words[i].charAt(0);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O'|| ch=='u' || ch=='U'){
                cnt++;
            }
        }
    }
    System.out.println(cnt);
   } 
}
