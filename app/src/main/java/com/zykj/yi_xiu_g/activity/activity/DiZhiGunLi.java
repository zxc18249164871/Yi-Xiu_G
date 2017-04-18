package com.zykj.yi_xiu_g.activity.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.zykj.yi_xiu_g.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zykj on 2017/4/18.
 */

public class DiZhiGunLi extends Activity {

    @Bind(R.id.fanhui)
    ImageView fanhui;
    @Bind(R.id.tiaojin_bianjidizhi)
    FrameLayout tiaojinBianjidizhi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_dizhiguanli);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.fanhui, R.id.tiaojin_bianjidizhi})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fanhui:
                finish();
                break;
            case R.id.tiaojin_bianjidizhi:
                Intent bianjidizhi = new Intent(this, BianJidiZhi.class);
                startActivity(bianjidizhi);
                break;
        }
    }
}
