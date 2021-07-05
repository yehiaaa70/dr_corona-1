package com.example.side.ui.patient;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.side.R;

public class PatientFragment extends Fragment {

    private PatientViewModel patientViewModel;
    RecyclerView recyclerView;
    patientAdapter adapter;
    String name[]={"Nada","Tarek","Noha","Marina","Tasneem","Khaled","Mosa","Soad","Kareem"};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        patientViewModel = new ViewModelProvider(this).get(PatientViewModel.class);
        View root = inflater.inflate(R.layout.fragment_patient, container, false);

        recyclerView= (RecyclerView) root.findViewById(R.id.rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new patientAdapter(getActivity(), name) ;
        recyclerView.setAdapter(adapter);



        return root;

    }
}