package com.sajidlatif.vasa2018.data.RP;

public class w216_w222 {

    public static String TABLE_NAME = "w216_w222";

    public static String getCreateQuery() {

        String query;

        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                com.sajidlatif.vasa2018.Global.RP.w216_w222.W17           + " TEXT," +
                com.sajidlatif.vasa2018.Global.RP.w216_w222.W18           + " TEXT," +
                com.sajidlatif.vasa2018.Global.RP.w216_w222.W19           + " TEXT," +
                com.sajidlatif.vasa2018.Global.RP.w216_w222.W21           + " TEXT," +
                com.sajidlatif.vasa2018.Global.RP.w216_w222.W22           + " TEXT " +
                ')';

        return query;
    }
}
