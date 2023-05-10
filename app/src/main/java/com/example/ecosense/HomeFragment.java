package com.example.ecosense;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        MyListData[] listData = new MyListData[]{
                new MyListData("Hello Uganda", android.R.drawable.ic_dialog_map),
                new MyListData("Hello Uganda", android.R.drawable.ic_dialog_map),
                new MyListData("Hello Uganda", android.R.drawable.ic_dialog_map),
                new MyListData("Hello Uganda", android.R.drawable.ic_dialog_map),
                new MyListData("Hello Uganda", android.R.drawable.ic_dialog_map),
                new MyListData("Hello Uganda", android.R.drawable.ic_dialog_map),
                new MyListData("Hello Uganda", android.R.drawable.ic_dialog_map)
        };
        RecyclerView recyclerView = view.findViewById(R.id.topstories);
        TopStoriesAdapter adapter = new TopStoriesAdapter(listData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);
        return view;
    }
}