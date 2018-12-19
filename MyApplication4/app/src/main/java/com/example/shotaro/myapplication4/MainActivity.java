package com.example.shotaro.myapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView animalImage = (ImageView) findViewById(R.id.animal);

        Button changeImageButton = (Button) findViewById(R.id.changeImage);

        changeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView animalImage = (ImageView) findViewById(R.id.animal);
                animalImage.setImageResource(R.drawable.lion);
            }
        });
    }
}
