package com.example.baseadapterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private String[] countryNames;
    private int[] flags = {R.drawable.bdflag,R.drawable.bdflag,R.drawable.bdflag,R.drawable.bdflag,R.drawable.bdflag,R.drawable.bdflag,R.drawable.bdflag,R.drawable.bdflag,R.drawable.bdflag,R.drawable.bdflag,R.drawable.bdflag,R.drawable.bdflag,R.drawable.bdflag,R.drawable.bdflag,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames=getResources().getStringArray(R.array.countrylist);
        listview=findViewById(R.id.listViewId);
        CustomAdapter adapter = new CustomAdapter(this,countryNames,flags);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value = countryNames[i];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();

            }
        });

    }
}