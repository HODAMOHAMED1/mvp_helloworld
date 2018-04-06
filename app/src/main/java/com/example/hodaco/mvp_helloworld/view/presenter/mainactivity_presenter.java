package com.example.hodaco.mvp_helloworld.view.presenter;

import android.graphics.ColorSpace;
import android.view.View;

import com.example.hodaco.mvp_helloworld.view.contract.mainactivity_contract;
import com.example.hodaco.mvp_helloworld.view.model.mainactivity_model;

/**
 * Created by hoda.CO on 05/04/2018.
 */

public class mainactivity_presenter implements mainactivity_contract.Presenter {
    private mainactivity_contract.Model model;
    private mainactivity_contract.View mview;

    public mainactivity_presenter(mainactivity_contract.View mview) {
        this.mview = mview;
        initPresenter();
    }
    public void initPresenter()
    {
        model=new mainactivity_model();
        mview.initView();
    }
    @Override
    public void onClick(View view) {
        mview.setData(model.getData().toString());
    }

}
