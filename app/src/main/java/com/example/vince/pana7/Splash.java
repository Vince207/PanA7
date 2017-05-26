package com.example.vince.pana7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Splash extends Activity
{
    private final int splashDisplayTimer = 4000;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable()
        {
            public void run()
            {
                Intent splashIntent = new Intent(Splash.this, MainActivity.class);
                startActivity(splashIntent);

                finish();
            }
        },splashDisplayTimer);


    }




}
