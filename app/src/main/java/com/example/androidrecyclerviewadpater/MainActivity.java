package com.example.androidrecyclerviewadpater;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidrecyclerviewadpater.adapter.productAdapter;
import com.example.androidrecyclerviewadpater.model.productModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMain;
    List<productModel> productModelList = new ArrayList<>();
    productAdapter productAdpater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = findViewById(R.id.rv_main);

        productModelList.add(new productModel(1, "phone", "electronics", 5000));
        productModelList.add(new productModel(2, "vivo phone", "electronics", 5500));
        productModelList.add(new productModel(3, "laptop", "electronics", 55000));
        productModelList.add(new productModel(4, "vivo case", "accesories", 50));
        productModelList.add(new productModel(5, "charger", "electronics", 1000));
        productModelList.add(new productModel(6, "tablet", "electronics", 7000));

        productAdpater = new productAdapter(productModelList);

        rvMain.setAdapter(productAdpater);
        rvMain.setLayoutManager(new LinearLayoutManager(this));
    }
}