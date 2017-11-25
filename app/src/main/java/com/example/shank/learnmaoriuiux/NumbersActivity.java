package com.example.shank.learnmaoriuiux;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.transition.Slide;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    private List<Object> numbersList;
    private RecyclerView customRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Build.VERSION.SDK_INT >= 21){
            Slide slide = new Slide();
            slide.setDuration(1500);
            getWindow().setEnterTransition(slide);
        }

        setContentView(R.layout.activity_custom_recycler);

        this.numbersList = initializeNumbersList();

        this.customRecyclerView = (RecyclerView) findViewById(R.id.customRecyclerLayout);
        this.customRecyclerView.setAdapter(new CustomRecyclerViewAdapterForNumbers(this, this.numbersList));
        this.customRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Object> initializeNumbersList(){

        List itemList = new ArrayList<Object>();

        itemList.add(new Numbers(R.drawable.ic_volume, "One", "Tahi",R.drawable.icon1, R.raw.audio_1));
        itemList.add(new Numbers(R.drawable.ic_volume, "Two", "Rua",R.drawable.icon2, R.raw.audio_2));
        itemList.add(new Numbers(R.drawable.ic_volume, "Three", "Toru",R.drawable.icon3, R.raw.audio_3));
        itemList.add(new Numbers(R.drawable.ic_volume, "Four", "Whā",R.drawable.icon4, R.raw.audio_4));
        itemList.add(new Numbers(R.drawable.ic_volume, "Five", "Rima",R.drawable.icon5, R.raw.audio_5));
        itemList.add(new Numbers(R.drawable.ic_volume, "Six", "Ono",R.drawable.icon6, R.raw.audio_6));
        itemList.add(new Numbers(R.drawable.ic_volume, "Seven", "Whitu",R.drawable.icon7, R.raw.audio_7));
        itemList.add(new Numbers(R.drawable.ic_volume, "Eight", "Waru",R.drawable.icon8, R.raw.audio_8));
        itemList.add(new Numbers(R.drawable.ic_volume, "Nine", "Iwa",R.drawable.icon9, R.raw.audio_9));
        itemList.add(new Numbers(R.drawable.ic_volume, "Ten", "Tekau",R.drawable.icon10, R.raw.audio_10));

        return itemList;
    }
}
