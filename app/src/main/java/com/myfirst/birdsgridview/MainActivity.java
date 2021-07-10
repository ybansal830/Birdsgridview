package com.myfirst.birdsgridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements itemClickListener {

    private RecyclerView mRecyclerView;
    private ArrayList<Birds> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        setData();
        BirdsAdapter birdsAdapter = new BirdsAdapter(arrayList, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        mRecyclerView.setAdapter(birdsAdapter);
        mRecyclerView.setLayoutManager(gridLayoutManager);
    }

    private void setData() {
        arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0) {
                arrayList.add(new Birds(R.drawable.eagle,"Eagle"));
            } else if (i % 4 == 1) {
                arrayList.add(new Birds(R.drawable.crow,"Crow"));
            } else if (i % 4 == 2) {
                arrayList.add(new Birds(R.drawable.pigeon,"Pigeon"));
            } else if (i % 4 == 3) {
                arrayList.add(new Birds(R.drawable.parrot,"Parrot"));
            }
        }
    }

    @Override
    public void itemClick(String birdName) {
        Toast.makeText(this,birdName,Toast.LENGTH_SHORT).show();
    }
}