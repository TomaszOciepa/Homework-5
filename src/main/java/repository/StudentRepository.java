package repository;

import model.Student;

import java.util.ArrayList;
import java.util.List;


public class StudentRepository {


    private final List<Student> students;

    public StudentRepository() {
        final List<Student> students = new ArrayList<>();

        students.add(new Student("Tomek", "Ociepa", "jjdd5-jbusters"));

        this.students = students;
    }


    public List<Student> getStudents() {
        return students;
    }
}
