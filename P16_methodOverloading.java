public class P16_methodOverloading {
    public static void main(String[] args) {
        // In java, method overloading is possiable...
        // Means we can define same method multiple times with different parameters(args). And java recnogise them.
        // i.e.,. if we use sum(a,b) it uses sum method with two agrs and vice versia.
        
        System.out.println(test("thin","olives"));
        System.out.println(test("thin","olives","Mozerilla"));
        System.out.println(test("thin","olives",true));


    }
    static String test(String bread, String tops){
        return bread + " crust pizza with " + tops;
    }
    static String test(String bread, String tops,String cheeze){
        return bread + " crust pizza with " + tops + " and " + cheeze;
    }
    static String test(String bread, String tops,Boolean extraCicken){
        if (extraCicken) {
            return bread + " crust pizza with " + tops + " and extra chicken";
        }
        return bread + " crust pizza with " + tops + " and No extra chicken";
        
    }
}
