package com.example.administrator.animals;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class GameActivity extends AppCompatActivity {
    public final int total_level = 7;
    public Integer timeLeft = 15;
    public Integer level = 1;
    Timer timer = new Timer();
    public final int[] buttonId = new int[]{R.id.imageButton_1, R.id.imageButton_2,
            R.id.imageButton_3, R.id.imageButton_4, R.id.imageButton_5, R.id.imageButton_6,
            R.id.imageButton_7, R.id.imageButton_8, R.id.imageButton_9};
    public final String str_good = "_good";
    public final String str_bad = "_bad";
    int badButton = 0;
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            //Updates that are needed on the UI Thread
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (timeLeft > 0) {
                        timeLeft--;
                        String unit = ((timeLeft <= 1)? "second":"seconds");
                        ((TextView) findViewById(R.id.tv_time)).setText(timeLeft.toString() + " " + unit);
                    } else {
                        ((TextView) findViewById(R.id.tv_time)).setText("Time Out!");
                    }
                }
            });

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        startLevel();
    }


    public void startLevel() {
        level = 1;
        timeLeft = 15;
        timer.schedule(task, 1000, 1000);
        initLevel();
    }

    public void Lose() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gameIntent = new Intent(GameActivity.this, LoseActivity.class);
                GameActivity.this.startActivity(gameIntent);
                GameActivity.this.finish();
            }
        }, 1000);
    }

    public void nextLevel() {
        level++;
        timeLeft = 15;
        ((TextView) findViewById(R.id.tv_level)).setText("Level " + level.toString());
        initLevel();
    }

    public void initLevel() {
        if (level > total_level) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent gameIntent = new Intent(GameActivity.this, FinishActivity.class);
                    GameActivity.this.startActivity(gameIntent);
                    GameActivity.this.finish();
                }
            }, 0);
        }
        Random random = new Random();
        int bad = random.nextInt(9);
        badButton = bad;
        for (int i = 0; i < 9; ++i) {
            String imageName = "level_" + level + str_good;
            int drawableId;
            if (i == bad) {
                imageName = "level_" + level + str_bad;
                drawableId = getResources().getIdentifier(imageName, "drawable", getApplicationContext().getPackageName());
                ((ImageButton) findViewById(buttonId[i])).setImageResource(drawableId);
            } else {
                imageName = "level_" + level + str_good;
                drawableId = getResources().getIdentifier(imageName, "drawable", getApplicationContext().getPackageName());
                ((ImageButton) findViewById(buttonId[i])).setImageResource(drawableId);
            }
        }
    }

    public void gameButtonClick(View view) {
        int buttonDowm = 0;
        switch (view.getId()) {
            case R.id.imageButton_1: {
                //Toast.makeText(getBaseContext(),"1",Toast.LENGTH_SHORT).show();
                buttonDowm = 0;
                break;
            }
            case R.id.imageButton_2: {
                //Toast.makeText(getBaseContext(),"2",Toast.LENGTH_SHORT).show();
                buttonDowm = 1;
                break;
            }
            case R.id.imageButton_3: {
                //Toast.makeText(getBaseContext(),"3",Toast.LENGTH_SHORT).show();
                buttonDowm = 2;
                break;
            }
            case R.id.imageButton_4: {
                //Toast.makeText(getBaseContext(),"4",Toast.LENGTH_SHORT).show();
                buttonDowm = 3;
                break;
            }
            case R.id.imageButton_5: {
                //Toast.makeText(getBaseContext(),"5",Toast.LENGTH_SHORT).show();
                buttonDowm = 4;
                break;
            }
            case R.id.imageButton_6: {
                //Toast.makeText(getBaseContext(),"6",Toast.LENGTH_SHORT).show();
                buttonDowm = 5;
                break;
            }
            case R.id.imageButton_7: {
                //Toast.makeText(getBaseContext(),"7",Toast.LENGTH_SHORT).show();
                buttonDowm = 6;
                break;
            }
            case R.id.imageButton_8: {
                //Toast.makeText(getBaseContext(),"8",Toast.LENGTH_SHORT).show();
                buttonDowm = 7;
                break;
            }
            case R.id.imageButton_9: {
                //Toast.makeText(getBaseContext(),"9",Toast.LENGTH_SHORT).show();
                buttonDowm = 8;
                break;
            }
        }
        CharSequence c = ((TextView) findViewById(R.id.tv_time)).getText();
        if (c.toString() == "Time Out!") {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent gameIntent = new Intent(GameActivity.this, LoseActivity.class);
                    GameActivity.this.startActivity(gameIntent);
                    GameActivity.this.finish();
                }
            }, 0);
            return;
        }
        if (buttonDowm != badButton) {
            //Toast.makeText(getBaseContext(), "You Lose!", Toast.LENGTH_LONG).show();
            ((ImageButton) findViewById(buttonId[badButton])).setBackgroundColor(0xFFFF4081);
            Lose();
            timer.cancel();
        } else {
            //Toast.makeText(getBaseContext(), "Congratulations!", Toast.LENGTH_LONG).show();
            nextLevel();
        }

    }
}
