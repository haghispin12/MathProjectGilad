package com.example.mathprojectgilad;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShowAllUsers extends AppCompatActivity {

    private RecyclerView rcShowFruits;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_show_all_users);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//
//            return insets;
//        });
        rcShowFruits = findViewById(R.id.rcShowUsers);
        intview();



    }

    public void intview(){
        ArrayList<Fruit> fruit = new ArrayList<>();
        fruit.add(new Fruit("banana", R.drawable.banana));
        fruit.add(new Fruit("apple" ,R.drawable.apple));
        fruit.add(new Fruit("orange" ,R.drawable.orange));
        fruit.add(new Fruit("lemon" , R.drawable.lemon));
        fruit.add(new Fruit("grapes", R.drawable.fru));

        MyFruitsAdapter myFruitsAdapter = new MyFruitsAdapter(fruit, new MyFruitsAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Fruit item) {
                Toast.makeText(ShowAllUsers.this, item.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        rcShowFruits.setLayoutManager(new LinearLayoutManager(this));
        rcShowFruits.setAdapter(myFruitsAdapter);
        rcShowFruits.setHasFixedSize(true);
        
    }

}