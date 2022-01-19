package spsmb.cz.io;

import spsmb.cz.logic.CaloriesDiary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {

    private File calories_diary = new File("Calories_Diary.txt");
    private FileWriter write = new FileWriter("Calories_Diary.txt");

    public FileOutput() throws IOException {
    }

    public void writeEntry(CaloriesDiary entry) throws IOException {
        write.write(entry.getWhat() + " - " + entry.getWhen() + " - " + entry.getHowMuch() + " calories");
    }

    public void writeCaloriesCombined(Integer caloriesTotal) throws IOException {
        write.write(caloriesTotal);
    }
}
