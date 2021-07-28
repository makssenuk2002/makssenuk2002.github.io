import java.util.Comparator;


public class HotelRoomCapacityComparator implements Comparator<hotelRoom>{

    @Override
    public int compare(hotelRoom r1, hotelRoom r2) {
        return r1.getRoomCapacity() - r2.getRoomCapacity();

    }
}
