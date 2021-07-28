import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books; // Приватний ArrayList із книгами
    private int hash; // Збирігаємо хеш

    // Метод завантаження наявних книг
    public void loadBooks() {
        books = new ArrayList<>();
        books.add(new Book("History of SpaceX", 2021, 2, "Golovatyuk"));
        books.add(new Book("Dogecoin to Moon", 2020, 1, "Musk"));
        books.add(new Book("Stranger Things", 1986, 3, "Wheeler"));
        books.add(new Book("The Crown", 2019, 2, "Jackson"));
    }

    // Метод відображення книг
    public void showBooks() {
        hash = books.hashCode();
        System.out.println("------------------------------------------------------");
        System.out.printf("|%-8s%-13s%-3s%-6s%-2s%-5s%-5s%-10s%s\n", "" ,"Title", "|" ,
                "Year", "|" ,"Room", "|" ,"Taker", "|");
        System.out.println("------------------------------------------------------");
        for (Book currBook : books) {
            System.out.printf("|  %-19s|  %-6s|  %-4s|  %-12s|\n", currBook.getTitle(),
                    currBook.getYear(), currBook.getRoom(), currBook.getTaker());
        }
        System.out.println("------------------------------------------------------");
    }

    // Метод видалення книги
    public char delBook(String title) {
         for (Iterator<Book> it = books.iterator(); it.hasNext();) {
             Book currBook = it.next();
             if (currBook.getTitle().equals(title)) {
                 it.remove();
                 return '✓';
             }
         }
         return 'x';
    }

    // Метод додавання книги
    public char addBook(String title, int year, int room, String taker) {
        books.add(new Book(title, year, room, taker));
        return '✓';
    }

    // Метод редагування книги (зміна читача)
    public char editBook(String title, String newTaker) {
        for (Book currBook : books) {
            if (title.equals(currBook.getTitle())) {
                books.set(books.indexOf(currBook),
                        new Book(currBook.getTitle(),
                                 currBook.getYear(),
                                 currBook.getRoom(),
                                 newTaker));
                return '✓';
            }
        }
        return 'x';
    }

    // Метод сортування за назвою книги
    public char sortBooksByTitle() {
        books.sort(new TitleComparator());
        if (books.hashCode() != hash) {
            return '✓';
        } else {
            return 'x';
        }
    }

    // Метод сортування за роком видання
    public char sortBooksByYear() {
        books.sort(new YearComparator());
        if (books.hashCode() != hash) {
            return '✓';
        } else {
            return 'x';
        }
    }
}