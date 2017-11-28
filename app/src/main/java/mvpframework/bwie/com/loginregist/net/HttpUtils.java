package mvpframework.bwie.com.loginregist.net;

import android.content.Context;

import java.util.Map;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/11/28.
 */

public class HttpUtils {
    public static volatile HttpUtils httpUtils;
    private Context context;
    public OkHttpClient client;

    public HttpUtils(Context context) {
        this.context = context;
        client=new OkHttpClient();
    }
    public static HttpUtils getHttpUtils(Context context){
        if(httpUtils==null){
            synchronized (HttpUtils.class){
                if(httpUtils==null){
                    httpUtils=new HttpUtils(context);
                }
            }
        }
        return httpUtils;
    }

    public void doGet(String url, Callback callback){
        Request request=new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }
    public void doPost(String url, Map<String,String> params, Callback callback){
        FormBody.Builder builder=new FormBody.Builder();
        for(Map.Entry<String,String> entry:params.entrySet()){
            builder.add(entry.getKey(),entry.getValue());
        }
        FormBody formBody=builder.build();
        Request request=new Request.Builder().url(url).post(formBody).build();
        client.newCall(request).enqueue(callback);
    }
}
