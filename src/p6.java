public class p6 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.id = 1234;
        car1.gas = 20.5;

        System.out.println("License plate number is " + car1.id);
        System.out.println("Fuel capacity is " +car1.gas);
    }
}

class Car{
    int id;
    double gas;

    void show(){
        System.out.println("License plate number is " + this.id);
        System.out.println("Fuel capacity is " + this.gas);
    }
    void showCar(){
        System.out.println("Start to display the data of the car");
        this.show();
    }
    void setId(int n){
        id = n;
        System.out.println("Let license plate number be " + id);
    }
    void setGas(double g){
        gas = g;
        System.out.println("Let fuel capacity be " + gas);
    }

    void setIdGas(int n, double g){
        id = n;
        gas = g;
        System.out.println("Let license plate number be " + id + ", fuel capacity be " + gas);
    }
    int getID(){
        System.out.println("Find the ID");
        return id;
    }

    double getGas(){
        System.out.println("Find the Gas");
        return gas;
    }

}