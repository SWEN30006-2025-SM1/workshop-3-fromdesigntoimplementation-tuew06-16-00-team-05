package swen30006_workshops;

import java.util.List;

public class Student  extends Person {
    private String email;
    private String studentId;
    private List<Submission> submissions;

    public void submit(Assignment assignment, File file){
        Submission mySubmission = new Submission();
        submissions.add(mySubmission);
        assignment.addSubmission(mySubmission);
    }
    public void sendEmailMsg(String message) {}

    public float totalGrade() {
        return 0.0f;
    }

}
