//d:\!KPI\Предмети\subjects\stacionar\Programming\rr\TestRR\src\main\java\


package com.AttractionsMaven;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class CSVLoader {

    public ArrayList<Ticket> loadTickets(String sourceName) {
        ArrayList<Ticket> polisesList = new ArrayList<>();
        try {
            FileReader filereader = new FileReader(sourceName);

            CSVReader reader = new CSVReader(filereader);
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                String secondName = nextLine[0];
                Ticket.AttractionType type = Ticket.AttractionType.valueOf
                        (nextLine[1]);
                int cost = Integer.parseInt(nextLine[2]);

                String ticketExtradition = nextLine[3];
                GregorianCalendar iaCalendar = new GregorianCalendar();
                Date ticketDate = df.parse(ticketExtradition);
                iaCalendar.setGregorianChange(ticketDate);

                Ticket ticket = new Ticket(secondName, type, cost,
                        iaCalendar);
                polisesList.add(ticket);

            }
        } catch (Exception e) {
            System.err.println("Error occured while loading " + e.getMessage());
            return null;
        }
        return polisesList;
    }

    public void saveTickets(String sourceName, ArrayList<Ticket> client) {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(sourceName));

//            DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            
            for (Ticket ticket : client) {
                String[] entity = new String[4];
                entity[0] = ticket.getSecondName();
                entity[1] = ticket.getCategory().toString();
                entity[2] = Integer.toString(ticket.getCost());
                entity[3] = ticket.getDate();

                writer.writeNext(entity);
            }
            writer.close();
        } 
        catch (Exception m) {
            System.err.println("Error occured while saving " + m.getMessage());
        }
    }
    
}
