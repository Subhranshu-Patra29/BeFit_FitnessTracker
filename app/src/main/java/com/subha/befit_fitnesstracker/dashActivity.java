package com.subha.befit_fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashActivity extends AppCompatActivity {

    Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
    }
    public void PEDO(View view) {
        Intent in=new Intent(this,pedometerActivity.class);
        startActivity(in);
    }
    public void cal(View view) {
        Intent in=new Intent(this,calculateActivity.class);
        startActivity(in);
    }

    public void nutri(View view) {
        Intent in=new Intent(this,nutrientActivity.class);
        startActivity(in);
    }

    public void water(View view) {
        Intent in=new Intent(this,watertrackActivity.class);
        startActivity(in);
    }

    public void excer(View view) {
        Intent in=new Intent(this,excerciseActivity.class);
        startActivity(in);
    }

}
