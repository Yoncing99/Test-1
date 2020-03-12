//Write a program check two strings are equal or not
import java.util.Scanner;
public class Q3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1");
        String a = sc.nextLine();
        System.out.println("Enter String 1");
        String b = sc.nextLine();

        if(a.equals(b))
            System.out.println("Both equal");
        else
            System.out.println("Both not equal");
        
        }
}