package com.GymMaven;

import java.util.ArrayList;
import java.util.Scanner;

public class Laba10 {
    public static void printListName(ArrayList<Abonement> list) {
        for(Abonement p : list) {
            System.out.println(p.getSecondName());
        }
    }
    
     public static void printListCategory(ArrayList<Abonement> list) {
         System.out.println("-------------------------All Abonements-------------------------");
         System.out.println("-------------------------------------------------------------");
         System.out.printf("|%-8s%-13s%-3s%-6s%-2s%-5s%-5s%-10s%s\n", "" ,"Type", "|" ,"Second name " ,"|" ,
                 " Visiting time (in months)", "|" );
         System.out.println("-------------------------------------------------------------");
         for(Abonement p : list) {

            System.out.printf("|  %-19s|  %-12s|  %-5d|  %-12s|\n", p.getCategory(),
                    p.getSecondName(), p.getTime());
        }
         System.out.println("-------------------------------------------------------------");
     }
    
       public static void editAbonement(Abonement p) {
        try {
            Scanner commandString = new Scanner(System.in);
            System.out.print("Type second name: ");
            String secondName = commandString.nextLine();
                    
            System.out.print("Name workout type: ");
            Abonement.WorkoutType category = 
                Abonement.WorkoutType.valueOf(commandString.nextLine());
                    
            System.out.print("Enter Abonement cost: ");
            int time = commandString.nextInt();

            p.setSecondName(secondName);
            p.setCategory(category);
            p.setTime(time);
        }
        catch (Exception e) {
            System.out.println("Please \"AddNewAbonement\""
                    + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Abonement> client = new ArrayList<Abonement>();
        client.add(new Abonement("Senuk", Abonement.WorkoutType.POOL, 1));
        client.add(new Abonement("Kotelevich", Abonement.WorkoutType.POOL, 13));
        client.add(new Abonement("Larin", Abonement.WorkoutType.GYM, 5));
        client.add(new Abonement("Nikolov", Abonement.WorkoutType.VIP, 4));
        client.add(new Abonement("Anonim", Abonement.WorkoutType.GYM, 20));

        String command = "";
        Scanner commandString = new Scanner(System.in);
 do {
         System.out.println("\"PrintNames\" - list of clients ");
         System.out.println("\"PrintAbonementInfo\" - prints list of Abonements ");
         System.out.println("\"SearchByCategory\" - searches all Abonements"
                 + "by the given category");
         System.out.println("\"AddNewAbonement\" - Adds new Abonement to "
                 + "the list");
         System.out.println("\"EditAbonements\" - Edits Abonements by "
                 + "given name");
         System.out.println("\"DeleteAbonement\" - Deletes the Abonement "
                 + "by given name");
         System.out.println("\"Exit\" - exit program.");
         System.out.println("\"SortingByTimeOfVisiting\" - Sort Abonements by "
                 + "time");
         System.out.println("\"SortByName\" - Sort Abonements by "
                 + "name");
            command = commandString.nextLine();
            switch(command) {
                case "PrintNames":
                    printListName(client);
                    System.out.println();
                    break;
                case "SortByName":
                    client.sort(Abonement.sortingByName);
                    printListCategory(client);
                    System.out.println("sorted successfully");
                    break;
                case "PrintAbonementInfo":
                    printListCategory(client);
                    System.out.println();
                    break;
                case "SortByCategory":
                    client.sort(Abonement.sortingByTimeOfVisiting);
                    printListCategory(client);
                    System.out.println("sorted successfully");
                    break;
                case "SearchByCategory":
                    int clientsFound = 0;
                    System.out.print("Type your category: ");
                    command = commandString.nextLine();
                    for(Abonement p : client) {

                        if (command.equals(p.getCategory().toString())) {
                            System.out.println(p.getCategory() + " "
                                    + p.getSecondName() + " " + p.getTime());
                            clientsFound++;
                        }
                    }
                    if (clientsFound == 0) {
                        System.out.println("No Abonements found");
                    }
                    break;



                case "AddNewAbonement":
                    Abonement addPolis = new Abonement();
                    editAbonement(addPolis);
                    client.add(addPolis);
                    printListCategory(client);
                    System.out.print ("Successfully added to list!");
                    System.out.println();


                    break;
                case "EditAbonements":
                    System.out.print("Input second name ");
                    String secondName = commandString.nextLine();
                    for(Abonement p : client) {
                        if (p.getSecondName().equals(secondName)) {
                            editAbonement(p);
                            printListCategory(client);
                            System.out.print ("Successfully edited!");
                            break;
                        }
                    }
                    System.out.println();
                    break;
                case "DeleteAbonement":
                    System.out.print("Input second name ");
                    String secondNameForDeleting = commandString.nextLine();
                    for(Abonement p : client) {
                        if (p.getSecondName().equals(secondNameForDeleting)) {
                            client.remove(p);
                            printListCategory(client);
                            System.out.print ("Successfully del!");
                            break;
                        }
                    }
                    System.out.println();
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + command);
            }
        }
        while(!command.equals("Exit"));
        System.out.println("Have a nice day");
    }
}
