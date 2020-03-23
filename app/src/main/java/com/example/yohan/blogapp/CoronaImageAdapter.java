package com.example.yohan.blogapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class CoronaImageAdapter extends RecyclerView.Adapter<CoronaImageAdapter.ImageTypeViewHolder> {
    private ArrayList<coronaModel> dataList;
    private Context context;
    //public  onItemClicked mListner;

    public CoronaImageAdapter(ArrayList<coronaModel> dataList,Context context){
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ImageTypeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coronalayout,parent,false);

        return new ImageTypeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageTypeViewHolder holder, int position) {

        coronaModel model = dataList.get(position);

        holder.title.setText(model.title);
        holder.imageView.setImageResource(model.image);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


    public class ImageTypeViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        ImageView imageView;

        public ImageTypeViewHolder(@NonNull View itemView) {
            super(itemView);

            this.title = itemView.findViewById(R.id.coronaImageDetails);
            this.imageView = itemView.findViewById(R.id.coronaImage);
        }
    }

}
