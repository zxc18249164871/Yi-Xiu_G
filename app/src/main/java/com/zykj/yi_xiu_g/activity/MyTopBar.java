package com.zykj.yi_xiu_g.activity;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zykj.yi_xiu_g.R;

/**
 * Created by zykj on 2017/4/11.
 */

public class MyTopBar extends RelativeLayout {
    //    左面按钮  LeftText

    private String LeftText;
    private float LefrtTextSize;
    private Drawable RightTextGB;
    //    中间标题  TitleBar
    private String TitleBar;
    private float TitleTextSize;
    private Drawable TitleTextGB;
    //  右面按钮 RightText
    private String RightText;
    private float RightTextSize;
    private Drawable LefrtTextGB;
    private Context context;
    private TextView left, title, right;

    public MyTopBar(Context context) {
        super(context);


    }

    public MyTopBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
//        获取自定义属性
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyTopBar);
//        获取左面按钮的属性
        LeftText = typedArray.getString(R.styleable.MyTopBar_LeftText);
        LefrtTextSize = typedArray.getFloat(R.styleable.MyTopBar_LefrtTextSize, 0);
        LefrtTextGB = typedArray.getDrawable(R.styleable.MyTopBar_LefrtTextGB);
//        获取标题属性
        TitleBar = typedArray.getString(R.styleable.MyTopBar_TitleBar);
        TitleTextSize = typedArray.getFloat(R.styleable.MyTopBar_TitleTextSize, 0);
        TitleTextGB = typedArray.getDrawable(R.styleable.MyTopBar_TitleTextGB);
//        获取右面按钮的属性
        RightText = typedArray.getString(R.styleable.MyTopBar_RightText);
        RightTextSize = typedArray.getFloat(R.styleable.MyTopBar_RightTextSize, 0);
        RightTextGB = typedArray.getDrawable(R.styleable.MyTopBar_RightTextGB);
//        添加左面控件
        left = new TextView(context);
//        添加标题
        title = new TextView(context);
//        添加右面控件
        right = new TextView(context);

//        把控件属性设置到对应空间上
//        把左面控件属性设置到左面控件上
        left.setText(LeftText);
        left.setTextSize(LefrtTextSize);
        left.setBackgroundDrawable(LefrtTextGB);
//        把标题内容控件属性设置标题上
        title.setText(TitleBar);
        title.setTextSize(TitleTextSize);
        title.setBackgroundDrawable(TitleTextGB);
//        把右面控件属性设置到右面控件上
        right.setText(RightText);
        right.setTextSize(RightTextSize);
        right.setBackgroundDrawable(RightTextGB);
//        把空间添加到View中
//        把左侧的控件添加到View中
        LayoutParams leftparams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        leftparams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
//        把中间的标题添加到View中
        LayoutParams titleparams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        titleparams.addRule(RelativeLayout.CENTER_IN_PARENT);
//        把右侧的控件添加到View中
        LayoutParams rightparams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        rightparams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);


    }

    public MyTopBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
