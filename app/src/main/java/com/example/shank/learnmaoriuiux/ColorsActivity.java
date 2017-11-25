package com.example.shank.learnmaoriuiux;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Slide;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    private List<Object> colorsList;
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

        this.colorsList = initializeColorsList();

        this.customRecyclerView = (RecyclerView) findViewById(R.id.customRecyclerLayout);
        this.customRecyclerView.setAdapter(new CustomRecyclerViewAdapterForColors(this, this.colorsList));
        this.customRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Object> initializeColorsList(){

        List<Object> itemList = new ArrayList<Object>();

        itemList.add(new Colors(R.drawable.ic_volume, "Yellow", "Kōwhai", Color.rgb(255, 246, 170), R.raw.audio_yellow));
        itemList.add(new Colors(R.drawable.ic_volume, "Green", "Kākāriki", Color.rgb(173, 226, 183 ), R.raw.audio_green));
        itemList.add(new Colors(R.drawable.ic_volume, "Orange", "Karaka",Color.rgb(255, 184, 157), R.raw.audio_orange));
        itemList.add(new Colors(R.drawable.ic_volume, "Red", "Whero", Color.rgb(242, 132, 122), R.raw.audio_red));
        itemList.add(new Colors(R.drawable.ic_volume, "Blue", "Kikorangi",Color.rgb(162, 194, 255), R.raw.audio_blue));
        itemList.add(new Colors(R.drawable.ic_volume, "Pink", "māwhero", Color.rgb(255, 160, 183), R.raw.audio_pink));
        itemList.add(new Colors(R.drawable.ic_volume, "Purple", "Tawa", Color.rgb(230, 165, 220), R.raw.audio_purple));
        itemList.add(new Colors(R.drawable.ic_volume, "Blue", "Kikorangi",Color.rgb(162, 194, 255), R.raw.audio_blue));

        return itemList;
    }
}
