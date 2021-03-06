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
import com.drkeironbrown.clc.ui.CategoryDetailActivity;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryVH> {

    private OnBuyClick onBuyClick;
    private List<Category> list;
    private Context context;

    public CategoryAdapter(Context context, List<Category> list, OnBuyClick onBuyClick) {
        this.context = context;
        this.list = list;
        this.onBuyClick = onBuyClick;
    }

    @NonNull
    @Override
    public CategoryVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_category, viewGroup, false);
        return new CategoryVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryVH categoryVH, final int i) {
        categoryVH.txtCategoy.setText(list.get(i).getCategoryName());
        categoryVH.txtReadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Functions.isConnected(context)) {
                    Functions.showToast(context, context.getString(R.string.check_internet), MDToast.TYPE_ERROR);
                    return;
                }
                if (list.get(i).getCategoryPrice() != null && list.get(i).getCategoryPrice().trim().length() > 0 && Integer.parseInt(list.get(i).getCategoryPrice()) > 0 && PrefUtils.getUserFullProfileDetails(context).getIsFullPay() == 0) {
                    Functions.showAlertDialogWithTwoOption(context, "Premium", "Not now", "Upgrade to Premium to access this feature!", new PopupDialog.OnPopupClick() {
                        @Override
                        public void onOkClick() {
                            onBuyClick.onBuyClick(i);
                        }

                        @Override
                        public void onCancelClick() {

                        }
                    });
                } else {
                    Intent intent = new Intent(context, CategoryDetailActivity.class);
                    intent.putExtra("category", list.get(i));
                    Functions.fireIntent(context, intent, true);
                }
            }
        });

        categoryVH.txtPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Functions.isConnected(context)) {
                    Functions.showToast(context, context.getString(R.string.check_internet), MDToast.TYPE_ERROR);
                    return;
                }
                if (list.get(i).getCategoryPrice() != null && list.get(i).getCategoryPrice().trim().length() > 0 && Integer.parseInt(list.get(i).getCategoryPrice()) > 0 && PrefUtils.getUserFullProfileDetails(context).getIsFullPay() == 0) {
                    Functions.showAlertDialogWithTwoOption(context, "Premium", "Not now", "Upgrade to Premium to access this feature!", new PopupDialog.OnPopupClick() {
                        @Override
                        public void onOkClick() {
                            onBuyClick.onBuyClick(i);
                        }

                        @Override
                        public void onCancelClick() {

                        }
                    });
                }
            }
        });
        if (list.get(i).getCategoryPrice() != null && list.get(i).getCategoryPrice().trim().length() > 0 && Integer.parseInt(list.get(i).getCategoryPrice()) > 0 && PrefUtils.getUserFullProfileDetails(context).getIsFullPay() == 0) {
            categoryVH.txtPremium.setVisibility(View.VISIBLE);
        } else {
            categoryVH.txtPremium.setVisibility(View.GONE);
        }
        categoryVH.txtNote.setVisibility(View.GONE);

/*        AdvancedSpannableString spannableString = new AdvancedSpannableString("Click to read");
        spannableString.setUnderLine("Click to read");
        categoryVH.txtReadMore.setText(spannableString);*/
        Functions.loadImage(context, list.get(i).getCategoryImagePath(), categoryVH.imgCategory, categoryVH.progressBar);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setDataList(List<Category> data) {
        list = new ArrayList<>();
        list = data;
        notifyDataSetChanged();
    }

    public class CategoryVH extends RecyclerView.ViewHolder {
        private TfTextView txtCategoy, txtNote, txtReadMore, txtPremium;
        private ImageView imgCategory;
        private ProgressBar progressBar;

        public CategoryVH(View itemView) {
            super(itemView);
            progressBar = (ProgressBar) itemView.findViewById(R.id.progressBar);
            imgCategory = (ImageView) itemView.findViewById(R.id.imgCategory);
            txtCategoy = (TfTextView) itemView.findViewById(R.id.txtCategory);
            txtNote = (TfTextView) itemView.findViewById(R.id.txtNote);
            txtReadMore = (TfTextView) itemView.findViewById(R.id.txtReadMore);
            txtPremium = (TfTextView) itemView.findViewById(R.id.txtPremium);
        }
    }

    public interface OnBuyClick {
        void onBuyClick(int pos);
    }
}
