package com.github.wangkangmao;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by wangkangmao on 2016/11/16.
 */

public class CustomFontTextView extends TextView {

    public CustomFontTextView(Context context) {
        super(context);
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public void init1(Context context){
        AssetManager assets = context.getAssets();
        Typeface font = Typeface.createFromAsset(assets, "font/xinkai.ttf");
        setTypeface(font);
    }

    public void init2(Context context){
        AssetManager assets = context.getAssets();
        Typeface font = Typeface.createFromAsset(assets, "font/zhuanti.ttf");
        setTypeface(font);
    }
}
