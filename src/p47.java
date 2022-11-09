public class p47 {

    public static void main(String[] args) {
        Carp47 car1;
        car1 = new Carp47();

        car1.show();

        int number=1234;
        double gasoline=20.5;
        String str="NO1car";

        car1.setCar(number, gasoline);
        car1.setName(str);

        car1.show();
    }

}

class Carp47 {
    private int id;
    private double gas;
    private String name;

    public Carp47() {
        id=0;
        gas=0.0;
        name="No name";
        System.out.println("We made a car");
    }
    public void setCar(int n,double g) {
        id=n;
        gas=g;
        System.out.println("Let license plate number be " + id + ", fuel capacity be "+ gas);
    }

    public void setName(String nm) {
        name=nm;
        System.out.println("Set Car's name "+name);
    }
    public void show() {
        System.out.println("License plate number is "+id);
        System.out.println("Fuel capacity is "+gas);
        System.out.println("Car's name is "+name);
    }
}