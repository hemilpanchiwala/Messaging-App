package com.example.hemant.fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView foosball;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_second);

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });
        listenClickEventOf(R.id.three_d_animation_example);



        
    }

    @Override
    public void onClick(View v) {
                startActivity(ThreeDAnimationActivity.class);
    }

    private void listenClickEventOf(int id) {
        findViewById(id).setOnClickListener(this);
    }

    private void startActivity(Class<?> cls) {
        startActivity(new Intent(this, cls));
    }


}
