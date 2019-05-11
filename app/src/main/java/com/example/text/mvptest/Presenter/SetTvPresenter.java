package com.example.text.mvptest.Presenter;

import android.support.v7.app.AppCompatActivity;

import com.example.text.mvptest.Model.BaseModel;
import com.example.text.mvptest.Model.GetDataMobel;
import com.example.text.mvptest.View.UiSetData;

import java.lang.ref.WeakReference;

/**
 * Created by 胡泽宇 on 2018/4/25.
 */

public  class SetTvPresenter<V extends UiSetData>extends BasePresenter<V>{
    GetDataMobel getDataMobel;
    public SetTvPresenter(){
        getDataMobel=new GetDataMobel();
    }
    public  void SetData() {
        if (weakReference.get() != null) {

            getDataMobel.getdata(new GetDataMobel.LoadDataLinstener() {
                @Override
                public void getData(String str) {
                    weakReference.get().setText(str);

                }
            });
        }
    }

}
