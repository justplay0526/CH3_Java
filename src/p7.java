public class p7 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.id = 1234;
        car1.gas = 20.5;

        Car car2 = new Car();
        car2.id = 2345;
        car2.gas = 30.5;

        System.out.println("License plate number of car1 is " + car1.id);
        System.out.println("Fuel capacity of car1 is " +car1.gas);

        System.out.println("License plate number of car2 is " + car2.id);
        System.out.println("Fuel capacity of car2 is " +car2.gas);
    }
}
