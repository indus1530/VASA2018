package com.sajidlatif.vasa2018.data.N;

public class N2211_N2248_B {

    public static String TABLE_NAME = "N2211_N2248_B";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,  " +

                com.sajidlatif.vasa2018.Global.N.N2211_N2248_B.sub_N2211_N2248_B.STUDYID + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2211_N2248_B.sub_N2211_N2248_B.ACT_ID_FK + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2211_N2248_B.sub_N2211_N2248_B.ACT_COUNT + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2211_N2248_B.sub_N2211_N2248_B.N2213     + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2211_N2248_B.sub_N2211_N2248_B.N2213_2A  + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2211_N2248_B.sub_N2211_N2248_B.N2213_4   + " TEXT" +

                ')';

        return query;
    }
}
