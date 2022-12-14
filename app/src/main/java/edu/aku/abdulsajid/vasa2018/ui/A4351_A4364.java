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

import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;
import edu.aku.abdulsajid.vasa2018.utils.Gothrough;

public class A4351_A4364 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //  Region_Declaration
    Button
            btn_next13;

    LinearLayout
            ll_study_id,
            ll_A4351,
            ll_A4352,
            ll_A4353,
            ll_A4354,
            ll_A4355,
            ll_A4356,
            ll_A4357,
            ll_A4358,
            ll_A4363,
            ll_A4364;

    RadioButton
            rb_A4351_1,
            rb_A4351_2,
            rb_A4351_DK,
            rb_A4351_RA,
            rb_A4352_1,
            rb_A4352_2,
            rb_A4363_1,
            rb_A4363_2,
            rb_A4363_3,
            rb_A4363_DK,
            rb_A4363_RA;

    EditText
            ed_study_id,
            ed_A4353,
            ed_A4354,
            ed_A4355,
            ed_A4356,
            ed_A4357,
            ed_A4358,
            ed_A4364;

    String
            study_id,
            A4351,
            A4352,
            A4353,
            A4354,
            A4355,
            A4356,
            A4357,
            A4358,
            A4363,
            A4364,
            STATUS;

    int currentSection;

    // End Region_Declaration

    void Initialization() {

        btn_next13 = findViewById(R.id.btn_next13);

        ll_A4351 = findViewById(R.id.ll_A4351);
        ll_A4352 = findViewById(R.id.ll_A4352);
        ll_A4353 = findViewById(R.id.ll_A4353);
        ll_A4354 = findViewById(R.id.ll_A4354);
        ll_A4355 = findViewById(R.id.ll_A4355);
        ll_A4356 = findViewById(R.id.ll_A4356);
        ll_A4357 = findViewById(R.id.ll_A4357);
        ll_A4358 = findViewById(R.id.ll_A4358);
        ll_A4363 = findViewById(R.id.ll_A4363);
        ll_A4364 = findViewById(R.id.ll_A4364);

        rb_A4351_1 = findViewById(R.id.rb_A4351_1);
        rb_A4351_2 = findViewById(R.id.rb_A4351_2);
        rb_A4351_DK = findViewById(R.id.rb_A4351_DK);
        rb_A4351_RA = findViewById(R.id.rb_A4351_RA);
        rb_A4352_1 = findViewById(R.id.rb_A4352_1);
        rb_A4352_2 = findViewById(R.id.rb_A4352_2);
        rb_A4363_1 = findViewById(R.id.rb_A4363_1);
        rb_A4363_2 = findViewById(R.id.rb_A4363_2);
        rb_A4363_3 = findViewById(R.id.rb_A4363_3);
        rb_A4363_DK = findViewById(R.id.rb_A4363_DK);
        rb_A4363_RA = findViewById(R.id.rb_A4363_RA);

        ed_A4353 = findViewById(R.id.ed_A4353);
        ed_A4354 = findViewById(R.id.ed_A4354);
        ed_A4355 = findViewById(R.id.ed_A4355);
        ed_A4356 = findViewById(R.id.ed_A4356);
        ed_A4357 = findViewById(R.id.ed_A4357);
        ed_A4358 = findViewById(R.id.ed_A4358);
        ed_A4364 = findViewById(R.id.ed_A4364);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4351__a4364);

        this.setTitle(getString(R.string.h_a_sec_12));

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

        value_assignment();
        insert_data();

        Intent c = new Intent(A4351_A4364.this, A4401_A4473.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        //A4351
        if (compoundButton.getId() == R.id.rb_A4351_1
                || compoundButton.getId() == R.id.rb_A4351_2
                || compoundButton.getId() == R.id.rb_A4351_DK
                || compoundButton.getId() == R.id.rb_A4351_RA) {

            if (rb_A4351_1.isChecked()) {
                ll_A4352.setVisibility(View.VISIBLE);
                ll_A4353.setVisibility(View.VISIBLE);
                ll_A4354.setVisibility(View.VISIBLE);
                ll_A4355.setVisibility(View.VISIBLE);
                ll_A4356.setVisibility(View.VISIBLE);
                ll_A4357.setVisibility(View.VISIBLE);
                ll_A4358.setVisibility(View.VISIBLE);
            }
            else if (rb_A4351_2.isChecked() || rb_A4351_DK.isChecked() || rb_A4351_RA.isChecked()){
                ClearAllcontrol.ClearAll(ll_A4352);
                ClearAllcontrol.ClearAll(ll_A4353);
                ClearAllcontrol.ClearAll(ll_A4354);
                ClearAllcontrol.ClearAll(ll_A4355);
                ClearAllcontrol.ClearAll(ll_A4356);
                ClearAllcontrol.ClearAll(ll_A4357);
                ClearAllcontrol.ClearAll(ll_A4358);

                ll_A4352.setVisibility(View.GONE);
                ll_A4353.setVisibility(View.GONE);
                ll_A4354.setVisibility(View.GONE);
                ll_A4355.setVisibility(View.GONE);
                ll_A4356.setVisibility(View.GONE);
                ll_A4357.setVisibility(View.GONE);
                ll_A4358.setVisibility(View.GONE);
            }
        }

        //A4352
        if (compoundButton.getId() == R.id.rb_A4352_1
                || compoundButton.getId() == R.id.rb_A4352_2) {

            if (rb_A4352_1.isChecked()) {
                ll_A4353.setVisibility(View.VISIBLE);
                ll_A4354.setVisibility(View.VISIBLE);
                ll_A4355.setVisibility(View.VISIBLE);
                ll_A4356.setVisibility(View.VISIBLE);
                ll_A4357.setVisibility(View.VISIBLE);
                ll_A4358.setVisibility(View.VISIBLE);
            }
            else if (rb_A4352_2.isChecked()){
                ClearAllcontrol.ClearAll(ll_A4353);
                ClearAllcontrol.ClearAll(ll_A4354);
                ClearAllcontrol.ClearAll(ll_A4355);
                ClearAllcontrol.ClearAll(ll_A4356);
                ClearAllcontrol.ClearAll(ll_A4357);
                ClearAllcontrol.ClearAll(ll_A4358);

                ll_A4353.setVisibility(View.GONE);
                ll_A4354.setVisibility(View.GONE);
                ll_A4355.setVisibility(View.GONE);
                ll_A4356.setVisibility(View.GONE);
                ll_A4357.setVisibility(View.GONE);
                ll_A4358.setVisibility(View.GONE);
            }
        }

        //A4363
        if (compoundButton.getId() == R.id.rb_A4363_1
                || compoundButton.getId() == R.id.rb_A4363_2
                || compoundButton.getId() == R.id.rb_A4363_3
                || compoundButton.getId() == R.id.rb_A4363_DK
                || compoundButton.getId() == R.id.rb_A4363_RA) {

            if (rb_A4363_1.isChecked()) {
                ll_A4364.setVisibility(View.VISIBLE);
            }
            else {
                ClearAllcontrol.ClearAll(ll_A4364);
                ll_A4364.setVisibility(View.GONE);
            }
        }

    }

    void events_call() {

        btn_next13.setOnClickListener(this);

        rb_A4351_1.setOnCheckedChangeListener(this);
        rb_A4351_2.setOnCheckedChangeListener(this);
        rb_A4351_DK.setOnCheckedChangeListener(this);
        rb_A4351_RA.setOnCheckedChangeListener(this);

        rb_A4352_1.setOnCheckedChangeListener(this);
        rb_A4352_2.setOnCheckedChangeListener(this);

        rb_A4363_1.setOnCheckedChangeListener(this);
        rb_A4363_2.setOnCheckedChangeListener(this);
        rb_A4363_3.setOnCheckedChangeListener(this);
        rb_A4363_DK.setOnCheckedChangeListener(this);
        rb_A4363_RA.setOnCheckedChangeListener(this);

    }

    void value_assignment() {

        study_id = "0";
        A4351 = "-1";
        A4352 = "-1";
        A4353 = "-1";
        A4354 = "-1";
        A4355 = "-1";
        A4356 = "-1";
        A4357 = "-1";
        A4358 = "-1";
        A4363 = "-1";
        A4364 = "-1";
        STATUS = "0";


        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4351
        if (rb_A4351_1.isChecked()) {
            A4351 = "1";
        }
        if (rb_A4351_2.isChecked()) {
            A4351 = "2";
        }
        if (rb_A4351_DK.isChecked()) {
            A4351 = "9";
        }
        if (rb_A4351_RA.isChecked()) {
            A4351 = "8";
        }

        //A4352
        if (rb_A4352_1.isChecked()) {
            A4352 = "1";
        }
        if (rb_A4352_2.isChecked()) {
            A4352 = "2";
        }

        //A4353
        if (ed_A4353.getText().toString().trim().length() > 0) {
            A4353 = ed_A4353.getText().toString().trim();
        }

        //A4354
        if (ed_A4354.getText().toString().trim().length() > 0) {
            A4354 = ed_A4354.getText().toString().trim();
        }

        //A4355
        if (ed_A4355.getText().toString().trim().length() > 0) {
            A4355 = ed_A4355.getText().toString().trim();
        }

        //A4356
        if (ed_A4356.getText().toString().trim().length() > 0) {
            A4356 = ed_A4356.getText().toString().trim();
        }

        //A4357
        if (ed_A4357.getText().toString().trim().length() > 0) {
            A4357 = ed_A4357.getText().toString().trim();
        }

        //A4358
        if (ed_A4358.getText().toString().trim().length() > 0) {
            A4358 = ed_A4358.getText().toString().trim();
        }

        //A4363
        if (rb_A4363_1.isChecked()) {
            A4363 = "1";
        }
        if (rb_A4363_2.isChecked()) {
            A4363 = "2";
        }
        if (rb_A4363_3.isChecked()) {
            A4363 = "3";
        }
        if (rb_A4363_DK.isChecked()) {
            A4363 = "9";
        }
        if (rb_A4363_RA.isChecked()) {
            A4363 = "8";
        }

        //A4364
        if (ed_A4364.getText().toString().trim().length() > 0) {
            A4364 = ed_A4364.getText().toString().trim();
        }
    }

    void insert_data() {

        String query = "insert into A4351_A4364("

                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4351_A4364.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4351_A4364.A4351 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4351_A4364.A4352 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4351_A4364.A4353 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4351_A4364.A4354 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4351_A4364.A4355 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4351_A4364.A4356 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4351_A4364.A4357 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4351_A4364.A4358 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4351_A4364.A4363 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4351_A4364.A4364 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4351_A4364.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4351 + "','" +
                A4352 + "','" +
                A4353 + "','" +
                A4354 + "','" +
                A4355 + "','" +
                A4356 + "','" +
                A4357 + "','" +
                A4358 + "','" +
                A4363 + "','" +
                A4364 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "13th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4351) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4352) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4353) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4354) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4355) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4356) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4357) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4358) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4363) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_A4364) != false;
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 14);
    }
}
