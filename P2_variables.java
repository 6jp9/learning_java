public class P2_variables {
    
    /*
        variables -- container that holds the value
        
        primitive variables - simple value directly stored in memory (Stack)
        reference variables - stores address in memory (Stack) that points to something complex (Heap)
    
        datatypes
            primitive datatypes:
                int -- 9,10,888...........
                double -- 2.333, 32.22, 99.99.........(float values)
                char -- 'M','F','A','B','O'.......one single character -- use '' single quots
                boolean -- true, false
                .........soon. will see it in future or later
            
            reference datatypes:
                String -- "hello", "123abc!=----023094".........u know this...must use "" double quots
                and then there is arrays and objects will see that later
            
    
    */
   public static void main(String[] args) {
        int age = 23;
        double height = 5.6;
        char gender = 'M';
        boolean isIndian = true;
        String name = "Jaya Prakash";
        String place = "Vijayawada";
        System.out.println("Hi, this is " + name + " from " + place);
        System.out.println("I am " + age + " years out.\nAnd i am " + height + " feet tall.");
        System.out.println("gender: " + gender +"\nIs Indian: " + isIndian);

   }
    
}
