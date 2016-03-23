package com.quizmagic.colortext;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main extends AppCompatActivity {

    //傳令識別碼
    private static final int SELECT_COLOR_REQUEST = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectColor(View view){
        //Intent(傳令的 Activity，接受傳令的 Activity)
        Intent intent = new Intent(this,colorplay.class);
        //startActivity(intent);//傳令
        startActivityForResult(intent, SELECT_COLOR_REQUEST);//傳令需要能返回結果
    }
    //系統(好萊塢)回報有結果
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        //如果回傳的包裹裡的識別碼與我們當初定義的相同，這結果(包裹)就是我們的
        if(requestCode == SELECT_COLOR_REQUEST){

        }
    }
}
