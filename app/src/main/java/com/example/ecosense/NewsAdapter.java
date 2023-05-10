package com.example.ecosense;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NewsAdapter extends BaseAdapter {
    private String[] username;
    private String[] newstitle;
    private String[] Image;
    private String[] likes;
    private String[] downloads;
    private String[] comments;
    private String[] description;
    private String[] timeAgo;
    private LayoutInflater layoutInflater;
    private Context context;

    public NewsAdapter(Context ctx, ArrayList<String> username, ArrayList<String> newstitle, ArrayList<String> image, ArrayList<String> likes, ArrayList<String> downloads, ArrayList<String> comments,ArrayList<String> timeAgo){
        this.comments =comments.toArray(new String[0]);
        this.downloads = downloads.toArray(new String[0]);
        this.username = username.toArray(new String[0]);
        this.newstitle = newstitle.toArray(new String[0]);
        this.Image = image.toArray(new String[0]);
        this.likes = likes.toArray(new String[0]);
        this.context = ctx;
        this.timeAgo = timeAgo.toArray(new String[0]);
        layoutInflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return this.username.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.awareness_card_format,null);

        TextView newstitle = view.findViewById(R.id.description);
        TextView username = view.findViewById(R.id.username);
        TextView likes = view.findViewById(R.id.likes);
        TextView comments = view.findViewById(R.id.comments);
        TextView downloads = view.findViewById(R.id.downloads);
        ImageView userpicture =view.findViewById(R.id.userImage);
        TextView timeAgo = view.findViewById(R.id.time_ago);

        //setting the text into their fields and images
        newstitle.setText(this.newstitle[i]);
        username.setText(this.username[i]);
        likes.setText(this.likes[i]);
        comments.setText(this.downloads[i]);
        downloads.setText(this.downloads[i]);
        timeAgo.setText(this.timeAgo[i]);

        return view;
    }
}
