package com.example.yohan.blogapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecentPostAdapter extends RecyclerView.Adapter<RecentPostAdapter.ImageTypeViewHolder> {

    private ArrayList<RecentModel> dataList;
    private Context context;
    public  onItemClicked mListner;

    public interface onItemClicked{
        void OnItemClick(int index);

    }

    public void SetOnItemClickListener(onItemClicked listner){
        mListner = listner;
    }

    public RecentPostAdapter(ArrayList<RecentModel> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    public class ImageTypeViewHolder extends RecyclerView.ViewHolder{

        TextView title,subtitle,author;
        ImageView imageView;

        public ImageTypeViewHolder(@NonNull View itemView) {
            super(itemView);

            this.title = itemView.findViewById(R.id.tvtitle);
            this.subtitle = itemView.findViewById(R.id.tvsubtitle);
            this.imageView = itemView.findViewById(R.id.iconImage);
            this.author = itemView.findViewById(R.id.tvauthor);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(mListner != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            mListner.OnItemClick(position);
                        }
                    }
                }
            });


        }
    }


    @NonNull
    @Override
    public ImageTypeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recentpostdetails,viewGroup,false);

        return new ImageTypeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageTypeViewHolder imageTypeViewHolder, int i) {

//        Typeface custom_font = Typeface.createFromAsset(context.getAssets(),  "iskpota.ttf");
//
//        imageTypeViewHolder.title.setTypeface(custom_font);
//        imageTypeViewHolder.author.setTypeface(custom_font);
//        imageTypeViewHolder.subtitle.setTypeface(custom_font);

        RecentModel model = dataList.get(i);

        imageTypeViewHolder.title.setText(model.title);
         imageTypeViewHolder.subtitle.setText(model.date);
        String imageUrl = model.Image;
        imageTypeViewHolder.author.setText(model.author);

        Picasso.get().load(imageUrl).fit().centerInside().into(imageTypeViewHolder.imageView);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


}
