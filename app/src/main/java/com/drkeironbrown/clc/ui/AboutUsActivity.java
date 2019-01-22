package com.drkeironbrown.clc.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.custom.TfTextView;
import com.drkeironbrown.clc.helper.AdvancedSpannableString;
import com.drkeironbrown.clc.helper.Functions;

public class AboutUsActivity extends AppCompatActivity {

    private ImageView imgBack;
    private TfTextView txtTitle;
    private RelativeLayout toolbar;
    private TfTextView txtLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        this.txtLink = (TfTextView) findViewById(R.id.txtLink);
        this.toolbar = (RelativeLayout) findViewById(R.id.toolbar);
        this.txtTitle = (TfTextView) findViewById(R.id.txtTitle);
        this.imgBack = (ImageView) findViewById(R.id.imgBack);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        AdvancedSpannableString spannableString = new AdvancedSpannableString(txtLink.getText().toString().trim());
        spannableString.setUnderLine(txtLink.getText().toString().trim());
        txtLink.setText(spannableString);

        txtLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://drkeironbrown.com"));
                startActivity(browserIntent);
            }
        });
    }


    @Override
    public void onBackPressed() {
        Functions.fireIntent(this, false);
    }
}
