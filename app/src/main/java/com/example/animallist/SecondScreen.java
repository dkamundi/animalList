package com.example.animallist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            String title = extras.getString("title");
            Toast.makeText(this,""+title, Toast.LENGTH_SHORT).show();
        }
    }
}