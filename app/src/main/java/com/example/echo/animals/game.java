package com.example.echo.animals;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by echo on 2018/3/22.
 */

public class Game extends AppCompatActivity {
    // private Button bt_ok;
    private int i = 0;
    //主页
    private ImageButton imgbt_one, imgbt_two, imgbt_three, imgbt_four;
    private TextView tv_tishi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);

        init();

        changeGame();
        winOrFailed();

    }

    private void init() {

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/font_one.TTF");
        tv_tishi = findViewById(R.id.tv_1);
        tv_tishi.setTypeface(typeface);
        imgbt_one = findViewById(R.id.imgbt_1);
        imgbt_two = findViewById(R.id.imgbt_2);
        imgbt_three = findViewById(R.id.imgbt_3);
        imgbt_four = findViewById(R.id.imgbt_4);

    }

    private void changeGame() {
        //更换界面图标
        i = (int) (Math.random() * 3);
        switch (i) {
            case 0:
                tv_tishi.setText("flower");
                imgbt_one.setImageResource(R.drawable.sunartboard);
                imgbt_two.setImageResource(R.drawable.honeyartboard);
                imgbt_three.setImageResource(R.drawable.flowerartboard);
                imgbt_four.setImageResource(R.drawable.houseartboard);
                break;
            case 1:
                tv_tishi.setText("fish");
                imgbt_one.setImageResource(R.drawable.catartboard);
                imgbt_two.setImageResource(R.drawable.pigartboard);
                imgbt_three.setImageResource(R.drawable.birdartboard);
                imgbt_four.setImageResource(R.drawable.fishartboard);
                break;
            case 2:
                tv_tishi.setText("sun");
                imgbt_one.setImageResource(R.drawable.honeyartboard);
                imgbt_two.setImageResource(R.drawable.sunartboard);
                imgbt_three.setImageResource(R.drawable.houseartboard);
                imgbt_four.setImageResource(R.drawable.pigartboard);
                break;
            case 3:
                tv_tishi.setText("bird");
                imgbt_one.setImageResource(R.drawable.birdartboard);
                imgbt_two.setImageResource(R.drawable.fishartboard);
                imgbt_three.setImageResource(R.drawable.catartboard);
                imgbt_four.setImageResource(R.drawable.honeyartboard);
        }
    }

    private void winOrFailed() {
        imgbt_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i == 0) {
                    imgbt_one.setImageResource(R.drawable.sun_noartboard);
                    //Toast.makeText(Game.this,"Sorry,the wrong answer！",Toast.LENGTH_LONG).show();
                    over();
                } else if (i == 1) {
                    imgbt_one.setImageResource(R.drawable.cat_noartboard);
                    //Toast.makeText(Game.this,"Sorry,the wrong answer！",Toast.LENGTH_LONG).show();
                    over();
                } else if (i == 2) {
                    imgbt_one.setImageResource(R.drawable.honey_noartboard);
                    //Toast.makeText(Game.this,"Sorry,the wrong answer！",Toast.LENGTH_LONG).show();
                    over();
                } else if (i == 3) {
                    imgbt_one.setImageResource(R.drawable.bird_okartboard);
                    //Toast.makeText(Game.this,"Congratulations,the right answer！",Toast.LENGTH_LONG).show();
                    win();
                }
            }
        });
        imgbt_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i == 0) {
                    imgbt_two.setImageResource(R.drawable.honey_noartboard);
                    // Toast.makeText(Game.this,"Sorry,the wrong answer！",Toast.LENGTH_LONG).show();
                    over();
                } else if (i == 1) {
                    imgbt_two.setImageResource(R.drawable.pig_noartboard);
                    //Toast.makeText(Game.this,"Sorry,the wrong answer！",Toast.LENGTH_LONG).show();
                    over();
                } else if (i == 2) {
                    imgbt_two.setImageResource(R.drawable.sun_okartboard);
                    //Toast.makeText(Game.this,"Congratulations,the right answer！",Toast.LENGTH_LONG).show();
                    win();
                } else if (i == 3) {
                    imgbt_two.setImageResource(R.drawable.fish_noartboard);
                    //Toast.makeText(Game.this,"Sorry,the wrong answer！",Toast.LENGTH_LONG).show();
                    over();
                }
            }
        });
        imgbt_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i == 0) {
                    imgbt_three.setImageResource(R.drawable.flower_okartboard);
                    //Toast.makeText(Game.this,"Congratulations,the right answer！",Toast.LENGTH_LONG).show();
                    win();
                } else if (i == 1) {
                    imgbt_three.setImageResource(R.drawable.bird_noartboard);
                    //Toast.makeText(Game.this,"Sorry,the wrong answer！",Toast.LENGTH_LONG).show();
                    over();
                } else if (i == 2) {
                    imgbt_three.setImageResource(R.drawable.house_noartboard);
                    //Toast.makeText(Game.this,"Sorry,the wrong answer！",Toast.LENGTH_LONG).show();
                    over();
                } else if (i == 3) {
                    imgbt_three.setImageResource(R.drawable.cat_noartboard);
                    // Toast.makeText(Game.this,"Sorry,the wrong answer！",Toast.LENGTH_LONG).show();
                    over();
                }
            }
        });
        imgbt_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i == 0) {
                    imgbt_four.setImageResource(R.drawable.house_noartboard);
                    //Toast.makeText(Game.this,"Sorry,the wrong answer！",Toast.LENGTH_LONG).show();
                    over();
                } else if (i == 1) {
                    imgbt_four.setImageResource(R.drawable.fish_okartboard);
                    //Toast.makeText(Game.this,"Congratulations,the right answer！",Toast.LENGTH_LONG).show();
                    win();
                } else if (i == 2) {
                    imgbt_four.setImageResource(R.drawable.pig_noartboard);
                    // Toast.makeText(Game.this,"Sorry,the wrong answer！",Toast.LENGTH_LONG).show();
                    over();
                } else if (i == 3) {
                    imgbt_four.setImageResource(R.drawable.honey_noartboard);
                    //Toast.makeText(Game.this,"Sorry,the wrong answer！",Toast.LENGTH_LONG).show();
                    over();
                }
            }
        });
    }

    public void win() {
        startActivity(new Intent(Game.this, Win.class));
    }

    public void over() {
        startActivity(new Intent(Game.this, GameOver.class));
    }
}
