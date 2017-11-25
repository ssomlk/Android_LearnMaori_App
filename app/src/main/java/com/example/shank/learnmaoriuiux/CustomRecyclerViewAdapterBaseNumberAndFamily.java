package com.example.shank.learnmaoriuiux;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shank on 18/11/2017.
 */

public abstract class CustomRecyclerViewAdapterBaseNumberAndFamily extends RecyclerView.Adapter<CustomViewHolderForNumersAndFamily> {

    protected LayoutInflater inflater;
    protected List<Object> itemList;
    protected Context context;

    public CustomRecyclerViewAdapterBaseNumberAndFamily(Context context, List<Object> itemList){
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        if(this.itemList == null){
            this.itemList = new ArrayList<Object>();
        }
        this.itemList = itemList;
    }

    public abstract CustomViewHolderForNumersAndFamily onCreateViewHolder(ViewGroup parent, int viewType) ;

    public abstract void onBindViewHolder(CustomViewHolderForNumersAndFamily holder, int position) ;

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}


