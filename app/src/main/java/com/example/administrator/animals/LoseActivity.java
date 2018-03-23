package com.example.administrator.animals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.os.Handler;
public class LoseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);
    }
    public void btnClick(View view){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gameIntent=new Intent(LoseActivity.this,GameActivity.class);
                LoseActivity.this.startActivity(gameIntent);
                LoseActivity.this.finish();
            }
        },0);
    }
}
