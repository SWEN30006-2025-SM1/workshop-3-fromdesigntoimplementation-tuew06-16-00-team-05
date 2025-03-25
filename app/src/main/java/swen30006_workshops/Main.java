package swen30006_workshops;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Subject subject = new Subject("comp", "123");
        subject.createAssignment("assign1", new Date());
        subject.createAssignment("assign2", new Date());


    }
}
