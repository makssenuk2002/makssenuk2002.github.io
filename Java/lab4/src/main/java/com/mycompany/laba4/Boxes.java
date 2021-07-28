/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba4;


public class Boxes {
     private Student[] students;
   public void generateStudents(){
      Student Nikita = new Student(180, 200, 11, "Nikita", "Didenko");
       Student Robert = new Student(150, 200, 11, "Nastia", "Platina");
       Student Oleg = new Student(190, 11, "Oleg", "Kizaru");
        students = new Student[3];
        students[0] = Nikita;
        students[1] = Oleg;
        students[2] = Robert;
   }
   public Student getSmallestBox(){
        Student min = students[0];
        
        for (Student item : students){
            if(item.getRating()< min.getRating()){
                min = item;            
            }
        }
        return min;
    }
    public Student getBiggestBox(){
        Student max = students[0];
        for (Student item : students){
            if(item.getRating()> max.getRating()){
                max = item;         
            }
        }
        return max;
    }
     public Student getSerBox(){
        Student min = getSmallestBox();
        Student max = getBiggestBox();
        Student ser = students[0];
        for (Student item : students){
            if(item.getRating() != max.getRating()){
                if(item.getRating() != min.getRating()){
                ser = item;
                }     
            }
        }
        return ser;
    }
}
