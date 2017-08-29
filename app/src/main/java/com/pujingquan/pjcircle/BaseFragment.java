package com.pujingquan.pjcircle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public abstract class BaseFragment extends Fragment {

    private Context context;
    private View baseView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (baseView == null) {
            baseView = GetOnCreateView(inflater, container, savedInstanceState);
        }
        return baseView;
    }

    public abstract View GetOnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    public View findViewById(int id) {
        return baseView.findViewById(id);
    }

    public void toastL(String text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }

}
