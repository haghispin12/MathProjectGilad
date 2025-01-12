package com.example.mathprojectgilad;

import android.net.Uri;

public class User {
    private String Name;

    private int Rate;

    private int Score;
    private String userName;
    private int rating;
    private int myScore;
    private Uri uri;
    private long id;


    public String getName(String Name){
        return Name;
    }

    public void setName (String name){
        this.Name =name;
    }

    public int getRate (){
        return Rate;
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

    public String getUserName() {
        return Name;
    }

    public int getRating() {
        return rating;
    }

    public int getMyScore() {
        return myScore;
    }

    public Uri getUri() {
        return uri;
    }
    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
