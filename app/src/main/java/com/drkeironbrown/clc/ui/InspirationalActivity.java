package com.drkeironbrown.clc.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.custom.TfTextView;
import com.drkeironbrown.clc.helper.Functions;

public class InspirationalActivity extends AppCompatActivity {

    private ImageView imgBack;
    private ImageView imgSetting;
    private TfTextView txtTitle;
    private RelativeLayout toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspirational);
        this.toolbar = (RelativeLayout) findViewById(R.id.toolbar);
        this.txtTitle = (TfTextView) findViewById(R.id.txtTitle);
        this.imgBack = (ImageView) findViewById(R.id.imgBack);
        imgSetting = (ImageView) findViewById(R.id.imgSetting);
        txtTitle.setText("Inspirational");
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        imgSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.fireIntent(InspirationalActivity.this, SettingsActivity.class, true);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        Functions.fireIntent(this, false);
    }
}
