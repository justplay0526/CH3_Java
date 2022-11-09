public class p17 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setIdGas(1234,20.5);
        int iden = car1.getID();
        double gaso = car1.getGas();
        System.out.println("We got");
        System.out.println("License plate number be " + iden + ", fuel capacity be " + gaso);
    }
}
