package com.drkeironbrown.clc.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.custom.TfTextView;
import com.drkeironbrown.clc.helper.Functions;
import com.drkeironbrown.clc.model.Quotes;
import com.drkeironbrown.clc.model.SpecificItem;
import com.drkeironbrown.clc.ui.CategoryDetailActivity;

import java.util.ArrayList;
import java.util.List;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.QuotesVH> {

    private List<Quotes> list;
    private Context context;

    public QuotesAdapter(Context context, List<Quotes> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public QuotesVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_quotes, viewGroup, false);
        return new QuotesVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuotesVH quoteVH, final int i) {
        quoteVH.txtQuotes.setText(list.get(i).getQuotes());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setDataList(List<Quotes> data) {
        list = new ArrayList<>();
        list = data;
        notifyDataSetChanged();
    }

    public class QuotesVH extends RecyclerView.ViewHolder {
        private TfTextView txtQuotes;

        public QuotesVH(View itemView) {
            super(itemView);
            txtQuotes = (TfTextView) itemView.findViewById(R.id.txtQuotes);
        }
    }

}
