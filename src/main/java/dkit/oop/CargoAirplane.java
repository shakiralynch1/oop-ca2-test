package dkit.oop;

public class CargoAirplane extends Airplane {

    // fields (ref. Q1)
final int MAX_LOAD_KILOS;
private int currentLoad;



    // constructor
    CargoAirplane(String type, int maxLoad) {
        super(type);
        this.MAX_LOAD_KILOS=maxLoad;
    }



    // toString()


    @Override
    public String toString() {
        return "CargoAirplane{" +
                super.toString()+
                "MAX_LOAD_KILOS=" + MAX_LOAD_KILOS +
                ", currentLoad=" + currentLoad +
                '}';
    }
} // END of CargoAirplane class.

