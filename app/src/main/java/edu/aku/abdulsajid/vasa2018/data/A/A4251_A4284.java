package edu.aku.abdulsajid.vasa2018.data.A;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4251_A4284 {
    public static String TABLE_NAME = "A4251_A4284";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4251 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4253 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4253_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4254_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4254_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_4_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_5 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_6 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_7 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_8 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_9 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_10 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_11 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_12 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_13 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_13_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4255_DK + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4256_days + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4256_hours + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4256_minutes + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4257 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4257_name + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4258_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4258_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4259_hours + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4259_minutes + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4260 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4261 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4262 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4262_name + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4263_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4263_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4264 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4266 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4266_name + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4267_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4267_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4268_hours + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4268_minutes + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4269 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4270 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4271 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4271_name + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4272_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4272_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4273 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4274 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4275_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4275_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_5 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_5_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_6 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_7 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_8 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_9 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_10 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_11 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_12 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_13 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_14 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_15 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_16 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_16_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4276_DK + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4277 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4278_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4278_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4278_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4278_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4278_5 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4278_6 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4278_7 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4278_DK + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4279_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4279_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4279_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4279_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4279_5 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4279_6 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4279_7 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4279_DK + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4280 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4281 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4282 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4283 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.A4284 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.A.A4251_A4284.STATUS + " TEXT" +

                ')';

        return query;
    }
}