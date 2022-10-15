package edu.aku.abdulsajid.vasa2018.data.C;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class C3001_C3011 {

    public static String TABLE_NAME = "C3001_C3011";

    public static String getCreateQuery() {

        String query;

        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3001 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3002 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3003 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3004 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3005u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3005d + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3005w + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3005m + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3006 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3006_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3008 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3008_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3009_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3009_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3009_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3009_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3010 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.C3011 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011.STATUS + " TEXT" +
                ')';

        return query;
    }
}

