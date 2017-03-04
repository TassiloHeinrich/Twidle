package com.safariagaming.twidle;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LightSwitch extends AppCompatActivity {

    ImageButton on;
    MediaPlayer onSound, offSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_switch);
    }

    public void switchOn(View view)
    {
     on = (ImageButton) findViewById(R.id.light_switch_off);
     on.setVisibility(View.INVISIBLE);
     onSound = MediaPlayer.create(this, R.raw.open_light_switch_sound);
     onSound.start();
    }

    public void switchOff(View view)
    {
        on.setVisibility(View.VISIBLE);
        offSound = MediaPlayer.create(this, R.raw.close_light_switch_sound);
        offSound.start();
    }
}
