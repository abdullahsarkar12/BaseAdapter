package com.example.baseadapterproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] flags;
    String[] countryNames;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter(Context context, String[] countryNames, int[] flags) {

        this.context = context;
        this.countryNames = countryNames;
        this.flags = flags;

    }

    @Override
    public int getCount() {
        return countryNames.length;
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

        if (view == null) {

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.sampleview,viewGroup,false);


        }

        ImageView imageView = view.findViewById(R.id.imageId);
        TextView textView = view.findViewById(R.id.CountryNameId);
        imageView.setImageResource(flags[i]);
        textView.setText(countryNames[i]);



        return view;
    }
}

