package com.example.hodaco.mvp_helloworld.view.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hodaco.mvp_helloworld.R;
import com.example.hodaco.mvp_helloworld.view.contract.mainactivity_contract;
import com.example.hodaco.mvp_helloworld.view.presenter.mainactivity_presenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements mainactivity_contract.View {
    @BindView(R.id.text)
    TextView text;
    @BindView(R.id.button)
    Button button;
    //   private TextView text;
//   private Button button;
    private mainactivity_contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new mainactivity_presenter(this);
    }

    @Override
    public void initView() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onClick(view);
            }
        });
    }
    @Override
    public void setData(String data) {
        text.setText(data);
    }
}
