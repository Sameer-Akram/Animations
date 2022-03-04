package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   Animation blink;
    Animation rotate;
    Animation fade;
    Animation move;
    Animation slide;
    Animation zoom;
    Animation stop;
    Animation bounce;
    Animation zoom1;
    Animation su;

    TextView tv1;
    TextView tv2;
    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tv1=(TextView) findViewById(R.id.animation);
        tv2=(TextView) findViewById(R.id.name);
        tv3=(TextView) findViewById(R.id.click);
        Button btn1=(Button) findViewById(R.id.zin);
        Button btn2=(Button) findViewById(R.id.rotate);
        Button btn3=(Button) findViewById(R.id.fade);
        Button btn4=(Button) findViewById(R.id.move);
        Button btn5=(Button) findViewById(R.id.slide);
        Button btn6=(Button) findViewById(R.id.zoom);
        Button btn7=(Button) findViewById(R.id.stop);
        Button btn8=(Button) findViewById(R.id.blink2);
        Button btn9=(Button) findViewById(R.id.zin);
        Button btn10=(Button) findViewById(R.id.slideup);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            blink= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
            tv2.setVisibility(View.VISIBLE);
            tv2.startAnimation(blink);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                tv2.setVisibility(View.VISIBLE);
                tv2.startAnimation(rotate);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fade= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                tv2.setVisibility(View.VISIBLE);
                tv2.startAnimation(fade);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                tv2.setVisibility(View.VISIBLE);
                tv2.startAnimation(move);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slide= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
                tv2.setVisibility(View.VISIBLE);
                tv2.startAnimation(slide);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoom= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
                tv2.setVisibility(View.VISIBLE);
                tv2.startAnimation(zoom);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.clearAnimation();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bounce= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounch);
                tv2.setVisibility(View.VISIBLE);
                tv2.startAnimation(bounce);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoom1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomin);
                tv2.setVisibility(View.VISIBLE);
                tv2.startAnimation(zoom1);

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                su= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
                tv2.setVisibility(View.VISIBLE);
                tv2.startAnimation(su);

            }
        });

    }
}