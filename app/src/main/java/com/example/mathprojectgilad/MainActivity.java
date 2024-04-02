package com.example.mathprojectgilad;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private Button btrate;

    private Button BtChalleng;

    private Button BtBoardUp20;

    private Button btMultiTable;

    private TextView tvFirstNum;

    private TextView tvSecandNum;

    private TextView EtAnswer;

    private Button Btchecking;

    private Button BtSaver;

    private Button BtShowMeAllTheUsers;

    private int num1;

    private int num2;

    private FragmentTransaction trans;

    //Exercise exercise;

    Mainviewmodel viewModel;

    ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    int myrate = result.getData().getIntExtra("rate", -1);
                    Toast.makeText(MainActivity.this,myrate+"",Toast.LENGTH_SHORT).show();
                }
            });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new Mainviewmodel();
        intview();
        Intent intent = getIntent();
        String etuserName = intent.getStringExtra("Name");
        Toast.makeText(MainActivity.this, "helo " + etuserName + " ", Toast.LENGTH_LONG).show();

        viewModel.vNum1.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                 tvFirstNum.setText(integer + " ");
            }
        });

        viewModel.vNum2.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                tvSecandNum.setText(integer + " ");

            }
        });
    }


    public void intview() {
        btrate = findViewById(R.id.Btrate);
        btrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RateActivity.class);
                activityResultLauncher.launch(intent);
            }
        });


        BtChalleng = findViewById(R.id.BtChalleng);
        BtChalleng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.vChalleng();
            }
        });

        Btchecking = findViewById(R.id.Btchecking);
        Btchecking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean res = viewModel.vchak(EtAnswer.getText().toString());
                if (res == true) {
                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_LONG).show();
                    viewModel.setScore(viewModel.point);
                } else {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_LONG).show();
                }
            }
        });


        btMultiTable = findViewById(R.id.BtMultiTable);
        btMultiTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.vMultiTable();
            }
        });

        BtBoardUp20 = findViewById(R.id.BtBoardUp20);
        BtBoardUp20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.vBoardUp20();
            }
        });

        EtAnswer = findViewById(R.id.EtAnswer);
        EtAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }

        });

        BtSaver = findViewById(R.id.BtSaver);
        BtSaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        BtShowMeAllTheUsers = findViewById(R.id.BtShowMeAllTheUsers);
        BtShowMeAllTheUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            trans.add(R.id.frameLayout, new fragment_showusers());
            trans.commit();

            }
        });

        tvFirstNum = findViewById(R.id.TvFirstNum);
        tvFirstNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update();
            }
        });

        tvSecandNum = findViewById(R.id.TvSecandNum);
        tvSecandNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update();
            }
        });
    }


    public void update() {
        tvFirstNum.setText(num1 + " ");
        tvSecandNum.setText(num2 + " ");

    }
}



