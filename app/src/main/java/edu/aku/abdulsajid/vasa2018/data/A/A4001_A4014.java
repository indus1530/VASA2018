package edu.aku.abdulsajid.vasa2018.data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */
public class A4001_A4014 {
    public static String TABLE_NAME = "A4001_A4014";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4001 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4002 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4003 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4004 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4005 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4006 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4007 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4007_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4008 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4009a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4010 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4011 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4012 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4013u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4013d + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4013m + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4013y + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4014 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.STATUS + " TEXT" +

                ')';


        return query;
    }
}