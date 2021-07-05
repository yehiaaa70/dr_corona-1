package com.example.side.ui.pharmacies;

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

public class PharmaciesFragment extends Fragment {

    private PharmaciesViewModel pharmaciesViewModel;
    RecyclerView recyclerView;
    PharmaciesAdapter adapter;
    String name[]={"Pharmacies name","Pharmacies name","Pharmacies name","Pharmacies name","Pharmacies name","Pharmacies name","Pharmacies name","Pharmacies name","Pharmacies name","Pharmacies name"};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pharmaciesViewModel = new ViewModelProvider(this).get(PharmaciesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pharmacies, container, false);

        recyclerView= (RecyclerView) root.findViewById(R.id.rec2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new PharmaciesAdapter(getActivity(),name);
        recyclerView.setAdapter(adapter);



        return root;

}
}