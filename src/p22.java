public class p22 {
    public static void main(String[] args) {
        Carpri car1 = new Carpri();
        car1.setIdGas(1234,20.5);

        car1.show();

        System.out.println("Let the value of the gas be {-10.0}");
        car1.setIdGas(1234,-10.0);

        car1.show();
    }
}

class Carpri{
    private  int id;
    private double gas;

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
