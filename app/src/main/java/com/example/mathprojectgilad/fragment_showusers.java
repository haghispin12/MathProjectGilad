package com.example.mathprojectgilad;

import static android.app.Activity.RESULT_OK;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class fragment_showusers extends Fragment {

    private TextView tvRateing;
    private TextView tvUsername;
    private TextView tvScore;

    private Button BtPICTURE;

    private Button BtUser;

    private Button BtBackHome;

    private Button BtAddUser;

    private ImageView ivProfileImage;

    private Mainviewmodel mainviewmodel;

    Uri uri;
    ActivityResultLauncher<Intent> startCamera = registerForActivityResult(

            new ActivityResultContracts.StartActivityForResult(),

            new ActivityResultCallback<ActivityResult>() {

                @Override
                public void onActivityResult(ActivityResult result) {

                    if (result.getResultCode() == RESULT_OK) {

                        ivProfileImage.setImageURI(uri);
                        mainviewmodel.user.setUri(uri);

                    }

                }

            });

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }




    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainviewmodel = new ViewModelProvider(getActivity()).get(Mainviewmodel.class);
        View view= inflater.inflate(R.layout.fragment_showusers, container, false);

        tvRateing = view.findViewById(R.id.tvRate);

        tvUsername = view.findViewById(R.id.tvUsername);

        tvScore = view.findViewById(R.id.tvScore);

        BtPICTURE = view.findViewById(R.id.btAddPicture);

        tvScore.setText(mainviewmodel.user.getScore()+ "");
        tvUsername.setText(mainviewmodel.user.getUserName()+"");
        tvRateing.setText(mainviewmodel.user.getRate()+"");

        BtPICTURE.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ContentValues values = new ContentValues();

                values.put(MediaStore.Images.Media.TITLE, "New Picture");

                values.put(MediaStore.Images.Media.DESCRIPTION, "From Camera");

                uri = requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);

                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, uri);

                startCamera.launch(cameraIntent);

            }
        });


        ivProfileImage = view.findViewById(R.id.ivProfileImage);

        BtAddUser = view.findViewById(R.id.btAddUser);
        BtAddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long id = 0;
                if( getActivity() != null )
                    id = mainviewmodel.dbAddUser(getActivity());
                Toast.makeText(getActivity(),id+" ", Toast.LENGTH_SHORT).show();

            }
        });
        BtUser =view.findViewById(R.id.btAddUser);
        BtBackHome = view.findViewById(R.id.btBackHome);
        BtBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        //לטעון את הdbSelect בviewModel...
        mainviewmodel.Arry.observe(getActivity(), new Observer<ArrayList<User>>() {
            @Override
            public void onChanged(ArrayList<User> users) {

            }
        });


        return view;
    }
    public void setPcimageView(ImageView pcimageView) {
        ivProfileImage = pcimageView;
    }


}