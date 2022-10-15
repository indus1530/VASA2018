package edu.aku.abdulsajid.vasa2018.data.N;

public class N2023_N2026 {

    public static String TABLE_NAME = "N2023_N2026";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.N.N2023_N2026.sub_N2023_N2026.STUDYID + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2023_N2026.sub_N2023_N2026.N2023 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2023_N2026.sub_N2023_N2026.N2024 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2023_N2026.sub_N2023_N2026.N2024_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2023_N2026.sub_N2023_N2026.N2025U + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2023_N2026.sub_N2023_N2026.N2025D + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2023_N2026.sub_N2023_N2026.N2026 + " TEXT" +
                ')';

        return query;
    }
}