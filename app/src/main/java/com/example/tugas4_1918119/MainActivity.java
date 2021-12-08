package com.example.tugas4_1918119;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List adapter;
    private ArrayList<Repo> ctnArrayList;
    private ArrayList<Repo> ctArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView) findViewById(R.id.recycleview);
        adapter = new List(ctnArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        ctnArrayList = new ArrayList<>();
        ctnArrayList.add(new Repo("Gabrieela", "Pictorial Mark Logo",
                "Desain By Syahroni Bugis",R.drawable.gabrieela));
        ctnArrayList.add(new Repo("Gentleman Barbershop", "Abstract Mark Logo",
                "Desain By Syahroni Bugis",R.drawable.barbershop));
        ctnArrayList.add(new Repo("Bird Fish", "Grid Logo",
                "Desain By Syahroni Bugis",R.drawable.bird));
        ctnArrayList.add(new Repo("Halea Coffee", "Letter Form Logo",
                "Desain By Syahroni Bugis",R.drawable.halea));
    }


}