import java.util.Scanner;
public class P5_conditionalstatements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter your age: ");
        int age = s.nextInt();
        if (age>=18) {
            System.out.println("You are a major (adult)");
        }
        else if (age<=0) {
            System.out.println("Born Bro!!");
        }
        else{
            System.out.println("You are minor (Teenager)");
        }
        s.close();
    }
}
