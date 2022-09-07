package com.sajidlatif.vasa2018.data.N;

public class N2023_N2026 {

    public static String TABLE_NAME = "N2023_N2026";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,   " +

                com.sajidlatif.vasa2018.Global.N.N2023_N2026.sub_N2023_N2026.STUDYID + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2023_N2026.sub_N2023_N2026.N2023   + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2023_N2026.sub_N2023_N2026.N2024   + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2023_N2026.sub_N2023_N2026.N2024_1 + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2023_N2026.sub_N2023_N2026.N2025U  + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2023_N2026.sub_N2023_N2026.N2025D  + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2023_N2026.sub_N2023_N2026.N2026   + " TEXT" +
                ')';

        return query;
    }
}