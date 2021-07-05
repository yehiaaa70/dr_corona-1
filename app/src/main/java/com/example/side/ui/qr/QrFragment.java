package com.example.side.ui.qr;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.side.R;

public class QrFragment extends Fragment {

    public static TextView scantext;
    private QrViewModel mViewModel;


        @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qr, container, false);

        Button scanbtn =( Button) view.findViewById(R.id.scanbtn) ;
        scanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inn=new Intent(getActivity(),com.example.side.ui.scannerView.class);
                startActivity(inn);
            }

        });



    return view;

        }
}



