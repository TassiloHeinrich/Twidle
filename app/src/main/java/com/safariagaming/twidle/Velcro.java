package com.safariagaming.twidle;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Velcro extends AppCompatActivity {

    MediaPlayer velcro_sound;
    ImageButton open, close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_velcro);
    }

    public void onClickVelcroOPEN(View view) {
        close = (ImageButton) findViewById(R.id.velcroCLOSE);
        close.setVisibility(View.VISIBLE);
    }

    public void onClickVelcroCLOSE(View view) {
        open = (ImageButton) findViewById(R.id.velcroCLOSE);
        open.setVisibility(View.INVISIBLE);
        velcro_sound = MediaPlayer.create(this, R.raw.velcro_sound);
        velcro_sound.start();
    }

}
