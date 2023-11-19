package com.cts.eschool;

public class Student {
    private String Name;
    private int ID;
    private double Score;

    public Student(int ID, String Name, double Score){
        this.ID = ID;
        this.Name = Name;
        this.Score = Score;
    }
    
    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public double getScore() {
        return Score;
    }
    
    public void setsId(int ID) {
        this.ID = ID;
    }
    
    public void setsName(String Name) {
        this.Name = Name;
    }

    public void setScore(double Score) {
        this.Score = Score;
    }


}