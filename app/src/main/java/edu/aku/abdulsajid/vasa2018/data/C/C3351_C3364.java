package edu.aku.abdulsajid.vasa2018.data.C;

import edu.aku.abdulsajid.vasa2018.DataTables.C.C3301_C3314;

public class C3351_C3364 {
    public static String TABLE_NAME = "C3351_C3364";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.C.C3351_C3364.C3351 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3351_C3364.C3352 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3351_C3364.C3353 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3351_C3364.C3354 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3351_C3364.C3355 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3351_C3364.C3356 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3351_C3364.C3357 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3351_C3364.C3358 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3351_C3364.C3363 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3351_C3364.C3364 + " TEXT," +
                C3301_C3314.STATUS + " TEXT" +

                ')';

        return query;
    }
}

