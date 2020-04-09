package com.example.basic_coviddata;

public class Sympotoms {
    Boolean fever;
    Boolean cough;

    public Boolean getFever() {
        return fever;
    }

    public Boolean getCough() {
        return cough;
    }

    public Boolean getTiredness() {
        return tiredness;
    }

    public Boolean getBreathe() {
        return breathe;
    }

    Boolean tiredness;
    Boolean breathe;

    public void setFever(Boolean fever) {
        this.fever = fever;
    }

    public void setCough(Boolean cough) {
        this.cough = cough;
    }

    public void setTiredness(Boolean tiredness) {
        this.tiredness = tiredness;
    }

    public void setBreathe(Boolean breathe) {
        this.breathe = breathe;
    }
}
