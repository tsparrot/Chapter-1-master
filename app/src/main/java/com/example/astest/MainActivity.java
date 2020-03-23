package com.example.astest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button show_btn = findViewById(R.id.button);
        final TextView tv = findViewById(R.id.textView);
        final LinearLayout icon_line = findViewById(R.id.icon_line);
        final RatingBar rtb = findViewById(R.id.ratingBar);
        final Switch ini_sw = findViewById(R.id.switch2);

        show_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("One!Two!Three!");
                icon_line.setVisibility(View.VISIBLE);
                show_btn.setVisibility(View.INVISIBLE);
                rtb.setVisibility(View.VISIBLE);
            }
        });

        ini_sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tv.setText("Hello World!");
                    icon_line.setVisibility(View.INVISIBLE);
                    show_btn.setVisibility(View.VISIBLE);
                    rtb.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
