public class p26 {
    public static void main(String[] args) {
        Carinit car1 = new Carinit();
        car1.show();
        Carinit car2 = new Carinit(1234,20.5);
        car2.show();
    }
}
class Carinit{
    private  int id;
    private double gas;
    public Carinit(){
        id = 0;
        gas = 0;
        System.out.println("We made a car");
    }
    public Carinit(int n,double g){
        id = n;
        gas = g;
        System.out.println("We made a car, license plate number is " + id + ", fuel capacity is "+ gas);
    }
    public void show(){
        System.out.println("License plate number is " + this.id);
        System.out.println("Fuel capacity is " + this.gas);
    }
}