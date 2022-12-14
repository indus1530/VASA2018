package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.abdulsajid.vasa2018.DataTables.C.C3001_C3011;
import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.DBHelper;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;
import edu.aku.abdulsajid.vasa2018.utils.Gothrough;

public class C3401_C3457 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {


    //region Declaration

    Button btn_next;

    // LinerLayouts
    LinearLayout
            ll_study_id,
            ll_C3401,
            ll_C3402,
            ll_C3403,
            ll_C3404,
            ll_C3405,
            ll_C3406,
            ll_C3407,
            ll_C3408,
            ll_C3409,
            ll_C3410,
            ll_C3411,
            ll_C3412,
            ll_C3413,
            ll_C3414,
            ll_C3451_1,
            ll_C3451_2,
            ll_C3451_3,
            ll_C3451_4,
            ll_C3451_5,
            ll_C3451_6,
            ll_C3451_7,
            ll_C3451_8,
            ll_C3451_9,
            ll_C3451_10,
            ll_C3451_11,
            ll_C3451_12,
            ll_C3451_13,
            ll_C3452_1,
            ll_C3452_2,
            ll_C3452_3,
            ll_C3452_4,
            ll_C3452_5,
            ll_C3452_6,
            ll_C3452_7,
            ll_C3452_8,
            ll_C3452_9,
            ll_C3453_1,
            ll_C3453_2,
            ll_C3453_3,
            ll_C3453_4,
            ll_C3453_5,
            ll_C3453_6,
            ll_C3453_7,
            ll_C3453_8,
            ll_C3453_9,
            ll_C3453_10,
            ll_C3453_11,
            ll_C3453_12,
            ll_C3454,
            ll_C3455,
            ll_C3456,
            ll_C3457;

    RadioButton
            rb_C3402_1,
            rb_C3402_2,
            rb_C3402_DK,
            rb_C3403_1,
            rb_C3403_2,
            rb_C3403_3,
            rb_C3403_DK,
            rb_C3405_1,
            rb_C3405_2,
            rb_C3405_3,
            rb_C3405_4,
            rb_C3405_DK,
            rb_C3407_1,
            rb_C3407_2,
            rb_C3407_DK,
            rb_C3408_1,
            rb_C3408_2,
            rb_C3408_3,
            rb_C3408_DK,
            rb_C3410_1,
            rb_C3410_2,
            rb_C3410_DK,
            rb_C3411_1,
            rb_C3411_2,
            rb_C3411_3,
            rb_C3411_4,
            rb_C3411_5,
            rb_C3411_DK,
            rb_C3451_1_1,
            rb_C3451_1_2,
            rb_C3451_1_DK,
            rb_C3451_2_1,
            rb_C3451_2_2,
            rb_C3451_2_DK,
            rb_C3451_3_1,
            rb_C3451_3_2,
            rb_C3451_3_DK,
            rb_C3451_4_1,
            rb_C3451_4_2,
            rb_C3451_4_DK,
            rb_C3451_5_1,
            rb_C3451_5_2,
            rb_C3451_5_DK,
            rb_C3451_6_1,
            rb_C3451_6_2,
            rb_C3451_6_DK,
            rb_C3451_7_1,
            rb_C3451_7_2,
            rb_C3451_7_DK,
            rb_C3451_8_1,
            rb_C3451_8_2,
            rb_C3451_8_DK,
            rb_C3451_9_1,
            rb_C3451_9_2,
            rb_C3451_9_DK,
            rb_C3451_10_1,
            rb_C3451_10_2,
            rb_C3451_10_DK,
            rb_C3451_11_1,
            rb_C3451_11_2,
            rb_C3451_11_DK,
            rb_C3451_12_1,
            rb_C3451_12_2,
            rb_C3451_12_DK,
            rb_C3451_13_1,
            rb_C3451_13_2,
            rb_C3451_13_DK,
            rb_C3452_1_1,
            rb_C3452_1_2,
            rb_C3452_1_DK,
            rb_C3452_2_1,
            rb_C3452_2_2,
            rb_C3452_2_DK,
            rb_C3452_3_1,
            rb_C3452_3_2,
            rb_C3452_3_DK,
            rb_C3452_4_1,
            rb_C3452_4_2,
            rb_C3452_4_DK,
            rb_C3452_5_1,
            rb_C3452_5_2,
            rb_C3452_5_DK,
            rb_C3452_6_1,
            rb_C3452_6_2,
            rb_C3452_6_DK,
            rb_C3452_7_1,
            rb_C3452_7_2,
            rb_C3452_7_DK,
            rb_C3452_8_1,
            rb_C3452_8_2,
            rb_C3452_8_DK,
            rb_C3452_9_1,
            rb_C3452_9_2,
            rb_C3452_9_DK,
            rb_C3453_1_1,
            rb_C3453_1_2,
            rb_C3453_1_DK,
            rb_C3453_2_1,
            rb_C3453_2_2,
            rb_C3453_2_DK,
            rb_C3453_3_1,
            rb_C3453_3_2,
            rb_C3453_3_DK,
            rb_C3453_4_1,
            rb_C3453_4_2,
            rb_C3453_4_DK,
            rb_C3453_5_1,
            rb_C3453_5_2,
            rb_C3453_5_DK,
            rb_C3453_6_1,
            rb_C3453_6_2,
            rb_C3453_6_DK,
            rb_C3453_7_1,
            rb_C3453_7_2,
            rb_C3453_7_DK,
            rb_C3453_8_1,
            rb_C3453_8_2,
            rb_C3453_8_DK,
            rb_C3453_9_1,
            rb_C3453_9_2,
            rb_C3453_9_DK,
            rb_C3453_10_1,
            rb_C3453_10_2,
            rb_C3453_10_DK,
            rb_C3453_11_1,
            rb_C3453_11_2,
            rb_C3453_11_DK,
            rb_C3453_12_1,
            rb_C3453_12_2,
            rb_C3453_12_DK,
            rb_C3454_1,
            rb_C3454_2,
            rb_C3454_DK,
            rb_C3454_RA,
            rb_C3455_1,
            rb_C3455_2,
            rb_C3455_DK,
            rb_C3455_RA,
            rb_C3456_1,
            rb_C3456_2,
            rb_C3456_DK,
            rb_C3456_RA,
            rb_C3457_1,
            rb_C3457_2,
            rb_C3457_DK,
            rb_C3457_RA;

    //CheckBox

    EditText
            ed_study_id,
            ed_C3401,
            ed_C3404,
            ed_C3406,
            ed_C3409,
            ed_C3411_OT,
            ed_C3412_L1,
            ed_C3412_L2,
            ed_C3413,
            ed_C3414_1,
            ed_C3414_2,
            ed_C3451_13,
            ed_C3452_9,
            ed_C3453_12;

    String
            study_id,
            C3401,
            C3402,
            C3403,
            C3404,
            C3405,
            C3406,
            C3407,
            C3408,
            C3409,
            C3410,
            C3411,
            C3411_OT,
            C3412_L1,
            C3412_L2,
            C3413,
            C3414_1,
            C3414_2,
            C3451_1,
            C3451_2,
            C3451_3,
            C3451_4,
            C3451_5,
            C3451_6,
            C3451_7,
            C3451_8,
            C3451_9,
            C3451_10,
            C3451_11,
            C3451_12,
            C3451_13,
            C3451_13_OT,
            C3451_code,
            C3452_1,
            C3452_2,
            C3452_3,
            C3452_4,
            C3452_5,
            C3452_6,
            C3452_7,
            C3452_8,
            C3452_9,
            C3452_9_OT,
            C3452_code,
            C3453_1,
            C3453_2,
            C3453_3,
            C3453_4,
            C3453_5,
            C3453_6,
            C3453_7,
            C3453_8,
            C3453_9,
            C3453_10,
            C3453_11,
            C3453_12,
            C3453_12_OT,
            C3453_code,
            C3454,
            C3455,
            C3456,
            C3457,
            STATUS;

    int Q1403, C3003, currentSection;

    //endregion

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3401_c3457);

        this.setTitle(getString(R.string.h_c_sec_13));

        ll_study_id = findViewById(R.id.ll_study_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();

        ed_C3411_OT.setVisibility(View.GONE);
        ed_C3451_13.setVisibility(View.GONE);
        ed_C3452_9.setVisibility(View.GONE);
        ed_C3453_12.setVisibility(View.GONE);

        DBHelper db = new DBHelper(this);
        Cursor Q1101_Q1610 = db.getData("Q1101_Q1610", study_id);
        Cursor C3001_C3011 = db.getData("C3001_C3011", study_id);

        if (C3001_C3011.getCount() > 0) {

            C3001_C3011.moveToFirst();

            C3003 = Integer.valueOf(C3001_C3011.getString(C3001_C3011.getColumnIndex("C3003")));

            if (C3003 == 2) {

                ll_C3401.setVisibility(View.GONE);

            } else {

                ll_C3401.setVisibility(View.VISIBLE);
            }
        }

        if (Q1101_Q1610.getCount() > 0) {

            Q1101_Q1610.moveToFirst();

            Q1403 = Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1403")));

            if (Q1403 == 2) {

                ll_C3401.setVisibility(View.GONE);
                ll_C3402.setVisibility(View.GONE);
                ll_C3403.setVisibility(View.GONE);
                ll_C3404.setVisibility(View.GONE);

            } else {

                ll_C3401.setVisibility(View.VISIBLE);
                ll_C3402.setVisibility(View.VISIBLE);
                ll_C3403.setVisibility(View.VISIBLE);
                ll_C3404.setVisibility(View.VISIBLE);
            }
        }

        events_call();

        btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        // Intent c = new Intent(this, C3471_C3472.class);
        Intent c = new Intent(this, C3471_C3472.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    void Initialization() {

        // Button Next
        btn_next = findViewById(R.id.btn_next);

        // Layouts

        ll_C3401 = findViewById(R.id.ll_C3401);
        ll_C3402 = findViewById(R.id.ll_C3402);
        ll_C3403 = findViewById(R.id.ll_C3403);
        ll_C3404 = findViewById(R.id.ll_C3404);
        ll_C3405 = findViewById(R.id.ll_C3405);
        ll_C3406 = findViewById(R.id.ll_C3406);
        ll_C3407 = findViewById(R.id.ll_C3407);
        ll_C3408 = findViewById(R.id.ll_C3408);
        ll_C3409 = findViewById(R.id.ll_C3409);
        ll_C3410 = findViewById(R.id.ll_C3410);
        ll_C3411 = findViewById(R.id.ll_C3411);
        ll_C3412 = findViewById(R.id.ll_C3412);
        ll_C3413 = findViewById(R.id.ll_C3413);
        ll_C3414 = findViewById(R.id.ll_C3414);
        ll_C3451_1 = findViewById(R.id.ll_C3451_1);
        ll_C3451_2 = findViewById(R.id.ll_C3451_2);
        ll_C3451_3 = findViewById(R.id.ll_C3451_3);
        ll_C3451_4 = findViewById(R.id.ll_C3451_4);
        ll_C3451_5 = findViewById(R.id.ll_C3451_5);
        ll_C3451_6 = findViewById(R.id.ll_C3451_6);
        ll_C3451_7 = findViewById(R.id.ll_C3451_7);
        ll_C3451_8 = findViewById(R.id.ll_C3451_8);
        ll_C3451_9 = findViewById(R.id.ll_C3451_9);
        ll_C3451_10 = findViewById(R.id.ll_C3451_10);
        ll_C3451_11 = findViewById(R.id.ll_C3451_11);
        ll_C3451_12 = findViewById(R.id.ll_C3451_12);
        ll_C3451_13 = findViewById(R.id.ll_C3451_13);
        ll_C3452_1 = findViewById(R.id.ll_C3452_1);
        ll_C3452_2 = findViewById(R.id.ll_C3452_2);
        ll_C3452_3 = findViewById(R.id.ll_C3452_3);
        ll_C3452_4 = findViewById(R.id.ll_C3452_4);
        ll_C3452_5 = findViewById(R.id.ll_C3452_5);
        ll_C3452_6 = findViewById(R.id.ll_C3452_6);
        ll_C3452_7 = findViewById(R.id.ll_C3452_7);
        ll_C3452_8 = findViewById(R.id.ll_C3452_8);
        ll_C3452_9 = findViewById(R.id.ll_C3452_9);
        ll_C3453_1 = findViewById(R.id.ll_C3453_1);
        ll_C3453_2 = findViewById(R.id.ll_C3453_2);
        ll_C3453_3 = findViewById(R.id.ll_C3453_3);
        ll_C3453_4 = findViewById(R.id.ll_C3453_4);
        ll_C3453_5 = findViewById(R.id.ll_C3453_5);
        ll_C3453_6 = findViewById(R.id.ll_C3453_6);
        ll_C3453_7 = findViewById(R.id.ll_C3453_7);
        ll_C3453_8 = findViewById(R.id.ll_C3453_8);
        ll_C3453_9 = findViewById(R.id.ll_C3453_9);
        ll_C3453_10 = findViewById(R.id.ll_C3453_10);
        ll_C3453_11 = findViewById(R.id.ll_C3453_11);
        ll_C3453_12 = findViewById(R.id.ll_C3453_12);
        ll_C3454 = findViewById(R.id.ll_C3454);
        ll_C3455 = findViewById(R.id.ll_C3455);
        ll_C3456 = findViewById(R.id.ll_C3456);
        ll_C3457 = findViewById(R.id.ll_C3457);


        // Radio Buttons

        rb_C3402_1 = findViewById(R.id.rb_C3402_1);
        rb_C3402_2 = findViewById(R.id.rb_C3402_2);
        rb_C3402_DK = findViewById(R.id.rb_C3402_DK);
        rb_C3403_1 = findViewById(R.id.rb_C3403_1);
        rb_C3403_2 = findViewById(R.id.rb_C3403_2);
        rb_C3403_3 = findViewById(R.id.rb_C3403_3);
        rb_C3403_DK = findViewById(R.id.rb_C3403_DK);

        rb_C3405_1 = findViewById(R.id.rb_C3405_1);
        rb_C3405_2 = findViewById(R.id.rb_C3405_2);
        rb_C3405_3 = findViewById(R.id.rb_C3405_3);
        rb_C3405_4 = findViewById(R.id.rb_C3405_4);
        rb_C3405_DK = findViewById(R.id.rb_C3405_DK);

        rb_C3407_1 = findViewById(R.id.rb_C3407_1);
        rb_C3407_2 = findViewById(R.id.rb_C3407_2);
        rb_C3407_DK = findViewById(R.id.rb_C3407_DK);
        rb_C3408_1 = findViewById(R.id.rb_C3408_1);
        rb_C3408_2 = findViewById(R.id.rb_C3408_2);
        rb_C3408_3 = findViewById(R.id.rb_C3408_3);
        rb_C3408_DK = findViewById(R.id.rb_C3408_DK);
        rb_C3410_1 = findViewById(R.id.rb_C3410_1);
        rb_C3410_2 = findViewById(R.id.rb_C3410_2);
        rb_C3410_DK = findViewById(R.id.rb_C3410_DK);
        rb_C3411_1 = findViewById(R.id.rb_C3411_1);
        rb_C3411_2 = findViewById(R.id.rb_C3411_2);
        rb_C3411_3 = findViewById(R.id.rb_C3411_3);
        rb_C3411_4 = findViewById(R.id.rb_C3411_4);
        rb_C3411_5 = findViewById(R.id.rb_C3411_5);
        rb_C3411_DK = findViewById(R.id.rb_C3411_DK);
        rb_C3451_1_1 = findViewById(R.id.rb_C3451_1_1);
        rb_C3451_1_2 = findViewById(R.id.rb_C3451_1_2);
        rb_C3451_1_DK = findViewById(R.id.rb_C3451_1_DK);
        rb_C3451_2_1 = findViewById(R.id.rb_C3451_2_1);
        rb_C3451_2_2 = findViewById(R.id.rb_C3451_2_2);
        rb_C3451_2_DK = findViewById(R.id.rb_C3451_2_DK);
        rb_C3451_3_1 = findViewById(R.id.rb_C3451_3_1);
        rb_C3451_3_2 = findViewById(R.id.rb_C3451_3_2);
        rb_C3451_3_DK = findViewById(R.id.rb_C3451_3_DK);
        rb_C3451_4_1 = findViewById(R.id.rb_C3451_4_1);
        rb_C3451_4_2 = findViewById(R.id.rb_C3451_4_2);
        rb_C3451_4_DK = findViewById(R.id.rb_C3451_4_DK);
        rb_C3451_5_1 = findViewById(R.id.rb_C3451_5_1);
        rb_C3451_5_2 = findViewById(R.id.rb_C3451_5_2);
        rb_C3451_5_DK = findViewById(R.id.rb_C3451_5_DK);
        rb_C3451_6_1 = findViewById(R.id.rb_C3451_6_1);
        rb_C3451_6_2 = findViewById(R.id.rb_C3451_6_2);
        rb_C3451_6_DK = findViewById(R.id.rb_C3451_6_DK);
        rb_C3451_7_1 = findViewById(R.id.rb_C3451_7_1);
        rb_C3451_7_2 = findViewById(R.id.rb_C3451_7_2);
        rb_C3451_7_DK = findViewById(R.id.rb_C3451_7_DK);
        rb_C3451_8_1 = findViewById(R.id.rb_C3451_8_1);
        rb_C3451_8_2 = findViewById(R.id.rb_C3451_8_2);
        rb_C3451_8_DK = findViewById(R.id.rb_C3451_8_DK);
        rb_C3451_9_1 = findViewById(R.id.rb_C3451_9_1);
        rb_C3451_9_2 = findViewById(R.id.rb_C3451_9_2);
        rb_C3451_9_DK = findViewById(R.id.rb_C3451_9_DK);
        rb_C3451_10_1 = findViewById(R.id.rb_C3451_10_1);
        rb_C3451_10_2 = findViewById(R.id.rb_C3451_10_2);
        rb_C3451_10_DK = findViewById(R.id.rb_C3451_10_DK);
        rb_C3451_11_1 = findViewById(R.id.rb_C3451_11_1);
        rb_C3451_11_2 = findViewById(R.id.rb_C3451_11_2);
        rb_C3451_11_DK = findViewById(R.id.rb_C3451_11_DK);
        rb_C3451_12_1 = findViewById(R.id.rb_C3451_12_1);
        rb_C3451_12_2 = findViewById(R.id.rb_C3451_12_2);
        rb_C3451_12_DK = findViewById(R.id.rb_C3451_12_DK);
        rb_C3451_13_1 = findViewById(R.id.rb_C3451_13_1);
        rb_C3451_13_2 = findViewById(R.id.rb_C3451_13_2);
        rb_C3451_13_DK = findViewById(R.id.rb_C3451_13_DK);

        rb_C3452_1_1 = findViewById(R.id.rb_C3452_1_1);
        rb_C3452_1_2 = findViewById(R.id.rb_C3452_1_2);
        rb_C3452_1_DK = findViewById(R.id.rb_C3452_1_DK);
        rb_C3452_2_1 = findViewById(R.id.rb_C3452_2_1);
        rb_C3452_2_2 = findViewById(R.id.rb_C3452_2_2);
        rb_C3452_2_DK = findViewById(R.id.rb_C3452_2_DK);
        rb_C3452_3_1 = findViewById(R.id.rb_C3452_3_1);
        rb_C3452_3_2 = findViewById(R.id.rb_C3452_3_2);
        rb_C3452_3_DK = findViewById(R.id.rb_C3452_3_DK);
        rb_C3452_4_1 = findViewById(R.id.rb_C3452_4_1);
        rb_C3452_4_2 = findViewById(R.id.rb_C3452_4_2);
        rb_C3452_4_DK = findViewById(R.id.rb_C3452_4_DK);
        rb_C3452_5_1 = findViewById(R.id.rb_C3452_5_1);
        rb_C3452_5_2 = findViewById(R.id.rb_C3452_5_2);
        rb_C3452_5_DK = findViewById(R.id.rb_C3452_5_DK);
        rb_C3452_6_1 = findViewById(R.id.rb_C3452_6_1);
        rb_C3452_6_2 = findViewById(R.id.rb_C3452_6_2);
        rb_C3452_6_DK = findViewById(R.id.rb_C3452_6_DK);
        rb_C3452_7_1 = findViewById(R.id.rb_C3452_7_1);
        rb_C3452_7_2 = findViewById(R.id.rb_C3452_7_2);
        rb_C3452_7_DK = findViewById(R.id.rb_C3452_7_DK);
        rb_C3452_8_1 = findViewById(R.id.rb_C3452_8_1);
        rb_C3452_8_2 = findViewById(R.id.rb_C3452_8_2);
        rb_C3452_8_DK = findViewById(R.id.rb_C3452_8_DK);
        rb_C3452_9_1 = findViewById(R.id.rb_C3452_9_1);
        rb_C3452_9_2 = findViewById(R.id.rb_C3452_9_2);
        rb_C3452_9_DK = findViewById(R.id.rb_C3452_9_DK);

        rb_C3453_1_1 = findViewById(R.id.rb_C3453_1_1);
        rb_C3453_1_2 = findViewById(R.id.rb_C3453_1_2);
        rb_C3453_1_DK = findViewById(R.id.rb_C3453_1_DK);
        rb_C3453_2_1 = findViewById(R.id.rb_C3453_2_1);
        rb_C3453_2_2 = findViewById(R.id.rb_C3453_2_2);
        rb_C3453_2_DK = findViewById(R.id.rb_C3453_2_DK);
        rb_C3453_3_1 = findViewById(R.id.rb_C3453_3_1);
        rb_C3453_3_2 = findViewById(R.id.rb_C3453_3_2);
        rb_C3453_3_DK = findViewById(R.id.rb_C3453_3_DK);
        rb_C3453_4_1 = findViewById(R.id.rb_C3453_4_1);
        rb_C3453_4_2 = findViewById(R.id.rb_C3453_4_2);
        rb_C3453_4_DK = findViewById(R.id.rb_C3453_4_DK);
        rb_C3453_5_1 = findViewById(R.id.rb_C3453_5_1);
        rb_C3453_5_2 = findViewById(R.id.rb_C3453_5_2);
        rb_C3453_5_DK = findViewById(R.id.rb_C3453_5_DK);
        rb_C3453_6_1 = findViewById(R.id.rb_C3453_6_1);
        rb_C3453_6_2 = findViewById(R.id.rb_C3453_6_2);
        rb_C3453_6_DK = findViewById(R.id.rb_C3453_6_DK);
        rb_C3453_7_1 = findViewById(R.id.rb_C3453_7_1);
        rb_C3453_7_2 = findViewById(R.id.rb_C3453_7_2);
        rb_C3453_7_DK = findViewById(R.id.rb_C3453_7_DK);
        rb_C3453_8_1 = findViewById(R.id.rb_C3453_8_1);
        rb_C3453_8_2 = findViewById(R.id.rb_C3453_8_2);
        rb_C3453_8_DK = findViewById(R.id.rb_C3453_8_DK);
        rb_C3453_9_1 = findViewById(R.id.rb_C3453_9_1);
        rb_C3453_9_2 = findViewById(R.id.rb_C3453_9_2);
        rb_C3453_9_DK = findViewById(R.id.rb_C3453_9_DK);
        rb_C3453_10_1 = findViewById(R.id.rb_C3453_10_1);
        rb_C3453_10_2 = findViewById(R.id.rb_C3453_10_2);
        rb_C3453_10_DK = findViewById(R.id.rb_C3453_10_DK);
        rb_C3453_11_1 = findViewById(R.id.rb_C3453_11_1);
        rb_C3453_11_2 = findViewById(R.id.rb_C3453_11_2);
        rb_C3453_11_DK = findViewById(R.id.rb_C3453_11_DK);
        rb_C3453_12_1 = findViewById(R.id.rb_C3453_12_1);
        rb_C3453_12_2 = findViewById(R.id.rb_C3453_12_2);
        rb_C3453_12_DK = findViewById(R.id.rb_C3453_12_DK);

        rb_C3454_1 = findViewById(R.id.rb_C3454_1);
        rb_C3454_2 = findViewById(R.id.rb_C3454_2);
        rb_C3454_DK = findViewById(R.id.rb_C3454_DK);
        rb_C3454_RA = findViewById(R.id.rb_C3454_RA);

        rb_C3455_1 = findViewById(R.id.rb_C3455_1);
        rb_C3455_2 = findViewById(R.id.rb_C3455_2);
        rb_C3455_DK = findViewById(R.id.rb_C3455_DK);
        rb_C3455_RA = findViewById(R.id.rb_C3455_RA);

        rb_C3456_1 = findViewById(R.id.rb_C3456_1);
        rb_C3456_2 = findViewById(R.id.rb_C3456_2);
        rb_C3456_DK = findViewById(R.id.rb_C3456_DK);
        rb_C3456_RA = findViewById(R.id.rb_C3456_RA);

        rb_C3457_1 = findViewById(R.id.rb_C3457_1);
        rb_C3457_2 = findViewById(R.id.rb_C3457_2);
        rb_C3457_DK = findViewById(R.id.rb_C3457_DK);
        rb_C3457_RA = findViewById(R.id.rb_C3457_RA);

        // Edittexts

        ed_C3401 = findViewById(R.id.ed_C3401);
        ed_C3404 = findViewById(R.id.ed_C3404);
        ed_C3406 = findViewById(R.id.ed_C3406);
        ed_C3409 = findViewById(R.id.ed_C3409);
        ed_C3411_OT = findViewById(R.id.ed_C3411);
        ed_C3412_L1 = findViewById(R.id.ed_C3412_L1);
        ed_C3412_L2 = findViewById(R.id.ed_C3412_L2);
        ed_C3413 = findViewById(R.id.ed_C3413);
        ed_C3414_1 = findViewById(R.id.ed_C3414_1);
        ed_C3414_2 = findViewById(R.id.ed_C3414_2);

        ed_C3451_13 = findViewById(R.id.ed_C3451_13_OT);
        ed_C3452_9 = findViewById(R.id.ed_C3452_9_OT);
        ed_C3453_12 = findViewById(R.id.ed_C3453_12_OT);
    }

    void events_call() {

        rb_C3402_1.setOnCheckedChangeListener(this);
        rb_C3402_2.setOnCheckedChangeListener(this);
        rb_C3402_DK.setOnCheckedChangeListener(this);

        rb_C3403_1.setOnCheckedChangeListener(this);
        rb_C3403_2.setOnCheckedChangeListener(this);
        rb_C3403_3.setOnCheckedChangeListener(this);
        rb_C3403_DK.setOnCheckedChangeListener(this);

        rb_C3405_1.setOnCheckedChangeListener(this);
        rb_C3405_2.setOnCheckedChangeListener(this);
        rb_C3405_3.setOnCheckedChangeListener(this);
        rb_C3405_4.setOnCheckedChangeListener(this);
        rb_C3405_DK.setOnCheckedChangeListener(this);

        rb_C3407_1.setOnCheckedChangeListener(this);
        rb_C3407_2.setOnCheckedChangeListener(this);
        rb_C3407_DK.setOnCheckedChangeListener(this);

        rb_C3408_1.setOnCheckedChangeListener(this);
        rb_C3408_2.setOnCheckedChangeListener(this);
        rb_C3408_3.setOnCheckedChangeListener(this);
        rb_C3408_DK.setOnCheckedChangeListener(this);

        rb_C3410_1.setOnCheckedChangeListener(this);
        rb_C3410_2.setOnCheckedChangeListener(this);
        rb_C3410_DK.setOnCheckedChangeListener(this);

        rb_C3411_1.setOnCheckedChangeListener(this);
        rb_C3411_2.setOnCheckedChangeListener(this);
        rb_C3411_3.setOnCheckedChangeListener(this);
        rb_C3411_4.setOnCheckedChangeListener(this);
        rb_C3411_5.setOnCheckedChangeListener(this);
        rb_C3411_DK.setOnCheckedChangeListener(this);

        rb_C3451_13_1.setOnCheckedChangeListener(this);
        rb_C3452_9_1.setOnCheckedChangeListener(this);
        rb_C3453_12_1.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_C3402_1
                || compoundButton.getId() == R.id.rb_C3402_2
                || compoundButton.getId() == R.id.rb_C3402_DK) {

            if (rb_C3402_1.isChecked()) {

                ll_C3403.setVisibility(View.VISIBLE);
                ll_C3404.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3403);
                ClearAllcontrol.ClearAll(ll_C3404);

                ll_C3403.setVisibility(View.GONE);
                ll_C3404.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3403_1
                || compoundButton.getId() == R.id.rb_C3403_2
                || compoundButton.getId() == R.id.rb_C3403_3
                || compoundButton.getId() == R.id.rb_C3403_DK) {

            if (rb_C3403_1.isChecked() || rb_C3403_2.isChecked() || rb_C3403_3.isChecked()) {

                ll_C3404.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3404);
                ll_C3404.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3405_1
                || compoundButton.getId() == R.id.rb_C3405_2
                || compoundButton.getId() == R.id.rb_C3405_3
                || compoundButton.getId() == R.id.rb_C3405_4
                || compoundButton.getId() == R.id.rb_C3405_DK) {

            if (rb_C3405_1.isChecked() || rb_C3405_2.isChecked() || rb_C3405_4.isChecked() || rb_C3405_DK.isChecked()) {

                ll_C3406.setVisibility(View.VISIBLE);
                ll_C3407.setVisibility(View.VISIBLE);
                ll_C3408.setVisibility(View.VISIBLE);
                ll_C3409.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3406);
                ClearAllcontrol.ClearAll(ll_C3407);
                ClearAllcontrol.ClearAll(ll_C3408);
                ClearAllcontrol.ClearAll(ll_C3409);

                ll_C3406.setVisibility(View.GONE);
                ll_C3407.setVisibility(View.GONE);
                ll_C3408.setVisibility(View.GONE);
                ll_C3409.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3407_1
                || compoundButton.getId() == R.id.rb_C3407_2
                || compoundButton.getId() == R.id.rb_C3407_DK) {

            if (rb_C3407_1.isChecked()) {

                ll_C3408.setVisibility(View.VISIBLE);
                ll_C3409.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3408);
                ClearAllcontrol.ClearAll(ll_C3409);

                ll_C3408.setVisibility(View.GONE);
                ll_C3409.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3408_1
                || compoundButton.getId() == R.id.rb_C3408_2
                || compoundButton.getId() == R.id.rb_C3408_3
                || compoundButton.getId() == R.id.rb_C3408_DK) {

            if (rb_C3408_1.isChecked() || rb_C3408_2.isChecked() || rb_C3408_3.isChecked()) {

                ll_C3409.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3409);
                ll_C3409.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3410_1
                || compoundButton.getId() == R.id.rb_C3410_2
                || compoundButton.getId() == R.id.rb_C3410_DK) {

            if (rb_C3410_2.isChecked()) {

                ll_C3411.setVisibility(View.VISIBLE);
                ll_C3412.setVisibility(View.VISIBLE);
                ll_C3413.setVisibility(View.VISIBLE);
                ll_C3414.setVisibility(View.VISIBLE);

                ll_C3451_1.setVisibility(View.VISIBLE);
                ll_C3451_2.setVisibility(View.VISIBLE);
                ll_C3451_3.setVisibility(View.VISIBLE);
                ll_C3451_4.setVisibility(View.VISIBLE);
                ll_C3451_5.setVisibility(View.VISIBLE);
                ll_C3451_6.setVisibility(View.VISIBLE);
                ll_C3451_7.setVisibility(View.VISIBLE);
                ll_C3451_8.setVisibility(View.VISIBLE);
                ll_C3451_9.setVisibility(View.VISIBLE);
                ll_C3451_10.setVisibility(View.VISIBLE);
                ll_C3451_11.setVisibility(View.VISIBLE);
                ll_C3451_12.setVisibility(View.VISIBLE);
                ll_C3451_13.setVisibility(View.VISIBLE);

                ll_C3452_1.setVisibility(View.VISIBLE);
                ll_C3452_2.setVisibility(View.VISIBLE);
                ll_C3452_3.setVisibility(View.VISIBLE);
                ll_C3452_4.setVisibility(View.VISIBLE);
                ll_C3452_5.setVisibility(View.VISIBLE);
                ll_C3452_6.setVisibility(View.VISIBLE);
                ll_C3452_7.setVisibility(View.VISIBLE);
                ll_C3452_8.setVisibility(View.VISIBLE);
                ll_C3452_9.setVisibility(View.VISIBLE);

                ll_C3453_1.setVisibility(View.VISIBLE);
                ll_C3453_2.setVisibility(View.VISIBLE);
                ll_C3453_3.setVisibility(View.VISIBLE);
                ll_C3453_4.setVisibility(View.VISIBLE);
                ll_C3453_5.setVisibility(View.VISIBLE);
                ll_C3453_6.setVisibility(View.VISIBLE);
                ll_C3453_7.setVisibility(View.VISIBLE);
                ll_C3453_8.setVisibility(View.VISIBLE);
                ll_C3453_9.setVisibility(View.VISIBLE);
                ll_C3453_10.setVisibility(View.VISIBLE);
                ll_C3453_11.setVisibility(View.VISIBLE);
                ll_C3453_12.setVisibility(View.VISIBLE);

            } else if (rb_C3410_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3411);
                ClearAllcontrol.ClearAll(ll_C3412);
                ll_C3411.setVisibility(View.GONE);
                ll_C3412.setVisibility(View.GONE);

                ll_C3413.setVisibility(View.VISIBLE);
                ll_C3414.setVisibility(View.VISIBLE);

                ll_C3451_1.setVisibility(View.VISIBLE);
                ll_C3451_2.setVisibility(View.VISIBLE);
                ll_C3451_3.setVisibility(View.VISIBLE);
                ll_C3451_4.setVisibility(View.VISIBLE);
                ll_C3451_5.setVisibility(View.VISIBLE);
                ll_C3451_6.setVisibility(View.VISIBLE);
                ll_C3451_7.setVisibility(View.VISIBLE);
                ll_C3451_8.setVisibility(View.VISIBLE);
                ll_C3451_9.setVisibility(View.VISIBLE);
                ll_C3451_10.setVisibility(View.VISIBLE);
                ll_C3451_11.setVisibility(View.VISIBLE);
                ll_C3451_12.setVisibility(View.VISIBLE);
                ll_C3451_13.setVisibility(View.VISIBLE);

                ll_C3452_1.setVisibility(View.VISIBLE);
                ll_C3452_2.setVisibility(View.VISIBLE);
                ll_C3452_3.setVisibility(View.VISIBLE);
                ll_C3452_4.setVisibility(View.VISIBLE);
                ll_C3452_5.setVisibility(View.VISIBLE);
                ll_C3452_6.setVisibility(View.VISIBLE);
                ll_C3452_7.setVisibility(View.VISIBLE);
                ll_C3452_8.setVisibility(View.VISIBLE);
                ll_C3452_9.setVisibility(View.VISIBLE);

                ll_C3453_1.setVisibility(View.VISIBLE);
                ll_C3453_2.setVisibility(View.VISIBLE);
                ll_C3453_3.setVisibility(View.VISIBLE);
                ll_C3453_4.setVisibility(View.VISIBLE);
                ll_C3453_5.setVisibility(View.VISIBLE);
                ll_C3453_6.setVisibility(View.VISIBLE);
                ll_C3453_7.setVisibility(View.VISIBLE);
                ll_C3453_8.setVisibility(View.VISIBLE);
                ll_C3453_9.setVisibility(View.VISIBLE);
                ll_C3453_10.setVisibility(View.VISIBLE);
                ll_C3453_11.setVisibility(View.VISIBLE);
                ll_C3453_12.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3411);
                ClearAllcontrol.ClearAll(ll_C3412);
                ClearAllcontrol.ClearAll(ll_C3413);
                ClearAllcontrol.ClearAll(ll_C3414);

                ClearAllcontrol.ClearAll(ll_C3451_1);
                ClearAllcontrol.ClearAll(ll_C3451_2);
                ClearAllcontrol.ClearAll(ll_C3451_3);
                ClearAllcontrol.ClearAll(ll_C3451_4);
                ClearAllcontrol.ClearAll(ll_C3451_5);
                ClearAllcontrol.ClearAll(ll_C3451_6);
                ClearAllcontrol.ClearAll(ll_C3451_7);
                ClearAllcontrol.ClearAll(ll_C3451_8);
                ClearAllcontrol.ClearAll(ll_C3451_9);
                ClearAllcontrol.ClearAll(ll_C3451_10);
                ClearAllcontrol.ClearAll(ll_C3451_11);
                ClearAllcontrol.ClearAll(ll_C3451_12);
                ClearAllcontrol.ClearAll(ll_C3451_13);

                ClearAllcontrol.ClearAll(ll_C3452_1);
                ClearAllcontrol.ClearAll(ll_C3452_2);
                ClearAllcontrol.ClearAll(ll_C3452_3);
                ClearAllcontrol.ClearAll(ll_C3452_4);
                ClearAllcontrol.ClearAll(ll_C3452_5);
                ClearAllcontrol.ClearAll(ll_C3452_6);
                ClearAllcontrol.ClearAll(ll_C3452_7);
                ClearAllcontrol.ClearAll(ll_C3452_8);
                ClearAllcontrol.ClearAll(ll_C3452_9);

                ClearAllcontrol.ClearAll(ll_C3453_1);
                ClearAllcontrol.ClearAll(ll_C3453_2);
                ClearAllcontrol.ClearAll(ll_C3453_3);
                ClearAllcontrol.ClearAll(ll_C3453_4);
                ClearAllcontrol.ClearAll(ll_C3453_5);
                ClearAllcontrol.ClearAll(ll_C3453_6);
                ClearAllcontrol.ClearAll(ll_C3453_7);
                ClearAllcontrol.ClearAll(ll_C3453_8);
                ClearAllcontrol.ClearAll(ll_C3453_9);
                ClearAllcontrol.ClearAll(ll_C3453_10);
                ClearAllcontrol.ClearAll(ll_C3453_11);
                ClearAllcontrol.ClearAll(ll_C3453_12);

                ll_C3411.setVisibility(View.GONE);
                ll_C3412.setVisibility(View.GONE);
                ll_C3413.setVisibility(View.GONE);
                ll_C3414.setVisibility(View.GONE);

                ll_C3451_1.setVisibility(View.GONE);
                ll_C3451_2.setVisibility(View.GONE);
                ll_C3451_3.setVisibility(View.GONE);
                ll_C3451_4.setVisibility(View.GONE);
                ll_C3451_5.setVisibility(View.GONE);
                ll_C3451_6.setVisibility(View.GONE);
                ll_C3451_7.setVisibility(View.GONE);
                ll_C3451_8.setVisibility(View.GONE);
                ll_C3451_9.setVisibility(View.GONE);
                ll_C3451_10.setVisibility(View.GONE);
                ll_C3451_11.setVisibility(View.GONE);
                ll_C3451_12.setVisibility(View.GONE);
                ll_C3451_13.setVisibility(View.GONE);

                ll_C3452_1.setVisibility(View.GONE);
                ll_C3452_2.setVisibility(View.GONE);
                ll_C3452_3.setVisibility(View.GONE);
                ll_C3452_4.setVisibility(View.GONE);
                ll_C3452_5.setVisibility(View.GONE);
                ll_C3452_6.setVisibility(View.GONE);
                ll_C3452_7.setVisibility(View.GONE);
                ll_C3452_8.setVisibility(View.GONE);
                ll_C3452_9.setVisibility(View.GONE);

                ll_C3453_1.setVisibility(View.GONE);
                ll_C3453_2.setVisibility(View.GONE);
                ll_C3453_3.setVisibility(View.GONE);
                ll_C3453_4.setVisibility(View.GONE);
                ll_C3453_5.setVisibility(View.GONE);
                ll_C3453_6.setVisibility(View.GONE);
                ll_C3453_7.setVisibility(View.GONE);
                ll_C3453_8.setVisibility(View.GONE);
                ll_C3453_9.setVisibility(View.GONE);
                ll_C3453_10.setVisibility(View.GONE);
                ll_C3453_11.setVisibility(View.GONE);
                ll_C3453_12.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3411_1
                || compoundButton.getId() == R.id.rb_C3411_2
                || compoundButton.getId() == R.id.rb_C3411_3
                || compoundButton.getId() == R.id.rb_C3411_4
                || compoundButton.getId() == R.id.rb_C3411_5
                || compoundButton.getId() == R.id.rb_C3411_DK) {

            if (rb_C3411_1.isChecked()
                    || rb_C3411_2.isChecked()
                    || rb_C3411_3.isChecked()
                    || rb_C3411_4.isChecked()
                    || rb_C3411_5.isChecked()) {

                if (rb_C3411_5.isChecked()){

                    ed_C3411_OT.setVisibility(View.VISIBLE);
                } else {
                    ed_C3411_OT.setText("");
                    ed_C3411_OT.setVisibility(View.GONE);
                }

                ll_C3412.setVisibility(View.VISIBLE);
                ll_C3413.setVisibility(View.VISIBLE);
                ll_C3414.setVisibility(View.VISIBLE);

                ll_C3451_1.setVisibility(View.VISIBLE);
                ll_C3451_2.setVisibility(View.VISIBLE);
                ll_C3451_3.setVisibility(View.VISIBLE);
                ll_C3451_4.setVisibility(View.VISIBLE);
                ll_C3451_5.setVisibility(View.VISIBLE);
                ll_C3451_6.setVisibility(View.VISIBLE);
                ll_C3451_7.setVisibility(View.VISIBLE);
                ll_C3451_8.setVisibility(View.VISIBLE);
                ll_C3451_9.setVisibility(View.VISIBLE);
                ll_C3451_10.setVisibility(View.VISIBLE);
                ll_C3451_11.setVisibility(View.VISIBLE);
                ll_C3451_12.setVisibility(View.VISIBLE);
                ll_C3451_13.setVisibility(View.VISIBLE);

                ll_C3452_1.setVisibility(View.VISIBLE);
                ll_C3452_2.setVisibility(View.VISIBLE);
                ll_C3452_3.setVisibility(View.VISIBLE);
                ll_C3452_4.setVisibility(View.VISIBLE);
                ll_C3452_5.setVisibility(View.VISIBLE);
                ll_C3452_6.setVisibility(View.VISIBLE);
                ll_C3452_7.setVisibility(View.VISIBLE);
                ll_C3452_8.setVisibility(View.VISIBLE);
                ll_C3452_9.setVisibility(View.VISIBLE);

                ll_C3453_1.setVisibility(View.VISIBLE);
                ll_C3453_2.setVisibility(View.VISIBLE);
                ll_C3453_3.setVisibility(View.VISIBLE);
                ll_C3453_4.setVisibility(View.VISIBLE);
                ll_C3453_5.setVisibility(View.VISIBLE);
                ll_C3453_6.setVisibility(View.VISIBLE);
                ll_C3453_7.setVisibility(View.VISIBLE);
                ll_C3453_8.setVisibility(View.VISIBLE);
                ll_C3453_9.setVisibility(View.VISIBLE);
                ll_C3453_10.setVisibility(View.VISIBLE);
                ll_C3453_11.setVisibility(View.VISIBLE);
                ll_C3453_12.setVisibility(View.VISIBLE);

            } else {

                ed_C3411_OT.setText("");
                ed_C3411_OT.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(ll_C3412);
                ClearAllcontrol.ClearAll(ll_C3413);
                ClearAllcontrol.ClearAll(ll_C3414);

                ClearAllcontrol.ClearAll(ll_C3451_1);
                ClearAllcontrol.ClearAll(ll_C3451_2);
                ClearAllcontrol.ClearAll(ll_C3451_3);
                ClearAllcontrol.ClearAll(ll_C3451_4);
                ClearAllcontrol.ClearAll(ll_C3451_5);
                ClearAllcontrol.ClearAll(ll_C3451_6);
                ClearAllcontrol.ClearAll(ll_C3451_7);
                ClearAllcontrol.ClearAll(ll_C3451_8);
                ClearAllcontrol.ClearAll(ll_C3451_9);
                ClearAllcontrol.ClearAll(ll_C3451_10);
                ClearAllcontrol.ClearAll(ll_C3451_11);
                ClearAllcontrol.ClearAll(ll_C3451_12);
                ClearAllcontrol.ClearAll(ll_C3451_13);

                ClearAllcontrol.ClearAll(ll_C3452_1);
                ClearAllcontrol.ClearAll(ll_C3452_2);
                ClearAllcontrol.ClearAll(ll_C3452_3);
                ClearAllcontrol.ClearAll(ll_C3452_4);
                ClearAllcontrol.ClearAll(ll_C3452_5);
                ClearAllcontrol.ClearAll(ll_C3452_6);
                ClearAllcontrol.ClearAll(ll_C3452_7);
                ClearAllcontrol.ClearAll(ll_C3452_8);
                ClearAllcontrol.ClearAll(ll_C3452_9);

                ClearAllcontrol.ClearAll(ll_C3453_1);
                ClearAllcontrol.ClearAll(ll_C3453_2);
                ClearAllcontrol.ClearAll(ll_C3453_3);
                ClearAllcontrol.ClearAll(ll_C3453_4);
                ClearAllcontrol.ClearAll(ll_C3453_5);
                ClearAllcontrol.ClearAll(ll_C3453_6);
                ClearAllcontrol.ClearAll(ll_C3453_7);
                ClearAllcontrol.ClearAll(ll_C3453_8);
                ClearAllcontrol.ClearAll(ll_C3453_9);
                ClearAllcontrol.ClearAll(ll_C3453_10);
                ClearAllcontrol.ClearAll(ll_C3453_11);
                ClearAllcontrol.ClearAll(ll_C3453_12);

                ll_C3412.setVisibility(View.GONE);
                ll_C3413.setVisibility(View.GONE);
                ll_C3414.setVisibility(View.GONE);

                ll_C3451_1.setVisibility(View.GONE);
                ll_C3451_2.setVisibility(View.GONE);
                ll_C3451_3.setVisibility(View.GONE);
                ll_C3451_4.setVisibility(View.GONE);
                ll_C3451_5.setVisibility(View.GONE);
                ll_C3451_6.setVisibility(View.GONE);
                ll_C3451_7.setVisibility(View.GONE);
                ll_C3451_8.setVisibility(View.GONE);
                ll_C3451_9.setVisibility(View.GONE);
                ll_C3451_10.setVisibility(View.GONE);
                ll_C3451_11.setVisibility(View.GONE);
                ll_C3451_12.setVisibility(View.GONE);
                ll_C3451_13.setVisibility(View.GONE);

                ll_C3452_1.setVisibility(View.GONE);
                ll_C3452_2.setVisibility(View.GONE);
                ll_C3452_3.setVisibility(View.GONE);
                ll_C3452_4.setVisibility(View.GONE);
                ll_C3452_5.setVisibility(View.GONE);
                ll_C3452_6.setVisibility(View.GONE);
                ll_C3452_7.setVisibility(View.GONE);
                ll_C3452_8.setVisibility(View.GONE);
                ll_C3452_9.setVisibility(View.GONE);

                ll_C3453_1.setVisibility(View.GONE);
                ll_C3453_2.setVisibility(View.GONE);
                ll_C3453_3.setVisibility(View.GONE);
                ll_C3453_4.setVisibility(View.GONE);
                ll_C3453_5.setVisibility(View.GONE);
                ll_C3453_6.setVisibility(View.GONE);
                ll_C3453_7.setVisibility(View.GONE);
                ll_C3453_8.setVisibility(View.GONE);
                ll_C3453_9.setVisibility(View.GONE);
                ll_C3453_10.setVisibility(View.GONE);
                ll_C3453_11.setVisibility(View.GONE);
                ll_C3453_12.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3451_13_1
                || compoundButton.getId() == R.id.rb_C3451_13_2
                || compoundButton.getId() == R.id.rb_C3451_13_DK) {

            if (rb_C3451_13_1.isChecked()) {

                ed_C3451_13.setVisibility(View.VISIBLE);

            } else {

                ed_C3451_13.setText("");
                ed_C3451_13.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3452_9_1
                || compoundButton.getId() == R.id.rb_C3452_9_2
                || compoundButton.getId() == R.id.rb_C3452_9_DK) {

            if (rb_C3452_9_1.isChecked()) {

                ed_C3452_9.setVisibility(View.VISIBLE);

            } else {

                ed_C3452_9.setText("");
                ed_C3452_9.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3453_12_1
                || compoundButton.getId() == R.id.rb_C3453_12_2
                || compoundButton.getId() == R.id.rb_C3453_12_DK) {

            if (rb_C3453_12_1.isChecked()) {

                ed_C3453_12.setVisibility(View.VISIBLE);

            } else {

                ed_C3453_12.setText("");
                ed_C3453_12.setVisibility(View.GONE);
            }
        }

    }

    void value_assignment() {

        C3401 = "-1";
        C3402 = "-1";
        C3403 = "-1";
        C3404 = "-1";
        C3405 = "-1";
        C3406 = "-1";
        C3407 = "-1";
        C3408 = "-1";
        C3409 = "-1";
        C3410 = "-1";
        C3411 = "-1";
        C3411_OT = "-1";
        C3412_L1 = "-1";
        C3412_L2 = "-1";
        C3413 = "-1";
        C3414_1 = "-1";
        C3414_2 = "-1";
        C3451_1 = "-1";
        C3451_2 = "-1";
        C3451_3 = "-1";
        C3451_4 = "-1";
        C3451_5 = "-1";
        C3451_6 = "-1";
        C3451_7 = "-1";
        C3451_8 = "-1";
        C3451_9 = "-1";
        C3451_10 = "-1";
        C3451_11 = "-1";
        C3451_12 = "-1";
        C3451_13 = "-1";
        C3451_13_OT = "-1";
        C3451_code = "-1";
        C3452_1 = "-1";
        C3452_2 = "-1";
        C3452_3 = "-1";
        C3452_4 = "-1";
        C3452_5 = "-1";
        C3452_6 = "-1";
        C3452_7 = "-1";
        C3452_8 = "-1";
        C3452_9 = "-1";
        C3452_9_OT = "-1";
        C3452_code = "-1";
        C3453_1 = "-1";
        C3453_2 = "-1";
        C3453_3 = "-1";
        C3453_4 = "-1";
        C3453_5 = "-1";
        C3453_6 = "-1";
        C3453_7 = "-1";
        C3453_8 = "-1";
        C3453_9 = "-1";
        C3453_10 = "-1";
        C3453_11 = "-1";
        C3453_12 = "-1";
        C3453_12_OT = "-1";
        C3453_code = "-1";
        C3454 = "-1";
        C3455 = "-1";
        C3456 = "-1";
        C3457 = "-1";

        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        if (ed_C3401.getText().toString().trim().length() > 0) {
            C3401 = ed_C3401.getText().toString().trim();
        }

        if (rb_C3402_1.isChecked()) {
            C3402 = "1";
        } else if (rb_C3402_2.isChecked()) {
            C3402 = "2";
        } else if (rb_C3402_DK.isChecked()) {
            C3402 = "9";
        }

        if (rb_C3403_1.isChecked()) {
            C3403 = "1";
        } else if (rb_C3403_2.isChecked()) {
            C3403 = "2";
        } else if (rb_C3403_3.isChecked()) {
            C3403 = "3";
        } else if (rb_C3403_DK.isChecked()) {
            C3403 = "9";
        }

        if (ed_C3404.getText().toString().trim().length() > 0) {
            C3404 = ed_C3404.getText().toString().trim();
        }

        if (rb_C3405_1.isChecked()) {
            C3405 = "1";
        } else if (rb_C3405_2.isChecked()) {
            C3405 = "2";
        } else if (rb_C3405_3.isChecked()) {
            C3405 = "3";
        } else if (rb_C3405_4.isChecked()) {
            C3405 = "4";
        } else if (rb_C3405_DK.isChecked()) {
            C3405 = "9";
        }

        if (ed_C3406.getText().toString().trim().length() > 0) {
            C3406 = ed_C3406.getText().toString().trim();
        }

        if (rb_C3407_1.isChecked()) {
            C3407 = "1";
        } else if (rb_C3407_2.isChecked()) {
            C3407 = "2";
        } else if (rb_C3407_DK.isChecked()) {
            C3407 = "9";
        }

        if (rb_C3408_1.isChecked()) {
            C3408 = "1";
        } else if (rb_C3408_2.isChecked()) {
            C3408 = "2";
        } else if (rb_C3408_3.isChecked()) {
            C3408 = "3";
        } else if (rb_C3408_DK.isChecked()) {
            C3408 = "9";
        }

        if (ed_C3409.getText().toString().trim().length() > 0) {
            C3409 = ed_C3409.getText().toString().trim();
        }

        if (rb_C3410_1.isChecked()) {
            C3410 = "1";
        } else if (rb_C3410_2.isChecked()) {
            C3410 = "2";
        } else if (rb_C3410_DK.isChecked()) {
            C3410 = "9";
        }

        if (rb_C3411_1.isChecked()) {
            C3411 = "1";
        } else if (rb_C3411_2.isChecked()) {
            C3411 = "2";
        } else if (rb_C3411_3.isChecked()) {
            C3411 = "3";
        } else if (rb_C3411_4.isChecked()) {
            C3411 = "4";
        } else if (rb_C3411_5.isChecked()) {
            C3411 = "5";
            C3411_OT = ed_C3411_OT.getText().toString().trim();
        } else if (rb_C3411_DK.isChecked()) {
            C3411 = "9";
        }

        if (ed_C3412_L1.getText().toString().trim().length() > 0) {
            C3412_L1 = ed_C3412_L1.getText().toString().trim();
        }

        if (ed_C3412_L2.getText().toString().trim().length() > 0) {
            C3412_L2 = ed_C3412_L2.getText().toString().trim();
        }

        if (ed_C3413.getText().toString().trim().length() > 0) {
            C3413 = ed_C3413.getText().toString().trim();
        }

        if (ed_C3414_1.getText().toString().trim().length() > 0) {
            C3414_1 = ed_C3414_1.getText().toString().trim();
        }

        if (ed_C3414_2.getText().toString().trim().length() > 0) {
            C3414_2 = ed_C3414_2.getText().toString().trim();
        }


        int temp_C3451 = 0;

        if (rb_C3451_1_1.isChecked()) {
            C3451_1 = "1";
            temp_C3451 = temp_C3451 + 1;
        } else if (rb_C3451_1_2.isChecked()) {
            C3451_1 = "2";
        } else if (rb_C3451_1_DK.isChecked()) {
            C3451_1 = "9";
        }

        if (rb_C3451_2_1.isChecked()) {
            C3451_2 = "1";
            temp_C3451 = temp_C3451 + 1;
        } else if (rb_C3451_2_2.isChecked()) {
            C3451_2 = "2";
        } else if (rb_C3451_2_DK.isChecked()) {
            C3451_2 = "9";
        }

        if (rb_C3451_3_1.isChecked()) {
            C3451_3 = "1";
            temp_C3451 = temp_C3451 + 1;
        } else if (rb_C3451_3_2.isChecked()) {
            C3451_3 = "2";
        } else if (rb_C3451_3_DK.isChecked()) {
            C3451_3 = "9";
        }

        if (rb_C3451_4_1.isChecked()) {
            C3451_4 = "1";
            temp_C3451 = temp_C3451 + 1;
        } else if (rb_C3451_4_2.isChecked()) {
            C3451_4 = "2";
        } else if (rb_C3451_4_DK.isChecked()) {
            C3451_4 = "9";
        }

        if (rb_C3451_5_1.isChecked()) {
            C3451_5 = "1";
            temp_C3451 = temp_C3451 + 1;

        } else if (rb_C3451_5_2.isChecked()) {
            C3451_5 = "2";
        } else if (rb_C3451_5_DK.isChecked()) {
            C3451_5 = "9";
        }

        if (rb_C3451_6_1.isChecked()) {
            C3451_6 = "1";
            temp_C3451 = temp_C3451 + 1;

        } else if (rb_C3451_6_2.isChecked()) {
            C3451_6 = "2";
        } else if (rb_C3451_6_DK.isChecked()) {
            C3451_6 = "9";
        }

        if (rb_C3451_7_1.isChecked()) {
            C3451_7 = "1";
            temp_C3451 = temp_C3451 + 1;

        } else if (rb_C3451_7_2.isChecked()) {
            C3451_7 = "2";
        } else if (rb_C3451_7_DK.isChecked()) {
            C3451_7 = "9";
        }

        if (rb_C3451_8_1.isChecked()) {
            C3451_8 = "1";
            temp_C3451 = temp_C3451 + 1;

        } else if (rb_C3451_8_2.isChecked()) {
            C3451_8 = "2";
        } else if (rb_C3451_8_DK.isChecked()) {
            C3451_8 = "9";
        }

        if (rb_C3451_9_1.isChecked()) {
            C3451_9 = "1";
            temp_C3451 = temp_C3451 + 1;

        } else if (rb_C3451_9_2.isChecked()) {
            C3451_9 = "2";
        } else if (rb_C3451_9_DK.isChecked()) {
            C3451_9 = "9";
        }

        if (rb_C3451_10_1.isChecked()) {
            C3451_10 = "1";
            temp_C3451 = temp_C3451 + 1;

        } else if (rb_C3451_10_2.isChecked()) {
            C3451_10 = "2";
        } else if (rb_C3451_10_DK.isChecked()) {
            C3451_10 = "9";
        }

        if (rb_C3451_11_1.isChecked()) {
            C3451_11 = "1";
            temp_C3451 = temp_C3451 + 1;

        } else if (rb_C3451_11_2.isChecked()) {
            C3451_11 = "2";
        } else if (rb_C3451_11_DK.isChecked()) {
            C3451_11 = "9";
        }

        if (rb_C3451_12_1.isChecked()) {
            C3451_12 = "1";
            temp_C3451 = temp_C3451 + 1;

        } else if (rb_C3451_12_2.isChecked()) {
            C3451_12 = "2";
        } else if (rb_C3451_12_DK.isChecked()) {
            C3451_12 = "9";
        }

        if (rb_C3451_13_1.isChecked()) {
            C3451_13 = "1";
            C3451_13_OT = ed_C3451_13.getText().toString().trim();
            temp_C3451 = temp_C3451 + 1;
        } else if (rb_C3451_13_2.isChecked()) {
            C3451_13 = "2";
        } else if (rb_C3451_13_DK.isChecked()){
            C3451_13 = "3";
        }

        if (temp_C3451 == 1) {
            C3451_code = "1";
        } else if (temp_C3451 > 1) {
            C3451_code = "2";
        } else {
            C3451_code = "3";
        }


        int temp_C3452 = 0;
        if (rb_C3452_1_1.isChecked()) {
            C3452_1 = "1";
            temp_C3452 = temp_C3452 + 1;

        } else if (rb_C3452_1_2.isChecked()) {
            C3452_1 = "2";
        } else if (rb_C3452_1_DK.isChecked()) {
            C3452_1 = "9";
        }

        if (rb_C3452_2_1.isChecked()) {
            C3452_2 = "1";
            temp_C3452 = temp_C3452 + 1;

        } else if (rb_C3452_2_2.isChecked()) {
            C3452_2 = "2";
        } else if (rb_C3452_2_DK.isChecked()) {
            C3452_2 = "9";
        }

        if (rb_C3452_3_1.isChecked()) {
            C3452_3 = "1";
            temp_C3452 = temp_C3452 + 1;

        } else if (rb_C3452_3_2.isChecked()) {
            C3452_3 = "2";
        } else if (rb_C3452_3_DK.isChecked()) {
            C3452_3 = "9";
        }

        if (rb_C3452_4_1.isChecked()) {
            C3452_4 = "1";
            temp_C3452 = temp_C3452 + 1;

        } else if (rb_C3452_4_2.isChecked()) {
            C3452_4 = "2";
        } else if (rb_C3452_4_DK.isChecked()) {
            C3452_4 = "9";
        }

        if (rb_C3452_5_1.isChecked()) {
            C3452_5 = "1";
            temp_C3452 = temp_C3452 + 1;

        } else if (rb_C3452_5_2.isChecked()) {
            C3452_5 = "2";
        } else if (rb_C3452_5_DK.isChecked()) {
            C3452_5 = "9";
        }

        if (rb_C3452_6_1.isChecked()) {
            C3452_6 = "1";
            temp_C3452 = temp_C3452 + 1;

        } else if (rb_C3452_6_2.isChecked()) {
            C3452_6 = "2";
        } else if (rb_C3452_6_DK.isChecked()) {
            C3452_6 = "9";
        }

        if (rb_C3452_7_1.isChecked()) {
            C3452_7 = "1";
            temp_C3452 = temp_C3452 + 1;

        } else if (rb_C3452_7_2.isChecked()) {
            C3452_7 = "2";
        } else if (rb_C3452_7_DK.isChecked()) {
            C3452_7 = "9";
        }

        if (rb_C3452_8_1.isChecked()) {
            C3452_8 = "1";
            temp_C3452 = temp_C3452 + 1;

        } else if (rb_C3452_8_2.isChecked()) {
            C3452_8 = "2";
        } else if (rb_C3452_8_DK.isChecked()) {
            C3452_8 = "9";
        }

        if (rb_C3452_9_1.isChecked()) {
            C3452_9 = "1";
            temp_C3452 = temp_C3452 + 1;
            C3452_9_OT = ed_C3452_9.getText().toString().trim();
        } else if (rb_C3452_9_2.isChecked()) {
            C3452_9 = "2";
        } else if (rb_C3452_9_DK.isChecked()){
            C3452_9 = "3";
        }

        if (temp_C3452 == 1) {
            C3452_code = "1";
        } else if (temp_C3452 > 1) {
            C3452_code = "2";
        } else {
            C3452_code = "3";
        }

        int temp_C3453 = 0;

        if (rb_C3453_1_1.isChecked()) {
            C3453_1 = "1";
            temp_C3453 = temp_C3453 + 1;
        } else if (rb_C3453_1_2.isChecked()) {
            C3453_1 = "2";
        } else if (rb_C3453_1_DK.isChecked()) {
            C3453_1 = "9";
        }

        if (rb_C3453_2_1.isChecked()) {
            C3453_2 = "1";
            temp_C3453 = temp_C3453 + 1;
        } else if (rb_C3453_2_2.isChecked()) {
            C3453_2 = "2";
        } else if (rb_C3453_2_DK.isChecked()) {
            C3453_2 = "9";
        }

        if (rb_C3453_3_1.isChecked()) {
            C3453_3 = "1";
            temp_C3453 = temp_C3453 + 1;

        } else if (rb_C3453_3_2.isChecked()) {
            C3453_3 = "2";
        } else if (rb_C3453_3_DK.isChecked()) {
            C3453_3 = "9";
        }

        if (rb_C3453_4_1.isChecked()) {
            C3453_4 = "1";
            temp_C3453 = temp_C3453 + 1;

        } else if (rb_C3453_4_2.isChecked()) {
            C3453_4 = "2";
        } else if (rb_C3453_4_DK.isChecked()) {
            C3453_4 = "9";
        }

        if (rb_C3453_5_1.isChecked()) {
            C3453_5 = "1";
            temp_C3453 = temp_C3453 + 1;

        } else if (rb_C3453_5_2.isChecked()) {
            C3453_5 = "2";
        } else if (rb_C3453_5_DK.isChecked()) {
            C3453_5 = "9";
        }

        if (rb_C3453_6_1.isChecked()) {
            C3453_6 = "1";
            temp_C3453 = temp_C3453 + 1;

        } else if (rb_C3453_6_2.isChecked()) {
            C3453_6 = "2";
        } else if (rb_C3453_6_DK.isChecked()) {
            C3453_6 = "9";
        }

        if (rb_C3453_7_1.isChecked()) {
            C3453_7 = "1";
            temp_C3453 = temp_C3453 + 1;

        } else if (rb_C3453_7_2.isChecked()) {
            C3453_7 = "2";
        } else if (rb_C3453_7_DK.isChecked()) {
            C3453_7 = "9";
        }

        if (rb_C3453_8_1.isChecked()) {
            C3453_8 = "1";
            temp_C3453 = temp_C3453 + 1;

        } else if (rb_C3453_8_2.isChecked()) {
            C3453_8 = "2";
        } else if (rb_C3453_8_DK.isChecked()) {
            C3453_8 = "9";
        }

        if (rb_C3453_9_1.isChecked()) {
            C3453_9 = "1";
            temp_C3453 = temp_C3453 + 1;

        } else if (rb_C3453_9_2.isChecked()) {
            C3453_9 = "2";
        } else if (rb_C3453_9_DK.isChecked()) {
            C3453_9 = "9";
        }

        if (rb_C3453_10_1.isChecked()) {
            C3453_10 = "1";
            temp_C3453 = temp_C3453 + 1;

        } else if (rb_C3453_10_2.isChecked()) {
            C3453_10 = "2";
        } else if (rb_C3453_10_DK.isChecked()) {
            C3453_10 = "9";
        }

        if (rb_C3453_11_1.isChecked()) {
            C3453_11 = "1";
            temp_C3453 = temp_C3453 + 1;

        } else if (rb_C3453_11_2.isChecked()) {
            C3453_11 = "2";
        } else if (rb_C3453_11_DK.isChecked()) {
            C3453_11 = "9";
        }

        if (rb_C3453_12_1.isChecked()) {
            C3453_12 = "1";
            C3453_12_OT = ed_C3453_12.getText().toString().trim();
            temp_C3453 = temp_C3453 + 1;
        } else if (rb_C3453_12_2.isChecked()) {
            C3453_12 = "2";
        } else if (rb_C3453_12_DK.isChecked()){
            C3453_12 = "3";
        }

        if (temp_C3453 == 1) {
            C3453_code = "1";
        } else if (temp_C3453 > 1) {
            C3453_code = "2";
        } else {
            C3453_code = "3";
        }

        if (rb_C3454_1.isChecked()) {
            C3454 = "1";
        } else if (rb_C3454_2.isChecked()) {
            C3454 = "2";
        } else if (rb_C3454_DK.isChecked()) {
            C3454 = "9";
        } else if (rb_C3454_RA.isChecked()) {
            C3454 = "8";
        }

        if (rb_C3455_1.isChecked()) {
            C3455 = "1";
        } else if (rb_C3455_2.isChecked()) {
            C3455 = "2";
        } else if (rb_C3455_DK.isChecked()) {
            C3455 = "9";
        } else if (rb_C3455_RA.isChecked()) {
            C3455 = "8";
        }

        if (rb_C3456_1.isChecked()) {
            C3456 = "1";
        } else if (rb_C3456_2.isChecked()) {
            C3456 = "2";
        } else if (rb_C3456_DK.isChecked()) {
            C3456 = "9";
        } else if (rb_C3456_RA.isChecked()) {
            C3456 = "8";
        }

        if (rb_C3457_1.isChecked()) {
            C3457 = "1";
        } else if (rb_C3457_2.isChecked()) {
            C3457 = "2";
        } else if (rb_C3457_DK.isChecked()) {
            C3457 = "9";
        } else if (rb_C3457_RA.isChecked()) {
            C3457 = "8";
        }


    }

    void insert_data() {

        String query = "insert into C3401_C3457("

                + C3001_C3011.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3401 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3402 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3403 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3404 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3405 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3406 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3407 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3408 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3409 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3410 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3411 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3412_L1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3412_L2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3413 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3414_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3414_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_6 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_7 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_8 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_9 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_10 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_11 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_12 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_13 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_13_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3451_code + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3452_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3452_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3452_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3452_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3452_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3452_6 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3452_7 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3452_8 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3452_9 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3452_9_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3452_code + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_6 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_7 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_8 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_9 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_10 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_11 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_12 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_12_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3453_code + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3454 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3455 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3456 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.C.C3401_C3457.C3457 + ","
                + C3001_C3011.STATUS + ") values ('" +

                study_id + "','" +
                C3401 + "','" +
                C3402 + "','" +
                C3403 + "','" +
                C3404 + "','" +
                C3405 + "','" +
                C3406 + "','" +
                C3407 + "','" +
                C3408 + "','" +
                C3409 + "','" +
                C3410 + "','" +
                C3411 + "','" +
                C3412_L1 + "','" +
                C3412_L2 + "','" +
                C3413 + "','" +
                C3414_1 + "','" +
                C3414_2 + "','" +
                C3451_1 + "','" +
                C3451_2 + "','" +
                C3451_3 + "','" +
                C3451_4 + "','" +
                C3451_5 + "','" +
                C3451_6 + "','" +
                C3451_7 + "','" +
                C3451_8 + "','" +
                C3451_9 + "','" +
                C3451_10 + "','" +
                C3451_11 + "','" +
                C3451_12 + "','" +
                C3451_13 + "','" +
                C3451_13_OT + "','" +
                C3451_code + "','" +
                C3452_1 + "','" +
                C3452_2 + "','" +
                C3452_3 + "','" +
                C3452_4 + "','" +
                C3452_5 + "','" +
                C3452_6 + "','" +
                C3452_7 + "','" +
                C3452_8 + "','" +
                C3452_9 + "','" +
                C3452_9_OT + "','" +
                C3452_code + "','" +
                C3453_1 + "','" +
                C3453_2 + "','" +
                C3453_3 + "','" +
                C3453_4 + "','" +
                C3453_5 + "','" +
                C3453_6 + "','" +
                C3453_7 + "','" +
                C3453_8 + "','" +
                C3453_9 + "','" +
                C3453_10 + "','" +
                C3453_11 + "','" +
                C3453_12 + "','" +
                C3453_12_OT + "','" +
                C3453_code + "','" +
                C3454 + "','" +
                C3455 + "','" +
                C3456 + "','" +
                C3457 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "Section 13: The household inserted successfully", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Section 14: Social capital and HIV/Aids inserted successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3401) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3402) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3403) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3404) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3405) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3406) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3407) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3408) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3409) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3410) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3411) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3412) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3413) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3414) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_5) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_6) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_7) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_8) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_9) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_10) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_11) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_12) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3451_13) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3452_1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3452_2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3452_3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3452_4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3452_5) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3452_6) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3452_7) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3452_8) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3452_9) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3453_1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3453_2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3453_3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3453_4) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3453_5) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3453_6) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3453_7) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3453_8) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3453_9) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3453_10) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3453_11) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3453_12) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3454) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3455) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3456) == false) {
            return false;
        }
        return Gothrough.IamHiden(ll_C3457) != false;
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 12);
    }
}
