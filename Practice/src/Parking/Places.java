package Parking;



import java.util.HashMap;
import java.util.Map;

public class Places implements Iinfo {
    private  int price;

   public static Map<Integer,PlaceState> plases = new HashMap<Integer, PlaceState>();

    public Places() {

    }


    public Places(int price) {
        this.price = price;
        plases.put(0,PlaceState.BUSY);
        plases.put(1,PlaceState.FREE);
        plases.put(2,PlaceState.BUSY);
        plases.put(3,PlaceState.FREE);
        plases.put(4,PlaceState.BUSY);
        plases.put(5,PlaceState.UNAIVAILABLE);
        plases.put(6,PlaceState.BOOKED);
        plases.put(7,PlaceState.FREE);
    }

    @Override
    public void showInfo() {

        System.out.println("Information about places:\n"+plases);
    }

    public static void dislayFreePlaces(){
        System.out.println("Those places are free:");
        for (int i = 0; i <plases.size() ; i++) {
            if (plases.get(i)==PlaceState.FREE){
                System.out.print(i+", ");
            }
        }

    }
}
