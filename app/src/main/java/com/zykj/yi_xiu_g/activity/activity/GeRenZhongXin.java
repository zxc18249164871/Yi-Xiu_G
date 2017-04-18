package com.zykj.yi_xiu_g.activity.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.zykj.yi_xiu_g.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zykj on 2017/4/18.
 */

public class GeRenZhongXin extends Activity {
    @Bind(R.id.fanhui)
    ImageView fanhui;
    @Bind(R.id.haerbin)
    LinearLayout haerbin;
    @Bind(R.id.imageView4)
    ImageView imageView4;
    @Bind(R.id.weiwancheng)
    FrameLayout weiwancheng;
    @Bind(R.id.imageView10)
    ImageView imageView10;
    @Bind(R.id.yiwancheng)
    FrameLayout yiwancheng;
    @Bind(R.id.imageView9)
    ImageView imageView9;
    @Bind(R.id.yiquxiao)
    FrameLayout yiquxiao;
    @Bind(R.id.grzx_wodeziliao)
    LinearLayout grzxWodeziliao;
    @Bind(R.id.grzx_wodeqianbao)
    LinearLayout grzxWodeqianbao;
    @Bind(R.id.imageView7)
    ImageView imageView7;
    @Bind(R.id.imageView6)
    ImageView imageView6;
    @Bind(R.id.grzx_dizhiguanli)
    LinearLayout grzxDizhiguanli;
    @Bind(R.id.grzx_renzhengxinxi)
    LinearLayout grzxRenzhengxinxi;
    @Bind(R.id.grzx_pingtaifuwu)
    LinearLayout grzxPingtaifuwu;
    @Bind(R.id.grzx_guanyuwomen)
    LinearLayout grzxGuanyuwomen;
    @Bind(R.id.imageView8)
    ImageView imageView8;
    @Bind(R.id.grzx_shezhi)
    LinearLayout grzxShezhi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_gerenzhongxin);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.fanhui, R.id.weiwancheng, R.id.yiwancheng, R.id.yiquxiao, R.id.grzx_wodeziliao, R.id.grzx_wodeqianbao, R.id.grzx_dizhiguanli, R.id.grzx_renzhengxinxi, R.id.grzx_pingtaifuwu, R.id.grzx_guanyuwomen, R.id.grzx_shezhi})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fanhui:
                finish();
                break;
            case R.id.weiwancheng:
                Intent weiwancheng = new Intent(this, WeiWanCheng.class);
                startActivity(weiwancheng);
                break;
            case R.id.yiwancheng:
                Intent yiwancheng = new Intent(this, YiWanCheng.class);
                startActivity(yiwancheng);
                break;
            case R.id.yiquxiao:
                Intent yiquxiao = new Intent(this, YiQuXiao.class);
                startActivity(yiquxiao);
                break;
            case R.id.grzx_wodeziliao:
                Intent wodeziliao = new Intent(this, WoDeziLiao.class);
                startActivity(wodeziliao);
                break;
            case R.id.grzx_wodeqianbao:
                Intent wodeqianbao = new Intent(this, WoDeQianBao.class);
                startActivity(wodeqianbao);
                break;
            case R.id.grzx_dizhiguanli:
                Intent dizhiguanli = new Intent(this, DiZhiGunLi.class);
                startActivity(dizhiguanli);
                break;
            case R.id.grzx_renzhengxinxi:
                break;
            case R.id.grzx_pingtaifuwu:
                Intent fuwupingtai = new Intent(this, FuWuPingTai.class);
                startActivity(fuwupingtai);
                break;
            case R.id.grzx_guanyuwomen:
                break;
            case R.id.grzx_shezhi:
                Intent shezhi = new Intent(this, SheZhi.class);
                startActivity(shezhi);

                break;
        }
    }
}
