package com.example.favouritelistapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    public TextView item_number_TextView;
    public TextView item_name_TextView;

    public ItemViewHolder(@NonNull View itemView) {

        super ( itemView );
        item_name_TextView = itemView.findViewById ( R.id.item_name_textView );
        item_number_TextView = itemView.findViewById ( R.id.item_number_textView );
    }

    public TextView getTxtItemNumber() {
        return item_number_TextView;
    }

    public TextView getTxtItemName() {
        return item_name_TextView;
    }

}
