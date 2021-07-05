package com.example.side.ui.volunteer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.side.R;
import com.example.side.ui.doctor.doctorAdapter;

public class VolunteerFragment extends Fragment {

    private VolunteerViewModel volunteerViewModel;
    RecyclerView recyclerView;
    volunteerAdapter adapter;
    String name[]={"Mahmoud","Mariam","Farida","Omar","Hager","Islam","Zain","Shady","Shrouk","merna","mohab     "};


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        volunteerViewModel =
                new ViewModelProvider(this).get(VolunteerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_volunteer, container, false);

        recyclerView=(RecyclerView) root.findViewById(R.id.rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new volunteerAdapter(getActivity(),name);

        recyclerView.setAdapter(adapter);



        return root;
    }
}



