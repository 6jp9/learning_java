public class P23_main_constructorClass {
    public static void main(String[] args) {
        P23_1_car car = new P23_1_car();
        P23_1_car car1 = new P23_1_car("Ford", "Mustand", 1969);
        P23_1_car car2 = new P23_1_car("Dodge", "Challenger", 1969,"Drift Car");


        System.out.println("Player 0 selected "+car.BRAND+" "+car.MODEL+" "+car.YEAR);
        car.isRunning();

        System.out.println("Player 1 selected "+car1.BRAND+" "+car1.MODEL+" "+car1.YEAR);
        car1.isRunning();

        System.out.println("Player 2 selected "+car2.BRAND+" "+car2.MODEL+" "+car2.YEAR);
        car2.isRunning();

    }
}
