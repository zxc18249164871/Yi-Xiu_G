package com.zykj.yi_xiu_g.activity.utils;

import android.accessibilityservice.GestureDescription;
import android.content.Context;

import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.hss01248.dialog.StyledDialog;


import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by zykj on 2017/4/18.
 */

public class GongJu {
    public static Context context;
    public static boolean islog = true;

    public static void s(String s) {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
    }

    public static void i(String str) {
        if (islog)
            com.orhanobut.logger.Logger.i(str);

    }

    public static boolean getRespCode(String result) {
        if ("0".equals(JSON.parseObject(result).getString("resp_code"))) {
            return true;
        } else {
            return false;
        }
    }

    public static String getData(String result) {
        return JSON.parseObject(result).getString("data");
    }

    public static Callback.Cancelable get(String url, Map<String, String> params, MyCommonCall<String> call) {
        if (params == null)
            i(url);
        else
            i(url + params.toString());

        RequestParams rp= new RequestParams(url);
        if (params != null) {
            for (Map.Entry<String,String> entry:params.entrySet()
                 ) {rp.addBodyParameter(entry.getKey(),entry.getValue());
            }
            StyledDialog.buildLoading().show();
        }
        return   x.http().get(rp, call);
    }


    public static Callback.Cancelable post(RequestParams params, MyCommonCall<String> call) {
        return x.http().post(params, call);
    }


    public abstract static class MyCommonCall<String> implements Callback.CommonCallback<String> {
        @Override
        public void onFinished() {
        }

        @Override
        public void onCancelled(CancelledException cex) {
        }

        @Override
        public void onError(Throwable ex, boolean isOnCallback) {
            s("服务器异常");
            ex.printStackTrace();
        }

    }
}
