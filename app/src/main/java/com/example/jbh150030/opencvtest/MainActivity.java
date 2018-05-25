package com.example.jbh150030.opencvtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity"; ///Type this into string for filter to check that opencv actually loaded

    static {
        if(OpenCVLoader.initDebug()){
            Log.d(TAG, "Opencv successfully loaded");
        }
        else{
            Log.d(TAG, "Opencv not loaded");
        }
    //some changes
    }
    //more changes for third commit
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
