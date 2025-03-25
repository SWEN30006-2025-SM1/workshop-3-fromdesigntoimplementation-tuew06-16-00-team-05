package swen30006_workshops;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Assignment {
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;
    private List<Submission> submissions;
    private SubmissionValidator validator;

    public Assignment(String name, Date dueDate){
        this.name = name;
        this.dueDate = dueDate;
        this.submissions = new ArrayList<>();
        System.out.println("Assignment: " + name + " " + dueDate);
    }
    public List<Submission> invalidSubmissions() {
        return submissions.stream().filter(submission -> validator.validateSubmission(submission).isEmpty()).toList();
    }


    public List<Submission> validSubmissions() {
        return submissions.stream().filter(submission -> !validator.validateSubmission(submission).isEmpty()).toList();
    }

    public void addSubmission(Submission submission){
        submissions.add(submission);
    }


    public String getName() {
        return name;
    }

}
