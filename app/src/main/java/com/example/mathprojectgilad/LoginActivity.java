package com.example.mathprojectgilad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText etuserName;

    private Button btsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        intview();
        SharedPreferences Sh = getSharedPreferences ("MySharedPref", MODE_PRIVATE);
        String s1 = Sh.getString("name"," ");
        etuserName.setText(s1);


    }

    public void intview(){
        etuserName = findViewById(R.id.etuserName);

        btsubmit = findViewById(R.id.btsubmit);
            btsubmit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        intent.putExtra("Name",etuserName.getText().toString());
        startActivity(intent);

        SharedPreferences sharedPreferences = getSharedPreferences ("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString("name", etuserName.getText().toString());
        myEdit.apply();
    }
});
    }



}

