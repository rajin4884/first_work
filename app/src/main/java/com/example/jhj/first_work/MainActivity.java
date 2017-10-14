package com.example.jhj.first_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Two(View vi){
        Intent i = new Intent(this , Main2Activity.class);
        startActivity(i);
    }

    public void Six(View vi){
        Intent i = new Intent(this , FragmentExampleActivity.class);
        startActivity(i);
    }
}
