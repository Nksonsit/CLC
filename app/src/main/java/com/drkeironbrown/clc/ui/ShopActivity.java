package com.drkeironbrown.clc.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.adapter.ShopAdapter;
import com.drkeironbrown.clc.api.RestClient;
import com.drkeironbrown.clc.custom.TfTextView;
import com.drkeironbrown.clc.helper.Functions;
import com.drkeironbrown.clc.model.BaseResponse;
import com.drkeironbrown.clc.model.Shop;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ShopActivity extends AppCompatActivity {

    private ImageView imgBack;
    private TfTextView txtTitle;
    private RelativeLayout toolbar;
    private RecyclerView rvShop;
    private List<Shop> list;
    private ShopAdapter adapter;
    private TfTextView txtEmpty;
    private LinearLayout llEmptyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        this.llEmptyView = (LinearLayout) findViewById(R.id.llEmptyView);
        this.txtEmpty = (TfTextView) findViewById(R.id.txtEmpty);
        rvShop = (RecyclerView) findViewById(R.id.rvShop);
        toolbar = (RelativeLayout) findViewById(R.id.toolbar);
        txtTitle = (TfTextView) findViewById(R.id.txtTitle);
        imgBack = (ImageView) findViewById(R.id.imgBack);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        txtTitle.setText("Shop");
        list = new ArrayList<>();
        adapter = new ShopAdapter(this, list);
        rvShop.setLayoutManager(new LinearLayoutManager(this));
        rvShop.setAdapter(adapter);

        if (Functions.isConnected(this)) {
            RestClient.get().getShop().enqueue(new Callback<BaseResponse<List<Shop>>>() {
                @Override
                public void onResponse(Call<BaseResponse<List<Shop>>> call, Response<BaseResponse<List<Shop>>> response) {
                    if (response.body() != null) {
                        if (response.body().getStatus() == 1 && response.body().getData() != null && response.body().getData().size() > 0) {
                            list = response.body().getData();
                            adapter.setDataList(list);
                        } else {
                            llEmptyView.setVisibility(View.VISIBLE);
                            rvShop.setVisibility(View.GONE);
                        }
                    } else {
                        llEmptyView.setVisibility(View.VISIBLE);
                        rvShop.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onFailure(Call<BaseResponse<List<Shop>>> call, Throwable t) {
                    llEmptyView.setVisibility(View.VISIBLE);
                    rvShop.setVisibility(View.GONE);
                }
            });
        } else {
            llEmptyView.setVisibility(View.VISIBLE);
            rvShop.setVisibility(View.GONE);
            txtEmpty.setText(getString(R.string.check_internet));
        }
    }

    @Override
    public void onBackPressed() {
        Functions.fireIntent(this, false);
    }
}
