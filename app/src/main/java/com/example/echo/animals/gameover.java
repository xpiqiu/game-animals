package com.example.echo.animals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by echo on 2018/3/22.
 */

public class GameOver extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);
        Button btn_try_again, bt_exit;

        btn_try_again = findViewById(R.id.bt_gameover_tryagain);


        btn_try_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(GameOver.this, Game.class));
            }
        });


    }

    public void btnExit(View view) {
          /*
                    Intent intent = new Intent();
                    intent.setClass(GameOver.this,MainActivity.class);
                    startActivity(intent);
          */
        //Should exit the application
        finishAffinity();

    }
}
