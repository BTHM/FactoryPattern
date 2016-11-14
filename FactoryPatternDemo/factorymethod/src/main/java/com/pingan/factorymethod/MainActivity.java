package com.pingan.factorymethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW320 bmw = factoryBMW320.createBMW();
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW523 bmw532 = factoryBMW523.createBMW();


    }
}
