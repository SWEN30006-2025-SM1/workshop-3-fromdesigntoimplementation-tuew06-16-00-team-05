package swen30006_workshops;

import java.util.Date;

// Sample private file class to be replaced by your implementaiton
public class File {
    private Date createdDate;
    private String fileData;
    private String fileName;

    public String fileType(){
        // Bruh :D
        /*double num = Math.random();
        if(num<0.5){
            return "pdf";
        } else {
            return "docx";
        }*/

        var split = fileName.split("\\.");
        return split[split.length - 1].toLowerCase();
    }

    public String content(){
        return fileData;
    }

    public int fileSize(){
        return fileData.length();
    }
}