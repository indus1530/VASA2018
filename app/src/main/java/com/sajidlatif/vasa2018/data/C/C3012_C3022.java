package com.sajidlatif.vasa2018.data.C;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class C3012_C3022 {
    public static String TABLE_NAME = "C3012_C3022";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3012 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3013 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3015 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3016 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3017 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3018 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3018_1 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3019_u + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3019_a + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3019_b + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3019_c + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3020 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3021u + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3021d + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3021m + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3021y + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.C3022 + " TEXT," +
                com.sajidlatif.vasa2018.Global.C.C3012_C3022.STATUS + " TEXT" +
                ')';

        return query;
    }
}

