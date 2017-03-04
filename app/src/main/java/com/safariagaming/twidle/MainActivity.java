package com.safariagaming.twidle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //broadcasts are in here, intents are in the Mainifest.xml
    }
    //the keyword this refers to this activity.
    public void openFirePlace(View view) {
        Intent i = new Intent(this, FirePlace.class /*we use .class to say that it is a class*/); //The intent is stored in i
        startActivity(i);
    }

    public void openBubbleWrap(View view) {
        Intent i = new Intent(this, BubbleWrap.class /*we use .class to say that it is a class*/); //The intent is stored in i
        startActivity(i);
    }

    public void openLightSwitch(View view) {
        Intent i = new Intent(this, LightSwitch.class /*we use .class to say that it is a class*/); //The intent is stored in i
        startActivity(i);
    }

    public void openLighter(View view) {
        Intent i = new Intent(this, Lighter.class /*we use .class to say that it is a class*/); //The intent is stored in i
        startActivity(i);
    }

    public void openLock(View view) {
        Intent i = new Intent(this, Lock.class /*we use .class to say that it is a class*/); //The intent is stored in i
        startActivity(i);
    }
    public void openPen(View view)
    {
        Intent i = new Intent(this, Pen.class /*we use .class to say that it is a class*/ ); //The intent is stored in i
        startActivity(i);
    }
    public void openSizzling(View view)
    {
        Intent i = new Intent(this, Sizzling.class /*we use .class to say that it is a class*/ ); //The intent is stored in i
        startActivity(i);
    }
    public void openVelcro(View view)
    {
        Intent i = new Intent(this, Velcro.class /*we use .class to say that it is a class*/ ); //The intent is stored in i
        startActivity(i);
    }
    public void openZipper(View view)
    {
        Intent i = new Intent(this, Zipper.class /*we use .class to say that it is a class*/ ); //The intent is stored in i
        startActivity(i);
    }
}