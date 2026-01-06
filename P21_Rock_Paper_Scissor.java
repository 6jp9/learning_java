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
        int ps=0,bs=0;

        while (GameNotOver) {        
           
            if(loop==rounds){
                GameNotOver=false;
                continue;
            }
        System.out.println("***************************");
        
        loop++;
        System.out.println("Get ready for the round-"+loop);
        int bot = r.nextInt(3);
        System.out.print("Pick a choice:\n1. Rock\n2. Paper\n3. Scissor\nEnter your Choice (1/2/3): ");

        int player=scn.nextInt();
        System.out.println("***************************");
        
        if(player>3 || player<1){
            System.out.println("Enter a valid choice!!");
            loop--;
            continue;
        }

        String win = valWinner(CHOICES[player-1], CHOICES[bot]);
        System.out.println("Your pick "+CHOICES[player-1]+"\nBot pick "+CHOICES[bot]);

        if (win.equals("p1")) {
            ps++;
            
            System.out.println("you win the round "+loop);
        }
        else if (win.equals("b")) {
            bs++;
            System.out.println("bot wins the round "+loop);
        }
        else{
            System.out.println("It's a draw!! no points..");
        }
    System.out.println("Current Score: \nYou: "+ps+"\nBot: "+bs);    

    }
    System.out.println("***************************");
    System.out.println("Final Score: \nYou: "+ps+"\nBot: "+bs);

    if (ps>bs) {
        System.out.println("Winner: You");
    }
    else if (ps<bs) {
        System.out.println("Winner: Bot");
    }
    else{
        System.out.println("It's a tie!!");
    }
    System.out.println("***************************");
    
    scn.close();
}

static String valWinner(String p, String b){
    
    if (p.equals(b)) {
        return "draw";
    }
    else if ((p.equals("rock") && b.equals("scissor")) || (p.equals("paper") && b.equals("rock")) || (p.equals("scissor") && b.equals("paper"))) {
        return "p1";
    }
    return "b";
}

}