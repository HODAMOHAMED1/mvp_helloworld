package com.example.hodaco.mvp_helloworld.view.contract;

/**
 * Created by hoda.CO on 05/04/2018.
 */

public interface mainactivity_contract {
    interface View{
     void initView();
     void setData(String data);
    }
    interface Model
    {
      String getData();
    }
    interface Presenter
    {
        void onClick(android.view.View view);
    }
}
