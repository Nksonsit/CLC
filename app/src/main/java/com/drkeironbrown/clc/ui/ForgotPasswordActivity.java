package com.drkeironbrown.clc.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.braintreepayments.api.dropin.BaseActivity;
import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.api.RestClient;
import com.drkeironbrown.clc.custom.MDToast;
import com.drkeironbrown.clc.custom.TfButton;
import com.drkeironbrown.clc.custom.TfEditText;
import com.drkeironbrown.clc.custom.TfTextView;
import com.drkeironbrown.clc.helper.Functions;
import com.drkeironbrown.clc.model.BaseResponse;
import com.drkeironbrown.clc.model.ForgotPasswordReq;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ForgotPasswordActivity extends BaseActivity {

    private android.widget.ImageView imgBack;
    private com.drkeironbrown.clc.custom.TfTextView txtTitle;
    private android.widget.RelativeLayout toolbar;
    private com.drkeironbrown.clc.custom.TfTextView txtForgotPass;
    private com.drkeironbrown.clc.custom.TfEditText edtEmailId;
    private com.drkeironbrown.clc.custom.TfButton btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        this.btnSubmit = (TfButton) findViewById(R.id.btnSubmit);
        this.edtEmailId = (TfEditText) findViewById(R.id.edtEmailId);
        this.txtForgotPass = (TfTextView) findViewById(R.id.txtForgotPass);
        this.toolbar = (RelativeLayout) findViewById(R.id.toolbar);
        this.txtTitle = (TfTextView) findViewById(R.id.txtTitle);
        this.imgBack = (ImageView) findViewById(R.id.imgBack);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.hideKeyPad(ForgotPasswordActivity.this, v);
                onBackPressed();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.hideKeyPad(ForgotPasswordActivity.this, v);
                if (Functions.isConnected(ForgotPasswordActivity.this)) {
                    if (edtEmailId.getText().toString().trim().length() == 0) {
                        Functions.showToast(ForgotPasswordActivity.this, "Please enter email id", MDToast.TYPE_ERROR);
                        return;
                    }
                    if (!Functions.emailValidation(edtEmailId.getText().toString().trim())) {
                        Functions.showToast(ForgotPasswordActivity.this, "Please enter valid email id", MDToast.TYPE_ERROR);
                        return;
                    }
                    ForgotPasswordReq forgotPasswordReq = new ForgotPasswordReq();
                    forgotPasswordReq.setEmailId(edtEmailId.getText().toString().trim());
                    RestClient.get().getForgotPassword(forgotPasswordReq).enqueue(new Callback<BaseResponse>() {
                        @Override
                        public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                            if (response.body() != null) {
                                if (response.body().getStatus() == 1) {
                                    Functions.showToast(ForgotPasswordActivity.this, response.body().getMessage(), MDToast.TYPE_SUCCESS);
                                    edtEmailId.setText("");
                                } else {
                                    Functions.showToast(ForgotPasswordActivity.this, response.body().getMessage(), MDToast.TYPE_ERROR);
                                }
                            } else {
                                Functions.showToast(ForgotPasswordActivity.this, getString(R.string.try_again), MDToast.TYPE_ERROR);
                            }
                        }

                        @Override
                        public void onFailure(Call<BaseResponse> call, Throwable t) {
                            Functions.showToast(ForgotPasswordActivity.this, getString(R.string.try_again), MDToast.TYPE_ERROR);
                        }
                    });
                } else {
                    Functions.showToast(ForgotPasswordActivity.this, getString(R.string.check_internet), MDToast.TYPE_ERROR);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        Functions.fireIntent(this, false);
    }
}
