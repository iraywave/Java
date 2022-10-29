package work;

import work.cars.LadaCar;
import work.cars.TeslaCar;

public class main {
    public static void main(String[] args){
        TeslaCar tesla1 = new TeslaCar("red");
        TeslaCar tesla2 = new TeslaCar("blue");

        LadaCar lada1 = new LadaCar("yellow");

        Garage garage = new Garage(100);

        garage.addCar(tesla1);
        garage.addCar(tesla2);
        garage.addCar(lada1);
        garage.getCars("amount");
        garage.getCars("price");
    }
}
