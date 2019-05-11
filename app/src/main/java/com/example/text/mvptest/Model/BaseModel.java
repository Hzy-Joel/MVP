package com.example.text.mvptest.Model;

/**
 * Created by 胡泽宇 on 2018/4/25.
 */

public interface BaseModel {
    void getdata(LoadDataLinstener loadDataLinstener);
    interface LoadDataLinstener{
        void getData(String str);
    }
    void login(String count,String password,loginLinstener l);
    interface loginLinstener{
        void sucess();
        void fail();
    }
}
