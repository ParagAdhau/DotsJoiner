package com.example.letstry;


import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {

 @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        MyView myView = new MyView(this);
        setContentView(myView);
    }
    
}