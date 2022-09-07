package com.sajidlatif.vasa2018.data.C;

import com.sajidlatif.vasa2018.Global.C.C3301_C3314;

public class C3351_C3364 {
    public static String TABLE_NAME = "C3351_C3364";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                com.sajidlatif.vasa2018.Global.C.C3351_C3364.C3351 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3351_C3364.C3352 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3351_C3364.C3353 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3351_C3364.C3354 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3351_C3364.C3355 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3351_C3364.C3356 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3351_C3364.C3357 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3351_C3364.C3358 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3351_C3364.C3363 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3351_C3364.C3364 + " TEXT," +
                C3301_C3314.STATUS + " TEXT" +

                ')';

        return query;
    }
}

