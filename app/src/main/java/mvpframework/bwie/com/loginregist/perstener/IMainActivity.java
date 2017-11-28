package mvpframework.bwie.com.loginregist.perstener;

import mvpframework.bwie.com.loginregist.bean.LoginBean;

/**
 * Created by Administrator on 2017/11/28.
 */

public interface IMainActivity {
    public String getPhone();
    public String getPwd();
    public void show(LoginBean loginBean);
    public void shows(String string);
}
