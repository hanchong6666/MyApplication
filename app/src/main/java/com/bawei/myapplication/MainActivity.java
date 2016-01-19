package com.bawei.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.bawei.view.DrawHookView;
import com.bawei.view.RoundImageView;

public class MainActivity extends Activity {
    private  boolean b=false;
    private RoundImageView iv;
    private DrawHookView hd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        iv.setBackgroundResource(R.drawable.ic_launcher);
        hd.setVisibility(View.INVISIBLE);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b) {
                    hd.setVisibility(View.VISIBLE);
                    b = true;
                } else {
                    hd.setVisibility(View.INVISIBLE);
                    b = false;
                }
            }
        });

    }


    private void initialize() {

        iv = (RoundImageView) findViewById(R.id.iv);
        hd = (DrawHookView) findViewById(R.id.hd);
    }
}
