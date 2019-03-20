package com.example.wee01.module;

/**
 * @Auther: cx
 * @Date:
 * @Description:
 */
public interface MainModule {

    public interface CallBack{
        void success(String data);

        void fail();
    }

    void doData(CallBack back);

}
