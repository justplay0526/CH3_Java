
public class p45 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Declare car1");
        Carp45 car1 = new Carp45();
        car1.setCar(1234, 20.5);

        System.out.println("Declare car2");
        Carp45 car2;

        System.out.println("Let car1 = car2");
        car2=car1;

        System.out.print("car1's");
        car1.show();

        System.out.print("car2's");
        car2.show();

        System.out.println("change car1's data");
        car1.setCar(2345, 30.5);

        System.out.print("car1's");
        car1.show();

        System.out.print("car2's");
        car2.show();
    }

}

class Carp45{
    private int id;
    private double gas;

    public Carp45() {
        id=0;
        gas=0.0;
        System.out.println("We made a car");
    }
    public void setCar(int n,double g) {
        id=n;
        gas=g;
        System.out.println("We made a car, license plate number is " + id + ", fuel capacity is "+ gas);
    }
    public void show() {
        System.out.println("License plate number is "+id);
        System.out.println("Fuel capacity is "+gas);
    }
}