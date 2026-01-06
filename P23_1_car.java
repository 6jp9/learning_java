public class P23_1_car {
    String BRAND;
    String MODEL;
    int YEAR;
    String TYPE;

    // Constructor -- allows user defined data into class.
    // In python we use __init__ for automatic intialization of constructor. but in here we use class name (file name) for that..

    P23_1_car(){
        this.BRAND="Ferrari";
        this.MODEL="Wheel Chair";
        this.YEAR=0;
        this.TYPE="Manual";
    }


    // Constructor overloading

    P23_1_car(String Brand, String Model, int Year){
        this.BRAND=Brand;
        this.MODEL=Model;
        this.YEAR=Year;
        this.TYPE="Not Provided";
    }


    P23_1_car(String Brand, String Model, int Year, String type){
        this.BRAND=Brand;
        this.MODEL=Model;
        this.YEAR=Year;
        this.TYPE=type;

    }

    void isRunning(){
        System.out.println(this.MODEL+" is running");
    }

}
