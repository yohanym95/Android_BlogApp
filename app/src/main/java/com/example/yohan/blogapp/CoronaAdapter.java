package com.example.yohan.blogapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CoronaAdapter extends RecyclerView.Adapter<CoronaAdapter.ImageTypeViewHolder> {

    private ArrayList<CoronaListModel> dataList;
    private Context context;
    //public  onItemClicked mListner;

    public CoronaAdapter(ArrayList<CoronaListModel> dataList,Context context){
        this.dataList = dataList;
        this.context = context;
    }
    @NonNull
    @Override
    public ImageTypeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coronalistlayout,parent,false);

        return new ImageTypeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageTypeViewHolder holder, int position) {

        CoronaListModel coronaListModel = dataList.get(position);

        holder.title.setText(coronaListModel.title);
        holder.totalCount.setText(coronaListModel.totalCount);
        holder.totalLocal.setText("Locals Count of treatment or observation - "+coronaListModel.totalLocal);
        holder.totalForiegn.setText("Foreigners count of treatment or observation - "+coronaListModel.totalForiegn);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ImageTypeViewHolder extends RecyclerView.ViewHolder{

        TextView title,totalLocal,totalForiegn,totalCount;
        ImageView imageView;

        public ImageTypeViewHolder(@NonNull View itemView) {
            super(itemView);

            this.title = itemView.findViewById(R.id.hospitalTitle);
            this.totalLocal = itemView.findViewById(R.id.hospitalLocal);
            this.totalForiegn = itemView.findViewById(R.id.hospitalForiegn);
            this.totalCount = itemView.findViewById(R.id.totalTreat);





        }
    }

}
