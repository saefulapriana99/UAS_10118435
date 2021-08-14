package com.example.uas_10118435;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class   Splash extends AppCompatActivity {

    //    12/8/2021
    //    Saeful Apriana
    //    10118435
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread thread = new Thread(){
            public  void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(Splash.this, Walkthrough.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
