package com.example.adapterview;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION=8;

    public DBHelper(Context context) {
        super(context, "datadb", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tableSql = "create table db_data (" +
                "_id integer primary key autoincrement,"+
                "name not null," +
                "content)";

        db.execSQL(tableSql);

        db.execSQL("insert into db_data (name, content) values ('김동연', 'Project 1조')");
        db.execSQL("insert into db_data (name, content) values ('강민승', 'Project 2조')");
        db.execSQL("insert into db_data (name, content) values ('강지형', 'Project 3조')");
        db.execSQL("insert into db_data (name, content) values ('김영', 'Project 4조')");
        db.execSQL("insert into db_data (name, content) values ('박소미', 'Project 5조')");
        db.execSQL("insert into db_data (name, content) values ('송수민', 'Project 1조')");
        db.execSQL("insert into db_data (name, content) values ('안지훈', 'Project 2조')");

        String driverTable = "create table tb_drive (" +
                "_id integer primary key autoincrement,"+
                "title,"+
                "date,"+
                "type)";
        db.execSQL(driverTable);

        db.execSQL("insert into tb_drive (title, date, type) values ('안드로이드', '최종 수정 일자: 2월 1일', 'doc')");
        db.execSQL("insert into tb_drive (title, date, type) values ('db.zip', '최종 수정 일자: 2월 3일', 'file')");
        db.execSQL("insert into tb_drive (title, date, type) values ('하이브리드', '최종 수정 일자: 1월 8일', 'doc')");
        db.execSQL("insert into tb_drive (title, date, type) values ('안드로이드', '최종 수정 일자: 2월 1일', 'doc')");
        db.execSQL("insert into tb_drive (title, date, type) values ('안드로이드', '최종 수정 일자: 2월 1일', 'doc')");
        db.execSQL("insert into tb_drive (title, date, type) values ('안드로이드', '최종 수정 일자: 2월 1일', 'doc')");
        db.execSQL("insert into tb_drive (title, date, type) values ('안드로이드', '최종 수정 일자: 2월 1일', 'doc')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        if(newVersion == DATABASE_VERSION){
            db.execSQL("drop table db_data");
            db.execSQL("drop table tb_drive");
            onCreate(db);
        }
    }
}
