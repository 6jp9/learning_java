// Classes and objects 

// Objects is an entity that holds Data (Attributes) and can perform some actions (Methods). its a reference datatype 
// i.e., trying to print it using object name, prints address


public class P22_Main_class {
    public static void main(String[] args) {
        P22_1_car car = new P22_1_car();
        P22_1_car car2 = new P22_1_car();

        System.out.println(car.Makers);
        System.out.println(car.Model);
        System.out.println(car.Year);
        System.out.println(car.isRunning);

        // car.isRunning = true;
        // System.out.println(car.isRunning);

        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        System.out.println(car2.isRunning);


        
    }
}
