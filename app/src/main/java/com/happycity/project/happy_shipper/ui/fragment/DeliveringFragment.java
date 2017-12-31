package com.happycity.project.happy_shipper.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.happycity.project.happy_shipper.R;
import com.happycity.project.happy_shipper.domain.model.Goods;
import com.happycity.project.happy_shipper.ui.activity.GoodsDetailActivity;
import com.happycity.project.happy_shipper.ui.adapter.GoodAdapter;
import com.happycity.project.happy_shipper.ui.adapter.ItemClickListener;
import com.happycity.project.happy_shipper.utils.ActivityUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ha Truong on 12/28/2017.
 * This is a App
 * into the com.happycity.project.happy_shipper.ui.fragment
 */

public class DeliveringFragment extends Fragment implements ItemClickListener{


    private static final String TAG = "DeliveringFragment";

    private static final int DATA_SET_COUNT = 20;

    protected GoodAdapter mAdapter;
    protected List<Goods> mGoodsList;
    protected RecyclerView mRecyclerView;
    protected RecyclerView.LayoutManager mLayoutManager;


    public static DeliveringFragment newInstance(){
        return new DeliveringFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Initial data set, this data from local content provider or
        // remote server
        initDataSet();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_delivering, container, false);
        rootView.setTag(TAG);
        mRecyclerView = rootView.findViewById(R.id.recyclerViewDeliveringGoods);

        mAdapter = new GoodAdapter(mGoodsList);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setClickListener(this);
        return rootView;
    }

    private void initDataSet() {
        mGoodsList = new ArrayList<>();
        for (int i = 0; i < DATA_SET_COUNT; i++) {
            if(i % 2 == 0)
                mGoodsList.add(new Goods(i + "",
                    "Street Borei Kamakor, Phoum 3, Sangkat 3, Sangkat Bei, Mittakpheap, Preah Sihanouk",
                    "National Road 6, Tuek Vil, Puok, Siem Reap",
                        "2km",
                        "KHR 50",
                        "KHR 13",
                        "Dip beo"
                        ));
            else
                mGoodsList.add(new Goods(i + "",
                        "National Road6, Phum Kaksekam, Sangkat Sra Ngae, Tuek Vil, Puok, Siem Reap",
                        "St 306 #17 (between Norodom Blvd and St 51), Phnom Penh",
                        "2km",
                        "KHR 50",
                        "KHR 13",
                        "Pich Sophea"));
        }

    }


    @Override
    public void onClick(View view, int position) {
        final Goods goods = mGoodsList.get(position);
        Intent passToDetail = new Intent(getActivity(), GoodsDetailActivity.class);
        passToDetail.putExtra(ActivityUtils.ITEM_GOODS_EXTRA, goods);
        startActivity(passToDetail);
    }
}
