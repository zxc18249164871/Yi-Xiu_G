package com.zykj.yi_xiu_g.activity.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.bigkoo.pickerview.OptionsPickerView;
import com.zykj.yi_xiu_g.R;
import com.zykj.yi_xiu_g.activity.bean.Bean;
import com.zykj.yi_xiu_g.activity.utils.DiZhi;
import com.zykj.yi_xiu_g.activity.utils.GongJu;

import org.xutils.http.RequestParams;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zykj on 2017/4/18.
 */

public class ShouJiWeiXiu extends Activity {
    @Bind(R.id.fanhui)
    ImageView fanhui;
    @Bind(R.id.shoujipinpai)
    TextView shoujipinpai;
    @Bind(R.id.pihnpai)
    LinearLayout pihnpai;
    @Bind(R.id.shoujixinghao)
    TextView shoujixinghao;
    @Bind(R.id.xinghao)
    LinearLayout xinghao;
    @Bind(R.id.shoujiguzhangdiao)
    TextView shoujiguzhangdiao;
    @Bind(R.id.guzhang)
    LinearLayout guzhang;
    @Bind(R.id.miaoshu_guzhang)
    EditText miaoshuGuzhang;
    @Bind(R.id.tianjitupian)
    FrameLayout tianjitupian;
    @Bind(R.id.shoujiweixiu_queding)
    Button shoujiweixiuQueding;
    List<Bean> lists; //品牌的数据源
    private int index = 0;
    int mobileIndex = -1;  //用于检测是否选择了品牌

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_shoujiweixiu);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.fanhui, R.id.pihnpai, R.id.xinghao, R.id.guzhang, R.id.tianjitupian, R.id.shoujiweixiu_queding})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fanhui:
                finish();
                break;
            case R.id.pihnpai:
                GongJu.get(DiZhi.FIND_PHONE_BRAND, null, new GongJu.MyCommonCall<String>() {
                    @Override
                    public void onSuccess(String result) {
                        if (GongJu.getRespCode(result)) {
                            lists = JSON.parseArray(GongJu.getData(result), Bean.class);
                            OptionsPickerView optionsPickerView=new OptionsPickerView.Builder(ShouJiWeiXiu.this, new OptionsPickerView.OnOptionsSelectListener() {
                                @Override
                                public void onOptionsSelect(int options1, int options2, int options3, View v) {
                                    shoujipinpai.setText(lists.get(options1).getName());
                                }
                            }).build();
                        }
                    }
                });


                break;
            case R.id.xinghao:
                break;
            case R.id.guzhang:
                break;
            case R.id.tianjitupian:
                break;
            case R.id.shoujiweixiu_queding:
                break;
        }
    }
}
