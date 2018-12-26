package com.example.shotaro.slideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageSwitcher;

public class MainActivity extends AppCompatActivity {

    ImageSwitcher mImageSwither;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageSwither = (ImageSwitcher) findViewById(R.id.imageSwicher);
    }
}
