package com.GymMaven;
import java.util.Comparator;

public class Abonement {
    private String secondName;
    private int time;

    public enum WorkoutType {
        VIP, POOL, GYM;
    }

    WorkoutType category;
    public static Comparator<Abonement> sortingByName = new Comparator<Abonement>() {
        @Override
        public int compare(Abonement Abonement1, Abonement Abonement2) {
            return Abonement1.secondName.compareTo(Abonement2.secondName);
        }
    };

    public static Comparator<Abonement> sortingByTimeOfVisiting = new Comparator<Abonement>() {
        @Override
            public int compare(Abonement time1, Abonement time2) {
             int firstTime = time1.getTime();
             int secondTime = time2.getTime();
             return  firstTime - secondTime;

        }
    };
    
    public Abonement (String secondName, WorkoutType category, int time) {
        this.secondName = secondName;
        this.category = category;
        this.time = time;
    }


    public Abonement() {
        this.secondName = "";
        this.category = WorkoutType.POOL;
        this.time = 0;
    }

    public int getTime() {
        return time;
    }

    public String getSecondName() {
        return secondName;
    }

    public WorkoutType getCategory() {
        return category;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setCategory(WorkoutType category) {
        this.category = category;
    }

    public void setTime(int time) {
        this.time = time;
    }
}