package swen30006_workshops;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Subject {
    private String name;
    private String subjectCode;
    private List<Assignment> assignments;

    public Subject(String name, String subjectCode){
        this.name = name;
        this.subjectCode = subjectCode;
        this.assignments = new ArrayList<>();
        System.out.println("Subject info: " + subjectCode + " " + name);
    }

    public void createAssignment(String name, Date dueDate) {
        assignments.add(new Assignment(name, dueDate));
    }

    public void deleteAssignment(String name) {
        assignments.removeIf((assignment) -> {
            return assignment.getName().equals(name);
        });
    }
}
