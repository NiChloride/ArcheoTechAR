package com.shuo.archeotechar.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shuo.archeotechar.Antiquity;
import com.shuo.archeotechar.MyAdapter;
import com.shuo.archeotechar.R;

import java.util.ArrayList;
import java.util.Locale;

public class AntiquityFragment extends Fragment {

    private ArrayList<Antiquity> antiquityArrayList;
    private String[] name;
    private String[] description;
    private int[] imageResourceID;
    private RecyclerView recyclerview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_antiquity, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataInitialize();

        recyclerview = view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview.setHasFixedSize(true);
        MyAdapter myAdapter = new MyAdapter(getContext(), antiquityArrayList);
        recyclerview.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }

    private void dataInitialize() {
        antiquityArrayList = new ArrayList<>();

        name = new String[] {
                getString(R.string.name_1),
                getString(R.string.name_1),
                getString(R.string.name_1),
                getString(R.string.name_1),
                getString(R.string.name_1),
        };

        description = new String[] {
                getString(R.string.desc_1),
                getString(R.string.desc_1),
                getString(R.string.desc_1),
                getString(R.string.desc_1),
                getString(R.string.desc_1),
        };

        imageResourceID = new int[] {
                R.drawable.baseline_home_24,
                R.drawable.baseline_home_24,
                R.drawable.baseline_home_24,
                R.drawable.baseline_home_24,
                R.drawable.baseline_home_24,
        };

        for (int i = 0; i < name.length; i++ ) {
            Antiquity antiquity = new Antiquity(name[i], description[i], imageResourceID[i]);
            antiquityArrayList.add(antiquity);
        }
    }
}