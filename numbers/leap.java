import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("Given year is leap year");
        }else{
            System.out.println("Given year is not a leap year");
        }
    }
}
