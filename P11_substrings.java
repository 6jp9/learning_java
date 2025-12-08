import java.util.Scanner;
public class P11_substrings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your mail id: ");
        String email = s.nextLine();

        if (email.contains("@")) {
            int at = email.indexOf("@");

            System.out.println("Username: " + email.substring(0,at));

            System.out.println("Domain: " + email.substring(at+1));

        }
        else{
            System.out.println("Enter a valid email Id. it must contains '@' symobol ");
        }

        // slicing of string in python. we use string[x:y] to get a substring.
        // here we use substring(start, end). to get the substring of a string. 

        s.close();


    }
    
}
