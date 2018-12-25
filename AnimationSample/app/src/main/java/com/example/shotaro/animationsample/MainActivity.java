package com.example.shotaro.animationsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ViewPropertyAnimator animator = imageView.animate();
//                animator.setDuration(3000);
//                animator.rotation(360.0f * 5.0f);
                imageView.animate().setInterpolator(new OvershootInterpolator()).y(1000)
                        .setDuration(1000);
            }
        });
    }
}
