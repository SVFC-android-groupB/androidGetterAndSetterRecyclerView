package com.example.androidrecyclerviewadpater.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidrecyclerviewadpater.R;
import com.example.androidrecyclerviewadpater.model.ProductModel;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.productViewHolder> {

    List<ProductModel> productModelList;

    public ProductAdapter(List<ProductModel> productModelList){
        this.productModelList = productModelList;
    }

    @NonNull
    @Override
    public ProductAdapter.productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_product_card, parent, false);
        return new productViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.productViewHolder holder, int position) {
        ProductModel productModel = productModelList.get(position);
        holder.productName.setText(productModel.getName());
        holder.category.setText(productModel.getCategory());
        holder.price.setText(String.valueOf(productModel.getPrice()));
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
