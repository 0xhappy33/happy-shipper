package com.happycity.project.happy_shipper.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.happycity.project.happy_shipper.R;

/**
 * Created by Ha Truong on 12/28/2017.
 * This is a App
 * into the com.happycity.project.happy_shipper.ui.fragment
 */

public class DeliveredFragment extends Fragment{

    public static DeliveredFragment newInstance(){
        return new DeliveredFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_delivered, container, false);
    }
}
