package edu.aku.abdulsajid.vasa2018.data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4081_A4094 {
    public static String TABLE_NAME = "A4081_A4094";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4081 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4082_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4082_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4082_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4082_c + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4083 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4084 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4085_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4085_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4085_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4086 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4087_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4087_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4087_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4088 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4089 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4090 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4091 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4092 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4093 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4094_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4094_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4094_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4094_c + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.STATUS + " TEXT" +

                ')';

        return query;
    }
}