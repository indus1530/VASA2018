package edu.aku.abdulsajid.vasa2018.data.N;

public class N2012_N2016 {
    public static String TABLE_NAME = "N2012_N2016";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.N.N2012_N2016.sub_N2012_N2016.STUDYID + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2012_N2016.sub_N2012_N2016.N2012 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2012_N2016.sub_N2012_N2016.N2013 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2012_N2016.sub_N2012_N2016.N2014 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2012_N2016.sub_N2012_N2016.N2015 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2012_N2016.sub_N2012_N2016.N2016 + " TEXT" +
                ')';


        return query;
    }
}
