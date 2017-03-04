package com.safariagaming.twidle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static android.webkit.WebSettings.PluginState.ON;
import static com.safariagaming.twidle.R.id.view;

public class FirePlace extends AppCompatActivity {

    ImageButton off;
    MediaPlayer fireSound;
    Intent i;
    boolean isON;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_place);
    }

    public void turnOff(View view)
    {
        off = (ImageButton) findViewById(R.id.fire_place_OFF);
        off.setVisibility(View.INVISIBLE);
        fireSound = MediaPlayer.create(this, R.raw.fire_sound_effect);
        fireSound.start();
        isON = true;

    }

    public void turnOn(View view)
    {
        off.setVisibility(View.VISIBLE);
        fireSound.pause();
        isON = false;
    }

    public void openMainActivity() {
        i = new Intent(this, MainActivity.class /*we use .class to say that it is a class*/); //The intent is stored in i
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        if (isON == true)
        {
        fireSound.stop();
        openMainActivity();
        }

        else
        {
            openMainActivity();
        }
    }
}
