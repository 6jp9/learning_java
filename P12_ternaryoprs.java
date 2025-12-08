public class P12_ternaryoprs {
    public static void main(String[] args) {
        // ternary operator are one liner codes. 
        // ? is used for this operations

        // syntax: variable = (condition) ? ifTrueValue : elseFalseValue;

        // even or odd prog

        int num = 0;

        // String Ans = (num%2==0) ? "Even" : "Odd";
        // System.out.println(num +" is " + Ans);
        
        //###################################

        // positive or nagitive or zero

        String ans = (num>0) ? "Positive" : (num<0) ? "Nagative" : "Zero";
        System.out.println(num+" is "+ans);
        
    }
}
