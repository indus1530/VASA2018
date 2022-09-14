package edu.aku.abdulsajid.vasa2018.data.N;

public class N2001_N2011 {
    public static String TABLE_NAME = "N2001_N2011";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, " +

                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.STUDYID + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2001 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2002 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2003 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2004 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2005u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2005d + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2005w + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2005m + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2006 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2006x + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2008 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2008x + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2009_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2009_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2009_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2009_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2010 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.Global.N.N2001_N2011.sub_N2001_N2011.N2011 + " TEXT" +
                ')';


        return query;
    }
}
