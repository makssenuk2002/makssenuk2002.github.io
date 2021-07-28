/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MavenProjectTest;

import java.util.Comparator;

/**
 *
 * @author micha
 */
public class StudentsRatingComparator implements Comparator<Student>{
    
    @Override
    public int compare(Student s1, Student s2) {
        int ratingCompare = s2.getRating() - s1.getRating();
        
        if(ratingCompare == 0){
            return s1.getLastName().compareTo(s2.getLastName());
        } else {
            return ratingCompare;
        }
        
    }
    
}
