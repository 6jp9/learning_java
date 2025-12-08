public class P9_printf {
    public static void main(String[] args) {
        double a=3.1422223;
        System.out.printf("a = %f\n",a);

        // .n rounds the decimal values upto n number of decimals.
        System.out.printf("a = %.2f\n",a);

        // + puts a + sign if the number is positive. else - (by default - will  be there for nagitive)
        System.out.printf("a = %+f\n",a);

        // ( enclose the nagitive numbers in () paranthesys.
        System.out.printf("a = %(f\n",a);

        // " " (<space>) will put a space infront of the number if its positive. same as + but " ".
        System.out.printf("a = % f\n",a);


        // for ints
        int id = 50;
        System.out.printf("id = %d\n",id);
        // 0n puts n-1 number of zeros in front of the value. ex: n=4 if we use %03d---> 004
        System.out.printf("id = %04d\n",id);
        // n puts n-1 <spaces>. 4 --> %5d -->____4 (cosider _ as <space>)
        System.out.printf("id = %4d\n",id);
        // -n puts n number of <spaces> after the value. 4--> %-5d -->4____ (cosider _ as <space>)
        System.out.printf("id = %-4d\n",id);

        
        // In printf() --
        //  %s for String
        //  %d for int (decimal)
        //  %f for double (float)
        //  %c for char
        //  %b for boolean


    }
}
