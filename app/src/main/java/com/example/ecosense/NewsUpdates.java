package com.example.ecosense;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NewsUpdates extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news_updates, container, false);
        ArrayList<String> username = new ArrayList<>();
        ArrayList<String> title = new ArrayList<>();
        ArrayList<String> image = new ArrayList<>();
        ArrayList<String> likes = new ArrayList<>();
        ArrayList<String> downloads = new ArrayList<>();
        ArrayList<String> comments = new ArrayList<>();
        ArrayList<String> timeAgo = new ArrayList<>();

        timeAgo.add("2 min ago");timeAgo.add("2 min ago");timeAgo.add("2 min ago");timeAgo.add("2 min ago");
        comments.add("2 comments");comments.add("2 comments");comments.add("2 comments");comments.add("2 comments");
        downloads.add("23 downloads");downloads.add("23 downloads");downloads.add("23 downloads");downloads.add("23 downloads");
        likes.add("323 likes");likes.add("223 likes");likes.add("43 likes");likes.add("32 likes");
        username.add("Auma Jackline");   username.add("Sarah Kwerit");username.add("Matia Mathias");username.add("Isakah ");
        title.add("We should all be part of the solution to keep Uganda clean");title.add("Welcome to Africa ");title.add("Lira a city of wonders");title.add("Together as one");
        image.add("image1.png");image.add("image1.png");image.add("image1.png");image.add("image1.png");


        NewsAdapter newsAdapter = new NewsAdapter(getActivity(),username,title,image,likes,downloads,comments,timeAgo);
        ListView listView = view.findViewById(R.id.awareness_cards);
        listView.setAdapter(newsAdapter);

        return view;
    }
}