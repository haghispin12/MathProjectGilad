package com.example.mathprojectgilad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class RateActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private Button btrate;
    private SeekBar sbRate;
    private TextView tvNumOfRate;

    private int seekBarProgress;
    Mainviewmodel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        intview();
        viewModel = new ViewModelProvider(this).get(Mainviewmodel.class);
    }
    @Override
    public void onProgressChanged (SeekBar seekBar, int progress, boolean fromUser){
        seekBarProgress = progress;
        Toast.makeText(this, "" + seekBarProgress, Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onStartTrackingTouch (SeekBar seekBar){

    }

    @Override
    public void onStopTrackingTouch (SeekBar seekBar){

    }




    public void intview() {
        sbRate = findViewById(R.id.skrate);
        sbRate.setOnSeekBarChangeListener(this);
        tvNumOfRate = findViewById(R.id.tvNumOfRate);

        btrate = findViewById(R.id.Btrate);
        sbRate.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvNumOfRate.setText(seekBar.getProgress()+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        btrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("rate", sbRate.getProgress());
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }


}