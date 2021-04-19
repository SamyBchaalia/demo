package com.example.market;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Maison extends AppCompatActivity {

    RecyclerView maisonRecycler;
    SnapHelper snapHelper;
    ScaleCenterItemManager scaleCenterItemManager;
    List<ListProduct> listMaisons= new ArrayList<>();
    List<SlideModel> slideModels= new ArrayList<>();
    //adapter
    myAdapterrecy maisonAdapter;
    //firebase
    DatabaseReference maisonsref ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maison);
        maisonRecycler=findViewById(R.id.recyclerMoreProd);

        snapHelper = new LinearSnapHelper();
        scaleCenterItemManager = new ScaleCenterItemManager(this, LinearLayoutManager.HORIZONTAL, false);
        maisonRecycler.setLayoutManager(new LinearLayoutManager(this));
        maisonRecycler.setLayoutManager(scaleCenterItemManager);


        maisonsref= FirebaseDatabase.getInstance().getReference().child("shops").child("store1").child("products");
        maisonsref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds:dataSnapshot.getChildren()){
                    Toast.makeText(Maison.this, ds.toString(), Toast.LENGTH_LONG).show();
                    ListProduct data=ds.getValue(ListProduct.class);

                    listMaisons.add(data);

                }
                maisonAdapter =new myAdapterrecy(listMaisons,Maison.this);
                maisonRecycler.setAdapter(maisonAdapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            } });


        ImageSlider imageSlider = findViewById(R.id.image_slider1);

        slideModels.add(new SlideModel(R.drawable.balghaslider, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels);

    }}