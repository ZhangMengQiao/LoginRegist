package mvpframework.bwie.com.loginregist.net;

/**
 * Created by Administrator on 2017/11/28.
 */

public interface OnNetListener<T> {
    public void onSuccess(String string);
    public void onSuccess(T t);
    public void onFailure(Exception e);
}
