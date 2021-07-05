package com.example.side.ui.doctor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.side.R;
import com.example.side.ui.logout.LogOutViewModel;
import com.example.side.ui.logout.login;
import com.example.side.ui.logout.register;

public class custome extends Fragment {

    private  CustomeViewModel  customeViewModel ;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        customeViewModel = new ViewModelProvider(this).get( CustomeViewModel.class);
        View view=inflater.inflate(R.layout.custome_design, container, false);

        TextView b1 = ( TextView) view.findViewById(R.id.text);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in3=new Intent(getActivity(),doctor_profile.class);
                startActivity(in3);
            }

        });








        return view;

    }  }



