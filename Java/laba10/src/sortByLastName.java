import java.util.Comparator;
public class sortByLastName implements Comparator<Ticket>{
    @Override
    public int compare(Ticket ticket1, Ticket ticket2) {
        return ticket1.getLastName().compareTo(ticket2.getLastName());
    }
}