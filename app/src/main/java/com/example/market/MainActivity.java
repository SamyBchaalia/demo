package com.example.market;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<Card> Mylist= new ArrayList<>();
    CardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        Mylist.add(new Card("title 1","soukberk"));
        Mylist.add(new Card("title 2","soukb"));
        Mylist.add(new Card("title 3","soukch"));
        adapter =new CardAdapter(Mylist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        

    }
}