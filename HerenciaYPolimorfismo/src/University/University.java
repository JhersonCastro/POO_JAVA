/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University;

import Users.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IngSis
 */
public class University {
    private final List<Subject> subjects = new ArrayList<>();
    private final List<Student> student = new ArrayList<>();

    public List<Subject> getSubjects() {
        return subjects;
    }
    public List<Student> getStudent() {
        return student;
    }
    
    public void CreateSubject(String name, String ID, int grade){
        subjects.add(new Subject(name, ID, grade));
    }
    public void registerStudents(String name, String ID, String bornDate){
        student.add(new Student(name, bornDate, ID));
    }
    public void UpdateStudents(int i, String name, String ID, String bornDate){
        student.set(i, new Student(name, bornDate, ID));
    }
}
