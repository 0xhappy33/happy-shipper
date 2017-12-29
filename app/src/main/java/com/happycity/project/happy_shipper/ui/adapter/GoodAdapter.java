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
    }

    @Override
    public int getItemCount() {
        return goodsList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtFromAddress, txtToAddress;

        MyViewHolder(View view) {
            super(view);
            txtFromAddress = view.findViewById(R.id.from_address);
            txtToAddress = view.findViewById(R.id.to_address);
        }
    }
}
