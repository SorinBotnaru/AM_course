package Parking;


import java.time.LocalTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Parking implements Iinfo {

    HashMap<Integer, LocalTime> storeTimeIn = new HashMap<Integer, LocalTime>();
    HashMap<Integer, LocalTime> storeTimeOut = new HashMap<Integer, LocalTime>();
    private String name;
    private String address;
    private ParkingState parkingState;

    public Parking(String name, String address, ParkingState parkingState, int numberOfPlace) {
        this.name = name;
        this.address = address;
        this.parkingState = parkingState;
        System.out.println("Welcome to " + this.name);
        Places places = new Places(6);
        places.showInfo();
    }


    public void parkIn(int id) {

        if (Places.plases.containsKey(id) && Places.plases.get(id) == PlaceState.FREE) {
            System.out.println("\nParked!");
            LocalTime localTime = LocalTime.now();

            Iterator it = Places.plases.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                if (pair.getValue() == PlaceState.FREE) {
                    storeTimeIn.put((Integer) pair.getKey(), LocalTime.from(localTime));
                    System.out.println("Time:" + localTime + "\nYour Parking number is: " + pair.getKey());
                    Places.plases.put((Integer) pair.getKey(), PlaceState.BUSY);
                    break;
                }
            }
        } else {
            System.out.println("\nThis place is BUSY or is UNAIVAILABLE, Please choose a FREE place");
            Places.dislayFreePlaces();
        }

    }

    public void parkOut(int id) {
        long randomTime = (long) (Math.random() * 1440);
        if (storeTimeIn.containsKey(id) && Places.plases.get(id) == PlaceState.BUSY) {
            System.out.println("\nHave a good day!");
            Places.plases.put(id, PlaceState.FREE);

            storeTimeOut.put(id, storeTimeIn.get(id).plusMinutes(randomTime));
            System.out.println("Get out time:" + storeTimeOut.get(id) + " \nID:" + id + " must pay: " + randomTime * 0.1 + "LEI");
        } else {
            System.out.println("Check please another ID");
        }


    }


    @Override
    public void showInfo() {

    }
}
