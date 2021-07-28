/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba4;
public class Student extends People{
   private int rating;
   private int ZNO;
   private int PDF;
   private int atestat;
   private static int numberOfBoxes = 0;



   public Student(int ZNO, int PDF, int atestat, String name, String fio) {
        super(name, fio);
        this.ZNO = ZNO;
        this.PDF = PDF;
        this.atestat = atestat;
        rating = ZNO + PDF + atestat;
    }


    public Student(int ZNO, int atestat, String name, String fio) {
        super(name, fio);
        this.ZNO = ZNO;
        this.atestat = atestat;
        rating = ZNO + atestat;         
    }


    public  boolean checkRating(int bal) {
        return (rating >= bal);
    }
   public void printInfo(){
       if (PDF > 0 ) {
           System.out.println( getFio() + ": " + "rating: " + rating + " FDP: " +
                   PDF + " ZNO: " + ZNO );
       } else {
           System.out.println( getFio() + ": " + " rating: " + rating  +
                    " ZNO: " + ZNO );
       }
   }
    public int getRating() {
        return rating;
    }
    public int getZNO() {
        return ZNO;
    }
    public int getPDF() {
        return PDF;
    }
    public int getAtestat() {
        return atestat;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public void setZNO(int ZNO) {
        this.ZNO = ZNO;
    }
    public void setPDF(int PDF) {
        this.PDF = PDF;
    }
    public void setAtestat(int atestat) {
        this.atestat = atestat;
    }       
}
