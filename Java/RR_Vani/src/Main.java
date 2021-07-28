import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("\n");
//
//        Hotel president = new Hotel("PRESIDENT");
//        president.loadRooms(Hotel.SOURCE_GENERATE);
//
//        president.sortRooms(Hotel.SORT_BY_CAPACITY);
//        president.printRooms();
//        System.out.printf("%50s %n", "Сортування\n");
//
//        president.addRoom(new hotelRoom(99, 99, 99, hotelRoom.Type.DE_LUXE));
//        president.sortRooms(Hotel.SORT_BY_COST);
//        president.printRooms();
//        System.out.printf("%49s %n", "Додавання\n");
//
//        president.editNumber(president.findRoomByNumber(14), 15);
//        president.editCost(president.findRoomByNumber(15), 460);
//        president.editCapacity(president.findRoomByNumber(15), 1);
//        president.printRooms();
//        System.out.printf("%51s %n", "Редагування\n");
//
//        hotelRoom r = president.findRoomByNumber(99);
//        if(r != null){
//            president.deleteRoom(r);
//        }
//        president.sortRooms(Hotel.SORT_BY_COST);
//        president.printRooms();
//        System.out.printf("%48s %n", "Видалення");
        System.out.println("Type in \"Help\" to display the command list");

        String command = "";
        Scanner commandString = new Scanner(System.in);
        do {
            System.out.println("\"PrintNames\" - list of clients ");
            System.out.println("\"PrintTicketInfo\" - prints list of tickets ");
            System.out.println("\"SearchByCategory\" - searches all tickets"
                    + "by the given category");
            System.out.println("\"AddNewTicket\" - Adds new ticket to "
                    + "the list");
            System.out.println("\"EditTickets\" - Edits tickets by "
                    + "given name");
            System.out.println("\"DeleteTicket\" - Deletes the ticket "
                    + "by given name");
            System.out.println("\"Exit\" - exit program.");
            System.out.println("\"SortByCategory\" - Sort tickets by "
                    + "categoty");
            System.out.println("\"SortByName\" - Sort tickets by "
                    + "name");
            System.out.println("\"CSVFromTxtLoder\" - load data from csv.");
            System.out.println("\"CSVToTxtSaver\" - load data to csv.");

            command = commandString.nextLine();
            switch(command) {
//                case "PrintNames":
//                    printListName(client);
//                    System.out.println();
//                    break;
//                case "SortByName":
//                    client.sort(Ticket.sortingByName);
//                    printListCategory(client);
//                    System.out.println("sorted successfully");
//                    break;
//                case "PrintTicketInfo":
//                    printListCategory(client);
//                    System.out.println();
//                    break;
//                case "SortByCategory":
//                    client.sort(Ticket.sortingByCategory);
//                    printListCategory(client);
//                    System.out.println("sorted successfully");
//                    break;
//                case "SearchByCategory":
//                    int clientsFound = 0;
//                    System.out.print("Type your category: ");
//                    command = commandString.nextLine();
//                    for(Ticket p : client) {
//
//                        if (command.equals(p.getCategory().toString())) {
//                            System.out.println(p.getCategory() + " "
//                                    + p.getSecondName() + " " + p.getCost()
//                                    + " " + p.getDate());
//                            clientsFound++;
//                        }
//                    }
//                    if (clientsFound == 0) {
//                        System.out.println("No tickets found");
//                    }
//                    break;
//
//
//
//                case "AddNewTicket":
//                    Ticket addPolis = new Ticket();
//                    editTicket(addPolis);
//                    client.add(addPolis);
//                    printListCategory(client);
//                    System.out.print ("Successfully added to list!");
//                    System.out.println();
//
//
//                    break;
//                case "EditTickets":
//                    System.out.print("Input second name ");
//                    String secondName = commandString.nextLine();
//                    for(Ticket p : client) {
//                        if (p.getSecondName().equals(secondName)) {
//                            editTicket(p);
//                            printListCategory(client);
//                            System.out.print ("Successfully edited!");
//                            break;
//                        }
//                    }
//                    System.out.println();
//                    break;
//                case "DeleteTicket":
//                    System.out.print("Input second name ");
//                    String secondNameForDeleting = commandString.nextLine();
//                    for(Ticket p : client) {
//                        if (p.getSecondName().equals(secondNameForDeleting)) {
//                            client.remove(p);
//                            printListCategory(client);
//                            System.out.print ("Successfully del!");
//                            break;
//                        }
//                    }
//                    System.out.println();
//                    break;
//                case "CSVFromTxtLoder":
//                    CSVLoader loader = new CSVLoader();
//                    System.out.println("Type path with format");
//                    String c = commandString.nextLine();
//                    File f = new File(c);
//                    if (f.exists()) {
//                        client = loader.loadTickets(c);
//                        printListCategory(client);
//                        System.out.println("Loded from CSV successfully");
//                    }
//                    break;
//                case "CSVToTxtSaver":
//                    CSVLoader load = new CSVLoader();
//                    System.out.println("Type path with format");
//                    String s = commandString.nextLine();
//                    load.saveTickets(s,client);
//                    System.out.println("loaded to CSV  successfully");
//
//                    break;

//                default:
//                    throw new IllegalStateException("Unexpected value: " + command);
                default:
                    throw new IllegalStateException("Unexpected value: " + command);
            }
        }
        while(!command.equals("Exit"));

    }
}
