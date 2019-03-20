package com.example.wee01.module;

import com.example.wee01.net.OkHttpUtils;

/**
 * @Auther: cx
 * @Date:
 * @Description:
 */
public class MainModuleMl implements MainModule {
    @Override
    public void doData(final CallBack back) {
        new OkHttpUtils().get("https://code.aliyun.com/598254259/FristProject/raw/master/bw_list.txt").result(new OkHttpUtils.HttpListener() {
            @Override
            public void success(String data) {
                back.success(data);
            }

            @Override
            public void fail() {
                back.fail();
            }
        });
    }
}
