package com.example.sondeneme1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    ArrayList<Takim> takimArrayList = new ArrayList<>();
    Activity activity = new Activity();

    public CustomAdapter(ArrayList<Takim> takimArrayList, Activity activity){
        this.takimArrayList= takimArrayList;
        this.activity= activity;
    }
    @Override
    public int getCount() {
        return takimArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return takimArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(activity).inflate(R.layout.custom_listview_row,viewGroup,false);
        ImageView iv_row_logo = view.findViewById(R.id.iv_row_logo);
        TextView tv_row_takim = view.findViewById(R.id.tv_row_takim);
        TextView tv_row_lig = view.findViewById(R.id.tv_row_lig);
        Takim takim=takimArrayList.get(position);
        iv_row_logo.setImageResource(takim.getTakimlogo());
        tv_row_takim.setText(takim.getTakimad());
        tv_row_lig.setText(takim.getTakimligi());

        return view;
    }
}
