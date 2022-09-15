package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;
import edu.aku.abdulsajid.vasa2018.utils.Gothrough;
import edu.aku.abdulsajid.vasa2018.utils.InputFilterMinMax;

public class A4206_A4207 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {




    //Declaration
    Button
            btn_next10;

    LinearLayout
            ll_study_id,
            ll_A4206,
            ll_A4206_1,
            ll_A4206_2,
            ll_A4206_3,
            ll_A4206_4,
            ll_A4206_5,
            ll_A4206_6,
            ll_A4206_7,
            ll_A4206_8,
            ll_A4206_9,
            ll_A4206_10,
            ll_A4206_11,
            ll_A4206_12,
            ll_A4206_13,
            ll_A4206_14,
            ll_A4206_15,
            ll_A4206_16,
            ll_A4206_17,
            ll_A4206_18,
            ll_A4206_19,
            ll_A4206_20,
            ll_A4206_21,
            ll_A4206_22,
            ll_A4207;

    RadioButton
            rb_A4206_1,
            rb_A4206_2,
            rb_A4206_DK,
            rb_A4206_RA,
            rb_A4206_1_1,
            rb_A4206_1_2,
            rb_A4206_1_DK,
            rb_A4206_1_RA,
            rb_A4206_2_1,
            rb_A4206_2_2,
            rb_A4206_2_3,
            rb_A4206_2_4,
            rb_A4206_2_5,
            rb_A4206_2_6,
            rb_A4206_2_DK,
            rb_A4206_2_RA,
            rb_A4206_3_1,
            rb_A4206_3_2,
            rb_A4206_3_3,
            rb_A4206_3_4,
            rb_A4206_3_5,
            rb_A4206_3_6,
            rb_A4206_3_7,
            rb_A4206_3_DK,
            rb_A4206_3_RA,
            rb_A4206_4_1,
            rb_A4206_4_2,
            rb_A4206_4_DK,
            rb_A4206_4_RA,
            rb_A4206_5_1,
            rb_A4206_5_2,
            rb_A4206_5_DK,
            rb_A4206_5_RA,
            rb_A4206_6_1,
            rb_A4206_6_2,
            rb_A4206_6_DK,
            rb_A4206_6_RA,
            rb_A4206_7_1,
            rb_A4206_7_2,
            rb_A4206_7_DK,
            rb_A4206_7_RA,
            rb_A4206_8_1,
            rb_A4206_8_2,
            rb_A4206_8_DK,
            rb_A4206_8_RA,
            rb_A4206_9_1,
            rb_A4206_9_2,
            rb_A4206_9_DK,
            rb_A4206_9_RA,
            rb_A4206_10_1,
            rb_A4206_10_2,
            rb_A4206_10_3,
            rb_A4206_10_4,
            rb_A4206_10_DK,
            rb_A4206_10_RA,
            rb_A4206_11_1,
            rb_A4206_11_2,
            rb_A4206_11_DK,
            rb_A4206_11_RA,
            rb_A4206_12_1,
            rb_A4206_12_2,
            rb_A4206_12_DK,
            rb_A4206_12_RA,
            rb_A4206_13_1,
            rb_A4206_13_2,
            rb_A4206_13_DK,
            rb_A4206_13_RA,
            rb_A4206_14_1,
            rb_A4206_14_2,
            rb_A4206_14_DK,
            rb_A4206_14_RA,
            rb_A4206_15_1,
            rb_A4206_15_2,
            rb_A4206_15_DK,
            rb_A4206_15_RA,
            rb_A4206_16_1,
            rb_A4206_16_2,
            rb_A4206_16_DK,
            rb_A4206_16_RA,
            rb_A4206_17_1,
            rb_A4206_17_2,
            rb_A4206_17_DK,
            rb_A4206_17_RA,
            rb_A4206_18_1,
            rb_A4206_18_2,
            rb_A4206_18_DK,
            rb_A4206_18_RA,
            rb_A4206_19_1,
            rb_A4206_19_2,
            rb_A4206_19_DK,
            rb_A4206_19_RA,
            rb_A4206_20_1,
            rb_A4206_20_2,
            rb_A4206_20_DK,
            rb_A4206_20_RA,
            rb_A4206_21_1,
            rb_A4206_21_2,
            rb_A4206_21_DK,
            rb_A4206_21_RA,
            rb_A4206_22_1,
            rb_A4206_22_2,
            rb_A4206_22_DK,
            rb_A4206_22_RA;

    EditText
            ed_study_id,
            ed_A4207_hour,
            ed_A4207_day;


    String
            study_id,
            A4206,
            A4206_1,
            A4206_2,
            A4206_3,
            A4206_4,
            A4206_5,
            A4206_6,
            A4206_7,
            A4206_8,
            A4206_9,
            A4206_10,
            A4206_11,
            A4206_12,
            A4206_13,
            A4206_14,
            A4206_15,
            A4206_16,
            A4206_17,
            A4206_18,
            A4206_19,
            A4206_20,
            A4206_21,
            A4206_22,
            A4207_hour,
            A4207_day,
            STATUS;

    int currentSection;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next10 = findViewById(R.id.btn_next10);

        //Linear Layout
        ll_A4206 = findViewById(R.id.ll_A4206);
        ll_A4206_1 = findViewById(R.id.ll_A4206_1);
        ll_A4206_2 = findViewById(R.id.ll_A4206_2);
        ll_A4206_3 = findViewById(R.id.ll_A4206_3);
        ll_A4206_4 = findViewById(R.id.ll_A4206_4);
        ll_A4206_5 = findViewById(R.id.ll_A4206_5);
        ll_A4206_6 = findViewById(R.id.ll_A4206_6);
        ll_A4206_7 = findViewById(R.id.ll_A4206_7);
        ll_A4206_8 = findViewById(R.id.ll_A4206_8);
        ll_A4206_9 = findViewById(R.id.ll_A4206_9);
        ll_A4206_10 = findViewById(R.id.ll_A4206_10);
        ll_A4206_11 = findViewById(R.id.ll_A4206_11);
        ll_A4206_12 = findViewById(R.id.ll_A4206_12);
        ll_A4206_13 = findViewById(R.id.ll_A4206_13);
        ll_A4206_14 = findViewById(R.id.ll_A4206_14);
        ll_A4206_15 = findViewById(R.id.ll_A4206_15);
        ll_A4206_16 = findViewById(R.id.ll_A4206_16);
        ll_A4206_17 = findViewById(R.id.ll_A4206_17);
        ll_A4206_18 = findViewById(R.id.ll_A4206_18);
        ll_A4206_19 = findViewById(R.id.ll_A4206_19);
        ll_A4206_20 = findViewById(R.id.ll_A4206_20);
        ll_A4206_21 = findViewById(R.id.ll_A4206_21);
        ll_A4206_22 = findViewById(R.id.ll_A4206_22);
        ll_A4207 = findViewById(R.id.ll_A4207);

        //Radio Button
        rb_A4206_1 = findViewById(R.id.rb_A4206_1);
        rb_A4206_2 = findViewById(R.id.rb_A4206_2);
        rb_A4206_DK = findViewById(R.id.rb_A4206_DK);
        rb_A4206_RA = findViewById(R.id.rb_A4206_RA);
        rb_A4206_1_1 = findViewById(R.id.rb_A4206_1_1);
        rb_A4206_1_2 = findViewById(R.id.rb_A4206_1_2);
        rb_A4206_1_DK = findViewById(R.id.rb_A4206_1_DK);
        rb_A4206_1_RA = findViewById(R.id.rb_A4206_1_RA);
        rb_A4206_2_1 = findViewById(R.id.rb_A4206_2_1);
        rb_A4206_2_2 = findViewById(R.id.rb_A4206_2_2);
        rb_A4206_2_3 = findViewById(R.id.rb_A4206_2_3);
        rb_A4206_2_4 = findViewById(R.id.rb_A4206_2_4);
        rb_A4206_2_5 = findViewById(R.id.rb_A4206_2_5);
        rb_A4206_2_6 = findViewById(R.id.rb_A4206_2_6);
        rb_A4206_2_DK = findViewById(R.id.rb_A4206_2_DK);
        rb_A4206_2_RA = findViewById(R.id.rb_A4206_2_RA);
        rb_A4206_3_1 = findViewById(R.id.rb_A4206_3_1);
        rb_A4206_3_2 = findViewById(R.id.rb_A4206_3_2);
        rb_A4206_3_3 = findViewById(R.id.rb_A4206_3_3);
        rb_A4206_3_4 = findViewById(R.id.rb_A4206_3_4);
        rb_A4206_3_5 = findViewById(R.id.rb_A4206_3_5);
        rb_A4206_3_6 = findViewById(R.id.rb_A4206_3_6);
        rb_A4206_3_7 = findViewById(R.id.rb_A4206_3_7);
        rb_A4206_3_DK = findViewById(R.id.rb_A4206_3_DK);
        rb_A4206_3_RA = findViewById(R.id.rb_A4206_3_RA);
        rb_A4206_4_1 = findViewById(R.id.rb_A4206_4_1);
        rb_A4206_4_2 = findViewById(R.id.rb_A4206_4_2);
        rb_A4206_4_DK = findViewById(R.id.rb_A4206_4_DK);
        rb_A4206_4_RA = findViewById(R.id.rb_A4206_4_RA);
        rb_A4206_5_1 = findViewById(R.id.rb_A4206_5_1);
        rb_A4206_5_2 = findViewById(R.id.rb_A4206_5_2);
        rb_A4206_5_DK = findViewById(R.id.rb_A4206_5_DK);
        rb_A4206_5_RA = findViewById(R.id.rb_A4206_5_RA);
        rb_A4206_6_1 = findViewById(R.id.rb_A4206_6_1);
        rb_A4206_6_2 = findViewById(R.id.rb_A4206_6_2);
        rb_A4206_6_DK = findViewById(R.id.rb_A4206_6_DK);
        rb_A4206_6_RA = findViewById(R.id.rb_A4206_6_RA);
        rb_A4206_7_1 = findViewById(R.id.rb_A4206_7_1);
        rb_A4206_7_2 = findViewById(R.id.rb_A4206_7_2);
        rb_A4206_7_DK = findViewById(R.id.rb_A4206_7_DK);
        rb_A4206_7_RA = findViewById(R.id.rb_A4206_7_RA);
        rb_A4206_8_1 = findViewById(R.id.rb_A4206_8_1);
        rb_A4206_8_2 = findViewById(R.id.rb_A4206_8_2);
        rb_A4206_8_DK = findViewById(R.id.rb_A4206_8_DK);
        rb_A4206_8_RA = findViewById(R.id.rb_A4206_8_RA);
        rb_A4206_9_1 = findViewById(R.id.rb_A4206_9_1);
        rb_A4206_9_2 = findViewById(R.id.rb_A4206_9_2);
        rb_A4206_9_DK = findViewById(R.id.rb_A4206_9_DK);
        rb_A4206_9_RA = findViewById(R.id.rb_A4206_9_RA);
        rb_A4206_10_1 = findViewById(R.id.rb_A4206_10_1);
        rb_A4206_10_2 = findViewById(R.id.rb_A4206_10_2);
        rb_A4206_10_3 = findViewById(R.id.rb_A4206_10_3);
        rb_A4206_10_4 = findViewById(R.id.rb_A4206_10_4);
        rb_A4206_10_DK = findViewById(R.id.rb_A4206_10_DK);
        rb_A4206_10_RA = findViewById(R.id.rb_A4206_10_RA);
        rb_A4206_11_1 = findViewById(R.id.rb_A4206_11_1);
        rb_A4206_11_2 = findViewById(R.id.rb_A4206_11_2);
        rb_A4206_11_DK = findViewById(R.id.rb_A4206_11_DK);
        rb_A4206_11_RA = findViewById(R.id.rb_A4206_11_RA);
        rb_A4206_12_1 = findViewById(R.id.rb_A4206_12_1);
        rb_A4206_12_2 = findViewById(R.id.rb_A4206_12_2);
        rb_A4206_12_DK = findViewById(R.id.rb_A4206_12_DK);
        rb_A4206_12_RA = findViewById(R.id.rb_A4206_12_RA);
        rb_A4206_13_1 = findViewById(R.id.rb_A4206_13_1);
        rb_A4206_13_2 = findViewById(R.id.rb_A4206_13_2);
        rb_A4206_13_DK = findViewById(R.id.rb_A4206_13_DK);
        rb_A4206_13_RA = findViewById(R.id.rb_A4206_13_RA);
        rb_A4206_14_1 = findViewById(R.id.rb_A4206_14_1);
        rb_A4206_14_2 = findViewById(R.id.rb_A4206_14_2);
        rb_A4206_14_DK = findViewById(R.id.rb_A4206_14_DK);
        rb_A4206_14_RA = findViewById(R.id.rb_A4206_14_RA);
        rb_A4206_15_1 = findViewById(R.id.rb_A4206_15_1);
        rb_A4206_15_2 = findViewById(R.id.rb_A4206_15_2);
        rb_A4206_15_DK = findViewById(R.id.rb_A4206_15_DK);
        rb_A4206_15_RA = findViewById(R.id.rb_A4206_15_RA);
        rb_A4206_16_1 = findViewById(R.id.rb_A4206_16_1);
        rb_A4206_16_2 = findViewById(R.id.rb_A4206_16_2);
        rb_A4206_16_DK = findViewById(R.id.rb_A4206_16_DK);
        rb_A4206_16_RA = findViewById(R.id.rb_A4206_16_RA);
        rb_A4206_17_1 = findViewById(R.id.rb_A4206_17_1);
        rb_A4206_17_2 = findViewById(R.id.rb_A4206_17_2);
        rb_A4206_17_DK = findViewById(R.id.rb_A4206_17_DK);
        rb_A4206_17_RA = findViewById(R.id.rb_A4206_17_RA);
        rb_A4206_18_1 = findViewById(R.id.rb_A4206_18_1);
        rb_A4206_18_2 = findViewById(R.id.rb_A4206_18_2);
        rb_A4206_18_DK = findViewById(R.id.rb_A4206_18_DK);
        rb_A4206_18_RA = findViewById(R.id.rb_A4206_18_RA);
        rb_A4206_19_1 = findViewById(R.id.rb_A4206_19_1);
        rb_A4206_19_2 = findViewById(R.id.rb_A4206_19_2);
        rb_A4206_19_DK = findViewById(R.id.rb_A4206_19_DK);
        rb_A4206_19_RA = findViewById(R.id.rb_A4206_19_RA);
        rb_A4206_20_1 = findViewById(R.id.rb_A4206_20_1);
        rb_A4206_20_2 = findViewById(R.id.rb_A4206_20_2);
        rb_A4206_20_DK = findViewById(R.id.rb_A4206_20_DK);
        rb_A4206_20_RA = findViewById(R.id.rb_A4206_20_RA);
        rb_A4206_21_1 = findViewById(R.id.rb_A4206_21_1);
        rb_A4206_21_2 = findViewById(R.id.rb_A4206_21_2);
        rb_A4206_21_DK = findViewById(R.id.rb_A4206_21_DK);
        rb_A4206_21_RA = findViewById(R.id.rb_A4206_21_RA);
        rb_A4206_22_1 = findViewById(R.id.rb_A4206_22_1);
        rb_A4206_22_2 = findViewById(R.id.rb_A4206_22_2);
        rb_A4206_22_DK = findViewById(R.id.rb_A4206_22_DK);
        rb_A4206_22_RA = findViewById(R.id.rb_A4206_22_RA);

        // Edit Text
        ed_A4207_day = findViewById(R.id.ed_A4207_day);
        ed_A4207_hour = findViewById(R.id.ed_A4207_hour);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4206__a4207);

        this.setTitle(getString(R.string.h_a_sec_I_A));

        ll_study_id = findViewById(R.id.ll_study_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();
        events_calls();
    }

    @Override
    public void onClick(View view) {
        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        Intent c = new Intent(A4206_A4207.this, A4251_A4284.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


        //A4206
        if (compoundButton.getId() == R.id.rb_A4206_1
                || compoundButton.getId() == R.id.rb_A4206_2
                || compoundButton.getId() == R.id.rb_A4206_DK
                || compoundButton.getId() == R.id.rb_A4206_RA)

        {
            if (rb_A4206_2.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4206_1);
                ClearAllcontrol.ClearAll(ll_A4206_2);
                ClearAllcontrol.ClearAll(ll_A4206_3);
                ClearAllcontrol.ClearAll(ll_A4206_4);
                ClearAllcontrol.ClearAll(ll_A4206_5);
                ClearAllcontrol.ClearAll(ll_A4206_6);
                ClearAllcontrol.ClearAll(ll_A4206_7);
                ClearAllcontrol.ClearAll(ll_A4206_8);
                ClearAllcontrol.ClearAll(ll_A4206_9);
                ClearAllcontrol.ClearAll(ll_A4206_10);
                ClearAllcontrol.ClearAll(ll_A4206_11);
                ClearAllcontrol.ClearAll(ll_A4206_12);
                ClearAllcontrol.ClearAll(ll_A4206_13);
                ClearAllcontrol.ClearAll(ll_A4206_14);
                ClearAllcontrol.ClearAll(ll_A4206_15);
                ClearAllcontrol.ClearAll(ll_A4206_16);
                ClearAllcontrol.ClearAll(ll_A4206_17);
                ClearAllcontrol.ClearAll(ll_A4206_18);
                ClearAllcontrol.ClearAll(ll_A4206_19);
                ClearAllcontrol.ClearAll(ll_A4206_20);
                ClearAllcontrol.ClearAll(ll_A4206_21);
                ClearAllcontrol.ClearAll(ll_A4206_22);
                ClearAllcontrol.ClearAll(ll_A4207);

                ll_A4206_1.setVisibility(View.GONE);
                ll_A4206_2.setVisibility(View.GONE);
                ll_A4206_3.setVisibility(View.GONE);
                ll_A4206_4.setVisibility(View.GONE);
                ll_A4206_5.setVisibility(View.GONE);
                ll_A4206_6.setVisibility(View.GONE);
                ll_A4206_7.setVisibility(View.GONE);
                ll_A4206_8.setVisibility(View.GONE);
                ll_A4206_9.setVisibility(View.GONE);
                ll_A4206_10.setVisibility(View.GONE);
                ll_A4206_11.setVisibility(View.GONE);
                ll_A4206_12.setVisibility(View.GONE);
                ll_A4206_13.setVisibility(View.GONE);
                ll_A4206_14.setVisibility(View.GONE);
                ll_A4206_15.setVisibility(View.GONE);
                ll_A4206_16.setVisibility(View.GONE);
                ll_A4206_17.setVisibility(View.GONE);
                ll_A4206_18.setVisibility(View.GONE);
                ll_A4206_19.setVisibility(View.GONE);
                ll_A4206_20.setVisibility(View.GONE);
                ll_A4206_21.setVisibility(View.GONE);
                ll_A4206_22.setVisibility(View.GONE);
                ll_A4207.setVisibility(View.GONE);

            } else {
                ll_A4206_1.setVisibility(View.VISIBLE);
                ll_A4206_2.setVisibility(View.VISIBLE);
                ll_A4206_3.setVisibility(View.VISIBLE);
                ll_A4206_4.setVisibility(View.VISIBLE);
                ll_A4206_5.setVisibility(View.VISIBLE);
                ll_A4206_6.setVisibility(View.VISIBLE);
                ll_A4206_7.setVisibility(View.VISIBLE);
                ll_A4206_8.setVisibility(View.VISIBLE);
                ll_A4206_9.setVisibility(View.VISIBLE);
                ll_A4206_10.setVisibility(View.VISIBLE);
                ll_A4206_11.setVisibility(View.VISIBLE);
                ll_A4206_12.setVisibility(View.VISIBLE);
                ll_A4206_13.setVisibility(View.VISIBLE);
                ll_A4206_14.setVisibility(View.VISIBLE);
                ll_A4206_15.setVisibility(View.VISIBLE);
                ll_A4206_16.setVisibility(View.VISIBLE);
                ll_A4206_17.setVisibility(View.VISIBLE);
                ll_A4206_18.setVisibility(View.VISIBLE);
                ll_A4206_19.setVisibility(View.VISIBLE);
                ll_A4206_20.setVisibility(View.VISIBLE);
                ll_A4206_21.setVisibility(View.VISIBLE);
                ll_A4206_22.setVisibility(View.VISIBLE);
                ll_A4207.setVisibility(View.VISIBLE);
            }
        }


        //A4206_1
        if (compoundButton.getId() == R.id.rb_A4206_1_1
                || compoundButton.getId() == R.id.rb_A4206_1_2
                || compoundButton.getId() == R.id.rb_A4206_1_DK
                || compoundButton.getId() == R.id.rb_A4206_1_RA)

        {
            if (rb_A4206_1_2.isChecked() || rb_A4206_1_DK.isChecked() || rb_A4206_1_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4206_2);
                ClearAllcontrol.ClearAll(ll_A4206_3);

                ll_A4206_2.setVisibility(View.GONE);
                ll_A4206_3.setVisibility(View.GONE);

            } else {
                ll_A4206_2.setVisibility(View.VISIBLE);
                ll_A4206_3.setVisibility(View.VISIBLE);
            }
        }


        //A4206_3
        if (compoundButton.getId() == R.id.rb_A4206_3_1
                || compoundButton.getId() == R.id.rb_A4206_3_2
                || compoundButton.getId() == R.id.rb_A4206_3_3
                || compoundButton.getId() == R.id.rb_A4206_3_4
                || compoundButton.getId() == R.id.rb_A4206_3_5
                || compoundButton.getId() == R.id.rb_A4206_3_6
                || compoundButton.getId() == R.id.rb_A4206_3_7
                || compoundButton.getId() == R.id.rb_A4206_3_DK
                || compoundButton.getId() == R.id.rb_A4206_3_RA) {


            if (rb_A4206_3_1.isChecked() || rb_A4206_3_2.isChecked() || rb_A4206_3_3.isChecked() || rb_A4206_3_4.isChecked() || rb_A4206_3_5.isChecked() || rb_A4206_3_6.isChecked() || rb_A4206_3_7.isChecked() || rb_A4206_3_DK.isChecked() || rb_A4206_3_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4206_4);
                ClearAllcontrol.ClearAll(ll_A4206_5);
                ClearAllcontrol.ClearAll(ll_A4206_6);
                ClearAllcontrol.ClearAll(ll_A4206_7);
                ClearAllcontrol.ClearAll(ll_A4206_8);
                ClearAllcontrol.ClearAll(ll_A4206_9);
                ClearAllcontrol.ClearAll(ll_A4206_10);
                ClearAllcontrol.ClearAll(ll_A4206_11);
                ClearAllcontrol.ClearAll(ll_A4206_12);
                ClearAllcontrol.ClearAll(ll_A4206_13);
                ClearAllcontrol.ClearAll(ll_A4206_14);
                ClearAllcontrol.ClearAll(ll_A4206_15);
                ClearAllcontrol.ClearAll(ll_A4206_16);
                ClearAllcontrol.ClearAll(ll_A4206_17);
                ClearAllcontrol.ClearAll(ll_A4206_18);
                ClearAllcontrol.ClearAll(ll_A4206_19);

                ll_A4206_4.setVisibility(View.GONE);
                ll_A4206_5.setVisibility(View.GONE);
                ll_A4206_6.setVisibility(View.GONE);
                ll_A4206_7.setVisibility(View.GONE);
                ll_A4206_8.setVisibility(View.GONE);
                ll_A4206_9.setVisibility(View.GONE);
                ll_A4206_10.setVisibility(View.GONE);
                ll_A4206_11.setVisibility(View.GONE);
                ll_A4206_12.setVisibility(View.GONE);
                ll_A4206_13.setVisibility(View.GONE);
                ll_A4206_14.setVisibility(View.GONE);
                ll_A4206_15.setVisibility(View.GONE);
                ll_A4206_16.setVisibility(View.GONE);
                ll_A4206_17.setVisibility(View.GONE);
                ll_A4206_18.setVisibility(View.GONE);
                ll_A4206_19.setVisibility(View.GONE);

            } else {
                ll_A4206_4.setVisibility(View.VISIBLE);
                ll_A4206_5.setVisibility(View.VISIBLE);
                ll_A4206_6.setVisibility(View.VISIBLE);
                ll_A4206_7.setVisibility(View.VISIBLE);
                ll_A4206_8.setVisibility(View.VISIBLE);
                ll_A4206_9.setVisibility(View.VISIBLE);
                ll_A4206_10.setVisibility(View.VISIBLE);
                ll_A4206_11.setVisibility(View.VISIBLE);
                ll_A4206_12.setVisibility(View.VISIBLE);
                ll_A4206_13.setVisibility(View.VISIBLE);
                ll_A4206_14.setVisibility(View.VISIBLE);
                ll_A4206_15.setVisibility(View.VISIBLE);
                ll_A4206_16.setVisibility(View.VISIBLE);
                ll_A4206_17.setVisibility(View.VISIBLE);
                ll_A4206_18.setVisibility(View.VISIBLE);
                ll_A4206_19.setVisibility(View.VISIBLE);
            }
        }


        //A4206_8
        if (compoundButton.getId() == R.id.rb_A4206_8_1
                || compoundButton.getId() == R.id.rb_A4206_8_2
                || compoundButton.getId() == R.id.rb_A4206_8_DK
                || compoundButton.getId() == R.id.rb_A4206_8_RA)

        {
            if (rb_A4206_8_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4206_9);

                ll_A4206_9.setVisibility(View.GONE);

            } else {
                ll_A4206_9.setVisibility(View.VISIBLE);
            }
        }


        //A4206_9
        if (compoundButton.getId() == R.id.rb_A4206_9_1
                || compoundButton.getId() == R.id.rb_A4206_9_2
                || compoundButton.getId() == R.id.rb_A4206_9_DK
                || compoundButton.getId() == R.id.rb_A4206_9_RA)

        {
            if (rb_A4206_9_2.isChecked() || rb_A4206_9_DK.isChecked() || rb_A4206_9_RA.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4206_10);

                ll_A4206_10.setVisibility(View.GONE);

            } else {
                ll_A4206_10.setVisibility(View.VISIBLE);
            }
        }


        //A4206_21
        if (compoundButton.getId() == R.id.rb_A4206_21_1
                || compoundButton.getId() == R.id.rb_A4206_21_2
                || compoundButton.getId() == R.id.rb_A4206_21_DK
                || compoundButton.getId() == R.id.rb_A4206_21_RA)

        {
            if (rb_A4206_21_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4206_22);

                ll_A4206_22.setVisibility(View.GONE);

            } else {
                ll_A4206_22.setVisibility(View.VISIBLE);
            }
        }


        //A4206_22
        if (compoundButton.getId() == R.id.rb_A4206_22_1
                || compoundButton.getId() == R.id.rb_A4206_22_2
                || compoundButton.getId() == R.id.rb_A4206_22_DK
                || compoundButton.getId() == R.id.rb_A4206_22_RA)

        {
            if (rb_A4206_22_1.isChecked()) {
                ll_A4207.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4207);
                ll_A4207.setVisibility(View.GONE);
            }
        }

    }


    private void events_calls() {

        btn_next10.setOnClickListener(this);

        rb_A4206_1.setOnCheckedChangeListener(this);
        rb_A4206_2.setOnCheckedChangeListener(this);
        rb_A4206_DK.setOnCheckedChangeListener(this);
        rb_A4206_RA.setOnCheckedChangeListener(this);

        rb_A4206_1_1.setOnCheckedChangeListener(this);
        rb_A4206_1_2.setOnCheckedChangeListener(this);
        rb_A4206_1_DK.setOnCheckedChangeListener(this);
        rb_A4206_1_RA.setOnCheckedChangeListener(this);

        rb_A4206_3_1.setOnCheckedChangeListener(this);
        rb_A4206_3_2.setOnCheckedChangeListener(this);
        rb_A4206_3_3.setOnCheckedChangeListener(this);
        rb_A4206_3_4.setOnCheckedChangeListener(this);
        rb_A4206_3_5.setOnCheckedChangeListener(this);
        rb_A4206_3_6.setOnCheckedChangeListener(this);
        rb_A4206_3_7.setOnCheckedChangeListener(this);
        rb_A4206_3_DK.setOnCheckedChangeListener(this);
        rb_A4206_3_RA.setOnCheckedChangeListener(this);

        rb_A4206_8_1.setOnCheckedChangeListener(this);
        rb_A4206_8_2.setOnCheckedChangeListener(this);
        rb_A4206_8_DK.setOnCheckedChangeListener(this);
        rb_A4206_8_RA.setOnCheckedChangeListener(this);

        rb_A4206_9_1.setOnCheckedChangeListener(this);
        rb_A4206_9_2.setOnCheckedChangeListener(this);
        rb_A4206_9_DK.setOnCheckedChangeListener(this);
        rb_A4206_9_RA.setOnCheckedChangeListener(this);

        rb_A4206_21_1.setOnCheckedChangeListener(this);
        rb_A4206_21_2.setOnCheckedChangeListener(this);
        rb_A4206_21_DK.setOnCheckedChangeListener(this);
        rb_A4206_21_RA.setOnCheckedChangeListener(this);

        rb_A4206_22_1.setOnCheckedChangeListener(this);
        rb_A4206_22_2.setOnCheckedChangeListener(this);
        rb_A4206_22_DK.setOnCheckedChangeListener(this);
        rb_A4206_22_RA.setOnCheckedChangeListener(this);

        ed_A4207_hour.setFilters(new InputFilter[]{new InputFilterMinMax(0, 23, 99, 99)});

    }

    void value_assignment() {

        study_id = "0";
        A4206 = "-1";
        A4206_1 = "-1";
        A4206_2 = "-1";
        A4206_3 = "-1";
        A4206_4 = "-1";
        A4206_5 = "-1";
        A4206_6 = "-1";
        A4206_7 = "-1";
        A4206_8 = "-1";
        A4206_9 = "-1";
        A4206_10 = "-1";
        A4206_11 = "-1";
        A4206_12 = "-1";
        A4206_13 = "-1";
        A4206_14 = "-1";
        A4206_15 = "-1";
        A4206_16 = "-1";
        A4206_17 = "-1";
        A4206_18 = "-1";
        A4206_19 = "-1";
        A4206_20 = "-1";
        A4206_21 = "-1";
        A4206_22 = "-1";
        A4207_hour = "-1";
        A4207_day = "-1";
        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4206
        if (rb_A4206_1.isChecked()) {
            A4206 = "1";
        }
        if (rb_A4206_2.isChecked()) {
            A4206 = "2";
        }
        if (rb_A4206_DK.isChecked()) {
            A4206 = "9";
        }
        if (rb_A4206_RA.isChecked()) {
            A4206 = "8";
        }

        //A4206_1
        if (rb_A4206_1_1.isChecked()) {
            A4206_1 = "1";
        }
        if (rb_A4206_1_2.isChecked()) {
            A4206_1 = "2";
        }
        if (rb_A4206_1_DK.isChecked()) {
            A4206_1 = "9";
        }
        if (rb_A4206_1_RA.isChecked()) {
            A4206_1 = "8";
        }

        //A4206_2
        if (rb_A4206_2_1.isChecked()) {
            A4206_2 = "1";
        }
        if (rb_A4206_2_2.isChecked()) {
            A4206_2 = "2";
        }
        if (rb_A4206_2_3.isChecked()) {
            A4206_2 = "3";
        }
        if (rb_A4206_2_4.isChecked()) {
            A4206_2 = "4";
        }
        if (rb_A4206_2_5.isChecked()) {
            A4206_2 = "5";
        }
        if (rb_A4206_2_6.isChecked()) {
            A4206_2 = "6";
        }
        if (rb_A4206_2_DK.isChecked()) {
            A4206_2 = "9";
        }
        if (rb_A4206_2_RA.isChecked()) {
            A4206_2 = "8";
        }

        //A4206_3
        if (rb_A4206_3_1.isChecked()) {
            A4206_3 = "1";
        }
        if (rb_A4206_3_2.isChecked()) {
            A4206_3 = "2";
        }
        if (rb_A4206_3_3.isChecked()) {
            A4206_3 = "3";
        }
        if (rb_A4206_3_4.isChecked()) {
            A4206_3 = "4";
        }
        if (rb_A4206_3_5.isChecked()) {
            A4206_3 = "5";
        }
        if (rb_A4206_3_6.isChecked()) {
            A4206_3 = "6";
        }
        if (rb_A4206_3_7.isChecked()) {
            A4206_3 = "7";
        }
        if (rb_A4206_3_DK.isChecked()) {
            A4206_3 = "9";
        }
        if (rb_A4206_3_RA.isChecked()) {
            A4206_3 = "8";
        }

        //A4206_4
        if (rb_A4206_4_1.isChecked()) {
            A4206_4 = "1";
        }
        if (rb_A4206_4_2.isChecked()) {
            A4206_4 = "2";
        }
        if (rb_A4206_4_DK.isChecked()) {
            A4206_4 = "9";
        }
        if (rb_A4206_4_RA.isChecked()) {
            A4206_4 = "8";
        }

        //A4206_5
        if (rb_A4206_5_1.isChecked()) {
            A4206_5 = "1";
        }
        if (rb_A4206_5_2.isChecked()) {
            A4206_5 = "2";
        }
        if (rb_A4206_5_DK.isChecked()) {
            A4206_5 = "9";
        }
        if (rb_A4206_5_RA.isChecked()) {
            A4206_5 = "8";
        }

        //A4206_6
        if (rb_A4206_6_1.isChecked()) {
            A4206_6 = "1";
        }
        if (rb_A4206_6_2.isChecked()) {
            A4206_6 = "2";
        }
        if (rb_A4206_6_DK.isChecked()) {
            A4206_6 = "9";
        }
        if (rb_A4206_6_RA.isChecked()) {
            A4206_6 = "8";
        }

        //A4206_7
        if (rb_A4206_7_1.isChecked()) {
            A4206_7 = "1";
        }
        if (rb_A4206_7_2.isChecked()) {
            A4206_7 = "2";
        }
        if (rb_A4206_7_DK.isChecked()) {
            A4206_7 = "9";
        }
        if (rb_A4206_7_RA.isChecked()) {
            A4206_7 = "8";
        }

        //A4206_8
        if (rb_A4206_8_1.isChecked()) {
            A4206_8 = "1";
        }
        if (rb_A4206_8_2.isChecked()) {
            A4206_8 = "2";
        }
        if (rb_A4206_8_DK.isChecked()) {
            A4206_8 = "9";
        }
        if (rb_A4206_8_RA.isChecked()) {
            A4206_8 = "8";
        }

        //A4206_9
        if (rb_A4206_9_1.isChecked()) {
            A4206_9 = "1";
        }
        if (rb_A4206_9_2.isChecked()) {
            A4206_9 = "2";
        }
        if (rb_A4206_9_DK.isChecked()) {
            A4206_9 = "9";
        }
        if (rb_A4206_9_RA.isChecked()) {
            A4206_9 = "8";
        }

        //A4206_10
        if (rb_A4206_10_1.isChecked()) {
            A4206_10 = "1";
        }
        if (rb_A4206_10_2.isChecked()) {
            A4206_10 = "2";
        }
        if (rb_A4206_10_3.isChecked()) {
            A4206_10 = "3";
        }
        if (rb_A4206_10_4.isChecked()) {
            A4206_10 = "4";
        }
        if (rb_A4206_10_DK.isChecked()) {
            A4206_10 = "9";
        }
        if (rb_A4206_10_RA.isChecked()) {
            A4206_10 = "8";
        }

        //A4206_11
        if (rb_A4206_11_1.isChecked()) {
            A4206_11 = "1";
        }
        if (rb_A4206_11_2.isChecked()) {
            A4206_11 = "2";
        }
        if (rb_A4206_11_DK.isChecked()) {
            A4206_11 = "9";
        }
        if (rb_A4206_11_RA.isChecked()) {
            A4206_11 = "8";
        }

        //A4206_12
        if (rb_A4206_12_1.isChecked()) {
            A4206_12 = "1";
        }
        if (rb_A4206_12_2.isChecked()) {
            A4206_12 = "2";
        }
        if (rb_A4206_12_DK.isChecked()) {
            A4206_12 = "9";
        }
        if (rb_A4206_12_RA.isChecked()) {
            A4206_12 = "8";
        }

        //A4206_13
        if (rb_A4206_13_1.isChecked()) {
            A4206_13 = "1";
        }
        if (rb_A4206_13_2.isChecked()) {
            A4206_13 = "2";
        }
        if (rb_A4206_13_DK.isChecked()) {
            A4206_13 = "9";
        }
        if (rb_A4206_13_RA.isChecked()) {
            A4206_13 = "8";
        }

        //A4206_14
        if (rb_A4206_14_1.isChecked()) {
            A4206_14 = "1";
        }
        if (rb_A4206_14_2.isChecked()) {
            A4206_14 = "2";
        }
        if (rb_A4206_14_DK.isChecked()) {
            A4206_14 = "9";
        }
        if (rb_A4206_14_RA.isChecked()) {
            A4206_14 = "8";
        }

        //A4206_15
        if (rb_A4206_15_1.isChecked()) {
            A4206_15 = "1";
        }
        if (rb_A4206_15_2.isChecked()) {
            A4206_15 = "2";
        }
        if (rb_A4206_15_DK.isChecked()) {
            A4206_15 = "9";
        }
        if (rb_A4206_15_RA.isChecked()) {
            A4206_15 = "8";
        }

        //A4206_16
        if (rb_A4206_16_1.isChecked()) {
            A4206_16 = "1";
        }
        if (rb_A4206_16_2.isChecked()) {
            A4206_16 = "2";
        }
        if (rb_A4206_16_DK.isChecked()) {
            A4206_16 = "9";
        }
        if (rb_A4206_16_RA.isChecked()) {
            A4206_16 = "8";
        }

        //A4206_17
        if (rb_A4206_17_1.isChecked()) {
            A4206_17 = "1";
        }
        if (rb_A4206_17_2.isChecked()) {
            A4206_17 = "2";
        }
        if (rb_A4206_17_DK.isChecked()) {
            A4206_17 = "9";
        }
        if (rb_A4206_17_RA.isChecked()) {
            A4206_17 = "8";
        }

        //A4206_18
        if (rb_A4206_18_1.isChecked()) {
            A4206_18 = "1";
        }
        if (rb_A4206_18_2.isChecked()) {
            A4206_18 = "2";
        }
        if (rb_A4206_18_DK.isChecked()) {
            A4206_18 = "9";
        }
        if (rb_A4206_18_RA.isChecked()) {
            A4206_18 = "8";
        }

        //A4206_19
        if (rb_A4206_19_1.isChecked()) {
            A4206_19 = "1";
        }
        if (rb_A4206_19_2.isChecked()) {
            A4206_19 = "2";
        }
        if (rb_A4206_19_DK.isChecked()) {
            A4206_19 = "9";
        }
        if (rb_A4206_19_RA.isChecked()) {
            A4206_19 = "8";
        }

        //A4206_20
        if (rb_A4206_20_1.isChecked()) {
            A4206_20 = "1";
        }
        if (rb_A4206_20_2.isChecked()) {
            A4206_20 = "2";
        }
        if (rb_A4206_20_DK.isChecked()) {
            A4206_20 = "9";
        }
        if (rb_A4206_20_RA.isChecked()) {
            A4206_20 = "8";
        }

        //A4206_21
        if (rb_A4206_21_1.isChecked()) {
            A4206_21 = "1";
        }
        if (rb_A4206_21_2.isChecked()) {
            A4206_21 = "2";
        }
        if (rb_A4206_21_DK.isChecked()) {
            A4206_21 = "9";
        }
        if (rb_A4206_21_RA.isChecked()) {
            A4206_21 = "8";
        }

        //A4206_22
        if (rb_A4206_22_1.isChecked()) {
            A4206_22 = "1";
        }
        if (rb_A4206_22_2.isChecked()) {
            A4206_22 = "2";
        }
        if (rb_A4206_22_DK.isChecked()) {
            A4206_22 = "9";
        }
        if (rb_A4206_22_RA.isChecked()) {
            A4206_22 = "8";
        }

        //A4207_hour
        if (ed_A4207_hour.getText().toString().trim().length() > 0) {
            A4207_hour = ed_A4207_hour.getText().toString().trim();
        }

        //A4207_day
        if (ed_A4207_day.getText().toString().trim().length() > 0) {
            A4207_day = ed_A4207_day.getText().toString().trim();
        }

    }

    void insert_data() {

        String query = "insert into A4206_A4207("

                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.study_id + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_1 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_2 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_3 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_4 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_5 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_6 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_7 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_8 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_9 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_10 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_11 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_12 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_13 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_14 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_15 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_16 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_17 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_18 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_19 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_20 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_21 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4206_22 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4207_hour + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.A4207_day + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4206_A4207.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4206 + "','" +
                A4206_1 + "','" +
                A4206_2 + "','" +
                A4206_3 + "','" +
                A4206_4 + "','" +
                A4206_5 + "','" +
                A4206_6 + "','" +
                A4206_7 + "','" +
                A4206_8 + "','" +
                A4206_9 + "','" +
                A4206_10 + "','" +
                A4206_11 + "','" +
                A4206_12 + "','" +
                A4206_13 + "','" +
                A4206_14 + "','" +
                A4206_15 + "','" +
                A4206_16 + "','" +
                A4206_17 + "','" +
                A4206_18 + "','" +
                A4206_19 + "','" +
                A4206_20 + "','" +
                A4206_21 + "','" +
                A4206_22 + "','" +
                A4207_hour + "','" +
                A4207_day + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "10th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_A4206) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_9) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_10) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_11) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_12) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_13) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_14) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_15) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_16) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_17) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_18) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_19) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_20) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_21) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4206_22) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_A4207) != false;
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 11);
    }
}