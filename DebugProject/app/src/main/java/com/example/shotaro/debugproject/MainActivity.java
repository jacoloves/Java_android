package com.example.shotaro.debugproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 配列にお変数を作って、中身を初期化する
        String[] arrayString = {"Android","Java","こんにちは"};

        Button button = (Button) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.textView);

        int result;
        result = calc(100);
        Log.d("result", "結果は" + result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                leaks();
            }

            private void leaks() {

                for (int i = 0; i < 100000; i++){
                    list.add(new String("メモリーリークしています！！！！"));
                }
            }
        });

    }

    private int calc(int x){
        int result = 0;
        for(int i = 1; i <= x; i++){
            result += i;
            Log.v("calc", "iは"+i+"、result"+result);
        }
        Log.d("calc", "計算結果"+result);

        return result;
    }
}
