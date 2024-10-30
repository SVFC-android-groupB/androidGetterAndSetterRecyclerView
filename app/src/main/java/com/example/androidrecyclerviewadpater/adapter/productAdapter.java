package com.example.androidrecyclerviewadpater.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.androidrecyclerviewadpater.model.productModel;

import com.example.androidrecyclerviewadpater.R;

import java.util.List;

public class productAdapter extends RecyclerView.Adapter<productAdapter.productViewHolder> {

    List<productModel> productModelList;

    public productAdapter(List<productModel> productModelList){
        this.productModelList = productModelList;
    }

    @NonNull
    @Override
    public productAdapter.productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_product_card, parent, false);
        return new productViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productAdapter.productViewHolder holder, int position) {
         productModel productModel = productModelList.get(position);
         holder.productName.setText(productModel.getName());
         holder.category.setText(productModel.getCategory());
         holder.price.setText(productModel.getPrice());
    }

    @Override
    public int getItemCount() {
        return productModelList.size();
    }

    public static class productViewHolder extends RecyclerView.ViewHolder{

        TextView productName, category, price;

        public productViewHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.tv_name);
            category = itemView.findViewById(R.id.tv_category);
            price = itemView.findViewById(R.id.tv_price);
        }
    }
}
