package edu.aku.abdulsajid.vasa2018.data.C;

import edu.aku.abdulsajid.vasa2018.DataTables.C.C3101_C3112;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class C3121_C3228 {
    public static String TABLE_NAME = "C3121_C3228";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3121 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3122d + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3122m + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3122y + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3123_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3123_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3123_c + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3124 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3125 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3126 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3127 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3128 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3129 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3130 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3131 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3132_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3132_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3132_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3133 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3134 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3135 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3136 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3137 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3138 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3139 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3140 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3141 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3142 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3143 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3144_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3144 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3144_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3144_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3145 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3146 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3147_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3147_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3147_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3148 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3149 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3150_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3150_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3150_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3151 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3152_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3152_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3152_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3153 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3154 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3155 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3156 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3157 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3158 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3159_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3159_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3159_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3159_c + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3160 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3161 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3162d + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3162m + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3163_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3163_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3163_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3164 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3165_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3165_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3165_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3166 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3167 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3168 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3169 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3170 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3171 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3172 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3173 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3174 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3175_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3175_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3175_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3176 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3177_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3177_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3177_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3178 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3179_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3179_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3179_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3180 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3181 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3182 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3183 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3184 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3185 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3186_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3186 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3187 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3188 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3189 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3190 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3191 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3192 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3193_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3193_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3193_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3194 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3195A + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3195 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3196 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3197 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3198 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3199 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3199_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3200 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3201_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3201_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3201_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3202 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3203 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3204_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3204_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3204_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3205 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3206 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3207 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3208_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3208_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3208_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3209 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3210 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3212 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3213 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3214 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3215 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3216 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3217 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3218 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3218_OT + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3219 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3220_u + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3220_a + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3220_b + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3221 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3222 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3223 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3224 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3225 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3226 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_1 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_2 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_3 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_4 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_5 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_6 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_7 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_8 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_9 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_10 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_11 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_12 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_13 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_14 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_15 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_16 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_17 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_18 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_19 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_20 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_21 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3227_22 + " TEXT," +
                edu.aku.abdulsajid.vasa2018.DataTables.C.C3121_C3228.C3228 + " TEXT," +
                C3101_C3112.STATUS + " TEXT" +
                ')';

        return query;
    }

    /*public static String getAlterQuery() {
        String query;
        query = "ALTER TABLE '" + TABLE_NAME + "' ADD COLUMN " +
                Global.C.C3121_C3228.C3122y + " TEXT;";

        return query;
    }*/
}

