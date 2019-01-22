package com.drkeironbrown.clc.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.custom.TfTextView;
import com.drkeironbrown.clc.helper.Functions;
import com.drkeironbrown.clc.model.Category;

public class SubLinkDetailActivity extends AppCompatActivity {

    private ImageView imgBack;
    private TfTextView txtTitle;
    private RelativeLayout toolbar;
    private TfTextView txtCategoryDetail;
    private Category category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_link_detail);
        this.txtCategoryDetail = (TfTextView) findViewById(R.id.txtCategoryDetail);
        this.toolbar = (RelativeLayout) findViewById(R.id.toolbar);
        this.txtTitle = (TfTextView) findViewById(R.id.txtTitle);
        this.imgBack = (ImageView) findViewById(R.id.imgBack);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        category = (Category) getIntent().getSerializableExtra("sublinks");

        txtTitle.setText(category.getCategoryName());

        txtCategoryDetail.setText(Html.fromHtml(category.getCategoryDetail().replace("&#39;", "'")));

    }

    @Override
    public void onBackPressed() {
        Functions.fireIntent(this, false);
    }
}
