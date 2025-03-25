package com.unimelb.swen30006.workshops;

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

    public List<Submission> invalidSubmissions() {
        return new ArrayList<>();
    }

    public List<Submission> validSubmissions() {
        return new ArrayList<>();
    }
}
