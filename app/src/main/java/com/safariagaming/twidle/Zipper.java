package com.safariagaming.twidle;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Zipper extends AppCompatActivity {

    ImageButton openZipper;
    MediaPlayer openZipperSound, closeZipperSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zipper);
    }

    public void onClickCloseZipper(View view)
    {
        openZipper = (ImageButton) findViewById(R.id.zipper_open);
        openZipper.setVisibility(View.INVISIBLE);
        openZipperSound = MediaPlayer.create(this, R.raw.zipper_open);
        openZipperSound.start();
    }

    public void onClickOpenZipper(View view)
    {
        openZipper.setVisibility(View.VISIBLE);
        closeZipperSound = MediaPlayer.create(this, R.raw.zipper_close);
        closeZipperSound.start();
    }
}
