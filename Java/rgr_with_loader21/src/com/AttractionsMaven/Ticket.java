//d:\!KPI\Предмети\subjects\stacionar\Programming\rr\TestRR\src\main\java\


package com.AttractionsMaven;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Comparator;

public class Ticket {
    private String secondName;
    private int cost;
    public void setDate(Date ticketDate) {
    }

    public enum AttractionType {
        CARS, TRAMPOLINE, FERRIS_WHEEL, ROOM_OF_FEAR, SHOOTING_GALLERY, CAROUSEL;
    }



    AttractionType category;
    GregorianCalendar ticketDate = new GregorianCalendar();
    public  static  Comparator<Ticket> getSortingByCost = new Comparator<Ticket>() {
        @Override
        public int compare(Ticket o1, Ticket o2) {
            int cost = o1.getCost()- o2.getCost();
            System.out.println(cost);

            return  cost;
        }
    };
    public static Comparator<Ticket> sortingByName = new Comparator<Ticket>() {
        @Override
        public int compare(Ticket ticket, Ticket ticket2) {
            return ticket.secondName.compareTo(ticket2.secondName);
        }
    };

    
    public static Comparator<Ticket> sortingByCategory = new Comparator<Ticket>() {
        @Override
                public int compare(Ticket category1, Ticket category2) {
            return category1.category.toString().compareTo
        (category2.category.toString());
        }
    };
    
    public Ticket(String secondName, AttractionType category, int cost, 
            GregorianCalendar ticketDate) {
        this.secondName = secondName;
        this.cost = cost;
        this.category = category;
        this.ticketDate = ticketDate;
    }

    public Ticket() {
        this.secondName = "";
        this.cost = 0;
        this.category = AttractionType.CAROUSEL;
        this.ticketDate = new GregorianCalendar();
    }

    public String getSecondName() {
        return secondName;
    }

    public int getCost() {
        return cost;
    }

    public AttractionType getCategory() {
        return category;
    }
    
    public String getDate() {
        return ticketDate.get(Calendar.DAY_OF_MONTH) + "." 
                + ticketDate.get(Calendar.MONTH) + "." 
                + ticketDate.get(Calendar.YEAR);
    }
    public Calendar getCalendar (){
        return ticketDate;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCategory(AttractionType category) {
        this.category = category;
    }

    public void setDate(int day, int month, int year) {
        ticketDate.set(year, month, day);
    }
    
    
}