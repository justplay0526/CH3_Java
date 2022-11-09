public class p28 {
    public static void main(String[] args) {
        Carthis car1 = new Carthis();
        car1.show();

        Carthis car2 = new Carthis(1234, 20.5);
        car2.show();
    }
}
class Carthis{
    private  int id;
    private double gas;
    public Carthis(){
        id = 0;
        gas = 0;
        System.out.println("We made a car");
    }
    public Carthis(int n,double g){
        this();
        id = n;
        gas = g;
        System.out.println("We made a car, license plate number is " + id + ", fuel capacity is "+ gas);
    }

    public void setIdGas(int n, double g){

        if(g>0 && g<100){
            id = n;
            gas = g;
            System.out.println("Let license plate number be "
                    + id + ", fuel capacity be " + gas);
        }
        else{
            System.out.println(g + " is invalid fuel capacity ");
            System.out.println("Fuel capacity can't be changed");

        }
    }

    public void setCar(int n){
        id = n;
        System.out.println("Let license plate number be " + id);
    }

    public void setCar(double g){
        gas = g;
        System.out.println("Let fuel capacity be " + gas);
    }

    public void setCar(int n, double g){
        id = n;
        gas = g;
        System.out.println("Let license plate number be " + id + ", fuel capacity be " + gas);
    }

    public void show(){
        System.out.println("License plate number is " + this.id);
        System.out.println("Fuel capacity is " + this.gas);
    }
}