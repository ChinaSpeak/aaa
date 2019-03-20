package com.example.wee01.presenter;

import com.example.wee01.module.MainModule;
import com.example.wee01.view.MainView;

/**
 * @Auther: cx
 * @Date:
 * @Description:
 */
public class MainPresenterMl implements MainPresenter, MainModule.CallBack {

    private MainModule mainModule;
    private MainView mainView;

    public MainPresenterMl(MainModule mainModule, MainView mainView) {
        this.mainModule = mainModule;
        this.mainView = mainView;
    }

    @Override
    public void getData() {
        mainModule.doData(this);
    }

    @Override
    public void success(String data) {
        mainView.success(data);
    }

    @Override
    public void fail() {
        mainView.fail();
    }
}
