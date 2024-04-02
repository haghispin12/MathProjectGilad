package com.example.mathprojectgilad;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class fragment_showusers extends Fragment {
    private EditText EtUserName;

    private Button BtPICTURE;

    private Button BtUser;


    public void onCreate(View view) {
        EtUserName = view.findViewById(R.id.etFragmentUserName);
        BtPICTURE = view.findViewById(R.id.btAddPicture);
        BtUser =view.findViewById(R.id.btAddUser);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_showusers, container, false);
        onCreate(v);
        return v;
    }
}