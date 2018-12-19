package com.example.shotaro.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    final int HARE = 1;
    final int KUMORI = 2;
    final int AME = 3;
    final int YUKI = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sec05_01();

        //sec05_02();

        //Log.d("LOG", "壁掛け" + "時計");

        sec05_03();
    }

    private void sec05_01(){
        int x = 7;
        int y = 3;
        Log.d("LOG", "xとyの足し算は" + (x + y) + "です。");
        Log.d("LOG", "xとyの引き算は" + (x - y) + "です。");
        Log.d("LOG", "xとyの掛け算は" + (x * y) + "です。");
        Log.d("LOG", "xとyの割ったときの商は" + (x / y) + "です。");
        Log.d("LOG", "xとyの割ったときの余りは" + (x % y) + "です。");
    }

    private void sec05_02(){
        int x = 1;
        Log.d("LOG", "++xは" + ++x + "です。xは" + x + "になりました。");
        Log.d("LOG", "--xは" + --x + "です。xは" + x + "になりました。");
        Log.d("LOG", "x++は" + x++ + "です。xは" + x + "になりました。");
        Log.d("LOG", "x--は" + x-- + "です。xは" + x + "になりました。");
        x += 6;
        Log.d("LOG", "x+=6は" + x + "です。");
        x -= 3;
        Log.d("LOG", "x-=3は" + x + "です。");
        x *= 3;
        Log.d("LOG", "x*=3は" + x + "です。");
        x /= 3;
        Log.d("LOG", "x/=3は" + x + "です。");
    }

    private void sec05_03(){
        Log.d("LOG", "200" + 99);
        Log.d("LOG", "$" + 9 + 9);
        Log.d("LOG", "$" + (9 + 9));
    }
}
