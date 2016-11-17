package com.github.wangkangmao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CustomFontTextView textView1;
    private CustomFontTextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (CustomFontTextView) findViewById(R.id.main_tv1);
        textView2 = (CustomFontTextView) findViewById(R.id.main_tv2);
        init();

    }

    private void init() {
        textView1.init1(this);
        textView2.init2(this);
    }
}
