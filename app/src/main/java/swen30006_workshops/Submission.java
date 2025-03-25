package swen30006_workshops;

import java.util.ArrayList;
import java.util.List;

// Sample private submission class to be replaced by your implementation
public class Submission {
    private int attemptNum;
    private List<File> files;
    private int numFiles;
    private int score;

    public Submission(){
        attemptNum = 100;
        files = new ArrayList<>();
    }

    public Submission(int attemptNum){
        this.attemptNum = attemptNum;
        files = new ArrayList<>();
    }

    // Return two fake files
    public List<File> includedFiles(){
        files.add(new File());
        files.add(new File());
        return files;
    }

    public int getScore(){
        return score;
    }

    public void setScore(Person person, int score){
        if (!(person instanceof Student)){
            this.score = score;
        }
    }
}
