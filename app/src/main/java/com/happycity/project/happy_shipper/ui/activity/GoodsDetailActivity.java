package com.happycity.project.happy_shipper.ui.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.happycity.project.happy_shipper.R;
import com.happycity.project.happy_shipper.domain.model.Goods;
import com.happycity.project.happy_shipper.utils.ActivityUtils;

public class GoodsDetailActivity extends AppCompatActivity {

    TextView txtToAddressDetail;
    TextView txtUser;
    TextView txtCode;
    TextView txtDistance;
    TextView txtFee;
    TextView txtBill;

    Goods goods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initView();

        Intent intent = getIntent();
        goods = (Goods) intent.getSerializableExtra(ActivityUtils.ITEM_GOODS_EXTRA);
        addDataToView();
    }

    @SuppressLint("SetTextI18n")
    private void addDataToView() {
        txtToAddressDetail.setText(goods.getToAddress().trim());
        txtCode.setText("CODE : HC_00_" + goods.getIdGoods().trim());
        txtDistance.setText(goods.getKm().trim());
        txtUser.setText(goods.getUser().trim());
        txtBill.setText(goods.getPayMoney().trim());
        txtFee.setText(goods.getShipMoney().trim());
    }

    public void initView(){
        txtToAddressDetail = findViewById(R.id.detail_to_address);
        txtUser = findViewById(R.id.user_name_detail);
        txtDistance = findViewById(R.id.detail_distance);
        txtCode = findViewById(R.id.detail_code);
        txtBill = findViewById(R.id.total_bill_of_goods);
        txtFee = findViewById(R.id.detail_fees_received);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }


}
