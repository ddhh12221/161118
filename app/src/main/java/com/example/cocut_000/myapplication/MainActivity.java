package com.example.cocut_000.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout LL;
        final CheckBox cb;
        Button b;
        RadioGroup rg;

        final RadioButton rb1, rb2, rb3;
        final ImageView iv;


        LL= (LinearLayout)findViewById(R.id.LinearLayout1);
        cb= (CheckBox) findViewById(R.id.checkBox);

        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb.isChecked()){
                    LL.setVisibility(View.VISIBLE);
                }
                else {
                    LL.setVisibility(View.INVISIBLE);
                }
            }
        });

        b=(Button)findViewById(R.id.button);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        iv=(ImageView)findViewById(R.id.imageView);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                iv.setVisibility(View.INVISIBLE);
                if(rb1.isChecked()){
                    iv.setImageResource(R.drawable.image);
                }else if(rb2.isChecked()){
                    iv.setImageResource(R.drawable.image2);
                }else if(rb3.isChecked()){
                    iv.setImageResource(R.drawable.image3);
                }
            }
        });

                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        iv.setVisibility(View.VISIBLE);
                    }
                });





    }
}
