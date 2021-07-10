package com.myfirst.birdsgridview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirdsAdapter extends RecyclerView.Adapter<BirdsViewHolder> {

    private ArrayList<Birds> arrayList;
    private itemClickListener itemClickListener;

    public BirdsAdapter(ArrayList<Birds> arrayList, itemClickListener itemClickListener) {
        this.arrayList = arrayList;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public BirdsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_birds, parent, false);
        return new BirdsViewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull BirdsViewHolder holder, int position) {
        holder.setData(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
