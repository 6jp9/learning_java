public class P25_Static_Keyword {
    public static void main(String[] args) {
        
        P25_cars car1 = new P25_cars("mustang", "Blue");
        P25_cars car2 = new P25_cars("Charger", "Black");

        // car1.Count_cars(); //--> if not static method
        // // --> these both prints 1 car eventhought there are two objects...

        // car2.Count_cars(); 
        // --> for this to achive we need a Shared variable where both can read same value...
        
        // this is where we use Static varable...
        // Static variables are shared variables, where the owner ship given to class and objects can use them...<go to P25_cars.java file>

        System.out.println(P25_cars.Cars_Count);// it is prefered to call the static variable with class name directly, 
        // to indicates Cars_Count is a static varable...

        // if we want to access Count_cars method with the class name make it static as well.
        // now since the Count_cars become static. it is not prefered to call that method with objects. so...

        P25_cars.Count_cars();

        
    }
}
