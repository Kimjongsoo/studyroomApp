package com.example.studyroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btManage = (Button)findViewById(R.id.btn_manage);

        btManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"3", Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(), ManageContextActivity.class);
                startActivity(intent);
            }
        });

    }
}