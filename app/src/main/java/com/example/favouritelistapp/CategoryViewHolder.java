package com.example.favouritelistapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    private TextView txtCategoryNumber;
    private TextView txtCategoryName;

    public CategoryViewHolder(@NonNull View itemView) {

        super ( itemView );
        txtCategoryNumber = itemView.findViewById ( R.id.category_number_textview );
        txtCategoryName = itemView.findViewById ( R.id.category_name_textview );
    }

    public TextView getTxtCategoryNumber() {
        return txtCategoryNumber;
    }

    public TextView getTxtCategoryName() {
        return txtCategoryName;
    }
}
