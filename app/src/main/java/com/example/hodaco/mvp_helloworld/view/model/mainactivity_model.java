package com.example.hodaco.mvp_helloworld.view.model;

import com.example.hodaco.mvp_helloworld.view.contract.mainactivity_contract;

/**
 * Created by hoda.CO on 05/04/2018.
 */

public class mainactivity_model implements mainactivity_contract.Model {
    @Override
    public String getData() {
        return "helloworld";
    }
}
