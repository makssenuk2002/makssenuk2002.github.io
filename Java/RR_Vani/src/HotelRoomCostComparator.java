import java.util.Comparator;


public class HotelRoomCostComparator implements Comparator<hotelRoom>{

    @Override
    public int compare(hotelRoom r1, hotelRoom r2) {
        return r2.getCostPerDay() - r1.getCostPerDay();

    }
}


