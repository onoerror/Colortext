package com.quizmagic.colortext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class colorplay extends AppCompatActivity {

    //key 值得最佳實踐方式，以App的package 作為前綴詞
    public static final String BUNDLE_KEY_COLOR_INT = "com.schemas.android.colorInt";
    public static final String BUNDLE_KEY_COLOR_NAME = "com.schemas.android.colorName";
    private int mColorInt;
    private CharSequence mColorName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorplay);
        initColorData();
    }

    private void initColorData() {
        //預設選取紅色
        RadioButton radio = (RadioButton)findViewById(R.id.radio_holo_red_light);
        mColorInt = radio.getCurrentHintTextColor();
        mColorName = radio.getText();
    }

    public void clickColor(View view){
        RadioButton radio = (RadioButton)view;
        mColorInt = radio.getCurrentHintTextColor();
        mColorName = radio.getText();
    }

    public void ok(View view){
        //建立意圖
        Intent intent = new Intent();
        //設定包裹
        intent.putExtra(BUNDLE_KEY_COLOR_INT,mColorInt);
        intent.putExtra(BUNDLE_KEY_COLOR_INT,mColorName);
        setResult(RESULT_OK,intent);//設定結果OK了，傳送意圖
        finish();//目前Activity結果
    }
}
