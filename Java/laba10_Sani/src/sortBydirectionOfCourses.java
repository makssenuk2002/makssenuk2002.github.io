import java.util.Comparator;
public class sortBydirectionOfCourses implements Comparator<Policy>{
    @Override
    public int compare(Policy p1, Policy p2) {
        return
                p1.getDirectionOfCourses().compareTo(p2.getDirectionOfCourses())
                ;
    }
}