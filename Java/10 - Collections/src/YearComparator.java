import java.util.Comparator;

public class YearComparator implements Comparator<Book> {
    // Компаратор сортування за роком видання
    @Override
    public int compare(Book b1, Book b2) {
        int BookYear1 = b1.getYear();
        int BookYear2 = b2.getYear();
        return BookYear2 - BookYear1;
    }
}
