package com.pujingquan.pjcircle;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.pujingquan.pjcircle.fragment.CheckInfoFragment;
import com.pujingquan.pjcircle.fragment.PublicInfoFragment;

public class HomeActivity extends BaseActivity {

    FrameLayout mContainer;
    RadioGroup mRadioGroup;
    RadioButton mRbPublic;
    RadioButton mRbCheck;
    Fragment mPublicInfoFragment;
    Fragment mCheckInfoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }

    private void init() {
        initView();
        initData();
        initListener();
    }

    private void initView() {
        mContainer = (FrameLayout) findViewById(R.id.fl_container);
        mRadioGroup = (RadioGroup) findViewById(R.id.rg_layout);
        mRbPublic = (RadioButton) findViewById(R.id.rb_publish);
        mRbCheck = (RadioButton) findViewById(R.id.rb_check);
    }

    private void initData() {
        mPublicInfoFragment = new PublicInfoFragment();
        mCheckInfoFragment = new CheckInfoFragment();
    }

    private void initListener() {
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.rb_publish:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,mPublicInfoFragment).commit();
                        break;
                    case R.id.rb_check:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,mCheckInfoFragment).commit();
                        break;
                }
            }
        });

        mRbCheck.setChecked(true);
    }

}
