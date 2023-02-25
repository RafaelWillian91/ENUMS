package EnumsStaticImports;

import static EnumsStaticImports.Car.Logotipo.*;
public class App {

    public static void main(String[] args) {

       // Car c1 = new Car(Car.Logotipo.BMW);
        Car c1 = new Car(BMW);
        System.out.println(c1.getLogotipo());

    }

}
