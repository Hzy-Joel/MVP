package com.example.text.mvptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.text.mvptest.Model.BaseModel;
import com.example.text.mvptest.Model.GetDataMobel;
import com.example.text.mvptest.Presenter.BasePresenter;
import com.example.text.mvptest.Presenter.SetTvPresenter;
import com.example.text.mvptest.View.BaseActivity;
import com.example.text.mvptest.View.UiSetData;

public class MainActivity extends BaseActivity<UiSetData,SetTvPresenter<UiSetData>> implements UiSetData {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        basepresenter.SetData();
    }

    @Override
    public SetTvPresenter<UiSetData> choicePresent() {
        return new SetTvPresenter<>();
    }


    @Override
    public void setText(String str) {
        TextView tv= findViewById(R.id.tv);
        tv.setText(str);
    }


}
