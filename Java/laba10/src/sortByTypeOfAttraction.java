import java.util.Comparator;
public class sortByTypeOfAttraction implements Comparator<Ticket>{
    @Override
    public int compare(Ticket ticket1, Ticket ticket2) {
        return
                ticket1.getTypeOfAttraction().compareTo(ticket2.getTypeOfAttraction())
                ;
    }
}