package com.firstapp.projectgold;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class butnumadapater extends RecyclerView.Adapter<butnumadapater.viewholder> {
    Context context;
    ArrayList<Integer> var;
    public butnumadapater(Context context, ArrayList<Integer> var){
        this.context=context;
        this.var=var;

    }

    @NonNull
    @Override
    public butnumadapater.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.butnum,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull butnumadapater.viewholder holder, int position) {

        holder.number.setText(String.valueOf(var.get(position)));
    }

    @Override
    public int getItemCount() {
        return var.size();
    }
    class viewholder extends RecyclerView.ViewHolder{
        TextView number;

        public viewholder(View view) {
            super(view);
            number=view.findViewById(R.id.number);
        }
    }
}
