package com.example.ecosense;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TransasctionAdapter extends BaseAdapter {
    private Context context;
    private String[] delivered;
    private String[] cleared;
    private String[] location;
    LayoutInflater inflater;

    public TransasctionAdapter(Context ctx, ArrayList<String> delivered,ArrayList<String> cleared,ArrayList<String> location){
        this.context = ctx;
        this.delivered = delivered.toArray(new String[0]);
        this.cleared = cleared.toArray(new String[0]);
        this.location = location.toArray(new String[0]);
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return delivered.length;
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
        view = inflater.inflate(R.layout.recent_transaction,null);
        TextView mydelivery = view.findViewById(R.id.delivered);
        TextView mycleared = view.findViewById(R.id.cleared);
        TextView mylocation = view.findViewById(R.id.location);

        mydelivery.setText(delivered[i]);
        mycleared.setText(cleared[i]);
        mylocation.setText(location[i]);

        return view;
    }
}
