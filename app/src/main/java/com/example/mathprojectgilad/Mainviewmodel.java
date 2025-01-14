package com.example.mathprojectgilad;

import android.content.Context;
import android.util.Log;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Mainviewmodel extends ViewModel {
    public static long dbhalper;
    MutableLiveData<Integer> vNum1;

    User user;

    int point;

    int sum;

    MutableLiveData<Integer> vNum2;

    MutableLiveData<ArrayList<User>> Arry;

    Exercise exercise;

    public String tvUserName (){
        return user.getUserName();
    }
    public int tvRate1(){
        return user.getRate();
    }

    public int tvScore1(){
        return user.getScore();
    }

    public Mainviewmodel() {
        vNum1 = new MutableLiveData<>();
        vNum2 = new MutableLiveData<>();
        user = new User();
        Arry = new MutableLiveData<>(new ArrayList<User>());
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


    public long dbAddUser (Context taz){ // להחליף בין הid לBD
        DBHelper id =  new DBHelper(taz);
        long db = id.insert(user,taz);
        Log.d("gilad1",db+"");
        return db;
    }

    public void dbSeclct (Context context){
        DBHelper str = new DBHelper(context);
        ArrayList db = str.selectAll();
        return ;

    }


    public boolean vCheck(String answer) {
        boolean b1 = exercise.chack(Integer.parseInt(answer));
        return b1;
    }
    public void updateRate(int rate){
        user.setRate(rate);
    }

    public void updateName(String name){
        user.setName(name);

    }




    public Mainviewmodel user() {
        return null;
    }

}
