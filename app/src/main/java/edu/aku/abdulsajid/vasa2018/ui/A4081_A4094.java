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

public class A4081_A4094 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next4;

    LinearLayout
            ll_study_id,
            ll_A4081,
            ll_A4082_u,
            ll_A4082_a,
            ll_A4082_b,
            ll_A4082_c,
            ll_A4083,
            ll_A4084,
            ll_A4085_u,
            ll_A4085_a,
            ll_A4085_b,
            ll_A4086,
            ll_A4087_u,
            ll_A4087_a,
            ll_A4087_b,
            ll_A4088,
            ll_A4089,
            ll_A4090,
            ll_A4091,
            ll_A4092,
            ll_A4093,
            ll_A4094_u,
            ll_A4094_a,
            ll_A4094_b,
            ll_A4094_c;

    RadioButton
            rb_A4081_1,
            rb_A4081_2,
            rb_A4081_DK,
            rb_A4081_RA,
            rb_A4082_u_1,
            rb_A4082_u_2,
            rb_A4082_u_3,
            rb_A4082_u_DK,
            rb_A4082_u_RA,
            rb_A4083_1,
            rb_A4083_2,
            rb_A4083_DK,
            rb_A4083_RA,
            rb_A4084_1,
            rb_A4084_2,
            rb_A4084_DK,
            rb_A4084_RA,
            rb_A4085_u_1,
            rb_A4085_u_2,
            rb_A4085_u_DK,
            rb_A4085_u_RA,
            rb_A4086_1,
            rb_A4086_2,
            rb_A4086_DK,
            rb_A4086_RA,
            rb_A4087_u_1,
            rb_A4087_u_2,
            rb_A4087_u_DK,
            rb_A4087_u_RA,
            rb_A4088_1,
            rb_A4088_2,
            rb_A4088_DK,
            rb_A4088_RA,
            rb_A4089_1,
            rb_A4089_2,
            rb_A4089_DK,
            rb_A4089_RA,
            rb_A4090_1,
            rb_A4090_2,
            rb_A4090_DK,
            rb_A4090_RA,
            rb_A4091_1,
            rb_A4091_2,
            rb_A4091_DK,
            rb_A4091_RA,
            rb_A4092_1,
            rb_A4092_2,
            rb_A4092_DK,
            rb_A4092_RA,
            rb_A4094_u_1,
            rb_A4094_u_2,
            rb_A4094_u_3,
            rb_A4094_u_DK,
            rb_A4094_u_RA;

    EditText
            ed_study_id,
            ed_A4082_a,
            ed_A4082_b,
            ed_A4082_c,
            ed_A4085_a,
            ed_A4085_b,
            ed_A4087_a,
            ed_A4087_b,
            ed_A4093,
            ed_A4094_a,
            ed_A4094_b,
            ed_A4094_c;

    String
            study_id,
            A4081,
            A4082_u,
            A4082_a,
            A4082_b,
            A4082_c,
            A4083,
            A4084,
            A4085_u,
            A4085_a,
            A4085_b,
            A4086,
            A4087_u,
            A4087_a,
            A4087_b,
            A4088,
            A4089,
            A4090,
            A4091,
            A4092,
            A4093,
            A4094_u,
            A4094_a,
            A4094_b,
            A4094_c,
            STATUS;

    int currentSection;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next4 = findViewById(R.id.btn_next4);

        //Linear Layout
        ll_A4081 = findViewById(R.id.ll_A4081);
        ll_A4082_u = findViewById(R.id.ll_A4082_u);
        ll_A4082_a = findViewById(R.id.ll_A4082_a);
        ll_A4082_b = findViewById(R.id.ll_A4082_b);
        ll_A4082_c = findViewById(R.id.ll_A4082_c);
        ll_A4083 = findViewById(R.id.ll_A4083);
        ll_A4084 = findViewById(R.id.ll_A4084);
        ll_A4085_u = findViewById(R.id.ll_A4085_u);
        ll_A4085_a = findViewById(R.id.ll_A4085_a);
        ll_A4085_b = findViewById(R.id.ll_A4085_b);
        ll_A4086 = findViewById(R.id.ll_A4086);
        ll_A4087_u = findViewById(R.id.ll_A4087_u);
        ll_A4087_a = findViewById(R.id.ll_A4087_a);
        ll_A4087_b = findViewById(R.id.ll_A4087_b);
        ll_A4088 = findViewById(R.id.ll_A4088);
        ll_A4089 = findViewById(R.id.ll_A4089);
        ll_A4090 = findViewById(R.id.ll_A4090);
        ll_A4091 = findViewById(R.id.ll_A4091);
        ll_A4092 = findViewById(R.id.ll_A4092);
        ll_A4093 = findViewById(R.id.ll_A4093);
        ll_A4094_u = findViewById(R.id.ll_A4094_u);
        ll_A4094_a = findViewById(R.id.ll_A4094_a);
        ll_A4094_b = findViewById(R.id.ll_A4094_b);
        ll_A4094_c = findViewById(R.id.ll_A4094_c);

        //Radio Button
        rb_A4081_1 = findViewById(R.id.rb_A4081_1);
        rb_A4081_2 = findViewById(R.id.rb_A4081_2);
        rb_A4081_DK = findViewById(R.id.rb_A4081_DK);
        rb_A4081_RA = findViewById(R.id.rb_A4081_RA);
        rb_A4082_u_1 = findViewById(R.id.rb_A4082_u_1);
        rb_A4082_u_2 = findViewById(R.id.rb_A4082_u_2);
        rb_A4082_u_3 = findViewById(R.id.rb_A4082_u_3);
        rb_A4082_u_DK = findViewById(R.id.rb_A4082_u_DK);
        rb_A4082_u_RA = findViewById(R.id.rb_A4082_u_RA);
        rb_A4083_1 = findViewById(R.id.rb_A4083_1);
        rb_A4083_2 = findViewById(R.id.rb_A4083_2);
        rb_A4083_DK = findViewById(R.id.rb_A4083_DK);
        rb_A4083_RA = findViewById(R.id.rb_A4083_RA);
        rb_A4084_1 = findViewById(R.id.rb_A4084_1);
        rb_A4084_2 = findViewById(R.id.rb_A4084_2);
        rb_A4084_DK = findViewById(R.id.rb_A4084_DK);
        rb_A4084_RA = findViewById(R.id.rb_A4084_RA);
        rb_A4085_u_1 = findViewById(R.id.rb_A4085_u_1);
        rb_A4085_u_2 = findViewById(R.id.rb_A4085_u_2);
        rb_A4085_u_DK = findViewById(R.id.rb_A4085_u_DK);
        rb_A4085_u_RA = findViewById(R.id.rb_A4085_u_RA);
        rb_A4086_1 = findViewById(R.id.rb_A4086_1);
        rb_A4086_2 = findViewById(R.id.rb_A4086_2);
        rb_A4086_DK = findViewById(R.id.rb_A4086_DK);
        rb_A4086_RA = findViewById(R.id.rb_A4086_RA);
        rb_A4087_u_1 = findViewById(R.id.rb_A4087_u_1);
        rb_A4087_u_2 = findViewById(R.id.rb_A4087_u_2);
        rb_A4087_u_DK = findViewById(R.id.rb_A4087_u_DK);
        rb_A4087_u_RA = findViewById(R.id.rb_A4087_u_RA);
        rb_A4088_1 = findViewById(R.id.rb_A4088_1);
        rb_A4088_2 = findViewById(R.id.rb_A4088_2);
        rb_A4088_DK = findViewById(R.id.rb_A4088_DK);
        rb_A4088_RA = findViewById(R.id.rb_A4088_RA);
        rb_A4089_1 = findViewById(R.id.rb_A4089_1);
        rb_A4089_2 = findViewById(R.id.rb_A4089_2);
        rb_A4089_DK = findViewById(R.id.rb_A4089_DK);
        rb_A4089_RA = findViewById(R.id.rb_A4089_RA);
        rb_A4090_1 = findViewById(R.id.rb_A4090_1);
        rb_A4090_2 = findViewById(R.id.rb_A4090_2);
        rb_A4090_DK = findViewById(R.id.rb_A4090_DK);
        rb_A4090_RA = findViewById(R.id.rb_A4090_RA);
        rb_A4091_1 = findViewById(R.id.rb_A4091_1);
        rb_A4091_2 = findViewById(R.id.rb_A4091_2);
        rb_A4091_DK = findViewById(R.id.rb_A4091_DK);
        rb_A4091_RA = findViewById(R.id.rb_A4091_RA);
        rb_A4092_1 = findViewById(R.id.rb_A4092_1);
        rb_A4092_2 = findViewById(R.id.rb_A4092_2);
        rb_A4092_DK = findViewById(R.id.rb_A4092_DK);
        rb_A4092_RA = findViewById(R.id.rb_A4092_RA);
        rb_A4094_u_1 = findViewById(R.id.rb_A4094_u_1);
        rb_A4094_u_2 = findViewById(R.id.rb_A4094_u_2);
        rb_A4094_u_3 = findViewById(R.id.rb_A4094_u_3);
        rb_A4094_u_DK = findViewById(R.id.rb_A4094_u_DK);
        rb_A4094_u_RA = findViewById(R.id.rb_A4094_u_RA);

        // Edit Text
        ed_A4082_a = findViewById(R.id.ed_A4082_a);
        ed_A4082_b = findViewById(R.id.ed_A4082_b);
        ed_A4082_c = findViewById(R.id.ed_A4082_c);
        ed_A4085_a = findViewById(R.id.ed_A4085_a);
        ed_A4085_b = findViewById(R.id.ed_A4085_b);
        ed_A4087_a = findViewById(R.id.ed_A4087_a);
        ed_A4087_b = findViewById(R.id.ed_A4087_b);
        ed_A4093 = findViewById(R.id.ed_A4093);
        ed_A4094_a = findViewById(R.id.ed_A4094_a);
        ed_A4094_b = findViewById(R.id.ed_A4094_b);
        ed_A4094_c = findViewById(R.id.ed_A4094_c);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4081__a4094);

        this.setTitle(getString(R.string.h_a_sec_9));

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

        Intent c = new Intent(A4081_A4094.this, A4095_A4108.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        //A4081
        if (compoundButton.getId() == R.id.rb_A4081_1
                || compoundButton.getId() == R.id.rb_A4081_2
                || compoundButton.getId() == R.id.rb_A4081_DK
                || compoundButton.getId() == R.id.rb_A4081_RA) {

            if (rb_A4081_1.isChecked()) {
                ll_A4082_u.setVisibility(View.VISIBLE);
                ll_A4083.setVisibility(View.VISIBLE);
            }
            else {
                ClearAllcontrol.ClearAll(ll_A4082_u);
                ClearAllcontrol.ClearAll(ll_A4083);
                ll_A4082_u.setVisibility(View.GONE);
                ll_A4083.setVisibility(View.GONE);
            }
        }

        //A4082_units
        if (compoundButton.getId() == R.id.rb_A4082_u_1
                || compoundButton.getId() == R.id.rb_A4082_u_2
                || compoundButton.getId() == R.id.rb_A4082_u_3
                || compoundButton.getId() == R.id.rb_A4082_u_DK
                || compoundButton.getId() == R.id.rb_A4082_u_RA) {

                ClearAllcontrol.ClearAll(ll_A4082_a);
                ClearAllcontrol.ClearAll(ll_A4082_b);
                ClearAllcontrol.ClearAll(ll_A4082_c);
                ll_A4082_a.setVisibility(View.GONE);
                ll_A4082_b.setVisibility(View.GONE);
                ll_A4082_c.setVisibility(View.GONE);

            if (rb_A4082_u_1.isChecked()) {
                ll_A4082_a.setVisibility(View.VISIBLE);
            }
            else if (rb_A4082_u_2.isChecked()){
                ll_A4082_b.setVisibility(View.VISIBLE);
            }
            else if (rb_A4082_u_3.isChecked()){
                ll_A4082_c.setVisibility(View.VISIBLE);
            }
        }

        //A4084
        if (compoundButton.getId() == R.id.rb_A4084_1
                || compoundButton.getId() == R.id.rb_A4084_2
                || compoundButton.getId() == R.id.rb_A4084_DK
                || compoundButton.getId() == R.id.rb_A4084_RA) {

            if (rb_A4084_1.isChecked()) {
                ll_A4085_u.setVisibility(View.VISIBLE);
            }
            else {
                ClearAllcontrol.ClearAll(ll_A4085_u);
                ll_A4085_u.setVisibility(View.GONE);
            }
        }

        //A4085_units
        if (compoundButton.getId() == R.id.rb_A4085_u_1
                || compoundButton.getId() == R.id.rb_A4085_u_2
                || compoundButton.getId() == R.id.rb_A4085_u_DK
                || compoundButton.getId() == R.id.rb_A4085_u_RA) {

                ClearAllcontrol.ClearAll(ll_A4085_a);
                ClearAllcontrol.ClearAll(ll_A4085_b);
                ll_A4085_a.setVisibility(View.GONE);
                ll_A4085_b.setVisibility(View.GONE);

            if (rb_A4085_u_1.isChecked()) {
                ll_A4085_a.setVisibility(View.VISIBLE);
            }
            else if (rb_A4085_u_2.isChecked()) {
                ll_A4085_b.setVisibility(View.VISIBLE);
            }
        }

        //A4086
        if (compoundButton.getId() == R.id.rb_A4086_1
                || compoundButton.getId() == R.id.rb_A4086_2
                || compoundButton.getId() == R.id.rb_A4086_DK
                || compoundButton.getId() == R.id.rb_A4086_RA) {

            if (rb_A4086_1.isChecked()) {
                ll_A4087_u.setVisibility(View.VISIBLE);
                ll_A4088.setVisibility(View.VISIBLE);
                ll_A4089.setVisibility(View.VISIBLE);


            } else {
                ClearAllcontrol.ClearAll(ll_A4087_u);
                ClearAllcontrol.ClearAll(ll_A4088);
                ClearAllcontrol.ClearAll(ll_A4089);

                ll_A4087_u.setVisibility(View.GONE);
                ll_A4088.setVisibility(View.GONE);
                ll_A4089.setVisibility(View.GONE);
            }
        }

        //A4087_units
        if (compoundButton.getId() == R.id.rb_A4087_u_1
                || compoundButton.getId() == R.id.rb_A4087_u_2
                || compoundButton.getId() == R.id.rb_A4087_u_DK
                || compoundButton.getId() == R.id.rb_A4087_u_RA) {

                ClearAllcontrol.ClearAll(ll_A4087_a);
                ClearAllcontrol.ClearAll(ll_A4087_b);
                ll_A4087_a.setVisibility(View.GONE);
                ll_A4087_b.setVisibility(View.GONE);

            if (rb_A4087_u_1.isChecked()) {
                ll_A4087_a.setVisibility(View.VISIBLE);
            }
            else if (rb_A4087_u_2.isChecked()) {
                ll_A4087_b.setVisibility(View.VISIBLE);
            }
        }

        //A4091
        if (compoundButton.getId() == R.id.rb_A4091_1
                || compoundButton.getId() == R.id.rb_A4091_2
                || compoundButton.getId() == R.id.rb_A4091_DK
                || compoundButton.getId() == R.id.rb_A4091_RA) {

            if (rb_A4091_1.isChecked()) {
                ll_A4092.setVisibility(View.VISIBLE);
                ll_A4093.setVisibility(View.VISIBLE);
                ll_A4094_u.setVisibility(View.VISIBLE);


            } else {
                ClearAllcontrol.ClearAll(ll_A4092);
                ClearAllcontrol.ClearAll(ll_A4093);
                ClearAllcontrol.ClearAll(ll_A4094_u);

                ll_A4092.setVisibility(View.GONE);
                ll_A4093.setVisibility(View.GONE);
                ll_A4094_u.setVisibility(View.GONE);
            }
        }

        //A4094_units
        if (compoundButton.getId() == R.id.rb_A4094_u_1
                || compoundButton.getId() == R.id.rb_A4094_u_2
                || compoundButton.getId() == R.id.rb_A4094_u_3
                || compoundButton.getId() == R.id.rb_A4094_u_DK
                || compoundButton.getId() == R.id.rb_A4094_u_RA) {

                ClearAllcontrol.ClearAll(ll_A4094_a);
                ClearAllcontrol.ClearAll(ll_A4094_b);
                ClearAllcontrol.ClearAll(ll_A4094_c);
                ll_A4094_a.setVisibility(View.GONE);
                ll_A4094_b.setVisibility(View.GONE);
                ll_A4094_c.setVisibility(View.GONE);

        if (rb_A4094_u_1.isChecked()) {
            ll_A4094_a.setVisibility(View.VISIBLE);
        }
        else if (rb_A4094_u_2.isChecked()) {
            ll_A4094_b.setVisibility(View.VISIBLE);
        }
        else if (rb_A4094_u_3.isChecked()) {
            ll_A4094_c.setVisibility(View.VISIBLE);
        }
    }

}

    private void events_calls() {

        btn_next4.setOnClickListener(this);

        rb_A4081_1.setOnCheckedChangeListener(this);
        rb_A4081_2.setOnCheckedChangeListener(this);
        rb_A4081_DK.setOnCheckedChangeListener(this);
        rb_A4081_RA.setOnCheckedChangeListener(this);
        rb_A4082_u_1.setOnCheckedChangeListener(this);
        rb_A4082_u_2.setOnCheckedChangeListener(this);
        rb_A4082_u_3.setOnCheckedChangeListener(this);
        rb_A4082_u_DK.setOnCheckedChangeListener(this);
        rb_A4082_u_RA.setOnCheckedChangeListener(this);
        rb_A4084_1.setOnCheckedChangeListener(this);
        rb_A4084_2.setOnCheckedChangeListener(this);
        rb_A4084_DK.setOnCheckedChangeListener(this);
        rb_A4084_RA.setOnCheckedChangeListener(this);
        rb_A4085_u_1.setOnCheckedChangeListener(this);
        rb_A4085_u_2.setOnCheckedChangeListener(this);
        rb_A4085_u_DK.setOnCheckedChangeListener(this);
        rb_A4085_u_RA.setOnCheckedChangeListener(this);
        rb_A4086_1.setOnCheckedChangeListener(this);
        rb_A4086_2.setOnCheckedChangeListener(this);
        rb_A4086_DK.setOnCheckedChangeListener(this);
        rb_A4086_RA.setOnCheckedChangeListener(this);
        rb_A4087_u_1.setOnCheckedChangeListener(this);
        rb_A4087_u_2.setOnCheckedChangeListener(this);
        rb_A4087_u_DK.setOnCheckedChangeListener(this);
        rb_A4087_u_RA.setOnCheckedChangeListener(this);
        rb_A4091_1.setOnCheckedChangeListener(this);
        rb_A4091_2.setOnCheckedChangeListener(this);
        rb_A4091_DK.setOnCheckedChangeListener(this);
        rb_A4091_RA.setOnCheckedChangeListener(this);
        rb_A4094_u_1.setOnCheckedChangeListener(this);
        rb_A4094_u_2.setOnCheckedChangeListener(this);
        rb_A4094_u_3.setOnCheckedChangeListener(this);
        rb_A4094_u_DK.setOnCheckedChangeListener(this);
        rb_A4094_u_RA.setOnCheckedChangeListener(this);

        ed_A4082_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4082_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});
        ed_A4082_c.setFilters(new InputFilter[]{new InputFilterMinMax(1, 49, 99, 99)});

        ed_A4085_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4085_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4087_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4087_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4094_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 59, 99, 99)});
        ed_A4094_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 99, 99)});
        ed_A4094_c.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});

    }

    void value_assignment() {

        study_id = "0";
        A4081 = "-1";
        A4082_u = "-1";
        A4082_a = "-1";
        A4082_b = "-1";
        A4082_c = "-1";
        A4083 = "-1";
        A4084 = "-1";
        A4085_u = "-1";
        A4085_a = "-1";
        A4085_b = "-1";
        A4086 = "-1";
        A4087_u = "-1";
        A4087_a = "-1";
        A4087_b = "-1";
        A4088 = "-1";
        A4089 = "-1";
        A4090 = "-1";
        A4091 = "-1";
        A4092 = "-1";
        A4093 = "-1";
        A4094_u = "-1";
        A4094_a = "-1";
        A4094_b = "-1";
        A4094_c = "-1";
        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4081
        if (rb_A4081_1.isChecked()) {
            A4081 = "1";
        }
        if (rb_A4081_2.isChecked()) {
            A4081 = "2";
        }
        if (rb_A4081_DK.isChecked()) {
            A4081 = "9";
        }
        if (rb_A4081_RA.isChecked()) {
            A4081 = "8";
        }

        //A4082_u
        if (rb_A4082_u_1.isChecked()) {
            A4082_u = "1";
        }
        if (rb_A4082_u_2.isChecked()) {
            A4082_u = "2";
        }
        if (rb_A4082_u_3.isChecked()) {
            A4082_u = "3";
        }
        if (rb_A4082_u_DK.isChecked()) {
            A4082_u = "9";
        }
        if (rb_A4082_u_RA.isChecked()) {
            A4082_u = "8";
        }

        //A4082_a
        if (ed_A4082_a.getText().toString().trim().length() > 0) {
            A4082_a = ed_A4082_a.getText().toString().trim();
        }

        //A4082_b
        if (ed_A4082_b.getText().toString().trim().length() > 0) {
            A4082_b = ed_A4082_b.getText().toString().trim();
        }

        //A4082_c
        if (ed_A4082_c.getText().toString().trim().length() > 0) {
            A4082_c = ed_A4082_c.getText().toString().trim();
        }

        //A4083
        if (rb_A4083_1.isChecked()) {
            A4083 = "1";
        }
        if (rb_A4083_2.isChecked()) {
            A4083 = "2";
        }
        if (rb_A4083_DK.isChecked()) {
            A4083 = "9";
        }
        if (rb_A4083_RA.isChecked()) {
            A4083 = "8";
        }

        //A4084
        if (rb_A4084_1.isChecked()) {
            A4084 = "1";
        }
        if (rb_A4084_2.isChecked()) {
            A4084 = "2";
        }
        if (rb_A4084_DK.isChecked()) {
            A4084 = "9";
        }
        if (rb_A4084_RA.isChecked()) {
            A4084 = "8";
        }

        //A4085_u
        if (rb_A4085_u_1.isChecked()) {
            A4085_u = "1";
        }
        if (rb_A4085_u_2.isChecked()) {
            A4085_u = "2";
        }
        if (rb_A4085_u_DK.isChecked()) {
            A4085_u = "9";
        }
        if (rb_A4085_u_RA.isChecked()) {
            A4085_u = "8";
        }

        //A4085_a
        if (ed_A4085_a.getText().toString().trim().length() > 0) {
            A4085_a = ed_A4085_a.getText().toString().trim();
        }

        //A4085_b
        if (ed_A4085_b.getText().toString().trim().length() > 0) {
            A4085_b = ed_A4085_b.getText().toString().trim();
        }

        //A4086
        if (rb_A4086_1.isChecked()) {
            A4086 = "1";
        }
        if (rb_A4086_2.isChecked()) {
            A4086 = "2";
        }
        if (rb_A4086_DK.isChecked()) {
            A4086 = "9";
        }
        if (rb_A4086_RA.isChecked()) {
            A4086 = "8";
        }

        //A4087_u
        if (rb_A4087_u_1.isChecked()) {
            A4087_u = "1";
        }
        if (rb_A4087_u_2.isChecked()) {
            A4087_u = "2";
        }
        if (rb_A4087_u_DK.isChecked()) {
            A4087_u = "9";
        }
        if (rb_A4087_u_RA.isChecked()) {
            A4087_u = "8";
        }

        //A4087_a
        if (ed_A4087_a.getText().toString().trim().length() > 0) {
            A4087_a = ed_A4087_a.getText().toString().trim();
        }

        //A4087_b
        if (ed_A4087_b.getText().toString().trim().length() > 0) {
            A4087_b = ed_A4087_b.getText().toString().trim();
        }

        //A4088
        if (rb_A4088_1.isChecked()) {
            A4088 = "1";
        }
        if (rb_A4088_2.isChecked()) {
            A4088 = "2";
        }
        if (rb_A4088_DK.isChecked()) {
            A4088 = "9";
        }
        if (rb_A4088_RA.isChecked()) {
            A4088 = "8";
        }

        //A4089
        if (rb_A4089_1.isChecked()) {
            A4089 = "1";
        }
        if (rb_A4089_2.isChecked()) {
            A4089 = "2";
        }
        if (rb_A4089_DK.isChecked()) {
            A4089 = "9";
        }
        if (rb_A4089_RA.isChecked()) {
            A4089 = "8";
        }

        //A4090
        if (rb_A4090_1.isChecked()) {
            A4090 = "1";
        }
        if (rb_A4090_2.isChecked()) {
            A4090 = "2";
        }
        if (rb_A4090_DK.isChecked()) {
            A4090 = "9";
        }
        if (rb_A4090_RA.isChecked()) {
            A4090 = "8";
        }

        //A4091
        if (rb_A4091_1.isChecked()) {
            A4091 = "1";
        }
        if (rb_A4091_2.isChecked()) {
            A4091 = "2";
        }
        if (rb_A4091_DK.isChecked()) {
            A4091 = "9";
        }
        if (rb_A4091_RA.isChecked()) {
            A4091 = "8";
        }

        //A4092
        if (rb_A4092_1.isChecked()) {
            A4092 = "1";
        }
        if (rb_A4092_2.isChecked()) {
            A4092 = "2";
        }
        if (rb_A4092_DK.isChecked()) {
            A4092 = "9";
        }
        if (rb_A4092_RA.isChecked()) {
            A4092 = "8";
        }

        //A4093
        if (ed_A4093.getText().toString().trim().length() > 0) {
            A4093 = ed_A4093.getText().toString().trim();
        }

        //A4094_u
        if (rb_A4094_u_1.isChecked()) {
            A4094_u = "1";
        }
        if (rb_A4094_u_2.isChecked()) {
            A4094_u = "2";
        }
        if (rb_A4094_u_3.isChecked()) {
            A4094_u = "3";
        }
        if (rb_A4094_u_DK.isChecked()) {
            A4094_u = "9";
        }
        if (rb_A4094_u_RA.isChecked()) {
            A4094_u = "8";
        }

        //A4094_a
        if (ed_A4094_a.getText().toString().trim().length() > 0) {
            A4094_a = ed_A4094_a.getText().toString().trim();
        }

        //A4094_b
        if (ed_A4094_b.getText().toString().trim().length() > 0) {
            A4094_b = ed_A4094_b.getText().toString().trim();
        }

        //A4094_c
        if (ed_A4094_c.getText().toString().trim().length() > 0) {
            A4094_c = ed_A4094_c.getText().toString().trim();
        }

    }

    void insert_data() {

        String query = "insert into A4081_A4094("

                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.study_id + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4081 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4082_u + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4082_a + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4082_b + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4082_c + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4083 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4084 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4085_u + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4085_a + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4085_b + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4086 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4087_u + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4087_a + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4087_b + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4088 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4089 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4090 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4091 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4092 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4093 + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4094_u + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4094_a + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4094_b + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.A4094_c + ","
                + edu.aku.abdulsajid.vasa2018.Global.A.A4081_A4094.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4081 + "','" +
                A4082_u + "','" +
                A4082_a + "','" +
                A4082_b + "','" +
                A4082_c + "','" +
                A4083 + "','" +
                A4084 + "','" +
                A4085_u + "','" +
                A4085_a + "','" +
                A4085_b + "','" +
                A4086 + "','" +
                A4087_u + "','" +
                A4087_a + "','" +
                A4087_b + "','" +
                A4088 + "','" +
                A4089 + "','" +
                A4090 + "','" +
                A4091 + "','" +
                A4092 + "','" +
                A4093 + "','" +
                A4094_u + "','" +
                A4094_a + "','" +
                A4094_b + "','" +
                A4094_c + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "4th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4081) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4082_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4082_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4082_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4082_c) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4083) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4084) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4085_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4085_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4085_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4086) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4087_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4087_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4087_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4088) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4089) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4090) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4091) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4092) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4093) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4094_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4094_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4094_b) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_A4094_c) != false;
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 5);
    }
}