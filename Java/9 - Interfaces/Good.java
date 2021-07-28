public class Good {
    // Поля ціни та касира
    private int price;
    private String name;

    // Конструктор класу Good
    public Good(int price, String name) {
        this.price = price;
        this.name = name;
    }

    // Геттери і Сеттери
    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
