package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    //Declare Recyclerview , Adapter and ArrayList
    private RecyclerView recyclerView;
    private ScoutAdapter adapter;
    private ArrayList<Scout> scoutArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.scout_recycler_view);


        initViewLinear();


    }

    private void initViewLinear() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        scoutArrayList = new ArrayList<>();
        adapter = new ScoutAdapter(this,scoutArrayList);
        recyclerView.setAdapter(adapter);
        createList();
    }

    private void initViewGridLayout() {
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        scoutArrayList = new ArrayList<>();
        adapter = new ScoutAdapter(this,scoutArrayList);
        recyclerView.setAdapter(adapter);
        createList();
    }

    private void createList() {
        //data to be shown in list
        scoutArrayList.add(new Scout( "Eren Jaeger" ,"Unranked" , "22" ));
        scoutArrayList.add(new Scout ( "Mikasa Ackermann" ,"Unranked" , "12" ) );
        scoutArrayList.add(new Scout ( "Armin Arlelt" ,"Unranked" , "0" ) );
        scoutArrayList.add(new Scout ( "Erwin Smith " , "Commander" , "Unknown" ) );
        scoutArrayList.add(new Scout ( "Levi Ackermann" , "Squad Captain" ,"~58" ) );
        scoutArrayList.add(new Scout ( "Hange Zoe" , "Commander" , "Unknown") );
        scoutArrayList.add(new Scout ( "Jean Kirschtein" , "Unranked" , "1" )	);
        scoutArrayList.add(new Scout ("Conny Springer", "Unranked" , "Unknown")	);
        scoutArrayList.add(new Scout ("Sasha Braus","Unranked","1")	);

    }
}