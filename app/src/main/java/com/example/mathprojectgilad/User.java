package com.example.mathprojectgilad;

import android.graphics.Bitmap;
import android.net.Uri;

public class User {
    private String Name;
    private int Rate;
    private int Score;
    private Uri uri;
    private long id;
    private Bitmap bitmap;


    public User ( long id, String Name, int Rate, Bitmap bitmap, int Score) {
        this.id = id;
        this.Name = Name;
        this.Rate = Rate;
        this.bitmap = bitmap;
        this.Score = Score;

    }

    public User() {

    }

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

    public int getScore (){
        return Score;
    }

    public void setScore (int score){
        this.Score = score + Score;

    }

    public String getUserName() {
        return Name;
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

    public  User (){

    }

    public User () {
        this.id = id;
        this.Name = Name;
        this.Rate = Rate;
        this.bitmap = bitmap;
        this.Score = Score;

    }

}
