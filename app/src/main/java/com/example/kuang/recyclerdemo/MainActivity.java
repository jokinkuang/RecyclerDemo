package com.example.kuang.recyclerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    ViewGroup mMainView;
    RecyclerView mRecyclerView;
    MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainView = findViewById(R.id.content);

        mRecyclerView = findViewById(R.id.recycler);
        mAdapter = new MyAdapter(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
        mMainView.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "## run() called");
//                mRecyclerView.getRecycledViewPool().clear();
                mRecyclerView.setAdapter(null);
            }
        }, 10*1000);


    }
}
