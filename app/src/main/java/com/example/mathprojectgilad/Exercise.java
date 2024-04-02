package com.example.mathprojectgilad;

import java.util.Random;

public class Exercise {
    private int num1;
    private int num2;

    public void setBtChalleng() {
        Random r = new Random();
        num1 = r.nextInt(8) + 1;
        num2 = r.nextInt(89) + 10;

    }

    public void setBtMultiTable() {
        Random r = new Random();
        num1 = r.nextInt(8) + 1;
        num2 = r.nextInt(8) + 1;

    }

    public void setBtBoardUp20() {
        Random r = new Random();
        num1 = r.nextInt(8) + 1;
        num2 = r.nextInt(10) + 10;

    }

    public boolean chack(int answer) {
      return answer == num1*num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
