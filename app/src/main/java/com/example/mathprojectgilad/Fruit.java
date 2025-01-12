package com.example.mathprojectgilad;

import android.widget.ImageView;
import android.widget.TextView;

public class Fruit {
    private ImageView ivFruitImg;

    private TextView tvFruitName;
    private String Name;
    private int drawable;


    public Fruit(String name, int drawable) {
        this.Name = name;
        this.drawable = drawable;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
