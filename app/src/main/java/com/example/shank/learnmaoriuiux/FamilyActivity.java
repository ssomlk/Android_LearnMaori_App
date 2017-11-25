package com.example.shank.learnmaoriuiux;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    private List<Object> familyMembersList;
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

        this.familyMembersList = initializeFamilyMembersList();

        this.customRecyclerView = (RecyclerView) findViewById(R.id.customRecyclerLayout);
        this.customRecyclerView.setAdapter(new CustomRecyclerViewAdapterForFamily(this, this.familyMembersList));
        this.customRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Object> initializeFamilyMembersList(){

        List<Object> itemList = new ArrayList<Object>();

        itemList.add(new Family(R.drawable.ic_volume, "Father", "Pāpā",R.drawable.icon_father, R.raw.audio_father));
        itemList.add(new Family(R.drawable.ic_volume, "Mother", "Whaea",R.drawable.icon_mother, R.raw.audio_mother));
        itemList.add(new Family(R.drawable.ic_volume, "Husband", "Tāne",R.drawable.icon_husband, R.raw.audio_husband));
        itemList.add(new Family(R.drawable.ic_volume, "Wife", "Wahine",R.drawable.icon_wife, R.raw.audio_wife));
        itemList.add(new Family(R.drawable.ic_volume, "Child", "tamaiti",R.drawable.icon_child, R.raw.audio_child));
        itemList.add(new Family(R.drawable.ic_volume, "Children", "Tamarki",R.drawable.icon_children, R.raw.audio_children));
        itemList.add(new Family(R.drawable.ic_volume, "Son", "Tama",R.drawable.icon_son, R.raw.audio_son));
        itemList.add(new Family(R.drawable.ic_volume, "Daughter", "Te tāmahine",R.drawable.icon_daughter, R.raw.audio_daughter));
        itemList.add(new Family(R.drawable.ic_volume, "Brother", "Tungāne",R.drawable.icon_brother, R.raw.audio_brother));
        itemList.add(new Family(R.drawable.ic_volume, "Sister", " Tuahine",R.drawable.icon_sister, R.raw.audio_sister));

        return itemList;
    }
}
