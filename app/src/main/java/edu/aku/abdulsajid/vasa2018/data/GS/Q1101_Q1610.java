package edu.aku.abdulsajid.vasa2018.data.GS;

public class Q1101_Q1610 {

    public static String TABLE_NAME = "Q1101_Q1610";

    public static String getCreateQuery() {

        String query;

        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1201_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1201_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1201_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1201_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1201_5 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1201_6 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1202 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1203 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1204 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1205 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1206_d + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1206_m + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1206_y + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1207 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1208 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1209 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1301 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1302 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1307 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1308 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1309 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1310 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1311 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1312 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1313 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1401 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1402 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1403 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1403_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1404 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1405 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1406 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1407 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1408 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1409 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1410 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1411 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1412 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1413 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_5 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_6 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_7 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_8 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_9 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_10 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1415 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1416 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1416_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1417 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1417_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1418 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1418_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1419 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1419_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1420 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1420_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1421 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1421_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1501 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1502 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1503 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1503_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1601 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1602 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1603 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1604 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1604_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1605 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1606 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1607_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1607_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1607_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1608_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1608_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1608_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1609 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1610_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1610_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1610_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.interviewType + " INTEGER," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.currentSection + " INTEGER," +
                edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.STATUS + " TEXT" +
                ')';

        return query;
    }
}
