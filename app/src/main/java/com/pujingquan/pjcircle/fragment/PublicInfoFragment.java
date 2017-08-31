package com.pujingquan.pjcircle.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pujingquan.pjcircle.Constants;
import com.pujingquan.pjcircle.PublishInfoActivity;
import com.pujingquan.pjcircle.R;

/**
 * Description:
 * Created on 2017/8/30
 */

public class PublicInfoFragment extends Fragment implements View.OnClickListener{

    private Button mBtnDriver;
    private Button mBtnPassenger;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.public_info_fragment_layout,null);
        mBtnDriver = (Button) view.findViewById(R.id.btnDriver);
        mBtnPassenger = (Button) view.findViewById(R.id.btnPassenger);
        mBtnDriver.setOnClickListener(this);
        mBtnPassenger.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), PublishInfoActivity.class);
        switch (v.getId()) {
            case R.id.btnDriver:
                intent.putExtra(Constants.PUBLISHER_TYPE, Constants.DRIVER);
                getActivity().startActivity(intent);
                break;

            case R.id.btnPassenger:
                intent.putExtra(Constants.PUBLISHER_TYPE, Constants.PASSENGER);
                getActivity().startActivity(intent);
                break;
        }
    }
}
