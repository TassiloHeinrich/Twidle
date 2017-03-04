package com.safariagaming.twidle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Sizzling extends AppCompatActivity {

    private MediaPlayer egg_sizzling_sound;
    Intent i;
    boolean isON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sizzling);
    }

    public void onClickSizzilingON(View view)
    {
        egg_sizzling_sound = MediaPlayer.create(this, R.raw.egg_sizzling_sound);
        ImageButton on = (ImageButton) findViewById(R.id.sizzling_start);
        on.setVisibility(View.INVISIBLE);
        egg_sizzling_sound.start();
        isON = true;
    }

    public void onClickSizzilingOFF(View view)
    {
        ImageButton on = (ImageButton) findViewById(R.id.sizzling_start);
        on.setVisibility(View.VISIBLE);
        egg_sizzling_sound.pause();
        isON = false;
    }

    public void openMainActivity() {
        i = new Intent(this, MainActivity.class /*we use .class to say that it is a class*/); //The intent is stored in i
        startActivity(i);
    }

    @Override
    public void onBackPressed()
    {
        if (isON == true)
        {
            egg_sizzling_sound.stop();
            openMainActivity();
        }
        else
        {
            openMainActivity();
        }
    }
}
