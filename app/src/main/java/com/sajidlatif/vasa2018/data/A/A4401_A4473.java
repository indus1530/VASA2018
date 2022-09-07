package com.sajidlatif.vasa2018.data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4401_A4473 {
    public static String TABLE_NAME = "A4401_A4473";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4401 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4402 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4402_5_OT + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4403_province + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4403_district + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4404_years + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4405_hours + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4405_minutes + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_1 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_2 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_3 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_4 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_5 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_6 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_7 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_8 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_9 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_10 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_11 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_12 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_13 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_13_OT + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4451_code + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4452_1 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4452_2 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4452_3 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4452_4 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4452_5 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4452_6 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4452_7 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4452_8 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4452_9 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4452_9_OT + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4452_code + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_1 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_2 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_3 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_4 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_5 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_6 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_7 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_8 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_9 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_10 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_11 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_12 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_12_OT + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4453_code + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4454 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4455 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4456 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4457 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4471 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_1 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_2 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_3 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_4 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_5 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_6 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_7 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_8 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_9 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_10 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_11 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_12 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4472_DK + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.A4473 + " TEXT," +
                com.sajidlatif.vasa2018.Global.A.A4401_A4473.STATUS + " TEXT" +

                ')';

        return query;
    }
}