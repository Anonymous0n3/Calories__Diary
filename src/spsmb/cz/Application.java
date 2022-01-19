package spsmb.cz;

import spsmb.cz.io.UserInput;
import spsmb.cz.logic.MainLogic;

public class Application {
    public static void main(String[] args) {
        MainLogic.addItem();
        MainLogic.showEntries();
        MainLogic.modifyItems();
        MainLogic.showEntries();
        MainLogic.deleteEntry();
    }
}
