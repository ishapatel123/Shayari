package com.example.MyAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shayari.R;
import com.example.shayari.Second_Activity;

public class MyAdapter1 extends BaseAdapter {

    Second_Activity second_activity;
    int imgArr;
    String shayari[];

    public MyAdapter1(Second_Activity second_activity, int imgArr, String[] shayari) {
        this.second_activity = second_activity;
        this.imgArr=imgArr;
        this.shayari=shayari;
    }

    @Override
    public int getCount() {
        return shayari.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(second_activity).inflate(R.layout.second_page_item,viewGroup,false);
        ImageView imageView = view.findViewById(R.id.activity_second_page_imgView);
        TextView txt1 = view.findViewById(R.id.activity_second_page_txt1);

        imageView.setImageResource(imgArr);
        txt1.setText(""+shayari[position]);

        return view;
    }
}