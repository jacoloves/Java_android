package com.example.shotaro.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = 1;

        Log.d("countの値", "値は" + count + "です");
        hello();

        int numnum = plus2(5);
        Log.d("numnum", "値は" + numnum + "です");
    }

    private void hello(){
        Log.d("LOG", "こんにちは！");
        Log.d("LOG", "私の名前はAndroidです。");
    }

    private int plus2(int num){
        num = num + 2;
        return num;
    }
}
