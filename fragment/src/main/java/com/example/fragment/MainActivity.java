package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button1;
    Button button2;
    Button button3;

    FragmentManager manager;
    OneFragment oneFragment;
    TwoFragment twoFragment;
    ThreeFragment threeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.main_btn1);
        button2 = findViewById(R.id.main_btn2);
        button3 = findViewById(R.id.main_btn3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        manager = getSupportFragmentManager();
        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();
        threeFragment = new ThreeFragment();

        FragmentTransaction tf = manager.beginTransaction();
        tf.addToBackStack(null);
        tf.add(R.id.main_container, oneFragment);
        tf.commit();
    }

    @Override
    public void onClick(View v) {
        if(v == button1) {
            if (!oneFragment.isVisible()) {
                FragmentTransaction tf = manager.beginTransaction();
                tf.addToBackStack(null);
                tf.replace(R.id.main_container, oneFragment);
                tf.commit();
            }
        }else if(v == button2) {
            if (!twoFragment.isVisible()) {
                twoFragment.show(manager, null);
            }
        }else if(v == button3){
            if(!threeFragment.isVisible()){
                Log.d("aaa", "111111111111");
                FragmentTransaction tf = manager.beginTransaction();
                tf.addToBackStack(null);
                tf.replace(R.id.main_container, threeFragment);
                tf.commit();
            }
        }
    }
}