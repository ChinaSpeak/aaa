package com.example.wee01.net;

import android.os.Handler;
import android.os.Message;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * @Auther: cx
 * @Date:
 * @Description:
 */
public class OkHttpUtils {

    private HttpListener listener;
    private int HTTP_SUCCESS=1;
    private int HTTP_FAIL=2;

    public OkHttpUtils get(String url){
        doData(0,url,null);
        return this;
    }

    public OkHttpUtils post(String url,FormBody.Builder builderBody){
        doData(1,url,builderBody);
        return this;
    }

    private void doData(int i, String url,FormBody.Builder builderBody) {
        OkHttpClient client=new OkHttpClient();

        Request.Builder builder = new Request.Builder();
        builder.url(url);

        if (i==0){
            builder.get();
        }else {
            RequestBody body=builderBody.build();
            builder.post(body);
        }
        Request request = builder.build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Message message=Message.obtain();
                message.what=HTTP_FAIL;
                handler.sendMessage(message);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Message message=Message.obtain();
                message.obj=response.body().string();
                message.what=HTTP_SUCCESS;
                handler.sendMessage(message);
            }
        });
    }

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==1){
                String data=(String) msg.obj;
                listener.success(data);
            }else {
                listener.fail();
            }
        }
    };

    public interface HttpListener{
        void success(String data);
        void fail();
    }

    public void result(HttpListener listener){
        this.listener=listener;
    }

}
