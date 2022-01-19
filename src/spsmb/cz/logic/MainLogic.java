package spsmb.cz.logic;

import spsmb.cz.io.FileOutput;
import spsmb.cz.io.UserInput;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainLogic {
    private static Map<Integer, CaloriesDiary> diary = new HashMap<Integer, CaloriesDiary>();
    private static Scanner sc = new Scanner(System.in);

    public MainLogic() throws IOException {
    }

    public static void showEntries(){
        int i = 1;
        for (CaloriesDiary entry: diary.values()){
            System.out.println(i + ".) " + entry.getWhen() + "-" + entry.getWhat() + "-" + entry.getHowMuch() + " calories");
        }
    }

    public static void addItem(){
        diary.put(diary.size()+1, new CaloriesDiary(UserInput.returnTime(), UserInput.returnFood(), UserInput.returnCalories()));
    }

    public static void modifyItems(){
        System.out.println("Which entry you want to modify");
        int key = sc.nextInt();
        sc.nextLine();
        CaloriesDiary modifyEntry = diary.get(key);

        System.out.println("Select what you want to modify");
        System.out.println("1.) Time");
        System.out.println("2.) Food name");
        System.out.println("3.) Calories");
        int itemID = sc.nextInt();
        sc.nextLine();

        switch(itemID){
            case 1: modifyEntry.setWhen(UserInput.returnTime());
            diary.replace(key, modifyEntry);
            break;
            case 2: modifyEntry.setWhat(UserInput.returnFood());
                diary.replace(key, modifyEntry);
                break;
            case 3: modifyEntry.setHowMuch(UserInput.returnCalories());
                diary.replace(key, modifyEntry);
                break;
        }



    }

    public static void deleteEntry(){
        System.out.println("Which entry you want to modify");
        int key = sc.nextInt();
        sc.nextLine();
        diary.remove(key);
    }

    public static void allEntriesToFile() throws IOException {
        FileOutput fileOutput = new FileOutput();
        int caloriesTotal = 0;
        for(CaloriesDiary entry : diary.values() ){
            fileOutput.writeEntry(entry);
            caloriesTotal = caloriesTotal + entry.getHowMuch();
        }
        fileOutput.writeCaloriesCombined(caloriesTotal);
    }



}
