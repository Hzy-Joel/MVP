package com.example.text.mvptest.Model;

/**
 * Created by 胡泽宇 on 2018/4/25.
 */

public class GetDataMobel implements BaseModel {
    @Override
    public void getdata(LoadDataLinstener loadDataLinstener) {
        String str="这就是mvp模式";
        loadDataLinstener.getData(str);
    }

    @Override
    public void login(String count, String password, loginLinstener l) {
        //

    }
}
