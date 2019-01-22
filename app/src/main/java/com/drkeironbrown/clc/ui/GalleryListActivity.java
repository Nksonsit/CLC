package com.drkeironbrown.clc.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.adapter.GalleryAdapter;
import com.drkeironbrown.clc.custom.PopupDialog;
import com.drkeironbrown.clc.custom.TfTextView;
import com.drkeironbrown.clc.db.DBOpenHelper;
import com.drkeironbrown.clc.helper.Functions;
import com.drkeironbrown.clc.model.Gallery;

import java.util.ArrayList;
import java.util.List;

public class GalleryListActivity extends AppCompatActivity {

    private GalleryAdapter adapter;
    private RecyclerView rvGallery;
    private List<Gallery> list;
    private ImageView imgBack;
    private TfTextView txtTitle;
    private RelativeLayout toolbar;
    private LinearLayout btnAdd;
    private LinearLayout llEmptyView;
    private ImageView imgAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_list);
        toolbar = (RelativeLayout) findViewById(R.id.toolbar);
        llEmptyView = (LinearLayout) findViewById(R.id.llEmptyView);
        txtTitle = (TfTextView) findViewById(R.id.txtTitle);
        txtTitle.setText("Vision board");
        imgAdd = (ImageView) findViewById(R.id.imgAdd);
        imgBack = (ImageView) findViewById(R.id.imgBack);
        btnAdd = (LinearLayout) findViewById(R.id.btnAdd);
        rvGallery = (RecyclerView) findViewById(R.id.rvGallery);
        rvGallery.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        list = DBOpenHelper.getGalleryList();
        if (list.size() == 0) {
            llEmptyView.setVisibility(View.VISIBLE);
            rvGallery.setVisibility(View.GONE);
        } else {
            llEmptyView.setVisibility(View.GONE);
            rvGallery.setVisibility(View.VISIBLE);
        }
        adapter = new GalleryAdapter(this, list, new GalleryAdapter.OnClickItem() {
            @Override
            public void onDeleteClick(final int position) {
                Functions.showAlertDialogWithTwoOption(GalleryListActivity.this, "YES", "NO", "Are you sure want to delete ?", new PopupDialog.OnPopupClick() {
                    @Override
                    public void onOkClick() {
                        DBOpenHelper.deleteGallery(list.get(position).getGalleryId());
                        list.remove(position);
                        adapter.notifyItemRemoved(position);
                        if (list.size() == 0) {
                            llEmptyView.setVisibility(View.VISIBLE);
                            rvGallery.setVisibility(View.GONE);
                        } else {
                            llEmptyView.setVisibility(View.GONE);
                            rvGallery.setVisibility(View.VISIBLE);
                        }
                        new CountDownTimer(1000, 500) {
                            @Override
                            public void onTick(long millisUntilFinished) {

                            }

                            @Override
                            public void onFinish() {
                                adapter.setDataList(list);
                            }
                        }.start();
                    }

                    @Override
                    public void onCancelClick() {

                    }
                });


            }

            @Override
            public void onEditClick(int position) {
                Intent intent = new Intent(GalleryListActivity.this, AddGalleryActivity.class);
                intent.putExtra("gallery", list.get(position));
                Functions.fireIntent(GalleryListActivity.this, intent, true);
            }

            @Override
            public void onSeeClick(int position) {
                Intent intent = new Intent(GalleryListActivity.this, GalleryActivity.class);
                intent.putExtra("title", list.get(position).getGalleryName());
                intent.putExtra("galleryId", list.get(position).getGalleryId());
                Functions.fireIntent(GalleryListActivity.this, intent, true);
            }
        });
        rvGallery.setAdapter(adapter);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.fireIntent(GalleryListActivity.this, AddGalleryActivity.class, true);
            }
        });

        imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.fireIntent(GalleryListActivity.this, AddGalleryActivity.class, true);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
updateData();

    }

    private void updateData() {
        list = DBOpenHelper.getGalleryList();
        adapter.setDataList(list);
        if (list.size() == 0) {
            llEmptyView.setVisibility(View.VISIBLE);
            rvGallery.setVisibility(View.GONE);
        } else {
            llEmptyView.setVisibility(View.GONE);
            rvGallery.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onBackPressed() {
        Functions.fireIntent(this,Dashboard2Activity.class, false);
        finish();
    }
}
