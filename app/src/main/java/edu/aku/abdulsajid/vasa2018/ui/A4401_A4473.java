package edu.aku.abdulsajid.vasa2018.ui;

import static edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol.ClearAll;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;
import edu.aku.abdulsajid.vasa2018.utils.Gothrough;

public class A4401_A4473 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    private static final int CONTENT_REQUEST = 1337;

    //  Region_Declaration

    Button
            btn_next14,
            btn_imgCapture;

    LinearLayout
            ll_study_id,
            ll_A4401,
            ll_A4402,
            ll_A4403,
            ll_A4404,
            ll_A4405,
            ll_A4451_1,
            ll_A4451_2,
            ll_A4451_3,
            ll_A4451_4,
            ll_A4451_5,
            ll_A4451_6,
            ll_A4451_7,
            ll_A4451_8,
            ll_A4451_9,
            ll_A4451_10,
            ll_A4451_11,
            ll_A4451_12,
            ll_A4451_13,
            ll_A4452_1,
            ll_A4452_2,
            ll_A4452_3,
            ll_A4452_4,
            ll_A4452_5,
            ll_A4452_6,
            ll_A4452_7,
            ll_A4452_8,
            ll_A4452_9,
            ll_A4453_1,
            ll_A4453_2,
            ll_A4453_3,
            ll_A4453_4,
            ll_A4453_5,
            ll_A4453_6,
            ll_A4453_7,
            ll_A4453_8,
            ll_A4453_9,
            ll_A4453_10,
            ll_A4453_11,
            ll_A4453_12,
            ll_A4454,
            ll_A4455,
            ll_A4456,
            ll_A4457,
            ll_A4471,
            ll_A4472,
            ll_A4473;

    RadioButton
            rb_A4401_1,
            rb_A4401_2,
            rb_A4401_DK,
            rb_A4402_1,
            rb_A4402_2,
            rb_A4402_3,
            rb_A4402_4,
            rb_A4402_5,
            rb_A4402_DK,
            rb_A4451_1_1,
            rb_A4451_1_2,
            rb_A4451_1_DK,
            rb_A4451_2_1,
            rb_A4451_2_2,
            rb_A4451_2_DK,
            rb_A4451_3_1,
            rb_A4451_3_2,
            rb_A4451_3_DK,
            rb_A4451_4_1,
            rb_A4451_4_2,
            rb_A4451_4_DK,
            rb_A4451_5_1,
            rb_A4451_5_2,
            rb_A4451_5_DK,
            rb_A4451_6_1,
            rb_A4451_6_2,
            rb_A4451_6_DK,
            rb_A4451_7_1,
            rb_A4451_7_2,
            rb_A4451_7_DK,
            rb_A4451_8_1,
            rb_A4451_8_2,
            rb_A4451_8_DK,
            rb_A4451_9_1,
            rb_A4451_9_2,
            rb_A4451_9_DK,
            rb_A4451_10_1,
            rb_A4451_10_2,
            rb_A4451_10_DK,
            rb_A4451_11_1,
            rb_A4451_11_2,
            rb_A4451_11_DK,

            rb_A4451_12_1,
            rb_A4451_12_2,
            rb_A4451_12_DK,

            rb_A4451_13_1,
            rb_A4451_13_2,
            rb_A4451_13_DK,

            rb_A4452_1_1,
            rb_A4452_1_2,
            rb_A4452_1_DK,

            rb_A4452_2_1,
            rb_A4452_2_2,
            rb_A4452_2_DK,

            rb_A4452_3_1,
            rb_A4452_3_2,
            rb_A4452_3_DK,

    rb_A4452_4_1,
            rb_A4452_4_2,
            rb_A4452_4_DK,

    rb_A4452_5_1,
            rb_A4452_5_2,
            rb_A4452_5_DK,

    rb_A4452_6_1,
            rb_A4452_6_2,
            rb_A4452_6_DK,

    rb_A4452_7_1,
            rb_A4452_7_2,
            rb_A4452_7_DK,

    rb_A4452_8_1,
            rb_A4452_8_2,
            rb_A4452_8_DK,

    rb_A4452_9_1,
            rb_A4452_9_2,
            rb_A4452_9_DK,

    rb_A4453_1_1,
            rb_A4453_1_2,
            rb_A4453_1_DK,

    rb_A4453_2_1,
            rb_A4453_2_2,
            rb_A4453_2_DK,

    rb_A4453_3_1,
            rb_A4453_3_2,
            rb_A4453_3_DK,

    rb_A4453_4_1,
            rb_A4453_4_2,
            rb_A4453_4_DK,

    rb_A4453_5_1,
            rb_A4453_5_2,
            rb_A4453_5_DK,

    rb_A4453_6_1,
            rb_A4453_6_2,
            rb_A4453_6_DK,

    rb_A4453_7_1,
            rb_A4453_7_2,
            rb_A4453_7_DK,

    rb_A4453_8_1,
            rb_A4453_8_2,
            rb_A4453_8_DK,

    rb_A4453_9_1,
            rb_A4453_9_2,
            rb_A4453_9_DK,

    rb_A4453_10_1,
            rb_A4453_10_2,
            rb_A4453_10_DK,

    rb_A4453_11_1,
            rb_A4453_11_2,
            rb_A4453_11_DK,

    rb_A4453_12_1,
            rb_A4453_12_2,
            rb_A4453_12_DK,

    rb_A4454_1,
            rb_A4454_2,
            rb_A4454_DK,
            rb_A4454_RA,

    rb_A4455_1,
            rb_A4455_2,
            rb_A4455_DK,
            rb_A4455_RA,

    rb_A4456_1,
            rb_A4456_2,
            rb_A4456_DK,
            rb_A4456_RA,

    rb_A4457_1,
            rb_A4457_2,
            rb_A4457_DK,
            rb_A4457_RA;

    EditText
            ed_study_id,
            ed_A4402_5,
            ed_A4403_province,
            ed_A4403_district,
            ed_A4404_years,
            ed_A4405_hours,
            ed_A4405_minutes,
            ed_A4451_13,
            ed_A4452_9,
            ed_A4453_12,
            ed_A4471,
            ed_A4473;


    CheckBox
            cb_A4472_1,
            cb_A4472_2,
            cb_A4472_3,
            cb_A4472_4,
            cb_A4472_5,
            cb_A4472_6,
            cb_A4472_7,
            cb_A4472_8,
            cb_A4472_9,
            cb_A4472_10,
            cb_A4472_11,
            cb_A4472_12,
            cb_A4472_DK;

    String
            study_id,
            A4401,
            A4402,
            A4403,
            A4402_5_OT,
            A4403_province,
            A4403_district,
            A4404_years,
            A4405_hours,
            A4405_minutes,
            A4451_1,
            A4451_2,
            A4451_3,
            A4451_4,
            A4451_5,
            A4451_6,
            A4451_7,
            A4451_8,
            A4451_9,
            A4451_10,
            A4451_11,
            A4451_12,
            A4451_13,
            A4451_13_OT,
            A4451_code,
            A4452_1,
            A4452_2,
            A4452_3,
            A4452_4,
            A4452_5,
            A4452_6,
            A4452_7,
            A4452_8,
            A4452_9,
            A4452_9_OT,
            A4452_code,
            A4453_1,
            A4453_2,
            A4453_3,
            A4453_4,
            A4453_5,
            A4453_6,
            A4453_7,
            A4453_8,
            A4453_9,
            A4453_10,
            A4453_11,
            A4453_12,
            A4453_12_OT,
            A4453_code,
            A4454,
            A4455,
            A4456,
            A4457,
            A4471,
            A4472_1,
            A4472_2,
            A4472_3,
            A4472_4,
            A4472_5,
            A4472_6,
            A4472_7,
            A4472_8,
            A4472_9,
            A4472_10,
            A4472_11,
            A4472_12,
            A4472_DK,
            A4473,
            STATUS;

    int currentSection;

    TextView
            txt_cap_count;

    int count = 1;

    private File output = null;

    // End Region_Declaration


    void Initialization() {

        btn_next14 = findViewById(R.id.btn_next14);
        btn_imgCapture = findViewById(R.id.btn_imgCapture);
        txt_cap_count = findViewById(R.id.txt_cap_count);

        ll_A4401 = findViewById(R.id.ll_A4401);
        ll_A4402 = findViewById(R.id.ll_A4402);
        ll_A4403 = findViewById(R.id.ll_A4403);
        ll_A4404 = findViewById(R.id.ll_A4404);
        ll_A4405 = findViewById(R.id.ll_A4405);
        ll_A4451_1 = findViewById(R.id.ll_A4451_1);
        ll_A4451_2 = findViewById(R.id.ll_A4451_2);
        ll_A4451_3 = findViewById(R.id.ll_A4451_3);
        ll_A4451_4 = findViewById(R.id.ll_A4451_4);
        ll_A4451_5 = findViewById(R.id.ll_A4451_5);
        ll_A4451_6 = findViewById(R.id.ll_A4451_6);
        ll_A4451_7 = findViewById(R.id.ll_A4451_7);
        ll_A4451_8 = findViewById(R.id.ll_A4451_8);
        ll_A4451_9 = findViewById(R.id.ll_A4451_9);
        ll_A4451_10 = findViewById(R.id.ll_A4451_10);
        ll_A4451_11 = findViewById(R.id.ll_A4451_11);
        ll_A4451_12 = findViewById(R.id.ll_A4451_12);
        ll_A4451_13 = findViewById(R.id.ll_A4451_13);
        ll_A4452_1 = findViewById(R.id.ll_A4452_1);
        ll_A4452_2 = findViewById(R.id.ll_A4452_2);
        ll_A4452_3 = findViewById(R.id.ll_A4452_3);
        ll_A4452_4 = findViewById(R.id.ll_A4452_4);
        ll_A4452_5 = findViewById(R.id.ll_A4452_5);
        ll_A4452_6 = findViewById(R.id.ll_A4452_6);
        ll_A4452_7 = findViewById(R.id.ll_A4452_7);
        ll_A4452_8 = findViewById(R.id.ll_A4452_8);
        ll_A4452_9 = findViewById(R.id.ll_A4452_9);
        ll_A4453_1 = findViewById(R.id.ll_A4453_1);
        ll_A4453_2 = findViewById(R.id.ll_A4453_2);
        ll_A4453_3 = findViewById(R.id.ll_A4453_3);
        ll_A4453_4 = findViewById(R.id.ll_A4453_4);
        ll_A4453_5 = findViewById(R.id.ll_A4453_5);
        ll_A4453_6 = findViewById(R.id.ll_A4453_6);
        ll_A4453_7 = findViewById(R.id.ll_A4453_7);
        ll_A4453_8 = findViewById(R.id.ll_A4453_8);
        ll_A4453_9 = findViewById(R.id.ll_A4453_9);
        ll_A4453_10 = findViewById(R.id.ll_A4453_10);
        ll_A4453_11 = findViewById(R.id.ll_A4453_11);
        ll_A4453_12 = findViewById(R.id.ll_A4453_12);
        ll_A4454 = findViewById(R.id.ll_A4454);
        ll_A4455 = findViewById(R.id.ll_A4455);
        ll_A4456 = findViewById(R.id.ll_A4456);
        ll_A4457 = findViewById(R.id.ll_A4457);
        ll_A4471 = findViewById(R.id.ll_A4471);
        ll_A4472 = findViewById(R.id.ll_A4472);
        ll_A4473 = findViewById(R.id.ll_A4473);

        rb_A4401_1 = findViewById(R.id.rb_A4401_1);
        rb_A4401_2 = findViewById(R.id.rb_A4401_2);
        rb_A4401_DK = findViewById(R.id.rb_A4401_DK);

        rb_A4402_1 = findViewById(R.id.rb_A4402_1);
        rb_A4402_2 = findViewById(R.id.rb_A4402_2);
        rb_A4402_3 = findViewById(R.id.rb_A4402_3);
        rb_A4402_4 = findViewById(R.id.rb_A4402_4);
        rb_A4402_5 = findViewById(R.id.rb_A4402_5);
        rb_A4402_DK = findViewById(R.id.rb_A4402_DK);

        rb_A4451_1_1 = findViewById(R.id.rb_A4451_1_1);
        rb_A4451_1_2 = findViewById(R.id.rb_A4451_1_2);
        rb_A4451_1_DK = findViewById(R.id.rb_A4451_1_DK);

        rb_A4451_2_1 = findViewById(R.id.rb_A4451_2_1);
        rb_A4451_2_2 = findViewById(R.id.rb_A4451_2_2);
        rb_A4451_2_DK = findViewById(R.id.rb_A4451_2_DK);

        rb_A4451_3_1 = findViewById(R.id.rb_A4451_3_1);
        rb_A4451_3_2 = findViewById(R.id.rb_A4451_3_2);
        rb_A4451_3_DK = findViewById(R.id.rb_A4451_3_DK);

        rb_A4451_4_1 = findViewById(R.id.rb_A4451_4_1);
        rb_A4451_4_2 = findViewById(R.id.rb_A4451_4_2);
        rb_A4451_4_DK = findViewById(R.id.rb_A4451_4_DK);

        rb_A4451_5_1 = findViewById(R.id.rb_A4451_5_1);
        rb_A4451_5_2 = findViewById(R.id.rb_A4451_5_2);
        rb_A4451_5_DK = findViewById(R.id.rb_A4451_5_DK);

        rb_A4451_6_1 = findViewById(R.id.rb_A4451_6_1);
        rb_A4451_6_2 = findViewById(R.id.rb_A4451_6_2);
        rb_A4451_6_DK = findViewById(R.id.rb_A4451_6_DK);

        rb_A4451_7_1 = findViewById(R.id.rb_A4451_7_1);
        rb_A4451_7_2 = findViewById(R.id.rb_A4451_7_2);
        rb_A4451_7_DK = findViewById(R.id.rb_A4451_7_DK);

        rb_A4451_8_1 = findViewById(R.id.rb_A4451_8_1);
        rb_A4451_8_2 = findViewById(R.id.rb_A4451_8_2);
        rb_A4451_8_DK = findViewById(R.id.rb_A4451_8_DK);

        rb_A4451_9_1 = findViewById(R.id.rb_A4451_9_1);
        rb_A4451_9_2 = findViewById(R.id.rb_A4451_9_2);
        rb_A4451_9_DK = findViewById(R.id.rb_A4451_9_DK);

        rb_A4451_10_1 = findViewById(R.id.rb_A4451_10_1);
        rb_A4451_10_2 = findViewById(R.id.rb_A4451_10_2);
        rb_A4451_10_DK = findViewById(R.id.rb_A4451_10_DK);

        rb_A4451_11_1 = findViewById(R.id.rb_A4451_11_1);
        rb_A4451_11_2 = findViewById(R.id.rb_A4451_11_2);
        rb_A4451_11_DK = findViewById(R.id.rb_A4451_11_DK);

        rb_A4451_12_1 = findViewById(R.id.rb_A4451_12_1);
        rb_A4451_12_2 = findViewById(R.id.rb_A4451_12_2);
        rb_A4451_12_DK = findViewById(R.id.rb_A4451_12_DK);

        rb_A4451_13_1 = findViewById(R.id.rb_A4451_13_1);
        rb_A4451_13_2 = findViewById(R.id.rb_A4451_13_2);
        rb_A4451_13_DK = findViewById(R.id.rb_A4451_13_DK);

        rb_A4452_1_1 = findViewById(R.id.rb_A4452_1_1);
        rb_A4452_1_2 = findViewById(R.id.rb_A4452_1_2);
        rb_A4452_1_DK = findViewById(R.id.rb_A4452_1_DK);

        rb_A4452_2_1 = findViewById(R.id.rb_A4452_2_1);
        rb_A4452_2_2 = findViewById(R.id.rb_A4452_2_2);
        rb_A4452_2_DK = findViewById(R.id.rb_A4452_2_DK);

        rb_A4452_3_1 = findViewById(R.id.rb_A4452_3_1);
        rb_A4452_3_2 = findViewById(R.id.rb_A4452_3_2);
        rb_A4452_3_DK = findViewById(R.id.rb_A4452_3_DK);

        rb_A4452_4_1 = findViewById(R.id.rb_A4452_4_1);
        rb_A4452_4_2 = findViewById(R.id.rb_A4452_4_2);
        rb_A4452_4_DK = findViewById(R.id.rb_A4452_4_DK);

        rb_A4452_5_1 = findViewById(R.id.rb_A4452_5_1);
        rb_A4452_5_2 = findViewById(R.id.rb_A4452_5_2);
        rb_A4452_5_DK = findViewById(R.id.rb_A4452_5_DK);

        rb_A4452_6_1 = findViewById(R.id.rb_A4452_6_1);
        rb_A4452_6_2 = findViewById(R.id.rb_A4452_6_2);
        rb_A4452_6_DK = findViewById(R.id.rb_A4452_6_DK);

        rb_A4452_7_1 = findViewById(R.id.rb_A4452_7_1);
        rb_A4452_7_2 = findViewById(R.id.rb_A4452_7_2);
        rb_A4452_7_DK = findViewById(R.id.rb_A4452_7_DK);

        rb_A4452_8_1 = findViewById(R.id.rb_A4452_8_1);
        rb_A4452_8_2 = findViewById(R.id.rb_A4452_8_2);
        rb_A4452_8_DK = findViewById(R.id.rb_A4452_8_DK);

        rb_A4452_9_1 = findViewById(R.id.rb_A4452_9_1);
        rb_A4452_9_2 = findViewById(R.id.rb_A4452_9_2);
        rb_A4452_9_DK = findViewById(R.id.rb_A4452_9_DK);

        rb_A4453_1_1 = findViewById(R.id.rb_A4453_1_1);
        rb_A4453_1_2 = findViewById(R.id.rb_A4453_1_2);
        rb_A4453_1_DK = findViewById(R.id.rb_A4453_1_DK);

        rb_A4453_2_1 = findViewById(R.id.rb_A4453_2_1);
        rb_A4453_2_2 = findViewById(R.id.rb_A4453_2_2);
        rb_A4453_2_DK = findViewById(R.id.rb_A4453_2_DK);

        rb_A4453_3_1 = findViewById(R.id.rb_A4453_3_1);
        rb_A4453_3_2 = findViewById(R.id.rb_A4453_3_2);
        rb_A4453_3_DK = findViewById(R.id.rb_A4453_3_DK);

        rb_A4453_4_1 = findViewById(R.id.rb_A4453_4_1);
        rb_A4453_4_2 = findViewById(R.id.rb_A4453_4_2);
        rb_A4453_4_DK = findViewById(R.id.rb_A4453_4_DK);

        rb_A4453_5_1 = findViewById(R.id.rb_A4453_5_1);
        rb_A4453_5_2 = findViewById(R.id.rb_A4453_5_2);
        rb_A4453_5_DK = findViewById(R.id.rb_A4453_5_DK);

        rb_A4453_6_1 = findViewById(R.id.rb_A4453_6_1);
        rb_A4453_6_2 = findViewById(R.id.rb_A4453_6_2);
        rb_A4453_6_DK = findViewById(R.id.rb_A4453_6_DK);

        rb_A4453_7_1 = findViewById(R.id.rb_A4453_7_1);
        rb_A4453_7_2 = findViewById(R.id.rb_A4453_7_2);
        rb_A4453_7_DK = findViewById(R.id.rb_A4453_7_DK);

        rb_A4453_8_1 = findViewById(R.id.rb_A4453_8_1);
        rb_A4453_8_2 = findViewById(R.id.rb_A4453_8_2);
        rb_A4453_8_DK = findViewById(R.id.rb_A4453_8_DK);

        rb_A4453_9_1 = findViewById(R.id.rb_A4453_9_1);
        rb_A4453_9_2 = findViewById(R.id.rb_A4453_9_2);
        rb_A4453_9_DK = findViewById(R.id.rb_A4453_9_DK);

        rb_A4453_10_1 = findViewById(R.id.rb_A4453_10_1);
        rb_A4453_10_2 = findViewById(R.id.rb_A4453_10_2);
        rb_A4453_10_DK = findViewById(R.id.rb_A4453_10_DK);

        rb_A4453_11_1 = findViewById(R.id.rb_A4453_11_1);
        rb_A4453_11_2 = findViewById(R.id.rb_A4453_11_2);
        rb_A4453_11_DK = findViewById(R.id.rb_A4453_11_DK);

        rb_A4453_12_1 = findViewById(R.id.rb_A4453_12_1);
        rb_A4453_12_2 = findViewById(R.id.rb_A4453_12_2);
        rb_A4453_12_DK = findViewById(R.id.rb_A4453_12_DK);

        rb_A4454_1 = findViewById(R.id.rb_A4454_1);
        rb_A4454_2 = findViewById(R.id.rb_A4454_2);
        rb_A4454_DK = findViewById(R.id.rb_A4454_DK);
        rb_A4454_RA = findViewById(R.id.rb_A4454_RA);

        rb_A4455_1 = findViewById(R.id.rb_A4455_1);
        rb_A4455_2 = findViewById(R.id.rb_A4455_2);
        rb_A4455_DK = findViewById(R.id.rb_A4455_DK);
        rb_A4455_RA = findViewById(R.id.rb_A4455_RA);

        rb_A4456_1 = findViewById(R.id.rb_A4456_1);
        rb_A4456_2 = findViewById(R.id.rb_A4456_2);
        rb_A4456_DK = findViewById(R.id.rb_A4456_DK);
        rb_A4456_RA = findViewById(R.id.rb_A4456_RA);

        rb_A4457_1 = findViewById(R.id.rb_A4457_1);
        rb_A4457_2 = findViewById(R.id.rb_A4457_2);
        rb_A4457_DK = findViewById(R.id.rb_A4457_DK);
        rb_A4457_RA = findViewById(R.id.rb_A4457_RA);

        ed_A4402_5 = findViewById(R.id.ed_A4402_5);
        ed_A4403_province = findViewById(R.id.ed_A4403_province);
        ed_A4403_district = findViewById(R.id.ed_A4403_district);
        ed_A4404_years = findViewById(R.id.ed_A4404_years);
        ed_A4405_hours = findViewById(R.id.ed_A4405_hours);
        ed_A4405_minutes = findViewById(R.id.ed_A4405_minutes);
        ed_A4451_13 = findViewById(R.id.ed_A4451_13);
        ed_A4452_9 = findViewById(R.id.ed_A4452_9);
        ed_A4453_12 = findViewById(R.id.ed_A4453_12);
        ed_A4471 = findViewById(R.id.ed_A4471);
        ed_A4473 = findViewById(R.id.ed_A4473);

        cb_A4472_1 = findViewById(R.id.cb_A4472_1);
        cb_A4472_2 = findViewById(R.id.cb_A4472_2);
        cb_A4472_3 = findViewById(R.id.cb_A4472_3);
        cb_A4472_4 = findViewById(R.id.cb_A4472_4);
        cb_A4472_5 = findViewById(R.id.cb_A4472_5);
        cb_A4472_6 = findViewById(R.id.cb_A4472_6);
        cb_A4472_7 = findViewById(R.id.cb_A4472_7);
        cb_A4472_8 = findViewById(R.id.cb_A4472_8);
        cb_A4472_9 = findViewById(R.id.cb_A4472_9);
        cb_A4472_10 = findViewById(R.id.cb_A4472_10);
        cb_A4472_11 = findViewById(R.id.cb_A4472_11);
        cb_A4472_12 = findViewById(R.id.cb_A4472_12);
        cb_A4472_DK = findViewById(R.id.cb_A4472_DK);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4401_a4473);

        this.setTitle(getString(R.string.h_a_sec_13));

        ll_study_id = findViewById(R.id.ll_study_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();
        events_call();

        btn_next14.setEnabled(false);
        btn_imgCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String RootDir = Environment.getExternalStorageDirectory()
                        + File.separator + "VASA";
                File RootFile = new File(RootDir);
                boolean success = true;
                if (!RootFile.exists()) {
                    success = RootFile.mkdir();
                }
                if (success) {
                    RootDir = RootDir + File.separator + ed_study_id.getText().toString();
                    RootFile = new File(RootDir);
                    success = true;
                    if (!RootFile.exists()) {
                        success = RootFile.mkdir();
                    }

                    if (success) {
                        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        output = new File(RootDir, "A4471_" + count + ".jpeg");

                        i.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(output));
                        startActivityForResult(i, CONTENT_REQUEST);
                    } else {
                        Toast.makeText(getApplicationContext(), "Can't create folder!!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Can't create folder!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CONTENT_REQUEST) {
            if (resultCode == RESULT_OK) {

                txt_cap_count.setText("Pictures Attached: " + count);

                Toast.makeText(this, "Image capture done!!", Toast.LENGTH_SHORT).show();
                btn_next14.setEnabled(true);

                count++;
            }
        }
    }

    @Override
    public void onClick(View view) {
        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        Intent c = new Intent(A4401_A4473.this, InterviewEnd.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_A4401_1
                || compoundButton.getId() == R.id.rb_A4401_2
                || compoundButton.getId() == R.id.rb_A4401_DK) {

            if (rb_A4401_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4402);
                ClearAllcontrol.ClearAll(ll_A4403);
                ll_A4402.setVisibility(View.GONE);
                ll_A4403.setVisibility(View.GONE);
            }
            else if (rb_A4401_DK.isChecked()) {
                ClearAll(ll_A4402);
                ClearAll(ll_A4403);
                ClearAll(ll_A4404);
                ClearAll(ll_A4405);
                ClearAll(ll_A4451_1);
                ClearAll(ll_A4451_2);
                ClearAll(ll_A4451_3);
                ClearAll(ll_A4451_4);
                ClearAll(ll_A4451_5);
                ClearAll(ll_A4451_6);
                ClearAll(ll_A4451_7);
                ClearAll(ll_A4451_8);
                ClearAll(ll_A4451_9);
                ClearAll(ll_A4451_10);
                ClearAll(ll_A4451_11);
                ClearAll(ll_A4451_12);
                ClearAll(ll_A4451_13);
                ClearAll(ll_A4452_1);
                ClearAll(ll_A4452_2);
                ClearAll(ll_A4452_3);
                ClearAll(ll_A4452_4);
                ClearAll(ll_A4452_5);
                ClearAll(ll_A4452_6);
                ClearAll(ll_A4452_7);
                ClearAll(ll_A4452_8);
                ClearAll(ll_A4452_9);
                ClearAll(ll_A4453_1);
                ClearAll(ll_A4453_2);
                ClearAll(ll_A4453_3);
                ClearAll(ll_A4453_4);
                ClearAll(ll_A4453_5);
                ClearAll(ll_A4453_6);
                ClearAll(ll_A4453_7);
                ClearAll(ll_A4453_8);
                ClearAll(ll_A4453_9);
                ClearAll(ll_A4453_10);
                ClearAll(ll_A4453_11);
                ClearAll(ll_A4453_12);

                ll_A4402.setVisibility(View.GONE);
                ll_A4403.setVisibility(View.GONE);
                ll_A4404.setVisibility(View.GONE);
                ll_A4405.setVisibility(View.GONE);
                ll_A4451_1.setVisibility(View.GONE);
                ll_A4451_2.setVisibility(View.GONE);
                ll_A4451_3.setVisibility(View.GONE);
                ll_A4451_4.setVisibility(View.GONE);
                ll_A4451_5.setVisibility(View.GONE);
                ll_A4451_6.setVisibility(View.GONE);
                ll_A4451_7.setVisibility(View.GONE);
                ll_A4451_8.setVisibility(View.GONE);
                ll_A4451_9.setVisibility(View.GONE);
                ll_A4451_10.setVisibility(View.GONE);
                ll_A4451_11.setVisibility(View.GONE);
                ll_A4451_12.setVisibility(View.GONE);
                ll_A4451_13.setVisibility(View.GONE);
                ll_A4452_1.setVisibility(View.GONE);
                ll_A4452_2.setVisibility(View.GONE);
                ll_A4452_3.setVisibility(View.GONE);
                ll_A4452_4.setVisibility(View.GONE);
                ll_A4452_5.setVisibility(View.GONE);
                ll_A4452_6.setVisibility(View.GONE);
                ll_A4452_7.setVisibility(View.GONE);
                ll_A4452_8.setVisibility(View.GONE);
                ll_A4452_9.setVisibility(View.GONE);
                ll_A4453_1.setVisibility(View.GONE);
                ll_A4453_2.setVisibility(View.GONE);
                ll_A4453_3.setVisibility(View.GONE);
                ll_A4453_4.setVisibility(View.GONE);
                ll_A4453_5.setVisibility(View.GONE);
                ll_A4453_6.setVisibility(View.GONE);
                ll_A4453_7.setVisibility(View.GONE);
                ll_A4453_8.setVisibility(View.GONE);
                ll_A4453_9.setVisibility(View.GONE);
                ll_A4453_10.setVisibility(View.GONE);
                ll_A4453_11.setVisibility(View.GONE);
                ll_A4453_12.setVisibility(View.GONE);
                
            }
            else if (rb_A4401_2.isChecked()){
                ll_A4402.setVisibility(View.VISIBLE);
                ll_A4403.setVisibility(View.VISIBLE);
                ll_A4404.setVisibility(View.VISIBLE);
                ll_A4405.setVisibility(View.VISIBLE);
                ll_A4451_1.setVisibility(View.VISIBLE);
                ll_A4451_2.setVisibility(View.VISIBLE);
                ll_A4451_3.setVisibility(View.VISIBLE);
                ll_A4451_4.setVisibility(View.VISIBLE);
                ll_A4451_5.setVisibility(View.VISIBLE);
                ll_A4451_6.setVisibility(View.VISIBLE);
                ll_A4451_7.setVisibility(View.VISIBLE);
                ll_A4451_8.setVisibility(View.VISIBLE);
                ll_A4451_9.setVisibility(View.VISIBLE);
                ll_A4451_10.setVisibility(View.VISIBLE);
                ll_A4451_11.setVisibility(View.VISIBLE);
                ll_A4451_12.setVisibility(View.VISIBLE);
                ll_A4451_13.setVisibility(View.VISIBLE);
                ll_A4452_1.setVisibility(View.VISIBLE);
                ll_A4452_2.setVisibility(View.VISIBLE);
                ll_A4452_3.setVisibility(View.VISIBLE);
                ll_A4452_4.setVisibility(View.VISIBLE);
                ll_A4452_5.setVisibility(View.VISIBLE);
                ll_A4452_6.setVisibility(View.VISIBLE);
                ll_A4452_7.setVisibility(View.VISIBLE);
                ll_A4452_8.setVisibility(View.VISIBLE);
                ll_A4452_9.setVisibility(View.VISIBLE);
                ll_A4453_1.setVisibility(View.VISIBLE);
                ll_A4453_2.setVisibility(View.VISIBLE);
                ll_A4453_3.setVisibility(View.VISIBLE);
                ll_A4453_4.setVisibility(View.VISIBLE);
                ll_A4453_5.setVisibility(View.VISIBLE);
                ll_A4453_6.setVisibility(View.VISIBLE);
                ll_A4453_7.setVisibility(View.VISIBLE);
                ll_A4453_8.setVisibility(View.VISIBLE);
                ll_A4453_9.setVisibility(View.VISIBLE);
                ll_A4453_10.setVisibility(View.VISIBLE);
                ll_A4453_11.setVisibility(View.VISIBLE);
                ll_A4453_12.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_A4402_5) {
            if (rb_A4402_5.isChecked()) {
                ed_A4402_5.setVisibility(View.VISIBLE);
            }
            else {
                ed_A4402_5.setText("");
                ed_A4402_5.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4402_DK) {
            if (rb_A4402_DK.isChecked()) {

                ClearAll(ll_A4403);
                ClearAll(ll_A4404);
                ClearAll(ll_A4405);
                ClearAll(ll_A4451_1);
                ClearAll(ll_A4451_2);
                ClearAll(ll_A4451_3);
                ClearAll(ll_A4451_4);
                ClearAll(ll_A4451_5);
                ClearAll(ll_A4451_6);
                ClearAll(ll_A4451_7);
                ClearAll(ll_A4451_8);
                ClearAll(ll_A4451_9);
                ClearAll(ll_A4451_10);
                ClearAll(ll_A4451_11);
                ClearAll(ll_A4451_12);
                ClearAll(ll_A4451_13);
                ClearAll(ll_A4452_1);
                ClearAll(ll_A4452_2);
                ClearAll(ll_A4452_3);
                ClearAll(ll_A4452_4);
                ClearAll(ll_A4452_5);
                ClearAll(ll_A4452_6);
                ClearAll(ll_A4452_7);
                ClearAll(ll_A4452_8);
                ClearAll(ll_A4452_9);
                ClearAll(ll_A4453_1);
                ClearAll(ll_A4453_2);
                ClearAll(ll_A4453_3);
                ClearAll(ll_A4453_4);
                ClearAll(ll_A4453_5);
                ClearAll(ll_A4453_6);
                ClearAll(ll_A4453_7);
                ClearAll(ll_A4453_8);
                ClearAll(ll_A4453_9);
                ClearAll(ll_A4453_10);
                ClearAll(ll_A4453_11);
                ClearAll(ll_A4453_12);

                ll_A4403.setVisibility(View.GONE);
                ll_A4404.setVisibility(View.GONE);
                ll_A4405.setVisibility(View.GONE);
                ll_A4451_1.setVisibility(View.GONE);
                ll_A4451_2.setVisibility(View.GONE);
                ll_A4451_3.setVisibility(View.GONE);
                ll_A4451_4.setVisibility(View.GONE);
                ll_A4451_5.setVisibility(View.GONE);
                ll_A4451_6.setVisibility(View.GONE);
                ll_A4451_7.setVisibility(View.GONE);
                ll_A4451_8.setVisibility(View.GONE);
                ll_A4451_9.setVisibility(View.GONE);
                ll_A4451_10.setVisibility(View.GONE);
                ll_A4451_11.setVisibility(View.GONE);
                ll_A4451_12.setVisibility(View.GONE);
                ll_A4451_13.setVisibility(View.GONE);
                ll_A4452_1.setVisibility(View.GONE);
                ll_A4452_2.setVisibility(View.GONE);
                ll_A4452_3.setVisibility(View.GONE);
                ll_A4452_4.setVisibility(View.GONE);
                ll_A4452_5.setVisibility(View.GONE);
                ll_A4452_6.setVisibility(View.GONE);
                ll_A4452_7.setVisibility(View.GONE);
                ll_A4452_8.setVisibility(View.GONE);
                ll_A4452_9.setVisibility(View.GONE);
                ll_A4453_1.setVisibility(View.GONE);
                ll_A4453_2.setVisibility(View.GONE);
                ll_A4453_3.setVisibility(View.GONE);
                ll_A4453_4.setVisibility(View.GONE);
                ll_A4453_5.setVisibility(View.GONE);
                ll_A4453_6.setVisibility(View.GONE);
                ll_A4453_7.setVisibility(View.GONE);
                ll_A4453_8.setVisibility(View.GONE);
                ll_A4453_9.setVisibility(View.GONE);
                ll_A4453_10.setVisibility(View.GONE);
                ll_A4453_11.setVisibility(View.GONE);
                ll_A4453_12.setVisibility(View.GONE);
            } else {

                ll_A4451_1.setVisibility(View.VISIBLE);
                ll_A4451_2.setVisibility(View.VISIBLE);
                ll_A4451_3.setVisibility(View.VISIBLE);
                ll_A4451_4.setVisibility(View.VISIBLE);
                ll_A4451_5.setVisibility(View.VISIBLE);
                ll_A4451_6.setVisibility(View.VISIBLE);
                ll_A4451_7.setVisibility(View.VISIBLE);
                ll_A4451_8.setVisibility(View.VISIBLE);
                ll_A4451_9.setVisibility(View.VISIBLE);
                ll_A4451_10.setVisibility(View.VISIBLE);
                ll_A4451_11.setVisibility(View.VISIBLE);
                ll_A4451_12.setVisibility(View.VISIBLE);
                ll_A4451_13.setVisibility(View.VISIBLE);
                ll_A4452_1.setVisibility(View.VISIBLE);
                ll_A4452_2.setVisibility(View.VISIBLE);
                ll_A4452_3.setVisibility(View.VISIBLE);
                ll_A4452_4.setVisibility(View.VISIBLE);
                ll_A4452_5.setVisibility(View.VISIBLE);
                ll_A4452_6.setVisibility(View.VISIBLE);
                ll_A4452_7.setVisibility(View.VISIBLE);
                ll_A4452_8.setVisibility(View.VISIBLE);
                ll_A4452_9.setVisibility(View.VISIBLE);
                ll_A4453_1.setVisibility(View.VISIBLE);
                ll_A4453_2.setVisibility(View.VISIBLE);
                ll_A4453_3.setVisibility(View.VISIBLE);
                ll_A4453_4.setVisibility(View.VISIBLE);
                ll_A4453_5.setVisibility(View.VISIBLE);
                ll_A4453_6.setVisibility(View.VISIBLE);
                ll_A4453_7.setVisibility(View.VISIBLE);
                ll_A4453_8.setVisibility(View.VISIBLE);
                ll_A4453_9.setVisibility(View.VISIBLE);
                ll_A4453_10.setVisibility(View.VISIBLE);
                ll_A4453_11.setVisibility(View.VISIBLE);
                ll_A4453_12.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4451_13_1
                || compoundButton.getId() == R.id.rb_A4451_13_2
                || compoundButton.getId() == R.id.rb_A4451_13_DK) {
            if (rb_A4451_13_1.isChecked()) {
                ed_A4451_13.setVisibility(View.VISIBLE);
            }
            else {
                ed_A4451_13.setText("");
                ed_A4451_13.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4452_9_1
                || compoundButton.getId() == R.id.rb_A4452_9_2
                || compoundButton.getId() == R.id.rb_A4452_9_DK)
        {
            if (rb_A4452_9_1.isChecked()) {

                ed_A4452_9.setVisibility(View.VISIBLE);
            }
            else {
                ed_A4452_9.setText("");
                ed_A4452_9.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4453_12_1
                || compoundButton.getId() == R.id.rb_A4453_12_2
                || compoundButton.getId() == R.id.rb_A4453_12_DK)
        {
            if (rb_A4453_12_1.isChecked()) {
                ed_A4453_12.setVisibility(View.VISIBLE);
            }
            else {
                ed_A4453_12.setText("");
                ed_A4453_12.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.cb_A4472_DK) {
            if (cb_A4472_DK.isChecked()) {
                cb_A4472_1.setChecked(false);
                cb_A4472_2.setChecked(false);
                cb_A4472_3.setChecked(false);
                cb_A4472_4.setChecked(false);
                cb_A4472_5.setChecked(false);
                cb_A4472_6.setChecked(false);
                cb_A4472_7.setChecked(false);
                cb_A4472_8.setChecked(false);
                cb_A4472_9.setChecked(false);
                cb_A4472_10.setChecked(false);
                cb_A4472_11.setChecked(false);
                cb_A4472_12.setChecked(false);
            } else {
                cb_A4472_DK.setChecked(false);
            }
        } else {

            cb_A4472_DK.setChecked(false);
        }

        if (compoundButton.getId() == R.id.cb_A4472_12) {
            if (cb_A4472_12.isChecked()) {
                cb_A4472_1.setChecked(false);
                cb_A4472_2.setChecked(false);
                cb_A4472_3.setChecked(false);
                cb_A4472_4.setChecked(false);
                cb_A4472_5.setChecked(false);
                cb_A4472_6.setChecked(false);
                cb_A4472_7.setChecked(false);
                cb_A4472_8.setChecked(false);
                cb_A4472_9.setChecked(false);
                cb_A4472_10.setChecked(false);
                cb_A4472_11.setChecked(false);
                cb_A4472_DK.setChecked(false);
            } else {
                cb_A4472_12.setChecked(false);
            }
        } else {

            cb_A4472_12.setChecked(false);
        }
    }

    void events_call() {

        btn_next14.setOnClickListener(this);

        rb_A4401_1.setOnCheckedChangeListener(this);
        rb_A4401_2.setOnCheckedChangeListener(this);
        rb_A4401_DK.setOnCheckedChangeListener(this);

        rb_A4402_1.setOnCheckedChangeListener(this);
        rb_A4402_2.setOnCheckedChangeListener(this);
        rb_A4402_3.setOnCheckedChangeListener(this);
        rb_A4402_4.setOnCheckedChangeListener(this);
        rb_A4402_5.setOnCheckedChangeListener(this);
        rb_A4402_DK.setOnCheckedChangeListener(this);

        rb_A4451_13_1.setOnCheckedChangeListener(this);
        rb_A4451_13_2.setOnCheckedChangeListener(this);
        rb_A4451_13_DK.setOnCheckedChangeListener(this);

        rb_A4452_9_1.setOnCheckedChangeListener(this);
        rb_A4452_9_2.setOnCheckedChangeListener(this);
        rb_A4452_9_DK.setOnCheckedChangeListener(this);

        rb_A4453_12_1.setOnCheckedChangeListener(this);
        rb_A4453_12_2.setOnCheckedChangeListener(this);
        rb_A4453_12_DK.setOnCheckedChangeListener(this);

       // cb_A4472_1.setOnCheckedChangeListener(this);
       // cb_A4472_2.setOnCheckedChangeListener(this);
       // cb_A4472_3.setOnCheckedChangeListener(this);
       // cb_A4472_4.setOnCheckedChangeListener(this);
       // cb_A4472_5.setOnCheckedChangeListener(this);
       // cb_A4472_6.setOnCheckedChangeListener(this);
       // cb_A4472_7.setOnCheckedChangeListener(this);
       // cb_A4472_8.setOnCheckedChangeListener(this);
       // cb_A4472_9.setOnCheckedChangeListener(this);
       // cb_A4472_10.setOnCheckedChangeListener(this);
       // cb_A4472_11.setOnCheckedChangeListener(this);
       // cb_A4472_12.setOnCheckedChangeListener(this);
       // cb_A4472_DK.setOnCheckedChangeListener(this);
        smart(ll_A4472);

    }

    void value_assignment() {

        study_id = "0";
        A4401 = "-1";
        A4402 = "-1";
        A4402_5_OT = "-1";
        A4403_province = "-1";
        A4403_district = "-1";
        A4404_years = "-1";
        A4405_hours = "-1";
        A4405_minutes = "-1";
        A4451_1 = "-1";
        A4451_2 = "-1";
        A4451_3 = "-1";
        A4451_4 = "-1";
        A4451_5 = "-1";
        A4451_6 = "-1";
        A4451_7 = "-1";
        A4451_8 = "-1";
        A4451_9 = "-1";
        A4451_10 = "-1";
        A4451_11 = "-1";
        A4451_12 = "-1";
        A4451_13 = "-1";
        A4451_13_OT = "-1";
        A4451_code = "-1";
        A4452_1 = "-1";
        A4452_2 = "-1";
        A4452_3 = "-1";
        A4452_4 = "-1";
        A4452_5 = "-1";
        A4452_6 = "-1";
        A4452_7 = "-1";
        A4452_8 = "-1";
        A4452_9 = "-1";
        A4452_9_OT = "-1";
        A4452_code = "-1";
        A4453_1 = "-1";
        A4453_2 = "-1";
        A4453_3 = "-1";
        A4453_4 = "-1";
        A4453_5 = "-1";
        A4453_6 = "-1";
        A4453_7 = "-1";
        A4453_8 = "-1";
        A4453_9 = "-1";
        A4453_10 = "-1";
        A4453_11 = "-1";
        A4453_12 = "-1";
        A4453_12_OT = "-1";
        A4453_code = "-1";
        A4454 = "-1";
        A4455 = "-1";
        A4456 = "-1";
        A4457 = "-1";
        A4471 = "-1";
        A4472_1 = "-1";
        A4472_2 = "-1";
        A4472_3 = "-1";
        A4472_4 = "-1";
        A4472_5 = "-1";
        A4472_6 = "-1";
        A4472_7 = "-1";
        A4472_8 = "-1";
        A4472_9 = "-1";
        A4472_10 = "-1";
        A4472_11 = "-1";
        A4472_12 = "-1";
        A4472_DK = "-1";
        A4473 = "-1";
        STATUS = "0";


        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4401
        if (rb_A4401_1.isChecked()) {
            A4401 = "1";
        }
        if (rb_A4401_2.isChecked()) {
            A4401 = "2";
        }
        if (rb_A4401_DK.isChecked()) {
            A4401 = "9";
        }

        //A4402
        if (rb_A4402_1.isChecked()) {
            A4402 = "1";
        }
        if (rb_A4402_2.isChecked()) {
            A4402 = "2";
        }
        if (rb_A4402_3.isChecked()) {
            A4402 = "3";
        }
        if (rb_A4402_4.isChecked()) {
            A4402 = "4";
        }
        if (rb_A4402_5.isChecked()) {
            A4402 = "5";
        }
        if (rb_A4402_DK.isChecked()) {
            A4402 = "9";
        }
        if (ed_A4402_5.getText().toString().trim().length() > 0) {
            A4402_5_OT = ed_A4402_5.getText().toString().trim();
        }

        //A4403
        if (ed_A4403_province.getText().toString().trim().length() > 0) {
            A4403_province = ed_A4403_province.getText().toString().trim();
        }
        if (ed_A4403_district.getText().toString().trim().length() > 0) {
            A4403 = ed_A4403_district.getText().toString().trim();
        }

        //A4404_years
        if (ed_A4404_years.getText().toString().trim().length() > 0) {
            A4404_years = ed_A4404_years.getText().toString().trim();
        }

        //A4405
        if (ed_A4405_hours.getText().toString().trim().length() > 0) {
            A4405_hours = ed_A4405_hours.getText().toString().trim();
        }
        if (ed_A4405_minutes.getText().toString().trim().length() > 0) {
            A4405_minutes = ed_A4405_minutes.getText().toString().trim();
        }


        int temp_A4451 = 0;
        //A4451_1
        if (rb_A4451_1_1.isChecked()) {
            A4451_1 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_1_2.isChecked()) {
            A4451_1 = "2";
        }
        if (rb_A4451_1_DK.isChecked()) {
            A4451_1 = "9";
        }

        //A4451_2
        if (rb_A4451_2_1.isChecked()) {
            A4451_2 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_2_2.isChecked()) {
            A4451_2 = "2";
        }
        if (rb_A4451_2_DK.isChecked()) {
            A4451_2 = "9";
        }

        //A4451_3
        if (rb_A4451_3_1.isChecked()) {
            A4451_3 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_3_2.isChecked()) {
            A4451_3 = "2";
        }
        if (rb_A4451_3_DK.isChecked()) {
            A4451_3 = "9";
        }

        //A4451_4
        if (rb_A4451_4_1.isChecked()) {
            A4451_4 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_4_2.isChecked()) {
            A4451_4 = "2";
        }
        if (rb_A4451_4_DK.isChecked()) {
            A4451_4 = "9";
        }

        //A4451_5
        if (rb_A4451_5_1.isChecked()) {
            A4451_5 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_5_2.isChecked()) {
            A4451_5 = "2";
        }
        if (rb_A4451_5_DK.isChecked()) {
            A4451_5 = "9";
        }

        //A4451_6
        if (rb_A4451_6_1.isChecked()) {
            A4451_6 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_6_2.isChecked()) {
            A4451_6 = "2";
        }
        if (rb_A4451_6_DK.isChecked()) {
            A4451_6 = "9";
        }

        //A4451_7
        if (rb_A4451_7_1.isChecked()) {
            A4451_7 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_7_2.isChecked()) {
            A4451_7 = "2";
        }
        if (rb_A4451_7_DK.isChecked()) {
            A4451_7 = "9";
        }

        //A4451_8
        if (rb_A4451_8_1.isChecked()) {
            A4451_8 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_8_2.isChecked()) {
            A4451_8 = "2";
        }
        if (rb_A4451_8_DK.isChecked()) {
            A4451_8 = "9";
        }

        //A4451_9
        if (rb_A4451_9_1.isChecked()) {
            A4451_9 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_9_2.isChecked()) {
            A4451_9 = "2";
        }
        if (rb_A4451_9_DK.isChecked()) {
            A4451_9 = "9";
        }

        //A4451_10
        if (rb_A4451_10_1.isChecked()) {
            A4451_10 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_10_2.isChecked()) {
            A4451_10 = "2";
        }
        if (rb_A4451_10_DK.isChecked()) {
            A4451_10 = "9";
        }

        //A4451_11
        if (rb_A4451_11_1.isChecked()) {
            A4451_11 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_11_2.isChecked()) {
            A4451_11 = "2";
        }
        if (rb_A4451_11_DK.isChecked()) {
            A4451_11 = "9";
        }

        //A4451_12
        if (rb_A4451_12_1.isChecked()) {
            A4451_12 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_12_2.isChecked()) {
            A4451_12 = "2";
        }
        if (rb_A4451_12_DK.isChecked()) {
            A4451_12 = "9";
        }

        //A4451_13
        if (rb_A4451_13_1.isChecked()) {
            A4451_13 = "1";
            temp_A4451 = temp_A4451+1;

        }
        if (rb_A4451_13_2.isChecked()) {
            A4451_13 = "2";
        }
        if (rb_A4451_13_DK.isChecked()) {
            A4451_13 = "9";
        }
        if (ed_A4451_13.getText().toString().trim().length() > 0) {
            A4451_13_OT = ed_A4451_13.getText().toString().trim();
        }


        if (temp_A4451 == 1)
        {
            A4451_code = "1";
        }
        else if (temp_A4451 > 1)
        {
            A4451_code = "2";
        }
        else
            {
                A4451_code = "3";
            }




        int temp_A4452 = 0;
        //A4452_1
        if (rb_A4452_1_1.isChecked()) {
            A4452_1 = "1";
            temp_A4452 = temp_A4452+1;
        }
        if (rb_A4452_1_2.isChecked()) {
            A4452_1 = "2";
        }
        if (rb_A4452_1_DK.isChecked()) {
            A4452_1 = "9";
        }

        //A4452_2
        if (rb_A4452_2_1.isChecked()) {
            A4452_2 = "1";
            temp_A4452 = temp_A4452+1;

        }
        if (rb_A4452_2_2.isChecked()) {
            A4452_2 = "2";
        }
        if (rb_A4452_2_DK.isChecked()) {
            A4452_2 = "9";
        }

        //A4452_3
        if (rb_A4452_3_1.isChecked()) {
            A4452_3 = "1";
            temp_A4452 = temp_A4452+1;

        }
        if (rb_A4452_3_2.isChecked()) {
            A4452_3 = "2";
        }
        if (rb_A4452_3_DK.isChecked()) {
            A4452_3 = "9";
        }

        //A4452_4
        if (rb_A4452_4_1.isChecked()) {
            A4452_4 = "1";
            temp_A4452 = temp_A4452+1;

        }
        if (rb_A4452_4_2.isChecked()) {
            A4452_4 = "2";
        }
        if (rb_A4452_4_DK.isChecked()) {
            A4452_4 = "9";
        }

        //A4452_5
        if (rb_A4452_5_1.isChecked()) {
            A4452_5 = "1";
            temp_A4452 = temp_A4452+1;

        }
        if (rb_A4452_5_2.isChecked()) {
            A4452_5 = "2";
        }
        if (rb_A4452_5_DK.isChecked()) {
            A4452_5 = "9";
        }

        //A4452_6
        if (rb_A4452_6_1.isChecked()) {
            A4452_6 = "1";
            temp_A4452 = temp_A4452+1;

        }
        if (rb_A4452_6_2.isChecked()) {
            A4452_6 = "2";
        }
        if (rb_A4452_6_DK.isChecked()) {
            A4452_6 = "9";
        }

        //A4452_7
        if (rb_A4452_7_1.isChecked()) {
            A4452_7 = "1";
            temp_A4452 = temp_A4452+1;

        }
        if (rb_A4452_7_2.isChecked()) {
            A4452_7 = "2";
        }
        if (rb_A4452_7_DK.isChecked()) {
            A4452_7 = "9";
        }

        //A4452_8
        if (rb_A4452_8_1.isChecked()) {
            A4452_8 = "1";
            temp_A4452 = temp_A4452+1;

        }
        if (rb_A4452_8_2.isChecked()) {
            A4452_8 = "2";
        }
        if (rb_A4452_8_DK.isChecked()) {
            A4452_8 = "9";
        }

        //A4452_9
        if (rb_A4452_9_1.isChecked()) {
            A4452_9 = "1";
            temp_A4452 = temp_A4452+1;

        }
        if (rb_A4452_9_2.isChecked()) {
            A4452_9 = "2";
        }
        if (rb_A4452_9_DK.isChecked()) {
            A4452_9 = "9";
        }
        if (ed_A4452_9.getText().toString().trim().length() > 0) {
            A4452_9_OT = ed_A4452_9.getText().toString().trim();
        }


        if(temp_A4452==1)
        {
            A4452_code="1";
        }
        else if(temp_A4452>1)
        {
            A4452_code="2";
        }
        else
        {
            A4452_code="3";
        }




        int temp_a4453=0;
        //A4453_1
        if (rb_A4453_1_1.isChecked()) {
            A4453_1 = "1";
            temp_a4453=temp_a4453+1;

        }
        if (rb_A4453_1_2.isChecked()) {
            A4453_1 = "2";
        }
        if (rb_A4453_1_DK.isChecked()) {
            A4453_1 = "9";
        }

        //A4453_2
        if (rb_A4453_2_1.isChecked()) {
            A4453_2 = "1";
            temp_a4453=temp_a4453+1;
        }
        if (rb_A4453_2_2.isChecked()) {
            A4453_2 = "2";
        }
        if (rb_A4453_2_DK.isChecked()) {
            A4453_2 = "9";
        }

        //A4453_3
        if (rb_A4453_3_1.isChecked()) {
            A4453_3 = "1";
            temp_a4453=temp_a4453+1;

        }
        if (rb_A4453_3_2.isChecked()) {
            A4453_3 = "2";
        }
        if (rb_A4453_3_DK.isChecked()) {
            A4453_3 = "9";
        }

        //A4453_4
        if (rb_A4453_4_1.isChecked()) {
            A4453_4 = "1";
            temp_a4453=temp_a4453+1;

        }
        if (rb_A4453_4_2.isChecked()) {
            A4453_4 = "2";
        }
        if (rb_A4453_4_DK.isChecked()) {
            A4453_4 = "9";
        }

        //A4453_5
        if (rb_A4453_5_1.isChecked()) {
            A4453_5 = "1";
            temp_a4453=temp_a4453+1;

        }
        if (rb_A4453_5_2.isChecked()) {
            A4453_5 = "2";
        }
        if (rb_A4453_5_DK.isChecked()) {
            A4453_5 = "9";
        }

        //A4453_6
        if (rb_A4453_6_1.isChecked()) {
            A4453_6 = "1";
            temp_a4453=temp_a4453+1;

        }
        if (rb_A4453_6_2.isChecked()) {
            A4453_6 = "2";
        }
        if (rb_A4453_6_DK.isChecked()) {
            A4453_6 = "9";
        }

        //A4453_7
        if (rb_A4453_7_1.isChecked()) {
            A4453_7 = "1";
            temp_a4453=temp_a4453+1;

        }
        if (rb_A4453_7_2.isChecked()) {
            A4453_7 = "2";
        }
        if (rb_A4453_7_DK.isChecked()) {
            A4453_7 = "9";
        }

        //A4453_8
        if (rb_A4453_8_1.isChecked()) {
            A4453_8 = "1";
            temp_a4453=temp_a4453+1;

        }
        if (rb_A4453_8_2.isChecked()) {
            A4453_8 = "2";
        }
        if (rb_A4453_8_DK.isChecked()) {
            A4453_8 = "9";
        }

        //A4453_9
        if (rb_A4453_9_1.isChecked()) {
            A4453_9 = "1";
            temp_a4453=temp_a4453+1;

        }
        if (rb_A4453_9_2.isChecked()) {
            A4453_9 = "2";
        }
        if (rb_A4453_9_DK.isChecked()) {
            A4453_9 = "9";
        }

        //A4453_10
        if (rb_A4453_10_1.isChecked()) {
            A4453_10 = "1";
            temp_a4453=temp_a4453+1;

        }
        if (rb_A4453_10_2.isChecked()) {
            A4453_10 = "2";
        }
        if (rb_A4453_10_DK.isChecked()) {
            A4453_10 = "9";
        }

        //A4453_11
        if (rb_A4453_11_1.isChecked()) {
            A4453_11 = "1";
            temp_a4453=temp_a4453+1;

        }
        if (rb_A4453_11_2.isChecked()) {
            A4453_11 = "2";
        }
        if (rb_A4453_11_DK.isChecked()) {
            A4453_11 = "9";
        }

        //A4453_12
        if (rb_A4453_12_1.isChecked()) {
            A4453_12 = "1";
            temp_a4453=temp_a4453+1;

        }
        if (rb_A4453_12_2.isChecked()) {
            A4453_12 = "2";
        }
        if (rb_A4453_12_DK.isChecked()) {
            A4453_12 = "9";
        }
        if (ed_A4453_12.getText().toString().trim().length() > 0) {
            A4453_12_OT = ed_A4453_12.getText().toString().trim();
        }


        if(temp_a4453==1)
        {
            A4453_code="1";
        }
        else if(temp_a4453>1)
        {
            A4453_code="2";
        }
        else
            {
                A4453_code="3";
            }


            //A4454
        if (rb_A4454_1.isChecked()) {
            A4454 = "1";
        }
        if (rb_A4454_2.isChecked()) {
            A4454 = "2";
        }
        if (rb_A4454_DK.isChecked()) {
            A4454 = "9";
        }
        if (rb_A4454_RA.isChecked()) {
            A4454 = "8";
        }

        //A4455
        if (rb_A4455_1.isChecked()) {
            A4455 = "1";
        }
        if (rb_A4455_2.isChecked()) {
            A4455 = "2";
        }
        if (rb_A4455_DK.isChecked()) {
            A4455 = "9";
        }
        if (rb_A4455_RA.isChecked()) {
            A4455 = "8";
        }

        //A4456
        if (rb_A4456_1.isChecked()) {
            A4456 = "1";
        }
        if (rb_A4456_2.isChecked()) {
            A4456 = "2";
        }
        if (rb_A4456_DK.isChecked()) {
            A4456 = "9";
        }
        if (rb_A4456_RA.isChecked()) {
            A4456 = "8";
        }

        //A4457
        if (rb_A4457_1.isChecked()) {
            A4457 = "1";
        }
        if (rb_A4457_2.isChecked()) {
            A4457 = "2";
        }
        if (rb_A4457_DK.isChecked()) {
            A4457 = "9";
        }
        if (rb_A4457_RA.isChecked()) {
            A4457 = "8";
        }

        //A4471
        if (ed_A4471.getText().toString().trim().length() > 0) {
            A4471 = ed_A4471.getText().toString().trim();
        }

        //A4472 CheckBox
        if (cb_A4472_1.isChecked()) {
            A4472_1 = "1";
        }
        if (cb_A4472_2.isChecked()) {
            A4472_2 = "2";
        }
        if (cb_A4472_3.isChecked()) {
            A4472_3 = "3";
        }
        if (cb_A4472_4.isChecked()) {
            A4472_4 = "4";
        }
        if (cb_A4472_5.isChecked()) {
            A4472_5 = "5";
        }
        if (cb_A4472_6.isChecked()) {
            A4472_6 = "6";
        }
        if (cb_A4472_7.isChecked()) {
            A4472_7 = "7";
        }
        if (cb_A4472_8.isChecked()) {
            A4472_8 = "8";
        }
        if (cb_A4472_9.isChecked()) {
            A4472_9 = "9";
        }
        if (cb_A4472_10.isChecked()) {
            A4472_10 = "10";
        }
        if (cb_A4472_11.isChecked()) {
            A4472_11 = "11";
        }
        if (cb_A4472_12.isChecked()) {
            A4472_12 = "12";
        }
        if (cb_A4472_DK.isChecked()) {
            A4472_DK = "99";
        }

        //A4473
        if (ed_A4473.getText().toString().trim().length() > 0) {
            A4473 = ed_A4473.getText().toString().trim();
        }
    }

    void insert_data() {

        String query = "insert into A4401_A4473("

                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4401 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4402 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4402_5_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4403_province + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4403_district + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4404_years + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4405_hours + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4405_minutes + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_6 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_7 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_8 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_9 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_10 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_11 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_12 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_13 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_13_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4451_code + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4452_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4452_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4452_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4452_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4452_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4452_6 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4452_7 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4452_8 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4452_9 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4452_9_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4452_code + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_6 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_7 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_8 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_9 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_10 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_11 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_12 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_12_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4453_code + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4454 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4455 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4456 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4457 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4471 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_6 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_7 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_8 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_9 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_10 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_11 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_12 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4472_DK + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.A4473 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4401_A4473.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4401 + "','" +
                A4402 + "','" +
                A4402_5_OT + "','" +
                A4403_province + "','" +
                A4403_district + "','" +
                A4404_years + "','" +
                A4405_hours + "','" +
                A4405_minutes + "','" +
                A4451_1 + "','" +
                A4451_2 + "','" +
                A4451_3 + "','" +
                A4451_4 + "','" +
                A4451_5 + "','" +
                A4451_6 + "','" +
                A4451_7 + "','" +
                A4451_8 + "','" +
                A4451_9 + "','" +
                A4451_10 + "','" +
                A4451_11 + "','" +
                A4451_12 + "','" +
                A4451_13 + "','" +
                A4451_13_OT + "','" +
                A4451_code + "','" +
                A4452_1 + "','" +
                A4452_2 + "','" +
                A4452_3 + "','" +
                A4452_4 + "','" +
                A4452_5 + "','" +
                A4452_6 + "','" +
                A4452_7 + "','" +
                A4452_8 + "','" +
                A4452_9 + "','" +
                A4452_9_OT + "','" +
                A4452_code + "','" +
                A4453_1 + "','" +
                A4453_2 + "','" +
                A4453_3 + "','" +
                A4453_4 + "','" +
                A4453_5 + "','" +
                A4453_6 + "','" +
                A4453_7 + "','" +
                A4453_8 + "','" +
                A4453_9 + "','" +
                A4453_10 + "','" +
                A4453_11 + "','" +
                A4453_12 + "','" +
                A4453_12_OT + "','" +
                A4453_code + "','" +
                A4454 + "','" +
                A4455 + "','" +
                A4456 + "','" +
                A4457 + "','" +
                A4471 + "','" +
                A4472_1 + "','" +
                A4472_2 + "','" +
                A4472_3 + "','" +
                A4472_4 + "','" +
                A4472_5 + "','" +
                A4472_6 + "','" +
                A4472_7 + "','" +
                A4472_8 + "','" +
                A4472_9 + "','" +
                A4472_10 + "','" +
                A4472_11 + "','" +
                A4472_12 + "','" +
                A4472_DK + "','" +
                A4473 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "14th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4401) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4402) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4403) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4404) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4405) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_9) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_10) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_11) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_12) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4451_13) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4452_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4452_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4452_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4452_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4452_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4452_6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4452_7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4452_8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4452_9) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4453_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4453_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4453_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4453_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4453_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4453_6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4453_7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4453_8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4453_9) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4453_10) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4453_11) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4453_12) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4454) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4455) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4456) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4457) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4471) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4472) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4473) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_A4473) != false;
    }


    void smart(LinearLayout lv)
    {
        for (int i = 0, count = lv.getChildCount(); i < count; ++i) {
            View view = lv.getChildAt(i);
            if (view instanceof CheckBox) {
                ((CheckBox) view).setOnCheckedChangeListener(this);
            }

        }
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 15);
    }
}
