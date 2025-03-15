import java.util.*;
public class countCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int v=0,c=0,n=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||ch=='i' ||ch=='I' ||ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                    v++;
                }else{
                    c++;
                }
            }else if(Character.isDigit(ch)){
                n++;
            }
        }
        System.out.println("vowels:"+v);
        System.out.println("Consonants:"+c);
        System.out.println("Digits:"+n);
    }
}
