package Parking;

public class App {
    public static void main(String[] args) {

Parking parking=new Parking("Happy Parking","bd.Moscovei 1",ParkingState.OPEN,10);
parking.parkIn(1);
parking.parkOut(1);
parking.parkIn(1);


    }
}
