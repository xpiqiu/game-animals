package com.example.administrator.animals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.os.Handler;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //timer.schedule(timerTask,0,50);
    }
    public void play_button_click(View view){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gameIntent=new Intent(MainActivity.this,GameActivity.class);
                MainActivity.this.startActivity(gameIntent);
                MainActivity.this.finish();
            }
        },0);
    }
}
