package com.example.market;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import java.util.ArrayList;
import java.util.List;

public class detailsShops extends AppCompatActivity {
    RecyclerView recycler3;
    private SnapHelper snapHelper;
 List<ListProduct> productClasses=new ArrayList<>();
    ScaleCenterItemManager scaleCenterItemManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_shops);
/*
        ImageSlider imageSlider = findViewById(R.id.image_slider);
        List<SlideModel> slideModels= new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.balghaslider, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels);

        recycler3=findViewById(R.id.recyclerView2);






        myAdapterrecy myAdapt=new myAdapterrecy(productClasses,this);
        recycler3.setAdapter(myAdapt);
        snapHelper = new LinearSnapHelper();
        scaleCenterItemManager = new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL,false);
        recycler3.setLayoutManager(new LinearLayoutManager(this));
        recycler3.setLayoutManager(scaleCenterItemManager);
        snapHelper.attachToRecyclerView(recycler3);*/

    }

}