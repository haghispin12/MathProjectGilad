package com.example.mathprojectgilad;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Mainviewmodel extends ViewModel {
    MutableLiveData<Integer> vNum1;

    MutableLiveData<Integer> vNum2;

    Exercise exercise;

    public Mainviewmodel() {
        vNum1 = new MutableLiveData<>();
        vNum2 = new MutableLiveData<>();
        exercise = new Exercise();
    }

    public void vChalleng() {
        exercise.setBtChalleng();
        vNum1.setValue(exercise.getNum1());
        vNum2.setValue(exercise.getNum2());
    }

    public void vMultiTable() {
        exercise.setBtMultiTable();
        vNum1.setValue(exercise.getNum1());
        vNum2.setValue(exercise.getNum2());
    }

    public void vBoardUp20() {
        exercise.setBtBoardUp20();
        vNum1.setValue(exercise.getNum1());
        vNum2.setValue(exercise.getNum2());
    }

    public Boolean vchak(String answer) {
        Boolean b1 = exercise.chack(answer);
        return b1;
    }
}
