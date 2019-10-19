package com.poliban.prj04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter adapter;
    private ListView lvItem;

    private List<String> data = new ArrayList<>();
    {
        data.add("Barcelona");
        data.add("Bayern Munich");
        data.add("Dortmund");
        data.add("Real Madrid");
        data.add("Sevilla");
        data.add("Atletico Madrid");
        data.add("Chelsea");
        data.add("Liverpool");
        data.add("Manchester United");
        data.add("Manchester City");
        data.add("Tottenham Hotspurs");
        data.add("Arsenal");
        data.add("Valencia");
        data.add("PSG");
        data.add("LYON");
        data.add("Leicester");
        data.add("Juventus");
        data.add("Inter Milan");
        data.add("Ac Milan");
        data.add("Napoli");
        data.add("Lazio");
        data.add("West Ham United");
        data.add("Schalke 04");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!=null) getSupportActionBar().setTitle("Demo Simple List View");

        ListView lv = findViewById(R.id.list_view);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, R.id.textview, data);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener((adapterView, view, i, l)->{
                    Toast.makeText(this, String.format( "You choosed :"+ data.get(i)), Toast.LENGTH_SHORT).show();
                });

        lv.setOnItemLongClickListener((adapterView , view ,i,l)->{
            data.remove(i);
            adapter.notifyDataSetChanged();
            return true;
        });
    }
}
