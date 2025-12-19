import java.util.Scanner;
import java.util.Random;

public class P21_Rock_Paper_Scissor {
    static Scanner scn=new Scanner(System.in);
    static String[] CHOICES = {"rock","paper","scissor"};
    public static void main(String[] args) {
        Random r=new Random();
        
        System.out.print("Enter number of rounds:");
        int rounds = scn.nextInt();
        int loop=0;
        boolean GameNotOver=true;

        while (GameNotOver) {        
           
            if(loop==rounds){
                GameNotOver=false;
                continue;
            }
             
        // initiating random number from 0,1,2 to pick a random choice.
        int bot = r.nextInt(3);
        System.out.print("Pick a choice:\n1. Rock\n2. Paper\n3. Scissor\nEnter your Choice (1/2/3): ");
        int player=scn.nextInt();
        loop++;
        
        if(player>3 || player<1){
            System.out.println("Enter a valid choice!!");
            loop--;
            continue;
        }
    }
        
        
        
        scn.close();
    }
    
    static boolean val(int p, int b, int rounds, int you, int bot){
        System.out.println("Your pick: "+CHOICES[p]);
        System.out.println("Bot pick: "+CHOICES[b]);
        if(p==0 && b==2){
            rounds++;
            you++;


        }
        return false;
    }

}
