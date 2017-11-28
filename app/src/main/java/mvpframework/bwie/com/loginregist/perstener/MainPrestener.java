package mvpframework.bwie.com.loginregist.perstener;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;

import mvpframework.bwie.com.loginregist.model.IMainModel;
import mvpframework.bwie.com.loginregist.model.MainModel;

/**
 * Created by Administrator on 2017/11/28.
 */

public class MainPrestener {
    private IMainModel iMainModel;
    private IMainActivity iMainActivity;
    private Context context;

    public MainPrestener(IMainActivity iMainActivity) {
        this.iMainActivity = iMainActivity;
        iMainModel=new MainModel();
        context= (Context) iMainActivity;
    }
    public void postLogin(){
        String url = "http://120.27.23.105/user/login";
        Map<String ,String> params=new HashMap<String,String>();
        params.put("mobiele")
    }
}
