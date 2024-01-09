package com.example.schooltargil1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;



public class MainActivity extends AppCompatActivity
{
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.button);



    }

    public void go(View view)
    {
        btn.setText("Oh, yea, I've been clicked!");
    }
}