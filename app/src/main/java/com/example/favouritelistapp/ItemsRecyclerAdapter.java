package com.example.favouritelistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemsRecyclerAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private Category category;

    public void setCategory ( Category category ) {
        this.category = category;
    }

    public ItemsRecyclerAdapter(Category category) {
        this.category = category;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from ( parent.getContext () ).inflate ( R.layout.item_viewholder,  parent, false );
        return new ItemViewHolder ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.getTxtItemNumber ().setText ( Integer.toString ( position + 1 ) + ".");
        holder.getTxtItemName ().setText ( category.getItems ().get ( position ) );
    }

    @Override
    public int getItemCount() {
        return category.getItems ().size ();
    }
}
