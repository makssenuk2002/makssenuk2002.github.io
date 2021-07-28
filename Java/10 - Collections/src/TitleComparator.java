import java.util.Comparator;

public class TitleComparator implements Comparator<Book>  {
    // Компаратор сортування за назвою книги
    @Override
    public int compare(Book b1, Book b2) {
        String BookName1 = b1.getTitle().toUpperCase();
        String BookName2 = b2.getTitle().toUpperCase();
        return BookName1.compareTo(BookName2);
    }
}
