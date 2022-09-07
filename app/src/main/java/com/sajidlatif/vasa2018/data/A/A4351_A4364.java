package com.sajidlatif.vasa2018.data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4351_A4364 {
    public static String TABLE_NAME = "A4351_A4364";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                com.sajidlatif.vasa2018.Global.A.A4351_A4364.A4351 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4351_A4364.A4352 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4351_A4364.A4353 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4351_A4364.A4354 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4351_A4364.A4355 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4351_A4364.A4356 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4351_A4364.A4357 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4351_A4364.A4358 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4351_A4364.A4363 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4351_A4364.A4364 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4351_A4364.STATUS + " TEXT" +

                ')';

        return query;
    }
}