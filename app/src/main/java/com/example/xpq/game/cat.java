package com.example.xpq.game;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class cat extends AppCompatActivity {


    private ImageView im;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat);
        im=(ImageView)findViewById(R.id.cat);
    }
    public void Onclickcat(View view) {
        im.setImageResource(R.drawable.ic_launcher_background);
        Toast.makeText(cat.this,"you are right",Toast.LENGTH_SHORT).show();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Congratulations!!!!!!!!!!!!!!!!!!!!!!");
        AlertDialog congra=builder.create();
        congra.show();
    }
    public void Onclickele(View view) {
        show();
    }
    public void Onclickfis(View view) {
        show();
    }
    public void Onclickbir(View view) {
        show();
    }
    public void show() {
        Toast.makeText(cat.this,"you are wrong",Toast.LENGTH_SHORT).show();
    }
}
