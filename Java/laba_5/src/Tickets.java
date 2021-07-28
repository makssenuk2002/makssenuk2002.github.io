public class Tickets {

    private Ticket[] tickets;

    public void generateTickets() {
        Ticket ticket1 = new Ticket("Ivanov", "Тир", 45, "11.10.2020");
        Ticket ticket2 = new Ticket("Senuk", "Оглядове колесо", 30, "04.09.2020");
        Ticket ticket3 = new Ticket("Senuk", "Тир", 100, "25.12.2020");
        Ticket ticket4 = new Ticket("Ignatuyk", "Карусель", 30, "05.09.2020");
        Ticket ticket5 = new Ticket("Ignatuyk", "Тир", 30, "03.09.2020");
        Ticket ticket6 = new Ticket("Petrenko", "Оглядове колесо", 30, "09.09.2020");
        Ticket ticket7 = new Ticket("Fesenko", "Карусель",30, "30.02.2021");


        tickets = new Ticket[7];
        tickets[0] = ticket1;
        tickets[1] = ticket2;
        tickets[2] = ticket3;
        tickets[3] = ticket4;
        tickets[4] = ticket5;
        tickets[5] = ticket6;
        tickets[6] = ticket7;

    }

    public void getAllTicketsOfType(String typeTicket){
        if (typeTicket == "Карусель" || typeTicket == "Тир" || typeTicket == "Оглядове колесо" ){
            for (Ticket currentTicket : tickets){
                if (currentTicket.getAttractionType() == typeTicket){
                    currentTicket.printTicket();
                }
            }
        } else {
            System.out.println("Такого атракціону не існує");
        }
    }
}
