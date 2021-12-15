package dkit.oop;

import java.util.ArrayList;

public class PassengerAirplane extends Airplane {

    // fields(Q2)
    final int MAX_NUM_PASSENGERS;

    private ArrayList<String> passengerList;


    PassengerAirplane(String type, int maxNumPassengers) {
        super(type);
        this.MAX_NUM_PASSENGERS=maxNumPassengers;
        passengerList = new ArrayList<>();

    }

    public void addPassenger(String name) {


           if(passengerList.size()< this.MAX_NUM_PASSENGERS){
               passengerList.add(name);
           }





    }

    @Override
    public String toString() {
        return "PassengerAirplane{" +
                super.toString()+
                "MAX_NUM_PASSENGERS=" + MAX_NUM_PASSENGERS +
                ", passengerList=" + passengerList +
                '}';
    }
} // end of PassengerAirplane
