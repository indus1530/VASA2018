package com.sajidlatif.vasa2018.data.GS;

public class Q1101_Q1610 {

    public static String TABLE_NAME = "Q1101_Q1610";

    public static String getCreateQuery() {

        String query;

        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1201_1          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1201_2          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1201_3          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1201_4          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1201_5          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1201_6          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1202            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1203            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1204            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1205            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1206_d          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1206_m          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1206_y          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1207            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1208            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1209            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1301            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1302            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1307            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1308            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1309            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1310            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1311            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1312            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1313            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1401            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1402            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1403            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1403_OT         + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1404            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1405            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1406            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1407            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1408            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1409            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1410            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1411            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1412            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1413            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1414_1          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1414_2          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1414_3          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1414_4          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1414_5          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1414_6          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1414_7          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1414_8          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1414_9          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1414_10         + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1415            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1416            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1416_OT         + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1417            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1417_OT         + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1418            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1418_OT         + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1419            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1419_OT         + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1420            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1420_OT         + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1421            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1421_OT         + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1501            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1502            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1503            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1503_OT         + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1601            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1602            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1603            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1604            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1604_OT         + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1605            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1606            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1607_1          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1607_2          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1607_3          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1608_1          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1608_2          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1608_3          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1609            + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1610_1          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1610_2          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.Q1610_3          + " TEXT," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.interviewType    + " INTEGER," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.currentSection   + " INTEGER," +
                com.sajidlatif.vasa2018.Global.GS.Q1101_Q1610.STATUS + " TEXT" +
                ')';

        return query;
    }
}
