package com.example.echo.animals;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //引导页
    private Button bt_play,bt_exit;
    /*//主页
    private ImageButton imgbt_one,imgbt_two,imgbt_three,imgbt_four;
    private TextView tv_tishi;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.yindaoye);

        init();
        bt_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Game.class);
                startActivity(intent);
            }
        });
        bt_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //System.exit(0);
                finish();
            }
        });

    }
    private void init(){
        //引导页
        bt_play =findViewById(R.id.bt_play);
        bt_exit =findViewById(R.id.bt_exit);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/04B_03.TTF");
        bt_play.setTypeface(typeface);
        bt_exit.setTypeface(typeface);

    }


}
