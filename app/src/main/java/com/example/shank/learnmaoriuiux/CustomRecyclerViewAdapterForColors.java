package com.example.shank.learnmaoriuiux;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shank on 18/11/2017.
 */

public class CustomRecyclerViewAdapterForColors extends RecyclerView.Adapter<CustomViewHolderForColors> {

    protected LayoutInflater inflater;
    protected List<Object> itemList;
    protected Context context;

    public CustomRecyclerViewAdapterForColors(Context context, List<Object> itemList){
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        if(this.itemList == null){
            this.itemList = new ArrayList<Object>();
        }
        this.itemList = itemList;
    }

    @Override
    public CustomViewHolderForColors onCreateViewHolder(ViewGroup parent, int viewType) {
         View view = this.inflater.inflate(R.layout.card_item_layout_color, parent, false);
        CustomViewHolderForColors holder = new CustomViewHolderForColors(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderForColors holder, int position) {
        Colors item = (Colors) this.itemList.get(position);
        holder.getSoundImage().setImageResource(item.getSoundImage());
        holder.getEnglishWord().setText(item.getEnglishColor());
        holder.getMaoriWord().setText(item.getMaoriColor());
        holder.getColorLayout().setBackgroundColor(item.getColorCode());
        holder.setSoundFile(item.getSoundFile());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
