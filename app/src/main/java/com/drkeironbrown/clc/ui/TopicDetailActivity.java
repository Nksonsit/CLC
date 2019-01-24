package com.drkeironbrown.clc.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.braintreepayments.api.dropin.BaseActivity;
import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.adapter.QuotesAdapter;
import com.drkeironbrown.clc.custom.TfTextView;
import com.drkeironbrown.clc.helper.Functions;
import com.drkeironbrown.clc.model.SpecificItem;

public class TopicDetailActivity extends BaseActivity {

    private android.widget.ImageView imgBack;
    private com.drkeironbrown.clc.custom.TfTextView txtTitle;
    private android.widget.RelativeLayout toolbar;
    private android.support.v7.widget.RecyclerView rvQuotes;
    private SpecificItem specificItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_detail);
        this.rvQuotes = (RecyclerView) findViewById(R.id.rvQuotes);
        this.toolbar = (RelativeLayout) findViewById(R.id.toolbar);
        this.txtTitle = (TfTextView) findViewById(R.id.txtTitle);
        this.imgBack = (ImageView) findViewById(R.id.imgBack);

        specificItem = (SpecificItem) getIntent().getSerializableExtra("topic");

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        txtTitle.setText(specificItem.getTopic());

        rvQuotes.setLayoutManager(new LinearLayoutManager(this));
        rvQuotes.setAdapter(new QuotesAdapter(this, specificItem.getQuotes()));
    }

    @Override
    public void onBackPressed() {
        Functions.fireIntent(this, false);
    }
}
