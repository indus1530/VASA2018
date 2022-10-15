package edu.aku.abdulsajid.vasa2018.data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4095_A4108 {
    public static String TABLE_NAME = "A4095_A4108";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4095 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4096 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4097_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4097_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4097_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4098 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4099_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4099_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4099_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4100 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4101_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4101_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4101_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4102 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4103 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4104 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4105 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4106 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4107 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4108 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.STATUS + " TEXT" +

                ')';

        return query;
    }
}