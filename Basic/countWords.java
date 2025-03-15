import java.util.*;
public class countWords {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String words[]=s.split(" ");
    int cnt=0;
    for(int i=0;i<words.length;i++){
        if(words[i]!=""){
            cnt++;
        }
    }
    System.out.println("Total Number of Words:"+cnt);
   } 
}
