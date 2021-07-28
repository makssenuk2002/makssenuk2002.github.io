import java.util.Comparator;
public class sortByLastName implements Comparator<Policy>{
    @Override
    public int compare(Policy p1, Policy p2) {
        return p1.getLastName().compareTo(p2.getLastName());
    }
}