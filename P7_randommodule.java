import java.util.Random;
public class P7_randommodule {
    public static void main(String[] args) {
        Random r=new Random();
        
        
        // we can use nextInt() with random module to generate a random number from -2B to +2B
        // we can mention range in method -- nextInt(1-10) from 1 to 9

        // int number = r.nextInt(1,7);
        // System.out.println("random number: "+number);

        // #############################################

        // we can use nextDouble() as well ranges from 0 to 1 ex: 0.233333,0.8888888 ....
        // we can use nextBoolean() to generate a random true or false
        Boolean isHead=r.nextBoolean();
        if (isHead) {
            System.out.println("Heads!");
        }
        else{
            System.out.println("Tails!");
        }
    }
    
}
