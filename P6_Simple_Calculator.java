import java.util.Scanner;
public class P6_Simple_Calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= s.nextInt();
        System.out.print("Enter second number: ");
        int b= s.nextInt();
        s.nextLine();


        System.out.print("Enter an operation to perform (+,-,*,/,%): ");

        char opr = s.next().charAt(0);
    // we don't have nextChar() method. if we use string and use nextLine() it will read "+\n", which cause error in comparison.
    // so we use next() --> reads the immediate word "+\n" and use charAt(0) to get the char at index 0 which is "+" in this example.



        System.out.println("first number: "+a);
        System.out.println("second number: "+b);



        if (opr=='+') {
            a+=b;
            System.out.println("addition: "+a);
        }
        else if (opr=='-') {
            a-=b;
            System.out.println("Subtraction: " +a);
        }
        else if (opr=='*') {
            a*=b;
            System.out.println("Multiplication: "+a);
        }
        else if (opr=='/') {
            if (b==0) {
                System.out.println("can't divide with 0");
            }
            else {
                a/=b;
                System.out.println("Division: "+a);
            }
        }
        else if (opr=='%') {
             if (b==0) {
                System.out.println("can't divide with 0");
            }
            else {
            a%=b;
            System.out.println("remainder: "+a);
            }
        }
        else {
            System.out.println("Invalid operation!! "+opr+" not valid.");
        }

        s.close();
    }
    
}
