package edu.aku.abdulsajid.vasa2018.data.C;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class C3012_C3022 {
    public static String TABLE_NAME = "C3012_C3022";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3012 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3013 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3015 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3016 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3017 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3018 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3018_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3019_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3019_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3019_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3019_c + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3020 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3021u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3021d + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3021m + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3021y + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.C3022 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3012_C3022.STATUS + " TEXT" +
                ')';

        return query;
    }
}

