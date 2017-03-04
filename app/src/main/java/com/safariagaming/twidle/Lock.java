package com.safariagaming.twidle;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Lock extends AppCompatActivity {
//THIS CODE IS WAY MORE EFFICANT BECAUSE IT ONLY USES lock_start AND NOT A lock_end.... EASY
    ImageButton lock_start;
    MediaPlayer start, end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock);
    }

    public void onClickLockSTART(View view)
    {
        lock_start = (ImageButton) findViewById(R.id.lock_start);
        lock_start.setVisibility(View.INVISIBLE);
        start = MediaPlayer.create(this, R.raw.open_lock_sound);
        start.start();
    }

    public void onClickLockEND(View view)
    {
        lock_start.setVisibility(View.VISIBLE);
        end = MediaPlayer.create(this, R.raw.close_lock_sound);
        end.start();
    }
}
