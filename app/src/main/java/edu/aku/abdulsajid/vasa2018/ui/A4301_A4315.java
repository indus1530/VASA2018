package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;
import edu.aku.abdulsajid.vasa2018.utils.Gothrough;

public class A4301_A4315 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    private Pattern pattern;
    private Matcher matcher;
    private static final String DATE_PATTERN = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";

    //Declaration Region
    Button
            btn_next12;

    LinearLayout
            ll_study_id,
            ll_A4301,
            ll_A4302_1,
            ll_A4302_2,
            ll_A4302_3,
            ll_A4302_4,
            ll_A4302_5,
            ll_A4302_6,
            ll_A4302_7,
            ll_A4303,
            ll_A4304,
            ll_A4305,
            ll_A4306_1check,
            ll_A4306_1,
            ll_A4306_2check,
            ll_A4306_2,
            ll_A4307,
            ll_A4308,
            ll_A4309,
            ll_A4310_1,
            ll_A4310_2,
            ll_A4310_3,
            ll_A4310_4,
            ll_A4310_5,
            ll_A4310_6,
            ll_A4310_7,
            ll_A4310_8,
            ll_A4310_9,
            ll_A4310_10,
            ll_A4310_11,
            ll_A4311_1,
            ll_A4311_2,
            ll_A4311_3,
            ll_A4311_4,
            ll_A4311_5,
            ll_A4312,
            ll_A4313,
            ll_A4314,
            ll_A4315;

    RadioButton
            rb_A4301_1,
            rb_A4301_2,
            rb_A4301_DK,
            rb_A4301_RA,
            rb_A4302_1_1,
            rb_A4302_1_2,
            rb_A4302_1_DK,
            rb_A4302_1_RA,
            rb_A4302_2_1,
            rb_A4302_2_2,
            rb_A4302_2_DK,
            rb_A4302_2_RA,
            rb_A4302_3_1,
            rb_A4302_3_2,
            rb_A4302_3_DK,
            rb_A4302_3_RA,
            rb_A4302_4_1,
            rb_A4302_4_2,
            rb_A4302_4_DK,
            rb_A4302_4_RA,
            rb_A4302_5_1,
            rb_A4302_5_2,
            rb_A4302_5_DK,
            rb_A4302_5_RA,
            rb_A4302_6_1,
            rb_A4302_6_2,
            rb_A4302_6_DK,
            rb_A4302_6_RA,
            rb_A4302_7_1,
            rb_A4302_7_2,
            rb_A4302_7_DK,
            rb_A4302_7_RA,
            rb_A4303_1,
            rb_A4303_2,
            rb_A4303_DK,
            rb_A4303_RA,
            rb_A4304_1,
            rb_A4304_2,
            rb_A4304_DK,
            rb_A4304_RA,
            rb_A4305_1,
            rb_A4305_2,
            rb_A4306_1check_1,
            rb_A4306_1check_2,
            rb_A4306_2check_1,
            rb_A4306_2check_2,
            rb_A4310_1_1,
            rb_A4310_1_2,
            rb_A4310_1_DK,
            rb_A4310_1_RA,
            rb_A4310_2_1,
            rb_A4310_2_2,
            rb_A4310_2_DK,
            rb_A4310_2_RA,
            rb_A4310_3_1,
            rb_A4310_3_2,
            rb_A4310_3_DK,
            rb_A4310_3_RA,
            rb_A4310_4_1,
            rb_A4310_4_2,
            rb_A4310_4_DK,
            rb_A4310_4_RA,
            rb_A4310_5_1,
            rb_A4310_5_2,
            rb_A4310_5_DK,
            rb_A4310_5_RA,
            rb_A4310_6_1,
            rb_A4310_6_2,
            rb_A4310_6_DK,
            rb_A4310_6_RA,
            rb_A4310_7_1,
            rb_A4310_7_2,
            rb_A4310_7_DK,
            rb_A4310_7_RA,
            rb_A4310_8_1,
            rb_A4310_8_2,
            rb_A4310_8_DK,
            rb_A4310_8_RA,
            rb_A4310_9_1,
            rb_A4310_9_2,
            rb_A4310_9_DK,
            rb_A4310_9_RA,
            rb_A4310_10_1,
            rb_A4310_10_2,
            rb_A4310_10_DK,
            rb_A4310_10_RA,
            rb_A4310_11_1,
            rb_A4310_11_2,
            rb_A4310_11_DK,
            rb_A4310_11_RA,
            rb_A4311_1_1,
            rb_A4311_1_2,
            rb_A4311_1_DK,
            rb_A4311_1_RA,
            rb_A4311_2_1,
            rb_A4311_2_2,
            rb_A4311_2_DK,
            rb_A4311_2_RA,
            rb_A4311_3_1,
            rb_A4311_3_2,
            rb_A4311_3_DK,
            rb_A4311_3_RA,
            rb_A4311_4_1,
            rb_A4311_4_2,
            rb_A4311_4_DK,
            rb_A4311_4_RA,
            rb_A4311_5_1,
            rb_A4311_5_2,
            rb_A4311_5_DK,
            rb_A4311_5_RA,
            rb_A4312_1,
            rb_A4312_2,
            rb_A4312_DK,
            rb_A4312_RA,
            rb_A4313_1,
            rb_A4313_2,
            rb_A4313_DK,
            rb_A4313_RA,
            rb_A4314_1,
            rb_A4314_2,
            rb_A4314_DK,
            rb_A4314_RA;

    EditText
            ed_study_id,
            ed_A4306_1,
            ed_A4306_2,
            ed_A4307,
            ed_A4308,
            ed_A4309,
            ed_A4315;

    String
            study_id,
            A4301,
            A4302_1,
            A4302_2,
            A4302_3,
            A4302_4,
            A4302_5,
            A4302_6,
            A4302_7,
            A4303,
            A4304,
            A4305,
            A4306_1check,
            A4306_1,
            A4306_2check,
            A4306_2,
            A4307,
            A4308,
            A4309,
            A4310_1,
            A4310_2,
            A4310_3,
            A4310_4,
            A4310_5,
            A4310_6,
            A4310_7,
            A4310_8,
            A4310_9,
            A4310_10,
            A4310_11,
            A4311_1,
            A4311_2,
            A4311_3,
            A4311_4,
            A4311_5,
            A4312,
            A4313,
            A4314,
            A4315,
            STATUS;

    int currentSection;

    //EndRegion Declaration

    void Initialization() {

        btn_next12 = findViewById(R.id.btn_next12);

        ll_A4301 = findViewById(R.id.ll_A4301);
        ll_A4302_1 = findViewById(R.id.ll_A4302_1);
        ll_A4302_2 = findViewById(R.id.ll_A4302_2);
        ll_A4302_3 = findViewById(R.id.ll_A4302_3);
        ll_A4302_4 = findViewById(R.id.ll_A4302_4);
        ll_A4302_5 = findViewById(R.id.ll_A4302_5);
        ll_A4302_6 = findViewById(R.id.ll_A4302_6);
        ll_A4302_7 = findViewById(R.id.ll_A4302_7);
        ll_A4303 = findViewById(R.id.ll_A4303);
        ll_A4304 = findViewById(R.id.ll_A4304);
        ll_A4305 = findViewById(R.id.ll_A4305);
        ll_A4306_1check = findViewById(R.id.ll_A4306_1check);
        ll_A4306_1 = findViewById(R.id.ll_A4306_1);
        ll_A4306_2check = findViewById(R.id.ll_A4306_2check);
        ll_A4306_2 = findViewById(R.id.ll_A4306_2);
        ll_A4307 = findViewById(R.id.ll_A4307);
        ll_A4308 = findViewById(R.id.ll_A4308);
        ll_A4309 = findViewById(R.id.ll_A4309);
        ll_A4310_1 = findViewById(R.id.ll_A4310_1);
        ll_A4310_2 = findViewById(R.id.ll_A4310_2);
        ll_A4310_3 = findViewById(R.id.ll_A4310_3);
        ll_A4310_4 = findViewById(R.id.ll_A4310_4);
        ll_A4310_5 = findViewById(R.id.ll_A4310_5);
        ll_A4310_6 = findViewById(R.id.ll_A4310_6);
        ll_A4310_7 = findViewById(R.id.ll_A4310_7);
        ll_A4310_8 = findViewById(R.id.ll_A4310_8);
        ll_A4310_9 = findViewById(R.id.ll_A4310_9);
        ll_A4310_10 = findViewById(R.id.ll_A4310_10);
        ll_A4310_11 = findViewById(R.id.ll_A4310_11);
        ll_A4311_1 = findViewById(R.id.ll_A4311_1);
        ll_A4311_2 = findViewById(R.id.ll_A4311_2);
        ll_A4311_3 = findViewById(R.id.ll_A4311_3);
        ll_A4311_4 = findViewById(R.id.ll_A4311_4);
        ll_A4311_5 = findViewById(R.id.ll_A4311_5);
        ll_A4312 = findViewById(R.id.ll_A4312);
        ll_A4313 = findViewById(R.id.ll_A4313);
        ll_A4314 = findViewById(R.id.ll_A4314);
        ll_A4315 = findViewById(R.id.ll_A4315);

        rb_A4301_1 = findViewById(R.id.rb_A4301_1);
        rb_A4301_2 = findViewById(R.id.rb_A4301_2);
        rb_A4301_DK = findViewById(R.id.rb_A4301_DK);
        rb_A4301_RA = findViewById(R.id.rb_A4301_RA);
        rb_A4302_1_1 = findViewById(R.id.rb_A4302_1_1);
        rb_A4302_1_2 = findViewById(R.id.rb_A4302_1_2);
        rb_A4302_1_DK = findViewById(R.id.rb_A4302_1_DK);
        rb_A4302_1_RA = findViewById(R.id.rb_A4302_1_RA);
        rb_A4302_2_1 = findViewById(R.id.rb_A4302_2_1);
        rb_A4302_2_2 = findViewById(R.id.rb_A4302_2_2);
        rb_A4302_2_DK = findViewById(R.id.rb_A4302_2_DK);
        rb_A4302_2_RA = findViewById(R.id.rb_A4302_2_RA);
        rb_A4302_3_1 = findViewById(R.id.rb_A4302_3_1);
        rb_A4302_3_2 = findViewById(R.id.rb_A4302_3_2);
        rb_A4302_3_DK = findViewById(R.id.rb_A4302_3_DK);
        rb_A4302_3_RA = findViewById(R.id.rb_A4302_3_RA);
        rb_A4302_4_1 = findViewById(R.id.rb_A4302_4_1);
        rb_A4302_4_2 = findViewById(R.id.rb_A4302_4_2);
        rb_A4302_4_DK = findViewById(R.id.rb_A4302_4_DK);
        rb_A4302_4_RA = findViewById(R.id.rb_A4302_4_RA);
        rb_A4302_5_1 = findViewById(R.id.rb_A4302_5_1);
        rb_A4302_5_2 = findViewById(R.id.rb_A4302_5_2);
        rb_A4302_5_DK = findViewById(R.id.rb_A4302_5_DK);
        rb_A4302_5_RA = findViewById(R.id.rb_A4302_5_RA);
        rb_A4302_6_1 = findViewById(R.id.rb_A4302_6_1);
        rb_A4302_6_2 = findViewById(R.id.rb_A4302_6_2);
        rb_A4302_6_DK = findViewById(R.id.rb_A4302_6_DK);
        rb_A4302_6_RA = findViewById(R.id.rb_A4302_6_RA);
        rb_A4302_7_1 = findViewById(R.id.rb_A4302_7_1);
        rb_A4302_7_2 = findViewById(R.id.rb_A4302_7_2);
        rb_A4302_7_DK = findViewById(R.id.rb_A4302_7_DK);
        rb_A4302_7_RA = findViewById(R.id.rb_A4302_7_RA);
        rb_A4303_1 = findViewById(R.id.rb_A4303_1);
        rb_A4303_2 = findViewById(R.id.rb_A4303_2);
        rb_A4303_DK = findViewById(R.id.rb_A4303_DK);
        rb_A4303_RA = findViewById(R.id.rb_A4303_RA);
        rb_A4304_1 = findViewById(R.id.rb_A4304_1);
        rb_A4304_2 = findViewById(R.id.rb_A4304_2);
        rb_A4304_DK = findViewById(R.id.rb_A4304_DK);
        rb_A4304_RA = findViewById(R.id.rb_A4304_RA);
        rb_A4305_1 = findViewById(R.id.rb_A4305_1);
        rb_A4305_2 = findViewById(R.id.rb_A4305_2);
        rb_A4306_1check_1 = findViewById(R.id.rb_A4306_1check_1);
        rb_A4306_1check_2 = findViewById(R.id.rb_A4306_1check_2);
        rb_A4306_2check_1 = findViewById(R.id.rb_A4306_2check_1);
        rb_A4306_2check_2 = findViewById(R.id.rb_A4306_2check_2);
        rb_A4310_1_1 = findViewById(R.id.rb_A4310_1_1);
        rb_A4310_1_2 = findViewById(R.id.rb_A4310_1_2);
        rb_A4310_1_DK = findViewById(R.id.rb_A4310_1_DK);
        rb_A4310_1_RA = findViewById(R.id.rb_A4310_1_RA);
        rb_A4310_2_1 = findViewById(R.id.rb_A4310_2_1);
        rb_A4310_2_2 = findViewById(R.id.rb_A4310_2_2);
        rb_A4310_2_DK = findViewById(R.id.rb_A4310_2_DK);
        rb_A4310_2_RA = findViewById(R.id.rb_A4310_2_RA);
        rb_A4310_3_1 = findViewById(R.id.rb_A4310_3_1);
        rb_A4310_3_2 = findViewById(R.id.rb_A4310_3_2);
        rb_A4310_3_DK = findViewById(R.id.rb_A4310_3_DK);
        rb_A4310_3_RA = findViewById(R.id.rb_A4310_3_RA);
        rb_A4310_4_1 = findViewById(R.id.rb_A4310_4_1);
        rb_A4310_4_2 = findViewById(R.id.rb_A4310_4_2);
        rb_A4310_4_DK = findViewById(R.id.rb_A4310_4_DK);
        rb_A4310_4_RA = findViewById(R.id.rb_A4310_4_RA);
        rb_A4310_5_1 = findViewById(R.id.rb_A4310_5_1);
        rb_A4310_5_2 = findViewById(R.id.rb_A4310_5_2);
        rb_A4310_5_DK = findViewById(R.id.rb_A4310_5_DK);
        rb_A4310_5_RA = findViewById(R.id.rb_A4310_5_RA);
        rb_A4310_6_1 = findViewById(R.id.rb_A4310_6_1);
        rb_A4310_6_2 = findViewById(R.id.rb_A4310_6_2);
        rb_A4310_6_DK = findViewById(R.id.rb_A4310_6_DK);
        rb_A4310_6_RA = findViewById(R.id.rb_A4310_6_RA);
        rb_A4310_7_1 = findViewById(R.id.rb_A4310_7_1);
        rb_A4310_7_2 = findViewById(R.id.rb_A4310_7_2);
        rb_A4310_7_DK = findViewById(R.id.rb_A4310_7_DK);
        rb_A4310_7_RA = findViewById(R.id.rb_A4310_7_RA);
        rb_A4310_8_1 = findViewById(R.id.rb_A4310_8_1);
        rb_A4310_8_2 = findViewById(R.id.rb_A4310_8_2);
        rb_A4310_8_DK = findViewById(R.id.rb_A4310_8_DK);
        rb_A4310_8_RA = findViewById(R.id.rb_A4310_8_RA);
        rb_A4310_9_1 = findViewById(R.id.rb_A4310_9_1);
        rb_A4310_9_2 = findViewById(R.id.rb_A4310_9_2);
        rb_A4310_9_DK = findViewById(R.id.rb_A4310_9_DK);
        rb_A4310_9_RA = findViewById(R.id.rb_A4310_9_RA);
        rb_A4310_10_1 = findViewById(R.id.rb_A4310_10_1);
        rb_A4310_10_2 = findViewById(R.id.rb_A4310_10_2);
        rb_A4310_10_DK = findViewById(R.id.rb_A4310_10_DK);
        rb_A4310_10_RA = findViewById(R.id.rb_A4310_10_RA);
        rb_A4310_11_1 = findViewById(R.id.rb_A4310_11_1);
        rb_A4310_11_2 = findViewById(R.id.rb_A4310_11_2);
        rb_A4310_11_DK = findViewById(R.id.rb_A4310_11_DK);
        rb_A4310_11_RA = findViewById(R.id.rb_A4310_11_RA);
        rb_A4311_1_1 = findViewById(R.id.rb_A4311_1_1);
        rb_A4311_1_2 = findViewById(R.id.rb_A4311_1_2);
        rb_A4311_1_DK = findViewById(R.id.rb_A4311_1_DK);
        rb_A4311_1_RA = findViewById(R.id.rb_A4311_1_RA);
        rb_A4311_2_1 = findViewById(R.id.rb_A4311_2_1);
        rb_A4311_2_2 = findViewById(R.id.rb_A4311_2_2);
        rb_A4311_2_DK = findViewById(R.id.rb_A4311_2_DK);
        rb_A4311_2_RA = findViewById(R.id.rb_A4311_2_RA);
        rb_A4311_3_1 = findViewById(R.id.rb_A4311_3_1);
        rb_A4311_3_2 = findViewById(R.id.rb_A4311_3_2);
        rb_A4311_3_DK = findViewById(R.id.rb_A4311_3_DK);
        rb_A4311_3_RA = findViewById(R.id.rb_A4311_3_RA);
        rb_A4311_4_1 = findViewById(R.id.rb_A4311_4_1);
        rb_A4311_4_2 = findViewById(R.id.rb_A4311_4_2);
        rb_A4311_4_DK = findViewById(R.id.rb_A4311_4_DK);
        rb_A4311_4_RA = findViewById(R.id.rb_A4311_4_RA);
        rb_A4311_5_1 = findViewById(R.id.rb_A4311_5_1);
        rb_A4311_5_2 = findViewById(R.id.rb_A4311_5_2);
        rb_A4311_5_DK = findViewById(R.id.rb_A4311_5_DK);
        rb_A4311_5_RA = findViewById(R.id.rb_A4311_5_RA);
        rb_A4312_1 = findViewById(R.id.rb_A4312_1);
        rb_A4312_2 = findViewById(R.id.rb_A4312_2);
        rb_A4312_DK = findViewById(R.id.rb_A4312_DK);
        rb_A4312_RA = findViewById(R.id.rb_A4312_RA);
        rb_A4313_1 = findViewById(R.id.rb_A4313_1);
        rb_A4313_2 = findViewById(R.id.rb_A4313_2);
        rb_A4313_DK = findViewById(R.id.rb_A4313_DK);
        rb_A4313_RA = findViewById(R.id.rb_A4313_RA);
        rb_A4314_1 = findViewById(R.id.rb_A4314_1);
        rb_A4314_2 = findViewById(R.id.rb_A4314_2);
        rb_A4314_DK = findViewById(R.id.rb_A4314_DK);
        rb_A4314_RA = findViewById(R.id.rb_A4314_RA);

        ed_A4306_1 = findViewById(R.id.ed_A4306_1);
        ed_A4306_2 = findViewById(R.id.ed_A4306_2);
        ed_A4307 = findViewById(R.id.ed_A4307);
        ed_A4308 = findViewById(R.id.ed_A4308);
        ed_A4309 = findViewById(R.id.ed_A4309);
        ed_A4315 = findViewById(R.id.ed_A4315);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4301__a4315);

        this.setTitle(getString(R.string.h_a_sec_11));

        ll_study_id = findViewById(R.id.ll_study_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();
        events_call();
    }

    @Override
    public void onClick(View view) {

        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        pattern = Pattern.compile(DATE_PATTERN);

        /*if (!validate(ed_A4306_1.getText().toString().trim())) {

            ed_A4306_1.setError("Kindly enter a valid date");
            ed_A4306_1.requestFocus();
            return;
        }

        if (!validate(ed_A4306_2.getText().toString().trim())) {

            ed_A4306_2.setError("Kindly enter a valid date");
            ed_A4306_2.requestFocus();
            return;
        }

        if (!validate(ed_A4307.getText().toString().trim())) {

            ed_A4307.setError("Kindly enter a valid date");
            ed_A4307.requestFocus();
            return;
        }*/

        value_assignment();
        insert_data();

        Intent c = new Intent(A4301_A4315.this, A4351_A4364.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_A4301_1
                || compoundButton.getId() == R.id.rb_A4301_2
                || compoundButton.getId() == R.id.rb_A4301_DK
                || compoundButton.getId() == R.id.rb_A4301_RA)

        {
            if (rb_A4301_2.isChecked() || rb_A4301_DK.isChecked() || rb_A4301_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4302_1);
                ClearAllcontrol.ClearAll(ll_A4302_2);
                ClearAllcontrol.ClearAll(ll_A4302_3);
                ClearAllcontrol.ClearAll(ll_A4302_4);
                ClearAllcontrol.ClearAll(ll_A4302_5);
                ClearAllcontrol.ClearAll(ll_A4302_6);
                ClearAllcontrol.ClearAll(ll_A4302_7);
                ClearAllcontrol.ClearAll(ll_A4303);

                ll_A4302_1.setVisibility(View.GONE);
                ll_A4302_2.setVisibility(View.GONE);
                ll_A4302_3.setVisibility(View.GONE);
                ll_A4302_4.setVisibility(View.GONE);
                ll_A4302_5.setVisibility(View.GONE);
                ll_A4302_6.setVisibility(View.GONE);
                ll_A4302_7.setVisibility(View.GONE);
                ll_A4303.setVisibility(View.GONE);

            } else {
                ll_A4302_1.setVisibility(View.VISIBLE);
                ll_A4302_2.setVisibility(View.VISIBLE);
                ll_A4302_3.setVisibility(View.VISIBLE);
                ll_A4302_4.setVisibility(View.VISIBLE);
                ll_A4302_5.setVisibility(View.VISIBLE);
                ll_A4302_6.setVisibility(View.VISIBLE);
                ll_A4302_7.setVisibility(View.VISIBLE);
                ll_A4303.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4302_7_1
                || compoundButton.getId() == R.id.rb_A4302_7_2
                || compoundButton.getId() == R.id.rb_A4302_7_DK
                || compoundButton.getId() == R.id.rb_A4302_7_RA)

        {
            if (rb_A4302_7_2.isChecked() || rb_A4302_7_DK.isChecked() || rb_A4302_7_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4303);
                ll_A4303.setVisibility(View.GONE);

            } else {
                ll_A4303.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4304_1
                || compoundButton.getId() == R.id.rb_A4304_2
                || compoundButton.getId() == R.id.rb_A4304_DK
                || compoundButton.getId() == R.id.rb_A4304_RA)

        {
            if (rb_A4304_2.isChecked() || rb_A4304_DK.isChecked() || rb_A4304_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4305);
                ClearAllcontrol.ClearAll(ll_A4306_1check);
                ClearAllcontrol.ClearAll(ll_A4306_1);
                ClearAllcontrol.ClearAll(ll_A4306_2check);
                ClearAllcontrol.ClearAll(ll_A4306_2);
                ClearAllcontrol.ClearAll(ll_A4307);
                ClearAllcontrol.ClearAll(ll_A4308);
                ClearAllcontrol.ClearAll(ll_A4309);

                ll_A4305.setVisibility(View.GONE);
                ll_A4306_1check.setVisibility(View.GONE);
                ll_A4306_1.setVisibility(View.GONE);
                ll_A4306_2check.setVisibility(View.GONE);
                ll_A4306_2.setVisibility(View.GONE);
                ll_A4307.setVisibility(View.GONE);
                ll_A4308.setVisibility(View.GONE);
                ll_A4309.setVisibility(View.GONE);

            } else {
                ll_A4305.setVisibility(View.VISIBLE);
                ll_A4306_1check.setVisibility(View.VISIBLE);
                ll_A4306_1.setVisibility(View.VISIBLE);
                ll_A4306_2check.setVisibility(View.VISIBLE);
                ll_A4306_2.setVisibility(View.VISIBLE);
                ll_A4307.setVisibility(View.VISIBLE);
                ll_A4308.setVisibility(View.VISIBLE);
                ll_A4309.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4305_1
                || compoundButton.getId() == R.id.rb_A4305_2)

        {
            if (rb_A4305_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4306_1check);
                ClearAllcontrol.ClearAll(ll_A4306_1);
                ClearAllcontrol.ClearAll(ll_A4306_2check);
                ClearAllcontrol.ClearAll(ll_A4306_2);
                ClearAllcontrol.ClearAll(ll_A4307);
                ClearAllcontrol.ClearAll(ll_A4308);
                ClearAllcontrol.ClearAll(ll_A4309);

                ll_A4306_1check.setVisibility(View.GONE);
                ll_A4306_1.setVisibility(View.GONE);
                ll_A4306_2check.setVisibility(View.GONE);
                ll_A4306_2.setVisibility(View.GONE);
                ll_A4307.setVisibility(View.GONE);
                ll_A4308.setVisibility(View.GONE);
                ll_A4309.setVisibility(View.GONE);

            } else {
                ll_A4306_1check.setVisibility(View.VISIBLE);
                ll_A4306_1.setVisibility(View.VISIBLE);
                ll_A4306_2check.setVisibility(View.VISIBLE);
                ll_A4306_2.setVisibility(View.VISIBLE);
                ll_A4307.setVisibility(View.VISIBLE);
                ll_A4308.setVisibility(View.VISIBLE);
                ll_A4309.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4306_1check_1
                || compoundButton.getId() == R.id.rb_A4306_1check_2)

        {
            if (rb_A4306_1check_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4306_1);
                ll_A4306_1.setVisibility(View.GONE);

            } else {
                ll_A4306_1.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4306_2check_1
                || compoundButton.getId() == R.id.rb_A4306_2check_2)

        {
            if (rb_A4306_2check_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4306_2);
                ll_A4306_2.setVisibility(View.GONE);

            } else {
                ll_A4306_2.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_A4314_1
                || compoundButton.getId() == R.id.rb_A4314_2
                || compoundButton.getId() == R.id.rb_A4314_DK
                || compoundButton.getId() == R.id.rb_A4314_RA)

        {
            if (rb_A4314_2.isChecked() || rb_A4314_DK.isChecked() || rb_A4314_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4315);
                ll_A4315.setVisibility(View.GONE);

            } else {
                ll_A4315.setVisibility(View.VISIBLE);
            }
        }

    }

    private void events_call() {

        btn_next12.setOnClickListener(this);

        rb_A4301_1.setOnCheckedChangeListener(this);
        rb_A4301_2.setOnCheckedChangeListener(this);
        rb_A4301_DK.setOnCheckedChangeListener(this);
        rb_A4301_RA.setOnCheckedChangeListener(this);

        rb_A4302_7_1.setOnCheckedChangeListener(this);
        rb_A4302_7_2.setOnCheckedChangeListener(this);
        rb_A4302_7_DK.setOnCheckedChangeListener(this);
        rb_A4302_7_RA.setOnCheckedChangeListener(this);

        rb_A4304_1.setOnCheckedChangeListener(this);
        rb_A4304_2.setOnCheckedChangeListener(this);
        rb_A4304_DK.setOnCheckedChangeListener(this);
        rb_A4304_RA.setOnCheckedChangeListener(this);

        rb_A4305_1.setOnCheckedChangeListener(this);
        rb_A4305_2.setOnCheckedChangeListener(this);

        rb_A4306_1check_1.setOnCheckedChangeListener(this);
        rb_A4306_1check_2.setOnCheckedChangeListener(this);

        rb_A4306_2check_1.setOnCheckedChangeListener(this);
        rb_A4306_2check_2.setOnCheckedChangeListener(this);

        rb_A4314_1.setOnCheckedChangeListener(this);
        rb_A4314_2.setOnCheckedChangeListener(this);
        rb_A4314_DK.setOnCheckedChangeListener(this);
        rb_A4314_RA.setOnCheckedChangeListener(this);

    }

    void value_assignment() {

        study_id = "0";
        A4301 = "-1";
        A4302_1 = "-1";
        A4302_2 = "-1";
        A4302_3 = "-1";
        A4302_4 = "-1";
        A4302_5 = "-1";
        A4302_6 = "-1";
        A4302_7 = "-1";
        A4303 = "-1";
        A4304 = "-1";
        A4305 = "-1";
        A4306_1check = "-1";
        A4306_1 = "-1";
        A4306_2check = "-1";
        A4306_2 = "-1";
        A4307 = "-1";
        A4308 = "-1";
        A4309 = "-1";
        A4310_1 = "-1";
        A4310_2 = "-1";
        A4310_3 = "-1";
        A4310_4 = "-1";
        A4310_5 = "-1";
        A4310_6 = "-1";
        A4310_7 = "-1";
        A4310_8 = "-1";
        A4310_9 = "-1";
        A4310_10 = "-1";
        A4310_11 = "-1";
        A4311_1 = "-1";
        A4311_2 = "-1";
        A4311_3 = "-1";
        A4311_4 = "-1";
        A4311_5 = "-1";
        A4312 = "-1";
        A4313 = "-1";
        A4314 = "-1";
        A4315 = "-1";
        STATUS = "0";


        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4301
        if (rb_A4301_1.isChecked()) {
            A4301 = "1";
        }
        if (rb_A4301_2.isChecked()) {
            A4301 = "2";
        }
        if (rb_A4301_DK.isChecked()) {
            A4301 = "9";
        }
        if (rb_A4301_RA.isChecked()) {
            A4301 = "8";
        }

        //A4302_1
        if (rb_A4302_1_1.isChecked()) {
            A4302_1 = "1";
        }
        if (rb_A4302_1_2.isChecked()) {
            A4302_1 = "2";
        }
        if (rb_A4302_1_DK.isChecked()) {
            A4302_1 = "9";
        }
        if (rb_A4302_1_RA.isChecked()) {
            A4302_1 = "8";
        }

        //A4302_2
        if (rb_A4302_2_1.isChecked()) {
            A4302_2 = "1";
        }
        if (rb_A4302_2_2.isChecked()) {
            A4302_2 = "2";
        }
        if (rb_A4302_2_DK.isChecked()) {
            A4302_2 = "9";
        }
        if (rb_A4302_2_RA.isChecked()) {
            A4302_2 = "8";
        }

        //A4302_3
        if (rb_A4302_3_1.isChecked()) {
            A4302_3 = "1";
        }
        if (rb_A4302_3_2.isChecked()) {
            A4302_3 = "2";
        }
        if (rb_A4302_3_DK.isChecked()) {
            A4302_3 = "9";
        }
        if (rb_A4302_3_RA.isChecked()) {
            A4302_3 = "8";
        }

        //A4302_4
        if (rb_A4302_4_1.isChecked()) {
            A4302_4 = "1";
        }
        if (rb_A4302_4_2.isChecked()) {
            A4302_4 = "2";
        }
        if (rb_A4302_4_DK.isChecked()) {
            A4302_4 = "9";
        }
        if (rb_A4302_4_RA.isChecked()) {
            A4302_4 = "8";
        }

        //A4302_5
        if (rb_A4302_5_1.isChecked()) {
            A4302_5 = "1";
        }
        if (rb_A4302_5_2.isChecked()) {
            A4302_5 = "2";
        }
        if (rb_A4302_5_DK.isChecked()) {
            A4302_5 = "9";
        }
        if (rb_A4302_5_RA.isChecked()) {
            A4302_5 = "8";
        }

        //A4302_6
        if (rb_A4302_6_1.isChecked()) {
            A4302_6 = "1";
        }
        if (rb_A4302_6_2.isChecked()) {
            A4302_6 = "2";
        }
        if (rb_A4302_6_DK.isChecked()) {
            A4302_6 = "9";
        }
        if (rb_A4302_6_RA.isChecked()) {
            A4302_6 = "8";
        }

        //A4302_7
        if (rb_A4302_7_1.isChecked()) {
            A4302_7 = "1";
        }
        if (rb_A4302_7_2.isChecked()) {
            A4302_7 = "2";
        }
        if (rb_A4302_7_DK.isChecked()) {
            A4302_7 = "9";
        }
        if (rb_A4302_7_RA.isChecked()) {
            A4302_7 = "8";
        }

        //A4303
        if (rb_A4303_1.isChecked()) {
            A4303 = "1";
        }
        if (rb_A4303_2.isChecked()) {
            A4303 = "2";
        }
        if (rb_A4303_DK.isChecked()) {
            A4303 = "9";
        }
        if (rb_A4303_RA.isChecked()) {
            A4303 = "8";
        }

        //A4304
        if (rb_A4304_1.isChecked()) {
            A4304 = "1";
        }
        if (rb_A4304_2.isChecked()) {
            A4304 = "2";
        }
        if (rb_A4304_DK.isChecked()) {
            A4304 = "9";
        }
        if (rb_A4304_RA.isChecked()) {
            A4304 = "8";
        }

        //A4305
        if (rb_A4305_1.isChecked()) {
            A4305 = "1";
        }
        if (rb_A4305_2.isChecked()) {
            A4305 = "2";
        }

        //A4306_1check
        if (rb_A4306_1check_1.isChecked()) {
            A4306_1check = "1";
        }
        if (rb_A4306_1check_2.isChecked()) {
            A4306_1check = "2";
        }

        //A4306_2check
        if (rb_A4306_2check_1.isChecked()) {
            A4306_2check = "1";
        }
        if (rb_A4306_2check_2.isChecked()) {
            A4306_2check = "2";
        }

        //A4306_1
        if (ed_A4306_1.getText().toString().trim().length() > 0) {
            A4306_1 = ed_A4306_1.getText().toString().trim();
        }

        //A4306_2
        if (ed_A4306_2.getText().toString().trim().length() > 0) {
            A4306_2 = ed_A4306_2.getText().toString().trim();
        }

        //A4307
        if (ed_A4307.getText().toString().trim().length() > 0) {
            A4307 = ed_A4307.getText().toString().trim();
        }

        //A4308
        if (ed_A4308.getText().toString().trim().length() > 0) {
            A4308 = ed_A4308.getText().toString().trim();
        }

        //A4309
        if (ed_A4309.getText().toString().trim().length() > 0) {
            A4309 = ed_A4309.getText().toString().trim();
        }

        //A4310_1
        if (rb_A4310_1_1.isChecked()) {
            A4310_1 = "1";
        }
        if (rb_A4310_1_2.isChecked()) {
            A4310_1 = "2";
        }
        if (rb_A4310_1_DK.isChecked()) {
            A4310_1 = "9";
        }
        if (rb_A4310_1_RA.isChecked()) {
            A4310_1 = "8";
        }

        //A4310_2
        if (rb_A4310_2_1.isChecked()) {
            A4310_2 = "1";
        }
        if (rb_A4310_2_2.isChecked()) {
            A4310_2 = "2";
        }
        if (rb_A4310_2_DK.isChecked()) {
            A4310_2 = "9";
        }
        if (rb_A4310_2_RA.isChecked()) {
            A4310_2 = "8";
        }

        //A4310_3
        if (rb_A4310_3_1.isChecked()) {
            A4310_3 = "1";
        }
        if (rb_A4310_3_2.isChecked()) {
            A4310_3 = "2";
        }
        if (rb_A4310_3_DK.isChecked()) {
            A4310_3 = "9";
        }
        if (rb_A4310_3_RA.isChecked()) {
            A4310_3 = "8";
        }

        //A4310_4
        if (rb_A4310_4_1.isChecked()) {
            A4310_4 = "1";
        }
        if (rb_A4310_4_2.isChecked()) {
            A4310_4 = "2";
        }
        if (rb_A4310_4_DK.isChecked()) {
            A4310_4 = "9";
        }
        if (rb_A4310_4_RA.isChecked()) {
            A4310_4 = "8";
        }

        //A4310_5
        if (rb_A4310_5_1.isChecked()) {
            A4310_5 = "1";
        }
        if (rb_A4310_5_2.isChecked()) {
            A4310_5 = "2";
        }
        if (rb_A4310_5_DK.isChecked()) {
            A4310_5 = "9";
        }
        if (rb_A4310_5_RA.isChecked()) {
            A4310_5 = "8";
        }

        //A4310_6
        if (rb_A4310_6_1.isChecked()) {
            A4310_6 = "1";
        }
        if (rb_A4310_6_2.isChecked()) {
            A4310_6 = "2";
        }
        if (rb_A4310_6_DK.isChecked()) {
            A4310_6 = "9";
        }
        if (rb_A4310_6_RA.isChecked()) {
            A4310_6 = "8";
        }

        //A4310_7
        if (rb_A4310_7_1.isChecked()) {
            A4310_7 = "1";
        }
        if (rb_A4310_7_2.isChecked()) {
            A4310_7 = "2";
        }
        if (rb_A4310_7_DK.isChecked()) {
            A4310_7 = "9";
        }
        if (rb_A4310_7_RA.isChecked()) {
            A4310_7 = "8";
        }

        //A4310_8
        if (rb_A4310_8_1.isChecked()) {
            A4310_8 = "1";
        }
        if (rb_A4310_8_2.isChecked()) {
            A4310_8 = "2";
        }
        if (rb_A4310_8_DK.isChecked()) {
            A4310_8 = "9";
        }
        if (rb_A4310_8_RA.isChecked()) {
            A4310_8 = "8";
        }

        //A4310_9
        if (rb_A4310_9_1.isChecked()) {
            A4310_9 = "1";
        }
        if (rb_A4310_9_2.isChecked()) {
            A4310_9 = "2";
        }
        if (rb_A4310_9_DK.isChecked()) {
            A4310_9 = "9";
        }
        if (rb_A4310_9_RA.isChecked()) {
            A4310_9 = "8";
        }

        //A4310_10
        if (rb_A4310_10_1.isChecked()) {
            A4310_10 = "1";
        }
        if (rb_A4310_10_2.isChecked()) {
            A4310_10 = "2";
        }
        if (rb_A4310_10_DK.isChecked()) {
            A4310_10 = "9";
        }
        if (rb_A4310_10_RA.isChecked()) {
            A4310_10 = "8";
        }

        //A4310_11
        if (rb_A4310_11_1.isChecked()) {
            A4310_11 = "1";
        }
        if (rb_A4310_11_2.isChecked()) {
            A4310_11 = "2";
        }
        if (rb_A4310_11_DK.isChecked()) {
            A4310_11 = "9";
        }
        if (rb_A4310_11_RA.isChecked()) {
            A4310_11 = "8";
        }

        //A4311_1
        if (rb_A4311_1_1.isChecked()) {
            A4311_1 = "1";
        }
        if (rb_A4311_1_2.isChecked()) {
            A4311_1 = "2";
        }
        if (rb_A4311_1_DK.isChecked()) {
            A4311_1 = "9";
        }
        if (rb_A4311_1_RA.isChecked()) {
            A4311_1 = "8";
        }

        //A4311_2
        if (rb_A4311_2_1.isChecked()) {
            A4311_2 = "1";
        }
        if (rb_A4311_2_2.isChecked()) {
            A4311_2 = "2";
        }
        if (rb_A4311_2_DK.isChecked()) {
            A4311_2 = "9";
        }
        if (rb_A4311_2_RA.isChecked()) {
            A4311_2 = "8";
        }

        //A4311_3
        if (rb_A4311_3_1.isChecked()) {
            A4311_3 = "1";
        }
        if (rb_A4311_3_2.isChecked()) {
            A4311_3 = "2";
        }
        if (rb_A4311_3_DK.isChecked()) {
            A4311_3 = "9";
        }
        if (rb_A4311_3_RA.isChecked()) {
            A4311_3 = "8";
        }

        //A4311_4
        if (rb_A4311_4_1.isChecked()) {
            A4311_4 = "1";
        }
        if (rb_A4311_4_2.isChecked()) {
            A4311_4 = "2";
        }
        if (rb_A4311_4_DK.isChecked()) {
            A4311_4 = "9";
        }
        if (rb_A4311_4_RA.isChecked()) {
            A4311_4 = "8";
        }

        //A4311_5
        if (rb_A4311_5_1.isChecked()) {
            A4311_5 = "1";
        }
        if (rb_A4311_5_2.isChecked()) {
            A4311_5 = "2";
        }
        if (rb_A4311_5_DK.isChecked()) {
            A4311_5 = "9";
        }
        if (rb_A4311_5_RA.isChecked()) {
            A4311_5 = "8";
        }

        //A4312
        if (rb_A4312_1.isChecked()) {
            A4312 = "1";
        }
        if (rb_A4312_2.isChecked()) {
            A4312 = "2";
        }
        if (rb_A4312_DK.isChecked()) {
            A4312 = "9";
        }
        if (rb_A4312_RA.isChecked()) {
            A4312 = "8";
        }

        //A4313
        if (rb_A4313_1.isChecked()) {
            A4313 = "1";
        }
        if (rb_A4313_2.isChecked()) {
            A4313 = "2";
        }
        if (rb_A4313_DK.isChecked()) {
            A4313 = "9";
        }
        if (rb_A4313_RA.isChecked()) {
            A4313 = "8";
        }

        //A4314
        if (rb_A4314_1.isChecked()) {
            A4314 = "1";
        }
        if (rb_A4314_2.isChecked()) {
            A4314 = "2";
        }
        if (rb_A4314_DK.isChecked()) {
            A4314 = "9";
        }
        if (rb_A4314_RA.isChecked()) {
            A4314 = "8";
        }

        //A4315
        if (ed_A4315.getText().toString().trim().length() > 0) {
            A4315 = ed_A4315.getText().toString().trim();
        }


    }

    void insert_data() {

        String query = "insert into A4301_A4315("

                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4301 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4302_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4302_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4302_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4302_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4302_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4302_6 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4302_7 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4303 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4304 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4305 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4306_1check + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4306_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4306_2check + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4306_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4307 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4308 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4309 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4310_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4310_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4310_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4310_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4310_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4310_6 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4310_7 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4310_8 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4310_9 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4310_10 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4310_11 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4311_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4311_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4311_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4311_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4311_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4312 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4313 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4314 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.A4315 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4301_A4315.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4301 + "','" +
                A4302_1 + "','" +
                A4302_2 + "','" +
                A4302_3 + "','" +
                A4302_4 + "','" +
                A4302_5 + "','" +
                A4302_6 + "','" +
                A4302_7 + "','" +
                A4303 + "','" +
                A4304 + "','" +
                A4305 + "','" +
                A4306_1check + "','" +
                A4306_1 + "','" +
                A4306_2check + "','" +
                A4306_2 + "','" +
                A4307 + "','" +
                A4308 + "','" +
                A4309 + "','" +
                A4310_1 + "','" +
                A4310_2 + "','" +
                A4310_3 + "','" +
                A4310_4 + "','" +
                A4310_5 + "','" +
                A4310_6 + "','" +
                A4310_7 + "','" +
                A4310_8 + "','" +
                A4310_9 + "','" +
                A4310_10 + "','" +
                A4310_11 + "','" +
                A4311_1 + "','" +
                A4311_2 + "','" +
                A4311_3 + "','" +
                A4311_4 + "','" +
                A4311_5 + "','" +
                A4312 + "','" +
                A4313 + "','" +
                A4314 + "','" +
                A4315 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "12th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4301) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4302_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4302_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4302_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4302_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4302_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4302_6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4302_7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4303) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4304) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4305) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4306_1check) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4306_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4306_2check) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4306_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4307) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4308) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4309) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4310_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4310_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4310_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4310_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4310_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4310_6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4310_7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4310_8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4310_9) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4310_10) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4310_11) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4311_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4311_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4311_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4311_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4311_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4312) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4313) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4314) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_A4315) != false;
    }


    public boolean validate(final String date) {

        matcher = pattern.matcher(date);

        if (date.equals("99/99/9999")) {

            return true;

        } else if (matcher.matches()) {

            matcher.reset();

            if (matcher.find()) {

                String day = matcher.group(1);
                String month = matcher.group(2);
                int year = Integer.parseInt(matcher.group(3));

                if (day.equals("31") &&
                        (month.equals("4") || month.equals("6") || month.equals("9") ||
                                month.equals("11") || month.equals("04") || month.equals("06") ||
                                month.equals("09"))) {
                    return false; // only 1,3,5,7,8,10,12 has 31 days
                } else if (month.equals("2") || month.equals("02")) {
                    //leap year
                    if (year % 4 == 0) {
                        return !day.equals("30") && !day.equals("31");
                    } else {
                        return !day.equals("29") && !day.equals("30") && !day.equals("31");
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 13);
    }
}
