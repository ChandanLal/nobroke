package com.example.android.nobroker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<DataModel> dataModelArrayList;

    public DataAdapter(Context ctx, ArrayList<DataModel> dataModelArrayList) {
        inflater = LayoutInflater.from(ctx);
        this.dataModelArrayList = dataModelArrayList;
    }

    @NonNull
    @Override
    public DataAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewTyp) {
        View view = inflater.inflate(R.layout.item_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.MyViewHolder holder, int position) {
       // Picasso.get().load(dataModelArrayList.get(position).getRent()).into(holder.rent);
        holder.rent.setText(dataModelArrayList.get(position).getRent());
        holder.propertySize.setText(dataModelArrayList.get(position).getPropertySize());
        holder.propertyTitle.setText(dataModelArrayList.get(position).getPropertyTitle());
    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView rent, propertySize, propertyTitle;
        ImageView iv;

        public MyViewHolder(View itemView) {
            super(itemView);

            rent = (TextView) itemView.findViewById(R.id.rent);
            propertySize = (TextView) itemView.findViewById(R.id.propertySize);
            propertyTitle = (TextView) itemView.findViewById(R.id.propertyTitle);
           // iv = (ImageView) itemView.findViewById(R.id.iv);
        }

    }
}
