package com.example.side.ui.doctor;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.side.R;
import com.example.side.databinding.FragmentDoctorProfileBinding;


public class doctor_profile extends Fragment {

    FragmentDoctorProfileBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDoctorProfileBinding.inflate(inflater);

        binding.doctorNameDoctorProfile.setText("Ahmed");
        return binding.getRoot();
    }
}