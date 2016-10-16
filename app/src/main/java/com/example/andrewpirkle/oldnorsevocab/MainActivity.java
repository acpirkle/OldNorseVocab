package com.example.andrewpirkle.oldnorsevocab;

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

    // sends user to the desired vocab activity
    public void nav2Activity(View v){
        if (v.getId() == R.id.oldnorse_button){
            Intent intent = new Intent(this,OldNorseActivity.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, SwedishActivity.class);
            startActivity(intent);
        }
    }
}
