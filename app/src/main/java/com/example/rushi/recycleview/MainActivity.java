package com.example.rushi.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Activity_DestinationAdapter adapter;
    private List<Destination_Activity> imageList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleview);
        imageList=new ArrayList<>();
        adapter=new Activity_DestinationAdapter(this,imageList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);
        prepareImage();


    }
    private void prepareImage() {
        int[] covers = new int[]{
                R.drawable.album1,
                R.drawable.album2,
                R.drawable.album3,
                R.drawable.album4,
                };

        Destination_Activity a = new Destination_Activity("True Romance", 13, covers[0]);
        imageList.add(a);

        a = new Destination_Activity("Xscpae", 8, covers[1]);
        imageList.add(a);

        a = new Destination_Activity("Maroon 5", 11, covers[2]);
        imageList.add(a);

        a = new Destination_Activity("Born to Die", 12, covers[3]);
        imageList.add(a);

        adapter.notifyDataSetChanged();
    }
}
