package com.safariagaming.twidle;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Pen extends AppCompatActivity {

    MediaPlayer penOpen_sound, penClose_sound;
    ImageButton penOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pen);
    }

    public void openPen(View view)
    {
        penOpen = (ImageButton) findViewById(R.id.closed_pen);
        penOpen.setVisibility(View.INVISIBLE);
        penOpen_sound = MediaPlayer.create(this, R.raw.pen_open);
        penOpen_sound.start();
    }

    public void closePen(View view)
    {
        penOpen.setVisibility(View.VISIBLE);
        penClose_sound = MediaPlayer.create(this, R.raw.pen_close);
        penClose_sound.start();
    }

}