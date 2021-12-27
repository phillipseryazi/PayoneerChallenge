package com.mudhut.software.payoneerchallenge.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mudhut.software.payoneerchallenge.R;
import com.mudhut.software.payoneerchallenge.models.ApplicableNetwork;

import java.util.List;

public class PayOptionsRecyclerAdapter extends RecyclerView.Adapter<PayOptionsRecyclerAdapter.PaymentOptionsViewHolder> {
    private final List<ApplicableNetwork> list;
    private final PaymentOptionListener listener;

    public PayOptionsRecyclerAdapter(List<ApplicableNetwork> list, PaymentOptionListener listener) {
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PaymentOptionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.payment_option_card, parent, false);
        return new PaymentOptionsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentOptionsViewHolder holder, int position) {
        holder.getTextView().setText(list.get(position).getLabel());
        Glide.with(holder.itemView).load(list.get(position).getLinks().get("logo")).into(holder.getImageView());
        holder.itemView.setOnClickListener(view -> {
            listener.onOptionClick(list.get(position).getLabel());
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class PaymentOptionsViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView imageView;

        public PaymentOptionsViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.option_list_textview);
            imageView = itemView.findViewById(R.id.option_list_imageview);
        }

        public TextView getTextView() {
            return textView;
        }

        public ImageView getImageView() {
            return imageView;
        }

    }

    public interface PaymentOptionListener {
        void onOptionClick(String label);
    }
}
