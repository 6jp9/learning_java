public class P24_1_car {
    String Model;
    String Color;

    P24_1_car(String model, String color){
        this.Color=color;
        this.Model=model;
        
    }

    void drive(){
        System.out.println("you are driving a "+this.Color+" "+this.Model);
    }
}