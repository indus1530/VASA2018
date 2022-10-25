package edu.aku.abdulsajid.vasa2018.data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4144_A4156 {
    public static String TABLE_NAME = "A4144_A4156";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4144 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4145 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4146 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4147 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4148 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4148x + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4149 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4150_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4150_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4150_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4151 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4152 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4153 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4154 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4155 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4156 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.STATUS + " TEXT" +

                ')';

        return query;
    }
}