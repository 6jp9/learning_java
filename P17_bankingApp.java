import java.util.Scanner;
public class P17_bankingApp {
    // variable scope - means where a variable can be accessed. 
    //      Local
    //      Class(Global)

    // We define this outside the main method. because we also use this outside the main method.
    // cosider this as Global variable or Global object creation in terms of python. so that other methods can also access it.
    // even though we opened it outside the main() method, we need to close it inside the main() method. 
    // Cuz java mainly looks for main() and only looks outside, for methods and variables used init. 
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Boolean flag = true;
        double balance = 0;
        // initiate options
        while (flag) {
            
                    System.out.println("********************");
                    System.out.println("Choose an operation (1-4): ");
                    System.out.println("********************");
            
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposite Amount");
                    System.out.println("3. Withdraw Amount");
                    System.out.println("4. Exit");
                    System.out.println("********************");
                    
                    // validate user's choice
                    System.out.print("Enter Choice: ");
                    int choice = scanner.nextInt();
                    // switch cases
                    System.out.println("********************");
                    switch(choice){
                        case 1 -> checkBalance(balance);
                        case 2 -> balance+=depositAmount();
                        case 3 -> balance-=withdrawAmount(balance);
                        case 4 -> flag=false;
                        default -> System.out.println("Invalid choice of operation!!");
                    }
                
                    
                }
                System.out.println("Thankyou visit again :) !!!");
        scanner.close();
    }
    // define check balance
    static void checkBalance(double balance){
        System.out.printf("Current Balance: %.2f\n",balance);
    }
    // define deposit
    static double depositAmount(){
        double amt;
        System.out.print("Enter an amount to deposite: ");
        amt = scanner.nextDouble();
        if (amt<0) {
            System.out.println("Invalid Amount!!");
            return 0;
        }
        else{
            System.out.println("Amount deposited!!");
            return amt;
        }
    }
    // define withdraw
    static double withdrawAmount(double balance){
        double amt;
        System.out.print("Enter an amount to deposit: ");
        amt = scanner.nextDouble();

        if (amt>balance) {
            System.out.println("Insuffient Funds!!");
        }
        else{
            System.out.println("Amount Deposited!!");
            return amt;
        }
        return 0;
    }
    // exit


}
