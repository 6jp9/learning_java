public class P20_varargs {
    public static void main(String[] args) {
        System.out.println(add(1,2,3));
        System.out.println(add(2,1,2,3,4,2,2,2));
        System.out.println(add(12323,2222));
    }

    static int add(int... nums){ // python -> *args -> packs args into Python List.
                                 // java -> "<datatype of args>..." (three_dots are called ellipsis) -> packs args in java Arrays.
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return sum;
    }
}
