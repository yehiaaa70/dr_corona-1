package com.example.side.ui.patient;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.side.R;
import com.example.side.databinding.FragmentPatientBinding;

import org.jetbrains.annotations.NotNull;

public class PatientFragment extends Fragment implements PatientInterface {

    private PatientViewModel patientViewModel;
    RecyclerView recyclerView;
    patientAdapter adapter;
    String name[] = {"Nada", "Tarek", "Noha", "Marina", "Tasneem", "Khaled", "Mosa", "Soad", "Kareem"};

    FragmentPatientBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        patientViewModel = new ViewModelProvider(this).get(PatientViewModel.class);

        binding = FragmentPatientBinding.inflate(inflater);
        recyclerView = binding.RecPatient;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new patientAdapter(name, getActivity(), this);
        recyclerView.setAdapter(adapter);

        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void getPatientPosition(int position) {
        Toast.makeText(requireActivity(), position + "", Toast.LENGTH_SHORT).show();
    }
}