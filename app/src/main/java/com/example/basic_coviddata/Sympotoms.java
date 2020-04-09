package com.example.basic_coviddata;

public class Sympotoms {

    boolean fever;
    boolean cough;
    boolean tiredness;
    boolean breathe;

    public boolean getFever() {
        return fever;
    }

    public boolean getCough() {
        return cough;
    }

    public boolean getTiredness() {
        return tiredness;
    }

    public boolean getBreathe() {
        return breathe;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public void setTiredness(boolean tiredness) {
        this.tiredness = tiredness;
    }

    public void setBreathe(boolean breathe) {
        this.breathe = breathe;
    }
}
