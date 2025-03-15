/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "enjoy" and "meatballs".
 */

import java.util.*;
public class consective2vowels {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        int cnt=0;
        for(int i=0;i<words.length;i++){
            for(int j=1;j<words[i].length();j++){
                if(isVowel(words[i].charAt(j-1))==true && isVowel(words[i].charAt(j))==true){
                    cnt++;
                    break;
                }
            }
        }
        sc.close();
        System.out.println(cnt);
    }
    public static boolean isVowel(char c){
        if(c=='a'||c=='A' || c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
            return true;
        }
        return false;
    }
}
