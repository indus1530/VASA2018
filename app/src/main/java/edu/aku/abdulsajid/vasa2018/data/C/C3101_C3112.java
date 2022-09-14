package edu.aku.abdulsajid.vasa2018.data.C;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class C3101_C3112 {
    public static String TABLE_NAME = "C3101_C3112";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3101 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3102 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3103 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3104 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3105 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3105_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3106 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_5 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_6 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_6_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_7 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_8 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_9 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_10 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_11 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_12 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_13 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_14 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_15 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_16 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_17 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_18 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_19 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_20 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_21 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3107_21_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3108 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_5 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_6 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_7 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_8 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_9 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_10 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_11 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_12 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_13 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3109_14 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3110 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3111 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3111_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3111_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3111_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3111_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3111_5 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3111_6 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3111_7 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3111_8 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3111_9 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.C3112 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.C.C3101_C3112.STATUS + " TEXT" +
                ')';

        return query;
    }
}

