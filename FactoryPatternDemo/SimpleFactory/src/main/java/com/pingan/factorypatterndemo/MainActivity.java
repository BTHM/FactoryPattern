package com.pingan.factorypatterndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Factory factory = new Factory();
        BMW bmw = factory.createBMW(320);
        BMW bmw532 = factory.createBMW(532);
    }
}
