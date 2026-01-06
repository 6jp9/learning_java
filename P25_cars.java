public class P25_cars {
    // int Cars_Count; // normal variable
    static int Cars_Count;
    String Model;
    String Color;

    P25_cars(String model, String color){
        this.Color=color;
        this.Model=model; 
        Cars_Count++;
    }

    // making it static. because Count_cars not belongs to a single object
    static void Count_cars(){
        System.out.println("you have "+Cars_Count+" Cars"); // no need to use "this" keyword, because Cars_count belongs to class.
    }


}
