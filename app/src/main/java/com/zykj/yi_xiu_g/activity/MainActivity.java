package com.zykj.yi_xiu_g.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.zykj.yi_xiu_g.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zykj on 2017/4/8.
 */

public class MainActivity extends Activity {
    @Bind(R.id.haerbin)
    LinearLayout haerbin;
    @Bind(R.id.gerenzhongxin)
    ImageView gerenzhongxin;
    @Bind(R.id.imageView2)
    ImageView imageView2;
    @Bind(R.id.imageView3)
    ImageView imageView3;
    @Bind(R.id.tianzhuan_shoujiweixiu)
    FrameLayout tianzhuanShoujiweixiu;
    @Bind(R.id.tiaozhuan_diannaoweixiu)
    FrameLayout tiaozhuanDiannaoweixiu;
    @Bind(R.id.textView2)
    TextView textView2;
    @Bind(R.id.imageView)
    ImageView imageView;
    @Bind(R.id.tiaozhuan_jiadianweixiu)
    FrameLayout tiaozhuanJiadianweixiu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_main);
        ButterKnife.bind(this);
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    @OnClick({R.id.haerbin, R.id.gerenzhongxin, R.id.tianzhuan_shoujiweixiu, R.id.tiaozhuan_diannaoweixiu, R.id.tiaozhuan_jiadianweixiu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.haerbin:
                break;
            case R.id.gerenzhongxin:
                break;
            case R.id.tianzhuan_shoujiweixiu:
                Intent intent=new Intent();
                startActivity(intent);
                break;
            case R.id.tiaozhuan_diannaoweixiu:
                break;
            case R.id.tiaozhuan_jiadianweixiu:
                break;
        }
    }
}
