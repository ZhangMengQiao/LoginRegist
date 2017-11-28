package mvpframework.bwie.com.loginregist.model;

import android.content.Context;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.Map;

import mvpframework.bwie.com.loginregist.bean.LoginBean;
import mvpframework.bwie.com.loginregist.net.HttpUtils;
import mvpframework.bwie.com.loginregist.net.OnNetListener;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/11/28.
 */

public class MainModel implements IMainModel{
    //post请求注册
    @Override
    public void postReg(Context context, String url, Map<String, String> entry, final OnNetListener onNetListener) {
        HttpUtils.getHttpUtils(context).doPost(url, entry, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                onNetListener.onFailure(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                onNetListener.onSuccess(response.body().string());
            }
        });
    }

    //post登陆
    @Override
    public void PostLogin(Context context, String url, Map<String, String> params, final OnNetListener<LoginBean> onNetListener) {
        HttpUtils.getHttpUtils(context).doPost(url, params, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                onNetListener.onFailure(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                LoginBean loginBean = new Gson().fromJson(response.body().string(), LoginBean.class);
                onNetListener.onSuccess(loginBean);
            }
        });
    }
}
