package com.example.mathprojectgilad;

public class User {
    private String Name;

    private int Rate;

    private int Score;

    public String getName(String Name){
        return Name;
    }

    public void setName (String name){
        this.Name =name;
    }

    public int getRate (int rate){
        return rate;
    }

    public void setRate (int rate){
        this.Rate = rate;
    }

    public int getScore (int score){
        return Score;
    }

    public void setScore (int score){
        this.Score = score;
    }
}
