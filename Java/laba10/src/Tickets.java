import org.w3c.dom.ls.LSOutput;
import java.util.*;
public class Tickets {
    List<Ticket> ticketsList = new ArrayList<Ticket>();
    public void generationTickets() {
        ticketsList.add(new Ticket(1, "Senuk",
                Ticket.typeOfAttraction.BOATS, 30, "27.04.2021"));
        ticketsList.add(new Ticket(2, "Kotelevich",
                Ticket.typeOfAttraction.CARS, 45, "30.04.2021"));
        ticketsList.add(new Ticket(3, "Perenko",
                Ticket.typeOfAttraction.SHOOTING_GALLERY, 50, "01.05.2021"));
        ticketsList.add(new Ticket(4, "Larin",
                Ticket.typeOfAttraction.WHEEL_REVIEWS, 35, "01.05.2021"));
        ticketsList.add(new Ticket(5, "Moyseinko",
                Ticket.typeOfAttraction.WHEEL_REVIEWS, 35, "01.05.2021"));
        System.out.println("\n------------------Інформаційна система квитків:-------------------------- \n");
        devision();
        printAllTickets();
    }
    public void printAllTickets() {
        for (Ticket currentTicket : ticketsList) {
            System.out.println(currentTicket);
        }
    }
    public void sortTicketsByLastName() {
        Collections.sort(ticketsList, new sortByLastName());
        System.out.println("\n----------------------Відбулося сортування за прізвищем:---------------------- \n");
        devision();
        printAllTickets();
    }
    public void sortTicketsByType() {
        Collections.sort(ticketsList, new sortByTypeOfAttraction());
        System.out.println("\n--------------------------------Відбулося сортування за типом: ----------------\n");
        devision();
        printAllTickets();
    }
    public void addNewTicket(String lastName, Ticket.typeOfAttraction
            typeOfAttraction, int price, String date) {
        int id = ticketsList.size() + 1;
        ticketsList.add(new Ticket(id, lastName, typeOfAttraction,
                price, date));
    }
    public void editTickets(int id, String lastName,
                            Ticket.typeOfAttraction typeOfAttraction, int price, String date) {
        for (Ticket currentTicket : ticketsList) {
            if (id == currentTicket.getId()) {
                System.out.println("\n----------Редагування квитка:------------\n" +
                        currentTicket);
                devision();
                currentTicket.setLastName(lastName);
                currentTicket.setTypeOfAttraction(typeOfAttraction);
                currentTicket.setPrice(price);
                currentTicket.setDate(date);
                System.out.println("\n-------------Квиток було змінено на: ---------------\n" +
                        currentTicket);
            }
        }
    }
    public void deleteTickets(int id) {
        System.out.println("\n-------------------Видаляємо квиток: ------------------\n");
        for (Iterator<Ticket> it = ticketsList.iterator();
             it.hasNext(); ) {
            Ticket currentTicket = it.next();
            if (id == currentTicket.getId()) {
                it.remove();
                break;
            }
        }
    }
    public void devision() {
        System.out.println(" ==================================================================================================================================================");
    }
    public void printTicketAttraction(Ticket.typeOfAttraction
                                              typeOfAttraction){
        System.out.println("\n---------------------Виведення квитків одного типу: ---------------------------\n");
        devision();
        for (Ticket currentTicket:ticketsList) {

            if(currentTicket.getTypeOfAttraction().equals(typeOfAttraction)){
                System.out.println(currentTicket);
            }
        }
    }
}