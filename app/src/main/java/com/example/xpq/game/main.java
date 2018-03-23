package com.example.xpq.game;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.CompoundButton;
import android.widget.Switch;


public class main extends AppCompatActivity {
    private MediaPlayer mediaPlayer1 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mediaPlayer1 = MediaPlayer.create(this, R.raw.as);
        Switch sw = (Switch) findViewById(R.id.switch1);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {


            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mediaPlayer1.start();
                }
                else{
                    mediaPlayer1.pause();
                }

            }
        });
    }
    public void startclick(View view) {
        startActivity(new Intent(main.this,diffirent.class));
    }

    public void setclick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("you should see the top tips and find the right picture");
        AlertDialog rule=builder.create();
        rule.show();

    }




    }
