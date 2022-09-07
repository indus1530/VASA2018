package com.sajidlatif.vasa2018.data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */
public class A4001_A4014 {
    public static String TABLE_NAME = "A4001_A4014";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4001 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4002 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4003 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4004 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4005 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4006 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4007 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4007_1 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4008 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4009a + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4010 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4011 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4012 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4013u + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4013d + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4013m + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4013y + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.A4014 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4001_A4014.STATUS + " TEXT" +

                ')';


        return query;
    }
}