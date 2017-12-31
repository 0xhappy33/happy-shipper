package com.happycity.project.happy_shipper.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.happycity.project.happy_shipper.R;
import com.happycity.project.happy_shipper.domain.model.Goods;

import java.util.List;

/**
 * Created by Ha Truong on 12/28/2017.
 * This is a App
 * into the com.happycity.project.happy_shipper.ui.adapter
 */

public class GoodAdapter  extends RecyclerView.Adapter<GoodAdapter.MyViewHolder>{

    private List<Goods> goodsList;
    private ItemClickListener itemClickListener;

    public GoodAdapter(List<Goods> goodsList){
        this.goodsList = goodsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_delivering_goods, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Goods goods = goodsList.get(position);
        holder.txtToAddress.setText(goods.getToAddress());
        holder.txtFromAddress.setText(goods.getFromAddress());
        holder.txtUser.setText(goods.getUser());
        holder.txtDistance.setText(goods.getKm());
        holder.txtBill.setText(goods.getPayMoney());
        holder.txtFee.setText(goods.getShipMoney());
    }

    @Override
    public int getItemCount() {
        return goodsList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtFromAddress, txtToAddress;
        TextView txtUser, txtFee, txtBill, txtDistance;

        MyViewHolder(View view) {
            super(view);
            txtFromAddress = view.findViewById(R.id.from_address);
            txtToAddress = view.findViewById(R.id.to_address);
            txtUser = view.findViewById(R.id.txtUser);
            txtDistance = view.findViewById(R.id.txtDistance);
            txtFee = view.findViewById(R.id.txtFee);
            txtBill = view.findViewById(R.id.txtBill);
            view.setTag(view);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (itemClickListener != null)
                itemClickListener.onClick(view, getPosition());
        }
    }

    public void setClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }
}
