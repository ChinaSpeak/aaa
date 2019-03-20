package com.example.wee01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.widget.Toast;

import com.example.wee01.adapter.MyAdapter;
import com.example.wee01.bean.JavaBean;
import com.example.wee01.bean.MoreItemBean;
import com.example.wee01.module.MainModuleMl;
import com.example.wee01.presenter.MainPresenterMl;
import com.example.wee01.view.MainView;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.recycler)
    XRecyclerView recycler;
    private MainPresenterMl ml;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ml = new MainPresenterMl(new MainModuleMl(),this);

        // 设置布局管理器
        LinearLayoutManager manager=new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(manager);

        //设置允许上拉下拉事件
        recycler.setLoadingMoreEnabled(true);

        //创建适配器
        adapter = new MyAdapter(this);
        //设置适配器
//        recycler.setAdapter(adapter);
        ml.getData();
    }

    @Override
    public void success(String data) {
        Gson gson=new Gson();
        JavaBean bean = gson.fromJson(data, JavaBean.class);
        Toast.makeText(this,bean.toString(),Toast.LENGTH_LONG).show();
//        adapter.setData(list);

    }

    @Override
    public void fail() {

    }
}
