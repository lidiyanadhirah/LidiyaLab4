package com.example.a455l.lidiyanadhirahlab3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by A455L on 7/10/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContent;

    public Integer[] mThumbIds = {
            R.drawable.pic_1, R.drawable.pic_2,
            R.drawable.pic_3, R.drawable.pic_4,
            R.drawable.pic_5, R.drawable.pic_6,
            R.drawable.pic_7, R.drawable.pic_8,
            R.drawable.pic_9
    };

    public ImageAdapter (Context c){
        mContent = c;

    }

    public int getCount(){
        return mThumbIds.length;
    }

    public Object getItem(int position){
        return mThumbIds[position];
    }

    public long getItemId(int position){
        return 0;
    }

    public View getView(int position, View converView, ViewGroup parent){
        ImageView imageView = new ImageView(mContent);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(150,150));
        return imageView;
    }
}
