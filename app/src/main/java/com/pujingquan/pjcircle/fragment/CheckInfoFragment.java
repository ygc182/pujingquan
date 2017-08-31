package com.pujingquan.pjcircle.fragment;


import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;

import com.andview.refreshview.XRefreshView;
import com.pujingquan.pjcircle.R;

import java.util.ArrayList;


/**
 * Description:
 * Created on 2017/8/30
 */

public class CheckInfoFragment extends Fragment {

    public static final String TAG = "ygc";
    XRefreshView xRefreshView;
    RecyclerView recyclerView;
    ArrayAdapter<String> adapter ;
    ArrayList<String> dataList = new ArrayList<>();
    public static long lastRefreshTime;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.check_info_fragment_layout,null);
        xRefreshView = (XRefreshView) view.findViewById(R.id.xRefreshView);
        recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        init();
        return view;
    }

    private void init() {
        initData();
        initListener();
    }

    private void initData() {
        for(int i=0;i<15;i++){
            dataList.add("data ... " + i);
        }
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, dataList);
        // 设置是否可以下拉刷新
        xRefreshView.setPullRefreshEnable(true);
        // 设置是否可以上拉加载
        xRefreshView.setPullLoadEnable(false);
        // 设置上次刷新的时间
        xRefreshView.restoreLastRefreshTime(lastRefreshTime);
        //当下拉刷新被禁用时，调用这个方法并传入false可以不让头部被下拉
        xRefreshView.setMoveHeadWhenDisablePullRefresh(true);
        // 设置时候可以自动刷新
        xRefreshView.setAutoRefresh(false);
    }

    private void initListener() {
        xRefreshView.setXRefreshViewListener(new XRefreshView.SimpleXRefreshListener() {
            @Override
            public void onRefresh(boolean isPullDown) {
                Log.d(TAG, "onRefresh: ");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        dataList.add(0,"data....666");
                        adapter.notifyDataSetChanged();
                        xRefreshView.stopRefresh();
                        lastRefreshTime = xRefreshView.getLastRefreshTime();
                    }
                }, 2000);
            }

            @Override
            public void onLoadMore(boolean isSilence) {
                Log.d(TAG, "onLoadMore: ");
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        xRefreshView.stopLoadMore();
                    }
                }, 2000);
            }

            @Override
            public void onRelease(float direction) {
                super.onRelease(direction);
            }
        });
        xRefreshView.setOnAbsListViewScrollListener(new AbsListView.OnScrollListener() {

            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                Log.d(TAG, "onScrollStateChanged: ");
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem,
                                 int visibleItemCount, int totalItemCount) {
                Log.i(TAG,"onScroll");
            }
        });
    }

}
