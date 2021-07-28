public class Main {
    public static void main(String[] args) {
        Library lib = new Library(); // Створюємо об'єкт класу 'Library'

        // Завантаження усіх книг
        System.out.println("\n\n---------------------- All books ---------------------");
        lib.loadBooks();
        lib.showBooks();

        // Видалення книги "The Crown"
        System.out.println("\n\n-------------------- Delete a book -------------------");
        System.out.println("[Execution status]: " + lib.delBook("The Crown"));
        lib.showBooks();

        // Додавання нової книги "End of the World"
        System.out.println("\n\n--------------------- Add new book -------------------");
        System.out.println("[Execution status]: " +
                lib.addBook("End of the World", 2012, 3, "Not Taken"));
        lib.showBooks();

        // Редагування книги (зміна читача на 'Nikolov')
        System.out.println("\n\n-------------------- Change a taker ------------------");
        System.out.println("[Execution status]: " +
                lib.editBook("End of the World", "Nikolov"));
        lib.showBooks();

        // Сортування за назвою книги
        System.out.println("\n\n-------------------- Sort by title -------------------");
        System.out.println("[Execution status]: " + lib.sortBooksByTitle());
        lib.showBooks();

        // Сортування за роком видання
        System.out.println("\n\n--------------------- Sort by year -------------------");
        System.out.println("[Execution status]: " + lib.sortBooksByYear());
        lib.showBooks();
    }
}