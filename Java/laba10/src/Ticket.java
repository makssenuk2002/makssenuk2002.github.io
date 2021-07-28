public class Ticket {
    private int id;
    private String lastName;
    private typeOfAttraction typeOfAttraction;
    private int price;
    private String date;
    enum typeOfAttraction {
        SHOOTING_GALLERY("Тир"),
        WHEEL_REVIEWS("Оглядове колесо"),
        ROLLER_COASTER("Амераеканські гірки"),
        BOATS("Лодочки"),
        CARS("Тачки");
        private String typeOfAttraction;
        typeOfAttraction(String typeOfAttraction) {
            this.typeOfAttraction = typeOfAttraction;
        }
        public String getTypeOfAttraction() {
            return typeOfAttraction;
        }
        @Override
        public String toString() {
            return typeOfAttraction;
        }
    }
    public Ticket(int id, String lastName, Ticket.typeOfAttraction
            typeOfAttraction, int price, String date) {
        this.id = id;
        this.lastName = lastName;
        this.typeOfAttraction = typeOfAttraction;
        this.price = price;
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public String getLastName() {
        return lastName;
    }
    public Ticket.typeOfAttraction getTypeOfAttraction() {
        return typeOfAttraction;
    }
    public int getPrice() {
        return price;
    }
    public String getDate() {
        return date;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setTypeOfAttraction(Ticket.typeOfAttraction
                                            typeOfAttraction) {
        this.typeOfAttraction = typeOfAttraction;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        String ticket = String.format(" | ID квитка = %-5d  ||  Прізвище = %-12s   ||   Тип атракціону =  %-17s   ||   Ціна = %-5d   ||  Дата придбання =%s |",
        id,lastName, typeOfAttraction,price,date);
        return ticket;
    }
}