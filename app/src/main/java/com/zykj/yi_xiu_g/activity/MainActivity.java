package com.zykj.yi_xiu_g.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zykj.yi_xiu_g.R;
import com.zykj.yi_xiu_g.activity.activity.DianNaoWeiXiu;
import com.zykj.yi_xiu_g.activity.activity.GeRenZhongXin;
import com.zykj.yi_xiu_g.activity.activity.JiaDianWeiXiu;
import com.zykj.yi_xiu_g.activity.activity.ShouJiWeiXiu;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zykj on 2017/4/8.
 */

public class MainActivity extends Activity {

    @Bind(R.id.haerbin_dizhi)
    LinearLayout haerbinDizhi;
    @Bind(R.id.gerenzhongxin)
    ImageView gerenzhongxin;
    @Bind(R.id.imageView2)
    ImageView imageView2;
    @Bind(R.id.imageView3)
    ImageView imageView3;
    @Bind(R.id.tianzhuan_shoujiweixiu)
    FrameLayout tianzhuanShoujiweixiu;
    @Bind(R.id.zhuye_shouji)
    LinearLayout zhuyeShouji;
    @Bind(R.id.tiaozhuan_diannaoweixiu)
    FrameLayout tiaozhuanDiannaoweixiu;
    @Bind(R.id.textView2)
    TextView textView2;
    @Bind(R.id.zhuye_dinanao)
    LinearLayout zhuyeDinanao;
    @Bind(R.id.imageView)
    ImageView imageView;
    @Bind(R.id.tiaozhuan_jiadianweixiu)
    FrameLayout tiaozhuanJiadianweixiu;
    @Bind(R.id.zhuye_jiadian)
    LinearLayout zhuyeJiadian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.haerbin_dizhi, R.id.gerenzhongxin, R.id.zhuye_shouji, R.id.zhuye_dinanao, R.id.zhuye_jiadian})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.haerbin_dizhi:
                break;
            case R.id.gerenzhongxin:
                Intent gerenzhongxin=new Intent(this,GeRenZhongXin.class);
                startActivity(gerenzhongxin);
                break;
            case R.id.zhuye_shouji:
                Intent shoujiweixiu=new Intent(this,ShouJiWeiXiu.class);
                startActivity(shoujiweixiu);
                break;
            case R.id.zhuye_dinanao:
                Intent diannaoweixiu=new Intent(this,DianNaoWeiXiu.class);
                startActivity(diannaoweixiu);
                break;
            case R.id.zhuye_jiadian:
                Intent jiadianweixiu=new Intent(this,JiaDianWeiXiu.class);
                startActivity(jiadianweixiu);
                break;
        }
    }
}
