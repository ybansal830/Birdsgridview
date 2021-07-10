package com.myfirst.birdsgridview;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BirdsViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvBird;
    private itemClickListener itemClickListener;
    public BirdsViewHolder(@NonNull View itemView,itemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        mIvBird = itemView.findViewById(R.id.ivBird);
    }
    public void setData(Birds birds){
        mIvBird.setImageResource(birds.getBirdsImageId());
        mIvBird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.itemClick(birds.getBirdName());
            }
        });
    }
}
