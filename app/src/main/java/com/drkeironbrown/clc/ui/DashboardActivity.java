package com.drkeironbrown.clc.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.helper.Functions;
import com.drkeironbrown.clc.helper.PrefUtils;

public class DashboardActivity extends AppCompatActivity {

    private RelativeLayout toolbar;
    private RelativeLayout rlCategory;
    private RelativeLayout rlGallery;
    private RelativeLayout rlSlideshow;
    private RelativeLayout rlInspirational;
    private RelativeLayout rlPInspirational;
    private RelativeLayout rlJournal;
    private RelativeLayout rlOnSecondThought;
    private RelativeLayout rlShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        PrefUtils.setIsFirstTime(this, false);
        rlShop = (RelativeLayout) findViewById(R.id.rlShop);
        rlOnSecondThought = (RelativeLayout) findViewById(R.id.rlOnSecondThought);
        rlJournal = (RelativeLayout) findViewById(R.id.rlJournal);
        rlPInspirational = (RelativeLayout) findViewById(R.id.rlPInspirational);
        rlInspirational = (RelativeLayout) findViewById(R.id.rlInspirational);
        rlSlideshow = (RelativeLayout) findViewById(R.id.rlSlideshow);
        rlGallery = (RelativeLayout) findViewById(R.id.rlGallery);
        rlCategory = (RelativeLayout) findViewById(R.id.rlCategory);
        toolbar = (RelativeLayout) findViewById(R.id.toolbar);

        rlSlideshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.fireIntent(DashboardActivity.this, SlideshowListActivity.class, true);
            }
        });

        rlGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.fireIntent(DashboardActivity.this, GalleryListActivity.class, true);
            }
        });

        rlJournal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.fireIntent(DashboardActivity.this, JournalListActivity.class, true);
            }
        });

        rlPInspirational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.fireIntent(DashboardActivity.this, PersonalInspirationalActivity.class, true);
            }
        });

        rlInspirational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.fireIntent(DashboardActivity.this, InspirationalActivity.class, true);
            }
        });

        rlOnSecondThought.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.fireIntent(DashboardActivity.this, SecondThoughtActivity.class, true);
            }
        });

        rlShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.fireIntent(DashboardActivity.this, ShopActivity.class, true);
            }
        });
    }
}
