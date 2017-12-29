package com.happycity.project.happy_shipper.ui.fragment;

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
import com.happycity.project.happy_shipper.ui.adapter.GoodAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ha Truong on 12/28/2017.
 * This is a App
 * into the com.happycity.project.happy_shipper.ui.fragment
 */

public class DeliveringFragment extends Fragment{


    private static final String TAG = "DeliveringFragment";

    private static final int DATASET_COUNT = 20;

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
        initDataset();
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

        return rootView;
    }

    private void initDataset() {
        mGoodsList = new ArrayList<>();
        for (int i = 0; i < DATASET_COUNT; i++) {
            mGoodsList.add(new Goods(i+"",
                    "NGUYEN CONG TRU, DA NANG",
                    "NGUYEN CONG TRU DA NANG"));
        }
    }
}
