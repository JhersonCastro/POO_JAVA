/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import University.Subject;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author IngSis
 */
public class Student extends User {
    private Map<Subject, String> subjectsAndGrade = new HashMap<>();


    public Student(String name, String bornDate, String ID) {
        super(name, bornDate, ID);
    }
    public void setValueToSubject(University.Subject sub, String grade){
        subjectsAndGrade.put(sub, grade);
    }   
}
