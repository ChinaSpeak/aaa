package com.example.wee01.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wee01.R;
import com.example.wee01.bean.JavaBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * @Auther: cx
 * @Date:
 * @Description:
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    List<JavaBean.DataBean.DataBeans> list;


    public MyAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=View.inflate(context, R.layout.new_item,null);
        MyViewHolder holder=new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder myViewHolder, int i) {
        JavaBean.DataBean.DataBeans beans = list.get(i);
        myViewHolder.text_view.setText(beans.getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setData(List<JavaBean.DataBean.DataBeans> list) {
        this.list=list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text_view;
        ImageView image_view;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text_view=itemView.findViewById(R.id.image_view);
           image_view= itemView.findViewById(R.id.text_view);
        }
    }
}
