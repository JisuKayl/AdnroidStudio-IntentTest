package com.example.navigation1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvColor;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeColor(View view) {

        tvColor = (TextView) (findViewById(R.id.tvColor));


        if (num == 0) {
            tvColor.setTextColor(Color.parseColor("#FF0000"));
            tvColor.setText("This is color RED");
            num = 1;
        } else {
            tvColor.setTextColor(Color.parseColor("#0000FF"));
            tvColor.setText("This is color BLUE");
            num = 0;
        }
    }

    public void navButton(View view) {
        Button secondBtn = (Button) findViewById(R.id.secondBtn);
        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("org.mentor-schools.quick launcher.SOMETHING", "Welcome to SECOND ACTIVITY");
                startActivity(startIntent);
            }
        });


    }
    public void onClickGoogle(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(intent);
    }

}