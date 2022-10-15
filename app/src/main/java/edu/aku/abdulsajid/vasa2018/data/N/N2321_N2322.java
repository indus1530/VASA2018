package edu.aku.abdulsajid.vasa2018.data.N;

public class N2321_N2322 {

    public static String TABLE_NAME = "N2321_N2322";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, " +

                edu.aku.abdulsajid.vasa2018.DataTables.N.N2321_N2322.sub_N2321_N2322.STUDYID + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2321_N2322.sub_N2321_N2322.N2321 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2321_N2322.sub_N2321_N2322.N2322_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2321_N2322.sub_N2321_N2322.N2322_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2321_N2322.sub_N2321_N2322.N2322_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2321_N2322.sub_N2321_N2322.N2322_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2321_N2322.sub_N2321_N2322.N2322_5 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2321_N2322.sub_N2321_N2322.N2322_6 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2321_N2322.sub_N2321_N2322.N2322_DK + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2321_N2322.sub_N2321_N2322.N2323 + " TEXT" +

                ')';

        return query;
    }

    public static String getAlterQuery() {
        String query;
        query = "ALTER TABLE '" + TABLE_NAME + "' ADD COLUMN " +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2321_N2322.sub_N2321_N2322.N2323 + " TEXT;";

        return query;
    }
}
