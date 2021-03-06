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
import com.drkeironbrown.clc.model.SubCategory;

public class SubCategoryDetailActivity extends AppCompatActivity {

    private ImageView imgBack;
    private TfTextView txtTitle;
    private RelativeLayout toolbar;
    private TfTextView txtCategoryDetail;
    private TfTextView txtDestroy;
    private SubCategory category;
    private boolean isSolDisplay = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category_detail);
        this.txtDestroy = (TfTextView) findViewById(R.id.txtDestroy);
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

        category = (SubCategory) getIntent().getSerializableExtra("subcat");

        txtTitle.setText(category.getCategoryName());

        txtCategoryDetail.setText(Html.fromHtml(category.getCategoryDetail().replace("&#39;", "'")));

        txtDestroy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isSolDisplay = true;
                txtCategoryDetail.setText(Html.fromHtml(category.getCategorySol()));
                txtDestroy.setVisibility(View.GONE);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (isSolDisplay) {
            isSolDisplay = false;
            txtCategoryDetail.setText(Html.fromHtml(category.getCategoryDetail()));
            txtDestroy.setVisibility(View.VISIBLE);
        } else {
            Functions.fireIntent(this, false);
        }
    }
}
