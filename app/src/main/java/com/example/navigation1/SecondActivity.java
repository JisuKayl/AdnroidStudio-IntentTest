package com.example.navigation1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("org.mentor-schools.quick launcher.SOMETHING")){
            TextView tvHeader2= (TextView) findViewById(R.id.tvHeader2);
            String text= getIntent().getExtras().getString("org.mentor-schools.quick launcher.SOMETHING");
            tvHeader2.setText(text);
        }
    }
}