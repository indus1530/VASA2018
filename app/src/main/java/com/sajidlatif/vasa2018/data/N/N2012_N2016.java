package com.sajidlatif.vasa2018.data.N;

public class N2012_N2016 {
    public static String TABLE_NAME = "N2012_N2016";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,   " +

                com.sajidlatif.vasa2018.Global.N.N2012_N2016.sub_N2012_N2016.STUDYID + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2012_N2016.sub_N2012_N2016.N2012 + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2012_N2016.sub_N2012_N2016.N2013 + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2012_N2016.sub_N2012_N2016.N2014 + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2012_N2016.sub_N2012_N2016.N2015 + " TEXT," +
                com.sajidlatif.vasa2018.Global.N.N2012_N2016.sub_N2012_N2016.N2016 + " TEXT" +
                ')';


        return query;
    }
}
