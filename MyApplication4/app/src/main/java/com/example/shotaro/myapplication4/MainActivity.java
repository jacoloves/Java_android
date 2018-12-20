package com.example.shotaro.myapplication4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private final int HARE = 1;
    private final int KUMORI = 2;
    private final int AME = 3;
    private final int KAZE = 4;
    private final int ARASHI = 5;

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

        kasaIruka(AME);
        kasaIruka(KUMORI);
        kasaIruka(HARE);
        kasaIruka(ARASHI);
    }

    private void kasaIruka(int tenki){
        switch (tenki){
            case AME:
                Log.d("行動", "傘を持っていく");
                break;
            case KUMORI:
                Log.d("行動", "折り畳み傘を持っていく");
                break;
            case HARE:
                Log.d("行動", "傘を持っていかない");
                break;
                default:
                    Log.d("行動", "わかりません");

        }
    }
}
