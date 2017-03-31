package com.example.lijunchao.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lijunchao on 2017/3/30.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    public FruitAdapter(Context context,int textViewResourceID,List<Fruit> objects){

        super(context,textViewResourceID,objects);
        resourceId=textViewResourceID;
    }

//    @Override
//    public View getView(int position, View convertView, ViewGroup parents){
//        Fruit fruit=getItem(position);
//        View view;
//        //vonvertView 用户缓存之前已经加载的布局
//        if(convertView==null){
//            view= LayoutInflater.from(getContext()).inflate(resourceId,null);
//        }else{
//            view=convertView;
//        }
//
//        ImageView fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
//        TextView fruitName=(TextView)view.findViewById(R.id.fruit_name);
//        fruitImage.setImageResource(fruit.getImageId());
//        fruitName.setText(fruit.getName());
//        return  view;

    //新增一个ViewHolder对空间实例进行缓存
    @Override
    public View getView(int position,View convertView,ViewGroup parents){
        Fruit fruit=getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,null);
            viewHolder=new ViewHolder();
            viewHolder.fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
            viewHolder.fruitName=(TextView)view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);//将viewHolder存储在View中
        }else{
            view=convertView;
            viewHolder=(ViewHolder) view.getTag();
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        return view;

    }
    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }
}
