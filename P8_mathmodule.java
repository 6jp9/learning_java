import java.util.Scanner;
public class P8_mathmodule {

    public static void main(String[] args) {
        // double a = Math.round(3.4444);
        // a=Math.sqrt(9);
        // a=Math.pow(2,3);
        // a=Math.ceil(3.2);
        // a=Math.floor(3.9);
        // a=Math.PI;
        // a=Math.E;
        // a=Math.abs(-22222);
        // System.out.println(a);

        Scanner s=new Scanner(System.in);

        System.out.print("enter radius of the circle: ");
        double radius = s.nextDouble();

         // area of the circle is PI(radius)^2
        double Area = Math.PI*Math.pow(radius,2);

        System.out.println("Area of the circle is: "+Area);
        // we can use printf() intead of println(). with printf() we can limit the number of decimal values to be printed by round it.
        // by default it rounds upto 6.
        System.out.printf("Area of the circle is: %f cm\n",Area);
        // we can mention how many decimals we want to rounded. ex: %.1f -- to round upto 1 decimal values, %.2f -- to round upto 2 decimal values.
        System.out.printf("Area of the circle is: %.2f cm\n",Area);

        s.close();


    }
    
}
