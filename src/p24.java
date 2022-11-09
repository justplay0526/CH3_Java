public class p24 {
    public static void main(String[] args) {
        Carpri car1 = new Carpri();

        car1.setCar(1234,20.5);
        car1.show();

        System.out.println("Only change license plate number");
        car1.setCar(2345);
        car1.show();

        System.out.println("Only change fuel capacity");
        car1.setCar(30.5);
        car1.show();
    }
}
