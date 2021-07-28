public class Book {
    // Поля характеристик книги та прізвище читача
    private final String title;
    private final int year;
    private final int room;
    private final String taker;

    // Конструктор книги
    public Book(String title, int year, int room, String taker) {
        this.title = title;
        this.year = year;
        this.room = room;
        this.taker = taker;
    }

    // Геттери книги
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getRoom() {
        return room;
    }

    public String getTaker() {
        return taker;
    }
}