package dkit.oop;

import javax.swing.*;
import java.beans.PropertyDescriptor;
import java.util.*;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */

public class AirplaneManager {

    ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.

    // write add() method
    public void add(Airplane airplane){
        airplaneList.add(airplane);
    }


    public void displayAllAirplanes(ArrayList<Airplane> airplaneList)
  {
            for(Airplane a: airplaneList){
                System.out.println(a);

            }
  }


    public void displayAllPassengerAirplanes(ArrayList<Airplane> airplaneList) {

            System.out.println("Passenger Airplane  details: ");
            for(Airplane a: airplaneList){
                if(a instanceof PassengerAirplane){
                    System.out.println(a);

                }
        }

    }

    //  write method getAllCargoAirplanes()
    public ArrayList<Airplane> getAllCargoAirplanes(ArrayList<Airplane>airplaneList){
        ArrayList<Airplane>newList= new ArrayList<>();
        for(Airplane a: airplaneList){
            if(a instanceof CargoAirplane){
                newList.add(a);

            }
        }

        return newList;

    }


   public boolean addPassengerNameToAirplane(int  airplaneId, String passengerName){
        boolean isAdded=false;
        for(Airplane a: airplaneList){
            if(a instanceof PassengerAirplane){
                if(a.getId()==airplaneId){
                    ((PassengerAirplane) a).addPassenger(passengerName);
                    return isAdded=true;
                }
            }


        }

        return isAdded=false;


   }


    // write containsAirplane( Airplane plane )
    public boolean containsAirplance(Airplane plane){
        boolean isAirplane=false;

        for(Airplane a: airplaneList){
            if(Objects.equals(a, plane))
            {
                isAirplane=true;

            }
        }

        return isAirplane;

    }


    // write findAirplaneByPassengerName( passengerName )
    public Airplane findAirplaneByPassengerName( String passengerName ){
        for(Airplane a: airplaneList){
                if(a instanceof PassengerAirplane){
                    if(((PassengerAirplane)a).getPassengerList().contains(passengerName)){
                        return a;
                    }
            }

        }
        return null;
    }
    public void sortAirplanes(Comparator<Airplane> comp)
    {
        airplaneList.sort(comp);
    }
    // write displayAllAirplanesInOrderOfType( argument )
    public void displayAllAirplanesInOrderOfType( ArrayList<Airplane> airplaneList){

        sortAirplanes(new CompareTo());
        for(Airplane a: airplaneList){

            System.out.println(a);
        }
    }


} // end of AirplaneManager


