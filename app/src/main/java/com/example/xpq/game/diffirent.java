package com.example.xpq.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class diffirent extends AppCompatActivity {


    private ImageView im;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diffirent);
        im=(ImageView)findViewById(R.id.ele);
    }
    public void Onclickele(View view) {
        im.setImageResource(R.drawable.ic_launcher_background);
        Toast.makeText(diffirent.this,"you are right",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(diffirent.this,without.class));
    }
    public void Onclickcat(View view) {
        show();
    }
    public void Onclickcat2(View view) {
        show();
    }
    public void Onclickcat3(View view) {
        show();
    }
    public void show() {
        Toast.makeText(diffirent.this,"you are wrong",Toast.LENGTH_SHORT).show();
    }
}
