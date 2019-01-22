package com.drkeironbrown.clc.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.custom.TfTextView;
import com.drkeironbrown.clc.fragment.FifthFragment;
import com.drkeironbrown.clc.fragment.FirstFragment;
import com.drkeironbrown.clc.fragment.ForthFragment;
import com.drkeironbrown.clc.fragment.SecondFragment;
import com.drkeironbrown.clc.fragment.SevenFragment;
import com.drkeironbrown.clc.fragment.SixthFragment;
import com.drkeironbrown.clc.fragment.ThirdFragment;
import com.drkeironbrown.clc.helper.Functions;
import com.drkeironbrown.clc.helper.PrefUtils;

public class FunctionSlideActivity extends AppCompatActivity {

    private LinearLayout container;
    private TfTextView txtNext;
    private TfTextView txtSkip;
    private FragmentManager fm;
    private int count = 1;
    private View divider;
    private View bottomSpace;
    private TfTextView txtPre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function_slide);

        Window w = getWindow(); // in Activity's onCreate() for instance
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        txtSkip = (TfTextView) findViewById(R.id.txtSkip);
        txtNext = (TfTextView) findViewById(R.id.txtNext);
        txtPre = (TfTextView) findViewById(R.id.txtPre);
        bottomSpace = findViewById(R.id.bottomSpace);
        divider = findViewById(R.id.divider);
        container = (LinearLayout) findViewById(R.id.container);

        fm = getSupportFragmentManager();
        pushFragment(new FirstFragment());
        txtSkip.setVisibility(View.GONE);
        txtNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if (count == 2) {
                    txtPre.setVisibility(View.VISIBLE);
                    txtSkip.setVisibility(View.VISIBLE);
                    pushFragment(new SecondFragment());
                } else if (count == 3) {
                    txtPre.setVisibility(View.VISIBLE);
                    pushFragment(new ThirdFragment());
                } else if (count == 4) {
                    txtPre.setVisibility(View.VISIBLE);
                    pushFragment(new ForthFragment());
                } else if (count == 5) {
                    txtPre.setVisibility(View.VISIBLE);
                    pushFragment(new FifthFragment());
                } else if (count == 6) {
                    txtPre.setVisibility(View.VISIBLE);
                    pushFragment(new SixthFragment());
                } else if (count == 7) {
                    txtPre.setVisibility(View.VISIBLE);
                    txtNext.setText("Done");
                    pushFragment(new SevenFragment());
                } else {
                    if (PrefUtils.getUserFullProfileDetails(FunctionSlideActivity.this).getIsFullPay() == 1) {
                        Functions.fireIntent(FunctionSlideActivity.this, Dashboard2Activity.class, true);
                    } else {
                        Functions.fireIntent(FunctionSlideActivity.this, PayActivity.class, true);
                    }
                    finish();
                }
            }
        });

        txtPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                if (count == 1) {
                    txtPre.setVisibility(View.GONE);
                    txtSkip.setVisibility(View.GONE);
                    txtNext.setText("Next");
                    pushFragment2(new FirstFragment());
                }else if (count == 2) {
                    txtPre.setVisibility(View.VISIBLE);
                    txtSkip.setVisibility(View.VISIBLE);
                    txtNext.setText("Next");
                    pushFragment2(new SecondFragment());
                } else if (count == 3) {
                    txtPre.setVisibility(View.VISIBLE);
                    txtNext.setText("Next");
                    pushFragment2(new ThirdFragment());
                } else if (count == 4) {
                    txtPre.setVisibility(View.VISIBLE);
                    txtNext.setText("Next");
                    pushFragment2(new ForthFragment());
                } else if (count == 5) {
                    txtPre.setVisibility(View.VISIBLE);
                    txtNext.setText("Next");
                    pushFragment2(new FifthFragment());
                } else if (count == 6) {
                    txtPre.setVisibility(View.VISIBLE);
                    txtNext.setText("Next");
                    pushFragment2(new SixthFragment());
                } else if (count == 7) {
                    txtPre.setVisibility(View.VISIBLE);
                    txtNext.setText("Done");
                    pushFragment2(new SevenFragment());
                } else {
                    if (PrefUtils.getUserFullProfileDetails(FunctionSlideActivity.this).getIsFullPay() == 1) {
                        Functions.fireIntent(FunctionSlideActivity.this, Dashboard2Activity.class, true);
                    } else {
                        Functions.fireIntent(FunctionSlideActivity.this, PayActivity.class, true);
                    }
                    finish();
                }
            }
        });

        txtSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PrefUtils.getUserFullProfileDetails(FunctionSlideActivity.this).getIsFullPay() == 1) {
                    Functions.fireIntent(FunctionSlideActivity.this, Dashboard2Activity.class, true);
                } else {
                    Functions.fireIntent(FunctionSlideActivity.this, PayActivity.class, true);
                }
                finish();
            }
        });

        if (Functions.hasSoftKeys(this, getWindowManager())) {
            RelativeLayout.LayoutParams param = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 102);
            bottomSpace.setLayoutParams(param);
        }

    }

    private void pushFragment(Fragment fragment) {
        FragmentTransaction ft = fm.beginTransaction();
        int rightIn = R.anim.slide_in_right;
        int rightOut = R.anim.slide_out_right;
        int leftIn = R.anim.slide_in_left;
        int leftOut = R.anim.slide_out_left;

        ft.setCustomAnimations(rightIn, leftOut);
        ft.replace(R.id.container, fragment);
        ft.commit();
    }
    private void pushFragment2(Fragment fragment) {
        FragmentTransaction ft = fm.beginTransaction();
        int rightIn = R.anim.slide_in_right;
        int rightOut = R.anim.slide_out_right;
        int leftIn = R.anim.slide_in_left;
        int leftOut = R.anim.slide_out_left;

        ft.setCustomAnimations(leftIn, rightOut);
        ft.replace(R.id.container, fragment);
        ft.commit();
    }
}
