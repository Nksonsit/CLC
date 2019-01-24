package com.drkeironbrown.clc.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.custom.MDToast;
import com.drkeironbrown.clc.custom.PopupDialog;
import com.drkeironbrown.clc.custom.TfTextView;
import com.drkeironbrown.clc.helper.Functions;
import com.drkeironbrown.clc.helper.PrefUtils;
import com.drkeironbrown.clc.model.Category;
import com.drkeironbrown.clc.model.SpecificItem;
import com.drkeironbrown.clc.ui.CategoryDetailActivity;
import com.drkeironbrown.clc.ui.TopicDetailActivity;

import java.util.ArrayList;
import java.util.List;

public class TopicsAdapter extends RecyclerView.Adapter<TopicsAdapter.TopicVH> {

    private List<SpecificItem> list;
    private Context context;

    public TopicsAdapter(Context context, List<SpecificItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public TopicVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_topic, viewGroup, false);
        return new TopicVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicVH topicVH, final int i) {
        topicVH.txtTopic.setText(list.get(i).getTopic());
        topicVH.txtReadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(context, TopicDetailActivity.class);
                    intent.putExtra("topic", list.get(i));
                    Functions.fireIntent(context, intent, true);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setDataList(List<SpecificItem> data) {
        list = new ArrayList<>();
        list = data;
        notifyDataSetChanged();
    }

    public class TopicVH extends RecyclerView.ViewHolder {
        private TfTextView txtTopic, txtReadMore;

        public TopicVH(View itemView) {
            super(itemView);
            txtTopic = (TfTextView) itemView.findViewById(R.id.txtTopic);
            txtReadMore = (TfTextView) itemView.findViewById(R.id.txtReadMore);
        }
    }

}
