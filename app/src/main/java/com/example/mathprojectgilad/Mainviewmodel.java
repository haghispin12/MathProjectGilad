package com.example.mathprojectgilad;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Mainviewmodel extends ViewModel {
    MutableLiveData<Integer> vNum1;

    User user;

    int point;

    int sum;

    MutableLiveData<Integer> vNum2;

    Exercise exercise;

    public Mainviewmodel() {
        vNum1 = new MutableLiveData<>();
        vNum2 = new MutableLiveData<>();
        user = new User();
        exercise = new Exercise();
    }

    public void vChalleng() {
        exercise.setBtChalleng();
        vNum1.setValue(exercise.getNum1());
        vNum2.setValue(exercise.getNum2());
        point = 20;
    }

    public void vMultiTable() {
        exercise.setBtMultiTable();
        vNum1.setValue(exercise.getNum1());
        vNum2.setValue(exercise.getNum2());
        point = 10;
    }

    public void vBoardUp20() {
        exercise.setBtBoardUp20();
        vNum1.setValue(exercise.getNum1());
        vNum2.setValue(exercise.getNum2());
        point = 15;
    }

    public Boolean vchak(String answer) {
        Boolean b1 = exercise.chack(Integer.valueOf(answer));
        return b1;
    }

    public void setUser (String Name){
        user.setName(Name);
    }

    public void setRate (int rate){
        user.setRate(rate);
    }

    public void setScore (int score){
        user.setScore(score);
        sum = score + sum;
    }



}
