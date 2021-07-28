import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Hotel {

    public static final int SORT_BY_CAPACITY = 1;
    public static final int SORT_BY_COST = 2;

    public static final int SOURCE_GENERATE = 1;

    private String title;
    private List<hotelRoom> suits;

    public Hotel(String title) {
        this.title = title;
        suits = new ArrayList<>();
    }

    public void sortRooms(int orderID){
        switch(orderID){
            case SORT_BY_CAPACITY:
                Collections.sort(suits, new HotelRoomCapacityComparator());
                break;

            case SORT_BY_COST:
                Collections.sort(suits, new HotelRoomCostComparator());
                break;
        }
    }

    public void loadRooms(int sourceType){
        switch(sourceType){
            case SOURCE_GENERATE:
                suits.add(new hotelRoom(14, 3, 500, hotelRoom.Type.STANDART));
                suits.add(new hotelRoom(42, 2, 350, hotelRoom.Type.SUITE));
                suits.add(new hotelRoom(43, 4, 1500, hotelRoom.Type.STANDART));
                suits.add(new hotelRoom(12, 1, 500, hotelRoom.Type.DE_LUXE));
                break;
        }

    }

    public void printRooms(){
        for (hotelRoom arr : suits) {
            System.out.println(arr);
        }
    }

    public void addRoom(hotelRoom r){
        suits.add(r);
    }

    public boolean deleteRoom(hotelRoom r){
        for (Iterator<hotelRoom> it = suits.iterator(); it.hasNext();) {
            hotelRoom next = it.next();
            if(next.getRoomNumber() == r.getRoomNumber()){
                it.remove();
                return true;
            }
        }
        return false;
    }

    public hotelRoom findRoomByNumber(int roomNumber){
        for (hotelRoom suit : suits) {
            if(suit.getRoomNumber() == roomNumber){
                return suit;
            }
        }
        return null;
    }

    public boolean editNumber(hotelRoom suit, int number){
        if (suits.contains(suit)){
            suits.get(suits.indexOf(suit)).setRoomNumber(number);
            return true;
        }
        return false;
    }
    public boolean editCost(hotelRoom suit, int cost){
        if (suits.contains(suit)){
            suits.get(suits.indexOf(suit)).setCostPerDay(cost);
            return true;
        }
        return false;
    }
    public boolean editCapacity(hotelRoom suit, int capacity){
        if (suits.contains(suit)){
            suits.get(suits.indexOf(suit)).setRoomCapacity(capacity);
            return true;
        }
        return false;
    }
}
