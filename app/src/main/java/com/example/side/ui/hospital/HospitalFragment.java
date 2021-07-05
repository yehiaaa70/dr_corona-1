package com.example.side.ui.hospital;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.side.R;
import com.example.side.ui.pharmacies.PharmaciesAdapter;
import com.example.side.ui.pharmacies.PharmaciesViewModel;

public class HospitalFragment extends Fragment {

    private HospitalViewModel HospitalViewModel;
    RecyclerView recyclerView;
    HospitalAdapter adapter;
    String name[]={"Hospital name","Hospital name","Hospital name","Hospital name","Hospital name","Hospital name","Hospital name","Hospital name","Hospital name","Hospital name"};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HospitalViewModel = new ViewModelProvider(this).get(HospitalViewModel.class);
        View root = inflater.inflate(R.layout.fragment_hospital, container, false);

        recyclerView= (RecyclerView) root.findViewById(R.id.rec2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new HospitalAdapter(getActivity(),name);
        recyclerView.setAdapter(adapter);



        return root;

    }
}
