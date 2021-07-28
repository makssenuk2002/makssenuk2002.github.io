public class Ticket {

    private String lastName;
    private String attractionType;
    private int price;
    private String date;

    public Ticket(String lastName, String attractionType, int price, String date) {
        this.lastName = lastName;
        this.attractionType = attractionType;
        this.price = price;
        this.date = date;
    }

    public String getAttractionType() {
        return attractionType;
    }


    public void printTicket(){
        System.out.println("Прізвище: " + lastName + " " +
                           "Атракціон: " + attractionType + " " +
                           "Ціна: " + price + " " +
                           "Дата: " + date + "\n"
        );
    }


}
