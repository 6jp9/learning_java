public class P15_Methods {
    public static void main(String[] args) { // static --> No need for object. can be call with class name directly
        // Java Method is nothing special than that of python Method. 
        // In Java, since we write each and every code inside a class, there are no standalone functions in here.
        // so those functions are nothing but methods

        // In java, we also need to  define the datatype for a method, based on the return datatype
        // for ex:
        // return result; --> if result is int type then we initiate method as "--> int my_function(){} <--" viceversia...
        // if there is no value to return or we don't use return then we use  "--> void my_function(){} <--"

        greet(); // since we are didn't return;
        System.out.println(cube(3)); // we return value;
        System.out.println(fullName("J", "P"));
    }

        static void greet(){   // we use static keyword. cuz we call this function in a static method (i.e.,. main()....(-->line.2<--)).
            System.out.println("Hello!!");  // void --> nothing to return.
        }

        static int cube(int num){
            return num*num*num;
        }
        static String fullName(String fName, String lName){
            return "Hello! "+fName+" "+lName;
        }
}
