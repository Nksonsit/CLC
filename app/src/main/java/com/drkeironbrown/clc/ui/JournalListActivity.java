package com.drkeironbrown.clc.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.adapter.JournalAdapter;
import com.drkeironbrown.clc.custom.TfTextView;
import com.drkeironbrown.clc.db.DBOpenHelper;
import com.drkeironbrown.clc.helper.Functions;
import com.drkeironbrown.clc.model.Journal;

import java.util.ArrayList;
import java.util.List;

public class JournalListActivity extends AppCompatActivity {

    private RecyclerView rvJournal;
    private List<Journal> list;
    private JournalAdapter adapter;
    private ImageView imgBack;
    private TfTextView txtTitle;
    private RelativeLayout toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal_list);
        this.toolbar = (RelativeLayout) findViewById(R.id.toolbar);
        this.txtTitle = (TfTextView) findViewById(R.id.txtTitle);
        this.imgBack = (ImageView) findViewById(R.id.imgBack);
        txtTitle.setText("Journal");
        rvJournal = (RecyclerView) findViewById(R.id.rvJournal);
        StaggeredGridLayoutManager slm = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        slm.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS);
        rvJournal.setLayoutManager(slm);
        list = new ArrayList<>();
        list = DBOpenHelper.getJournal();
        adapter = new JournalAdapter(this, list, new JournalAdapter.OnDeleteClick() {
            @Override
            public void onDeleteClick() {
//                list = DBOpenHelper.getJournal();
//                adapter.setDataList(list);
            }
        });
        rvJournal.setAdapter(adapter);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Functions.fireIntent(this, false);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        list = DBOpenHelper.getJournal();
        adapter.setDataList(list);
    }
}
