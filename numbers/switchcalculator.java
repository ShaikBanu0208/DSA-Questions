import java.util.*;
public class switchcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char op=sc.next().charAt(0);
        //switch
        switch(op){
            case '+':
            System.out.println(a+"+"+b+"="+(a+b));
            break;
            case '-':
            System.out.println(a+"-"+b+"="+(a-b));
            break;
            case '*':
            System.out.println(a+"*"+b+"="+(a*b));
            break;
            case '/':
            System.out.println(a+"/"+b+"="+(a/b));
            break;
            default:
            System.out.println("Invalid opeartor");
        }
    }
}
