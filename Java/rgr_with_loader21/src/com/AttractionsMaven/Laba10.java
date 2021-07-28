//d:\!KPI\Предмети\subjects\stacionar\Programming\rr\TestRR\src\main\java\



package com.AttractionsMaven;

import java.io.File;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Laba10 {
    public static void printListName(ArrayList<Ticket> list) {
        for(Ticket p : list) {
            System.out.println(p.getSecondName());
        }
    }
    
     public static void printListCategory(ArrayList<Ticket> list) {
         System.out.println("-------------------------All tickets-------------------------");
         System.out.println("-------------------------------------------------------------");
         System.out.printf("|%-8s%-13s%-3s%-6s%-2s%-5s%-5s%-10s%s\n", "" ,"Type", "|" ,"Second name " ,"|" ,
                 " Cost ", "|" ,"Date", "|" );
         System.out.println("-------------------------------------------------------------");
         for(Ticket p : list) {

            System.out.printf("|  %-19s|  %-12s|  %-5d|  %-12s|\n", p.getCategory(),
                    p.getSecondName(), p.getCost(), p.getDate());
        }
         System.out.println("-------------------------------------------------------------");


     }
    
       public static void editTicket(Ticket p) {
        try {
            Scanner commandString = new Scanner(System.in);
            System.out.print("Type second name: ");
            String secondName = commandString.nextLine();
                    
            System.out.print("Name attraction type: ");
            Ticket.AttractionType category = 
                Ticket.AttractionType.valueOf(commandString.nextLine());
                    
            System.out.print("Enter ticket cost: ");
            int cost = commandString.nextInt();
                    
            int day, month, year;
            System.out.print("Type the date (day): ");
            day = commandString.nextInt();
            System.out.print("Type the date (month): ");
            month = commandString.nextInt();
            System.out.print("Type the date (year): ");
            year = commandString.nextInt();
            p.setSecondName(secondName);
            p.setCategory(category);
            p.setCost(cost);
            p.setDate(day, month, year);
        }
        catch (Exception e) {
            System.out.println("Please \"AddNewTicket\""
                    + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Ticket> client = new ArrayList<Ticket>();
        client.add(new Ticket("Senuk", Ticket.AttractionType.TRAMPOLINE, 100, new GregorianCalendar(2021, 3, 23)));
        client.add(new Ticket("Kotelevich", Ticket.AttractionType.SHOOTING_GALLERY, 200, new GregorianCalendar(2021, 4, 17)));
        client.add(new Ticket("Larin", Ticket.AttractionType.FERRIS_WHEEL, 500, new GregorianCalendar(2021, 2, 14)));
        client.add(new Ticket("Nikolov", Ticket.AttractionType.CARS, 100, new GregorianCalendar(2021, 2, 15)));
        client.add(new Ticket("Anonim", Ticket.AttractionType.FERRIS_WHEEL, 0, new GregorianCalendar(2021, 4, 6)));

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
                case "PrintNames":
                    printListName(client);
                    System.out.println();
                    break;
                case "SortByName":
                    client.sort(Ticket.sortingByName);
                    printListCategory(client);
                    System.out.println("sorted successfully");
                    break;
                case "PrintTicketInfo":
                    printListCategory(client);
                    System.out.println();
                    break;
                case "SortByCategory":
                    client.sort(Ticket.sortingByCategory);
                    printListCategory(client);
                    System.out.println("sorted successfully");
                    break;
                case "SearchByCategory":
                    int clientsFound = 0;
                    System.out.print("Type your category: ");
                    command = commandString.nextLine();
                    for(Ticket p : client) {

                        if (command.equals(p.getCategory().toString())) {
                            System.out.println(p.getCategory() + " "
                                    + p.getSecondName() + " " + p.getCost()
                                    + " " + p.getDate());
                            clientsFound++;
                        }
                    }
                    if (clientsFound == 0) {
                        System.out.println("No tickets found");
                    }
                    break;



                case "AddNewTicket":
                    Ticket addPolis = new Ticket();
                    editTicket(addPolis);
                    client.add(addPolis);
                    printListCategory(client);
                    System.out.print ("Successfully added to list!");
                    System.out.println();


                    break;
                case "EditTickets":
                    System.out.print("Input second name ");
                    String secondName = commandString.nextLine();
                    for(Ticket p : client) {
                        if (p.getSecondName().equals(secondName)) {
                            editTicket(p);
                            printListCategory(client);
                            System.out.print ("Successfully edited!");
                            break;
                        }
                    }
                    System.out.println();
                    break;
                case "DeleteTicket":
                    System.out.print("Input second name ");
                    String secondNameForDeleting = commandString.nextLine();
                    for(Ticket p : client) {
                        if (p.getSecondName().equals(secondNameForDeleting)) {
                            client.remove(p);
                            printListCategory(client);
                            System.out.print ("Successfully del!");
                            break;
                        }
                    }
                    System.out.println();
                    break;
                case "CSVFromTxtLoder":
                    CSVLoader loader = new CSVLoader();
                    System.out.println("Type path with format");
                    String c = commandString.nextLine();
                    File f = new File(c);
                    if (f.exists()) {
                        client = loader.loadTickets(c);
                        printListCategory(client);
                        System.out.println("Loded from CSV successfully");
                    }
                    break;
                case "CSVToTxtSaver":
                    CSVLoader load = new CSVLoader();
                    System.out.println("Type path with format");
                    String s = commandString.nextLine();
                    load.saveTickets(s,client);
                    System.out.println("loaded to CSV  successfully");

                    break;


//                default:
//                    throw new IllegalStateException("Unexpected value: " + command);
                default:
                    throw new IllegalStateException("Unexpected value: " + command);
            }
        }
        while(!command.equals("Exit"));
        System.out.println("Have a nice day");
        
    }
}
