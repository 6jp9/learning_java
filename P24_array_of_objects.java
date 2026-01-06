public class P24_array_of_objects {
    public static void main(String[] args) {

        P24_1_car car1 = new P24_1_car("Mustang", "Green");
        P24_1_car car2 = new P24_1_car("Challenger", "Blue");
        P24_1_car car3 = new P24_1_car("Supra", "Black");
        P24_1_car[] cars = {car1,car2,car3}; 
        
                    // (OR)

        // P24_1_car[] cars = {new P24_1_car("Mustang", "Green"), 
        //                     new P24_1_car("Challenger", "Blue"), 
        //                     new P24_1_car("Supra", "Black")};

        
        // classic for loop for accessing the objects from arrays..
        // for(int i=0;i<cars.length;i++){
        //     cars[i].drive();
        // }

        // Enhanced for loop for accessing the objects...
        for(P24_1_car car : cars){
            car.drive();
        }
        
    }
}
