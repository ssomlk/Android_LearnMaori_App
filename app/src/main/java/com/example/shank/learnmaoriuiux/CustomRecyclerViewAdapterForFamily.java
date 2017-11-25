package com.example.shank.learnmaoriuiux;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by shank on 18/11/2017.
 */

public class CustomRecyclerViewAdapterForFamily extends CustomRecyclerViewAdapterBaseNumberAndFamily {

    public CustomRecyclerViewAdapterForFamily(Context context, List<Object> itemList){
        super(context, itemList);
    }

    @Override
    public CustomViewHolderForNumersAndFamily onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = this.inflater.inflate(R.layout.card_item_layout, parent, false);
        CustomViewHolderForNumersAndFamily holder = new CustomViewHolderForNumersAndFamily(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderForNumersAndFamily holder, int position) {
        Family item = (Family) this.itemList.get(position);
        holder.getSoundImage().setImageResource(item.getSoundImage());
        holder.getEnglishWord().setText(item.getEnglishFamilyMember());
        holder.getMaoriWord().setText(item.getMaoriFamilyMemberName());
        Picasso.with(this.context).load(item.getFamilyMemberImage()).resize(80,80).into(holder.getWordImage());
        holder.setSoundFile(item.getSoundFile());
    }
}
