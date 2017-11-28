package mvpframework.bwie.com.loginregist.model;

import android.content.Context;

import java.util.Map;

import mvpframework.bwie.com.loginregist.bean.LoginBean;
import mvpframework.bwie.com.loginregist.net.OnNetListener;

/**
 * Created by Administrator on 2017/11/28.
 */

public interface IMainModel {
    public void postReg(Context context, String url, Map<String,String>entry, OnNetListener onNetListener);
    public void PostLogin(Context context,String url,Map<String ,String>params,OnNetListener<LoginBean> onNetListener);
}
