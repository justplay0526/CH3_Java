public class p31 {
    public static void main(String[] args) {
        Carp31.showSum();

        Carp31 car1 = new Carp31();
        car1.setCar(1234,20.5);

        Carp31.showSum();

        Carp31 car2 = new Carp31();
        car2.setCar(4567,30.5);
    }
}
class Carp31{
    private  int id;
    private double gas;
    public static int sum = 0;

    public Carp31(){
        id = 0;
        gas = 0.0;
        sum++;
        System.out.println("We made a car");
    }

    public void setCar(int n, double g){
        id = n;
        gas = g;
        System.out.println("Let license plate number be " + id + ", fuel capacity be " + gas);
    }
    public static void showSum(){
        System.out.println("We total have "+ sum + " car");
    }

    public void show(){
        System.out.println("License plate number is " + this.id);
        System.out.println("Fuel capacity is " + this.gas);
    }
}