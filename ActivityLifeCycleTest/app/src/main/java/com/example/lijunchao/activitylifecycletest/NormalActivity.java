package com.example.lijunchao.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by lijunchao on 2017/3/28.
 */

public class NormalActivity extends Activity {

    @Override
    protected void onCreate(Bundle saveInstatnceState){
        super.onCreate(saveInstatnceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.normal_layout);
    }
}
