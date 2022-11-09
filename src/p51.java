public class p51 {

    public static void main(String[] args) {
        Carp31[] car1;
        car1 = new Carp31[3];

        for(int i=0;i<car1.length;i++) {
            car1[i]=new Carp31();
        }

        car1[0].setCar(1234, 20.5);
        car1[1].setCar(2345, 30.5);
        car1[2].setCar(3456, 40.5);

        for(int i=0;i<car1.length;i++) {
            car1[i].show();
        }
    }
}
