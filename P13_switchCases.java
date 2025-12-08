import java.util.Scanner;
public class P13_switchCases {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

            System.out.print("Enter a day of the week: ");
            String day = s.nextLine().toLowerCase();


// enhanced switch is java 14 feature. 
// this switch feature is useful when we stuck with multiple if-elseif statements.

// keywords are 
// switch {
    //  case (case1) -> block;
    //  case (case2) -> block;
    //  ....
    //  ....
    //  default -> block;
// }


        // switch (day) {
        //     case "monday" -> System.out.println("it is a weekday");
        //     case "tuesday" -> System.out.println("is a weekday");
        //     case "wednesday" -> System.out.println("is a weekday");
        //     case "thursday" -> System.out.println("is a weekday");
        //     case "friday" -> System.out.println("is a weekday");
        //     case "saturday" -> System.out.println("is a weekend!!");
        //     case "sunday" -> System.out.println("is a weekend!!");
        //     default -> System.out.println("Not a day from week");
        // }

        
// ###################################################

// since most of the cases like monday, tuesday.....friday are doing the same thing. 
// we can merge the cases to simplify the stuff.
     
     
        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("is a weekday");
            case "saturday", "sunday" -> System.out.println("is a weekend!!");
            default -> System.out.println("Not a day from week");
        }


        s.close();
    }
}
