package com.duvillard.xinterv;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

public class Listview1 extends FragmentActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview1);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_browse_fragment, new MainFragment())
                    .commitNow();

    }
    }}