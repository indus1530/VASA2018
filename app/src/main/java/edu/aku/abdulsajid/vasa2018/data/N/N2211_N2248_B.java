package edu.aku.abdulsajid.vasa2018.data.N;

public class N2211_N2248_B {

    public static String TABLE_NAME = "N2211_N2248_B";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,  " +

                edu.aku.abdulsajid.vasa2018.DataTables.N.N2211_N2248_B.sub_N2211_N2248_B.STUDYID + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2211_N2248_B.sub_N2211_N2248_B.ACT_ID_FK + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2211_N2248_B.sub_N2211_N2248_B.ACT_COUNT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2211_N2248_B.sub_N2211_N2248_B.N2213 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2211_N2248_B.sub_N2211_N2248_B.N2213_2A + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.N.N2211_N2248_B.sub_N2211_N2248_B.N2213_4 + " TEXT" +

                ')';

        return query;
    }
}
