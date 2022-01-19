package spsmb.cz.logic;

import spsmb.cz.enums.TimeValues;

public class CaloriesDiary {

    private TimeValues when;
    private String what;
    private int howMuch;

    public CaloriesDiary(TimeValues when, String what, int howMuch) {
        this.when = when;
        this.what = what;
        this.howMuch = howMuch;
    }

    public TimeValues getWhen() {
        return when;
    }

    public void setWhen(TimeValues when) {
        this.when = when;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int getHowMuch() {
        return howMuch;
    }

    public void setHowMuch(int howMuch) {
        this.howMuch = howMuch;
    }
}
