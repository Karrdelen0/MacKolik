package com.example.sondeneme1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Custom1Adapter extends RecyclerView.Adapter<Custom1Adapter.ViewHolder>{
    ArrayList<Mac> MacArrayList;
    //Her bir satır için temsil edilecek arayüz seçilir
    LayoutInflater layoutInflater;
    Context context;

    public Custom1Adapter(ArrayList<Mac> macArrayList, Context context) {
        MacArrayList = macArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(context);
       View v = layoutInflater.inflate(R.layout.row_list,parent,false);
       ViewHolder vh= new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tarih.setText(MacArrayList.get(position).getTarih());
        holder.yer.setText(MacArrayList.get(position).getYer());
        holder.logo1.setImageResource(MacArrayList.get(position).getTakimlogo1());
        holder.logo2.setImageResource(MacArrayList.get(position).getTakimlogo2());
        holder.linearLayout.setTag(holder);
    }

    @Override
    public int getItemCount() {
        return MacArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView tarih,yer;
        ImageView logo1,logo2;
        LinearLayout linearLayout;
        public ViewHolder( View itemView) {
            super(itemView);
            tarih =itemView.findViewById(R.id.tarih);
            yer =itemView.findViewById(R.id.yer);
            logo1=itemView.findViewById(R.id.logo1);
            logo2=itemView.findViewById(R.id.logo2);
            linearLayout=itemView.findViewById(R.id.linear);

        }
    }
}
