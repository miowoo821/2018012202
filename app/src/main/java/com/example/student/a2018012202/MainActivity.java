package com.example.student.a2018012202;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDbHelper helper=new MyDbHelper(MainActivity.this);//新增MyDbHelper物件
        SQLiteDatabase db=helper.getWritableDatabase();//以一個可寫入資料庫新增SQLiteDatabase物件

    }

}
