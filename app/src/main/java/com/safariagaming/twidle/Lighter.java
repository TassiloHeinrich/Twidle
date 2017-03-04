package com.safariagaming.twidle;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class Lighter extends AppCompatActivity {

    boolean isOn;
    MediaPlayer lighter_flame_sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lighter);
    }

    public void onClickLighterON(View view) //why View view //TURNS ON THE FLAME
    {
        isOn = true;
        ImageButton off = (ImageButton) findViewById(R.id.lighter_off);
        off.setVisibility(View.INVISIBLE);
        MediaPlayer openLockSound = MediaPlayer.create(this, R.raw.open_lighter_sound); //setting openLockSound to a mediaPlayer with that sound
        lighter_flame_sound = MediaPlayer.create(this, R.raw.lighter_flame_sound);
        openLockSound.start();

        if (isOn = true)
            lighter_flame_sound.start();
    }

    public void onClickLighterOFF(View view) //TURNS OFF THE FLAME
    {
        isOn = false;
        if (isOn = true) //why does this not work if it reads isOn = false???
            lighter_flame_sound.stop();

        ImageButton off = (ImageButton) findViewById(R.id.lighter_off);
        off.setVisibility(View.VISIBLE);
        MediaPlayer closeLockSound = MediaPlayer.create(this, R.raw.lighter_close_sound);
        closeLockSound.start();
    }

}