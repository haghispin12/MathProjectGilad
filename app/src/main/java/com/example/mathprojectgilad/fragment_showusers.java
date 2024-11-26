package com.example.mathprojectgilad;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
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

    private Button BtBackHome;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_showusers, container, false);
        EtUserName = view.findViewById(R.id.etFragmentUserName);
        BtPICTURE = view.findViewById(R.id.btAddPicture);
        BtUser =view.findViewById(R.id.btAddUser);
        BtBackHome = view.findViewById(R.id.btBackHome);
        BtBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inn = new Intent();
                inn.putExtra("BackHome", );

            }
        });
        return view;
    }
}