package com.firstapp.projectgold;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class profilesadapter extends RecyclerView.Adapter<profilesadapter.viewholder> {
    Context context;

    String[] list;

    public profilesadapter(Context context,String[] l) {
        this.context=context;
        this.list=l;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.profile,parent,false);
        return new viewholder(view);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.name.setText(list[position]);
    }

    class viewholder extends RecyclerView.ViewHolder {
        TextView name;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
        }
    }
}
