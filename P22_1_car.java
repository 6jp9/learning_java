public class P22_1_car {
    
    String Makers = "Ford";
    String Model = "Mustang";
    int Year = 1969;
    boolean isRunning = false;

    void start(){
        isRunning=true;
        System.out.println("your car is running");
    }
    void stop(){
        isRunning=false;
        System.out.println("your car is not running");

    }
}
