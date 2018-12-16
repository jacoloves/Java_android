package com.example.shotaro.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tapHere2 = findViewById(R.id.tapHere2);
        tapHere2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView2 = findViewById(R.id.textView2);
                textView2.setText("ハロージャバー");
            }
        });
    }

    public void onClickButton(View view){
        TextView textView = findViewById(R.id.textView);
        textView.setText("ボタンがタップされました");
    }
}
