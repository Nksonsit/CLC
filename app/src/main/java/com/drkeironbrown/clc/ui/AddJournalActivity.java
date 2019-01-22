package com.drkeironbrown.clc.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.custom.LinedEditText;
import com.drkeironbrown.clc.custom.MDToast;
import com.drkeironbrown.clc.db.DBOpenHelper;
import com.drkeironbrown.clc.helper.Functions;
import com.drkeironbrown.clc.model.Journal;

public class AddJournalActivity extends AppCompatActivity {

    private ImageView imgSave;
    private ImageView imgDelete;
    private ImageView imgShare;
    private LinedEditText edtJournal;
    private Journal journal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_journal);
        edtJournal = (LinedEditText) findViewById(R.id.edtJournal);
        imgShare = (ImageView) findViewById(R.id.imgShare);
        imgDelete = (ImageView) findViewById(R.id.imgDelete);
        imgSave = (ImageView) findViewById(R.id.imgSave);

        journal = (Journal) getIntent().getSerializableExtra("journal");
        if (journal == null) {
            imgDelete.setVisibility(View.GONE);
        } else {
            imgDelete.setVisibility(View.VISIBLE);
            edtJournal.setText(journal.getJournal());
        }

        imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBOpenHelper.deleteJournal(journal.getJournalId());
                onBackPressed();
            }
        });
        imgSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.hideKeyPad(AddJournalActivity.this, v);
                if (edtJournal.getText().toString().trim().length() == 0) {
                    Functions.showToast(AddJournalActivity.this, "Please enter your journal", MDToast.TYPE_INFO);
                    return;
                }
                if (journal == null) {
                    Journal journal = new Journal();
                    journal.setJournal(edtJournal.getText().toString().trim());
                    DBOpenHelper.addJournal(journal);
                } else {
                    journal.setJournal(edtJournal.getText().toString().trim());
                    DBOpenHelper.updateJournal(journal);
                }
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Functions.fireIntent(this, false);
    }
}
