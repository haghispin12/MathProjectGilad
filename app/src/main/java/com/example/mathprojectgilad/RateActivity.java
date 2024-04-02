package com.example.mathprojectgilad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class RateActivity extends AppCompatActivity {
    private Button btrate;
    private SeekBar skrate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        intview();
    }

    public void intview() {
        skrate = findViewById(R.id.skrate);

        btrate = findViewById(R.id.Btrate);
        btrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("rate", skrate.getProgress());
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }


}