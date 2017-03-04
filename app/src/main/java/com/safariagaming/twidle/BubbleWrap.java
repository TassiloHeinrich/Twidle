package com.safariagaming.twidle;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BubbleWrap extends AppCompatActivity {

    ImageButton bubbleWrapNotPopped;
    MediaPlayer BubbleWrapSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_wrap);
    }

    public void onClickChangeToPopped(View view)
    {
        bubbleWrapNotPopped = (ImageButton) findViewById(R.id.notPoppedBubbleWrap);
        bubbleWrapNotPopped.setVisibility(View.INVISIBLE);
        BubbleWrapSound = MediaPlayer.create(this, R.raw.bubble_wrap_sound);
        BubbleWrapSound.start();
    }

    public void onClickChangeToNotPopped(View view)
    {
        bubbleWrapNotPopped.setVisibility(View.VISIBLE);
    }
}
