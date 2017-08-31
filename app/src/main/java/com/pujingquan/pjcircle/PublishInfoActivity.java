package com.pujingquan.pjcircle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PublishInfoActivity extends BaseActivity implements View.OnClickListener{
    
    private String mPublisherType;
    private ImageView mIvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish_info);
        init();
    }

    private void init() {
        initView();
        initData();
        initListener();
    }

    private void initView() {
        mIvBack = (ImageView) findViewById(R.id.ivBack);
    }

    private void initData() {
        Intent intent = getIntent();
        if(intent!=null){
            mPublisherType = intent.getStringExtra(Constants.PUBLISHER_TYPE);
        }
    }

    private void initListener() {
        mIvBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ivBack:
                finish();
                break;
        }
    }
}
