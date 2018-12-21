package com.example.shotaro.arraysample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final int GU = 0;
    private final int CHOKI = 1;
    private final int PA = 2;

//    private int janken[] = new int[3];
    private ArrayList<Integer> jankenArr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jankenArr.add(0); //GU
        jankenArr.add(0); //CHOKI
        jankenArr.add(0); //PA

        ImageButton guButton = (ImageButton) findViewById(R.id.gu);

        guButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                janken[GU] = janken[GU] + 1;
                jankenArr.set(GU, jankenArr.get(GU) + 1);

                kaisu();
            }
        });

        ImageButton chokiButton = (ImageButton) findViewById(R.id.choki);

        chokiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                janken[CHOKI] = janken[CHOKI] + 1;
                jankenArr.set(CHOKI, jankenArr.get(CHOKI) + 1);

                kaisu();
            }
        });

        ImageButton paButton = (ImageButton) findViewById(R.id.pa);

        paButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                janken[PA] = janken[PA] + 1;
                jankenArr.set(PA, jankenArr.get(PA) + 1);

                kaisu();
            }
        });
    }

    private void kaisu() {
        TextView textView = (TextView) findViewById(R.id.textView);

//        textView.setText(janken[GU] + "," + janken[CHOKI] + "," + janken[PA]);

        textView.setText(jankenArr.get(GU) + "," + jankenArr.get(CHOKI) + "," + jankenArr.get(PA));

        int sum = 0;

//        for(int i = 0; i < 3; i++){
//            sum = sum + janken[i];
//        }

//        //コレクションのfor文
//
//        for (int i = 0; i < 3; i++) {
//            sum = sum + jankenArr.get(i);
//        }

        

        // for eachの例
//        for (int num:
//             janken) {
//            sum = sum + num;
//        }
        
        //コレクションのforeach

        for (Integer num :
             jankenArr) {
            sum = sum + num;
        }

        TextView goukei = (TextView) findViewById(R.id.goukei);
        goukei.setText("合計" + sum);
    }
}
