package com.example.studyroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ManageContextActivity extends AppCompatActivity {

    ArrayList<ManageContents> manageContentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_context);
        this.init();

        ListView listView = (ListView)findViewById(R.id.mngListview);
        final ManageAdapter manageAdapter = new ManageAdapter(this, manageContentList);

        listView.setAdapter(manageAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),
                        manageAdapter.getItem(position).getContents(), Toast.LENGTH_SHORT);
            }
        });
    }


    public void init(){
        manageContentList = new ArrayList<ManageContents>();
        manageContentList.add(new ManageContents("5월5일", "숙제한가득"));
        manageContentList.add(new ManageContents("12월25일", "숙제선물 한가득~"));
    }
}
