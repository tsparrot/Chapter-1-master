package com.example.astest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private Button initial_btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button initial_btn = findViewById(R.id.button);
        final TextView tv = findViewById(R.id.textView);
        final LinearLayout icon_line = findViewById(R.id.icon_line);
        final RatingBar rtb = findViewById(R.id.ratingBar);
        final ImageView ibtn1= findViewById(R.id.imageView1);
        final ImageView ibtn2= findViewById(R.id.imageView2);
        final ImageView ibtn3= findViewById(R.id.imageView3);

        initial_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("选择一个机器人");
                icon_line.setVisibility(View.VISIBLE);
                ibtn1.setVisibility(View.VISIBLE);
                ibtn2.setVisibility(View.VISIBLE);
                ibtn3.setVisibility(View.VISIBLE);
                rtb.setVisibility(View.GONE);
            }
        });

        ibtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count+=1;
                ibtn1.setVisibility(View.GONE);
                switch (count){
                    case 3:
                        icon_line.setVisibility(View.GONE);
                        rtb.setVisibility(View.VISIBLE);
                        tv.setText("所有的机器人都被消灭了, 为我们打分");
                        break;
                    case 2:
                        tv.setText("已击败两个敌方机器人");
                        break;
                    default:
                        tv.setText("已击败一个敌方机器人");
                        break;
                }
            }
        });

        ibtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count+=1;
                ibtn2.setVisibility(View.GONE);
                switch (count){
                    case 3:
                        icon_line.setVisibility(View.GONE);
                        rtb.setVisibility(View.VISIBLE);
                        tv.setText("所有的机器人都被消灭了, 为我们打分");
                        break;
                    case 2:
                        tv.setText("已击败两个敌方机器人");
                        break;
                    default:
                        tv.setText("已击败一个敌方机器人");
                        break;
                }
            }
        });

        ibtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count+=1;
                ibtn3.setVisibility(View.GONE);
                switch (count){
                    case 3:
                        icon_line.setVisibility(View.GONE);
                        rtb.setVisibility(View.VISIBLE);
                        tv.setText("所有的机器人都被消灭了, 为我们打分");
                        break;
                    case 2:
                        tv.setText("已击败两个敌方机器人");
                        break;
                    default:
                        tv.setText("已击败一个敌方机器人");
                        break;
                }
            }
        });


    }
}
