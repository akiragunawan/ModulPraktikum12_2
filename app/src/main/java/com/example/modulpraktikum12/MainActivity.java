package com.example.modulpraktikum12;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;
    Button btn1,btn2;
    private void playSound(int arg){
        try{
            if (player.isPlaying()){
                player.stop();
                player.release();
            }
        }catch(Exception e){
            Toast.makeText(this, " Masuk Exception",
                    Toast.LENGTH_LONG).show();
        }

        if (arg == 1){
            Toast.makeText(this, "Now Playing Lagu1",
                    Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.lagu);
        }
        else if (arg == 2){
            Toast.makeText(this, "Now Playing Lagu2",
                    Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.lagu2);
        }

        player.setLooping(false);

        player.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              playSound(1);
            }
        });
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(2);
            }
        });
      }

}
