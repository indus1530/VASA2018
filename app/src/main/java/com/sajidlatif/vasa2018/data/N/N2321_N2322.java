package com.sajidlatif.vasa2018.data.N;

public class N2321_N2322 {

    public static String TABLE_NAME = "N2321_N2322";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, " +

                com.sajidlatif.vasa2018.Global.N.N2321_N2322.sub_N2321_N2322.STUDYID + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2321_N2322.sub_N2321_N2322.N2321 + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2321_N2322.sub_N2321_N2322.N2322_1 + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2321_N2322.sub_N2321_N2322.N2322_2 + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2321_N2322.sub_N2321_N2322.N2322_3 + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2321_N2322.sub_N2321_N2322.N2322_4 + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2321_N2322.sub_N2321_N2322.N2322_5 + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2321_N2322.sub_N2321_N2322.N2322_6 + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2321_N2322.sub_N2321_N2322.N2322_DK + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2321_N2322.sub_N2321_N2322.N2323 + " TEXT" +

                ')';

        return query;
    }

    public static String getAlterQuery() {
        String query;
        query = "ALTER TABLE '" + TABLE_NAME + "' ADD COLUMN " +
                com.sajidlatif.vasa2018.Global.N.N2321_N2322.sub_N2321_N2322.N2323 + " TEXT;";

        return query;
    }
}
