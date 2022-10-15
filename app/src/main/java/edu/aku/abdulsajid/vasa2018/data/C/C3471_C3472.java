package edu.aku.abdulsajid.vasa2018.data.C;

import edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class C3471_C3472 {
    public static String TABLE_NAME = "C3471_C3472";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3471 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3472_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3472_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3472_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3472_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3472_5 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3472_6 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3472_7 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3472_8 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3472_9 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3472_10 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3472_11 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3472_DK + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3471_C3472.C3473 + " TEXT," +
                C3001_C3011.STATUS + " TEXT" +
                ')';

        return query;
    }
}

