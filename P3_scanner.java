import java.util.Scanner;

public class P3_scanner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
            Scanner know how to read input but don't know where to read it. 
            so System.in (carries the input stream and)provide the raw keyboard input from user.
            ---Bro can eat. but don't know what to eat. "System.in" is serving bro what to eat.---
        */
        // System.out.print("enter name: ");
        // String name = scn.nextLine();
        // System.out.print("enter age: ");
        // int age = scn.nextInt();
        // System.out.print("enter CGPA: ");
        // double gps= scn.nextDouble();
        // System.out.print("Are you a student (true/false): ");
        // Boolean isStudent = scn.nextBoolean();
        // /* 
        // next() --> reads the immediate word ex: input= hi hello --> cosiders input=hi
        // nextLine() --> reads the immediate line. will consider anything until we hit enter.
        //  */
        // System.out.println("Name: "+name);
        // System.out.println("age: "+age);
        // System.out.println("Is a student: "+isStudent);
        // System.out.println("cgpa:"+gps);


        // some issues with scanner
        System.out.print("enter a number: ");
        int num=scn.nextInt();
        scn.nextLine(); // to avoid the issue mentioned below.....v..........
        System.out.print("enter a string: ");
        String string = scn.nextLine();

        System.out.println("num: "+num);
        System.out.println("string: "+string);
        /*
        output:
`        enter a number: 23
 `       enter a string: num: 23
  `      string:

        -- nextInt() reads only the number, but NOT the newline (\n) you pressed after typing it.
            so when we enter an int ex:23 and hit enter. the System.in serves it as "2 3 \n".
            but the nextInt() only reads '23'. and the "\n" still remains in the input buffer.
        -- nextLine() method reads the nextline ("\n" from previous input) from input buffer. and consumes it...
        -- to avoid this we use a scn.nextLine() after the nextInt() done. so this new nextLine() will clear the input buffer.
            since we are not assigning it to any variable. no memory is being wasted and not stored at all.
        */

        scn.close();
        // must close the scanner after being used. might causes problems. will see in the future...
    }
}
