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

public class A4067_A4080 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next3;

    LinearLayout
            ll_study_id,
            ll_A4071,
            ll_A4072_u,
            ll_A4072_a,
            ll_A4072_b,
            ll_A4073,
            ll_A4074,
            ll_A4075_u,
            ll_A4075_a,
            ll_A4075_b,
            ll_A4076,
            ll_A4077_u,
            ll_A4077_a,
            ll_A4077_b,
            ll_A4078,
            ll_A4079,
            ll_A4080;

    RadioButton
            rb_A4071_1,
            rb_A4071_2,
            rb_A4071_DK,
            rb_A4071_RA,
            rb_A4072_u_1,
            rb_A4072_u_2,
            rb_A4072_u_DK,
            rb_A4072_u_RA,
            rb_A4073_1,
            rb_A4073_2,
            rb_A4073_DK,
            rb_A4073_RA,
            rb_A4074_1,
            rb_A4074_2,
            rb_A4074_DK,
            rb_A4074_RA,
            rb_A4075_u_1,
            rb_A4075_u_2,
            rb_A4075_u_DK,
            rb_A4075_u_RA,
            rb_A4076_1,
            rb_A4076_2,
            rb_A4076_DK,
            rb_A4076_RA,
            rb_A4077_u_1,
            rb_A4077_u_2,
            rb_A4077_u_DK,
            rb_A4077_u_RA,
            rb_A4078_1,
            rb_A4078_2,
            rb_A4078_DK,
            rb_A4078_RA,
            rb_A4079_1,
            rb_A4079_2,
            rb_A4079_DK,
            rb_A4079_RA,
            rb_A4080_1,
            rb_A4080_2,
            rb_A4080_DK,
            rb_A4080_RA;

    EditText
            ed_study_id,
            ed_A4072_a,
            ed_A4072_b,
            ed_A4075_a,
            ed_A4075_b,
            ed_A4077_a,
            ed_A4077_b;

    String
            study_id,
            A4071,
            A4072_u,
            A4072_a,
            A4072_b,
            A4073,
            A4074,
            A4075_u,
            A4075_a,
            A4075_b,
            A4076,
            A4077_u,
            A4077_a,
            A4077_b,
            A4078,
            A4079,
            A4080,
            STATUS;

    int currentSection;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next3 = findViewById(R.id.btn_next3);

        //Linear Layout_A4070);
        ll_A4071 = findViewById(R.id.ll_A4071);
        ll_A4072_u = findViewById(R.id.ll_A4072_u);
        ll_A4072_a = findViewById(R.id.ll_A4072_a);
        ll_A4072_b = findViewById(R.id.ll_A4072_b);
        ll_A4073 = findViewById(R.id.ll_A4073);
        ll_A4074 = findViewById(R.id.ll_A4074);
        ll_A4075_u = findViewById(R.id.ll_A4075_u);
        ll_A4075_a = findViewById(R.id.ll_A4075_a);
        ll_A4075_b = findViewById(R.id.ll_A4075_b);
        ll_A4076 = findViewById(R.id.ll_A4076);
        ll_A4077_u = findViewById(R.id.ll_A4077_u);
        ll_A4077_a = findViewById(R.id.ll_A4077_a);
        ll_A4077_b = findViewById(R.id.ll_A4077_b);
        ll_A4078 = findViewById(R.id.ll_A4078);
        ll_A4079 = findViewById(R.id.ll_A4079);
        ll_A4080 = findViewById(R.id.ll_A4080);

        //Radio Button
        rb_A4071_1 = findViewById(R.id.rb_A4071_1);
        rb_A4071_2 = findViewById(R.id.rb_A4071_2);
        rb_A4071_DK = findViewById(R.id.rb_A4071_DK);
        rb_A4071_RA = findViewById(R.id.rb_A4071_RA);
        rb_A4072_u_1 = findViewById(R.id.rb_A4072_u_1);
        rb_A4072_u_2 = findViewById(R.id.rb_A4072_u_2);
        rb_A4072_u_DK = findViewById(R.id.rb_A4072_u_DK);
        rb_A4072_u_RA = findViewById(R.id.rb_A4072_u_RA);
        rb_A4073_1 = findViewById(R.id.rb_A4073_1);
        rb_A4073_2 = findViewById(R.id.rb_A4073_2);
        rb_A4073_DK = findViewById(R.id.rb_A4073_DK);
        rb_A4073_RA = findViewById(R.id.rb_A4073_RA);
        rb_A4074_1 = findViewById(R.id.rb_A4074_1);
        rb_A4074_2 = findViewById(R.id.rb_A4074_2);
        rb_A4074_DK = findViewById(R.id.rb_A4074_DK);
        rb_A4074_RA = findViewById(R.id.rb_A4074_RA);
        rb_A4075_u_1 = findViewById(R.id.rb_A4075_u_1);
        rb_A4075_u_2 = findViewById(R.id.rb_A4075_u_2);
        rb_A4075_u_DK = findViewById(R.id.rb_A4075_u_DK);
        rb_A4075_u_RA = findViewById(R.id.rb_A4075_u_RA);
        rb_A4076_1 = findViewById(R.id.rb_A4076_1);
        rb_A4076_2 = findViewById(R.id.rb_A4076_2);
        rb_A4076_DK = findViewById(R.id.rb_A4076_DK);
        rb_A4076_RA = findViewById(R.id.rb_A4076_RA);
        rb_A4077_u_1 = findViewById(R.id.rb_A4077_u_1);
        rb_A4077_u_2 = findViewById(R.id.rb_A4077_u_2);
        rb_A4077_u_DK = findViewById(R.id.rb_A4077_u_DK);
        rb_A4077_u_RA = findViewById(R.id.rb_A4077_u_RA);
        rb_A4078_1 = findViewById(R.id.rb_A4078_1);
        rb_A4078_2 = findViewById(R.id.rb_A4078_2);
        rb_A4078_DK = findViewById(R.id.rb_A4078_DK);
        rb_A4078_RA = findViewById(R.id.rb_A4078_RA);
        rb_A4079_1 = findViewById(R.id.rb_A4079_1);
        rb_A4079_2 = findViewById(R.id.rb_A4079_2);
        rb_A4079_DK = findViewById(R.id.rb_A4079_DK);
        rb_A4079_RA = findViewById(R.id.rb_A4079_RA);
        rb_A4080_1 = findViewById(R.id.rb_A4080_1);
        rb_A4080_2 = findViewById(R.id.rb_A4080_2);
        rb_A4080_DK = findViewById(R.id.rb_A4080_DK);
        rb_A4080_RA = findViewById(R.id.rb_A4080_RA);

        // Edit Text
        ed_A4072_a = findViewById(R.id.ed_A4072_a);
        ed_A4072_b = findViewById(R.id.ed_A4072_b);
        ed_A4075_a = findViewById(R.id.ed_A4075_a);
        ed_A4075_b = findViewById(R.id.ed_A4075_b);
        ed_A4077_a = findViewById(R.id.ed_A4077_a);
        ed_A4077_b = findViewById(R.id.ed_A4077_b);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4067__a4080);

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

        Intent c = new Intent(A4067_A4080.this, A4081_A4094.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        //A4071
        if (compoundButton.getId() == R.id.rb_A4071_1
                || compoundButton.getId() == R.id.rb_A4071_2
                || compoundButton.getId() == R.id.rb_A4071_DK
                || compoundButton.getId() == R.id.rb_A4071_RA) {

            if (rb_A4071_1.isChecked()) {
                ll_A4072_u.setVisibility(View.VISIBLE);
                ll_A4073.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4072_u);
                ClearAllcontrol.ClearAll(ll_A4073);

                ll_A4072_u.setVisibility(View.GONE);
                ll_A4073.setVisibility(View.GONE);
            }
        }

        //A4072_Units
        if (compoundButton.getId() == R.id.rb_A4072_u_1
                || compoundButton.getId() == R.id.rb_A4072_u_2
                || compoundButton.getId() == R.id.rb_A4072_u_DK
                || compoundButton.getId() == R.id.rb_A4072_u_RA){

                ClearAllcontrol.ClearAll(ll_A4072_a);
                ClearAllcontrol.ClearAll(ll_A4072_b);

                ll_A4072_a.setVisibility(View.GONE);
                ll_A4072_b.setVisibility(View.GONE);

            if (rb_A4072_u_1.isChecked()) {
                ll_A4072_a.setVisibility(View.VISIBLE);
            } else if (rb_A4072_u_2.isChecked()) {
                ll_A4072_b.setVisibility(View.VISIBLE);
            }
        }

        //A4074
        if (compoundButton.getId() == R.id.rb_A4074_1
                || compoundButton.getId() == R.id.rb_A4074_2
                || compoundButton.getId() == R.id.rb_A4074_DK
                || compoundButton.getId() == R.id.rb_A4074_RA) {

            if (rb_A4074_1.isChecked()) {
                ll_A4075_u.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4075_u);
                ll_A4075_u.setVisibility(View.GONE);
            }
        }

        //A4075_units
        if (compoundButton.getId() == R.id.rb_A4075_u_1
                || compoundButton.getId() == R.id.rb_A4075_u_2
                || compoundButton.getId() == R.id.rb_A4075_u_DK
                || compoundButton.getId() == R.id.rb_A4075_u_RA){

                ClearAllcontrol.ClearAll(ll_A4075_a);
                ClearAllcontrol.ClearAll(ll_A4075_b);

                ll_A4075_a.setVisibility(View.GONE);
                ll_A4075_b.setVisibility(View.GONE);

            if (rb_A4075_u_1.isChecked()) {
                ll_A4075_a.setVisibility(View.VISIBLE);
            } else if (rb_A4075_u_2.isChecked()) {
                ll_A4075_b.setVisibility(View.VISIBLE);
            }
        }

        //A4076
        if (compoundButton.getId() == R.id.rb_A4076_1
                || compoundButton.getId() == R.id.rb_A4076_2
                || compoundButton.getId() == R.id.rb_A4076_DK
                || compoundButton.getId() == R.id.rb_A4076_RA) {

            if (rb_A4076_1.isChecked()) {
                ll_A4077_u.setVisibility(View.VISIBLE);
                ll_A4078.setVisibility(View.VISIBLE);
                ll_A4079.setVisibility(View.VISIBLE);
                ll_A4080.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4077_u);
                ClearAllcontrol.ClearAll(ll_A4078);
                ClearAllcontrol.ClearAll(ll_A4079);
                ClearAllcontrol.ClearAll(ll_A4080);

                ll_A4077_u.setVisibility(View.GONE);
                ll_A4078.setVisibility(View.GONE);
                ll_A4079.setVisibility(View.GONE);
                ll_A4080.setVisibility(View.GONE);
            }
        }

        //A4077_units
        if (compoundButton.getId() == R.id.rb_A4077_u_1
                || compoundButton.getId() == R.id.rb_A4077_u_2
                || compoundButton.getId() == R.id.rb_A4077_u_DK
                || compoundButton.getId() == R.id.rb_A4077_u_RA){

                ClearAllcontrol.ClearAll(ll_A4077_a);
                ClearAllcontrol.ClearAll(ll_A4077_b);

                ll_A4077_a.setVisibility(View.GONE);
                ll_A4077_b.setVisibility(View.GONE);

            if (rb_A4077_u_1.isChecked()) {
                ll_A4077_a.setVisibility(View.VISIBLE);
            } else if (rb_A4077_u_2.isChecked()) {
                ll_A4077_b.setVisibility(View.VISIBLE);
            }
        }

    }

    private void events_calls() {

        btn_next3.setOnClickListener(this);

        rb_A4071_1.setOnCheckedChangeListener(this);
        rb_A4071_2.setOnCheckedChangeListener(this);
        rb_A4071_DK.setOnCheckedChangeListener(this);
        rb_A4071_RA.setOnCheckedChangeListener(this);
        rb_A4072_u_1.setOnCheckedChangeListener(this);
        rb_A4072_u_2.setOnCheckedChangeListener(this);
        rb_A4072_u_DK.setOnCheckedChangeListener(this);
        rb_A4072_u_RA.setOnCheckedChangeListener(this);
        rb_A4074_1.setOnCheckedChangeListener(this);
        rb_A4074_2.setOnCheckedChangeListener(this);
        rb_A4074_DK.setOnCheckedChangeListener(this);
        rb_A4074_RA.setOnCheckedChangeListener(this);
        rb_A4075_u_1.setOnCheckedChangeListener(this);
        rb_A4075_u_2.setOnCheckedChangeListener(this);
        rb_A4075_u_DK.setOnCheckedChangeListener(this);
        rb_A4075_u_RA.setOnCheckedChangeListener(this);
        rb_A4076_1.setOnCheckedChangeListener(this);
        rb_A4076_2.setOnCheckedChangeListener(this);
        rb_A4076_DK.setOnCheckedChangeListener(this);
        rb_A4076_RA.setOnCheckedChangeListener(this);
        rb_A4077_u_1.setOnCheckedChangeListener(this);
        rb_A4077_u_2.setOnCheckedChangeListener(this);
        rb_A4077_u_DK.setOnCheckedChangeListener(this);
        rb_A4077_u_RA.setOnCheckedChangeListener(this);

        ed_A4072_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4072_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4075_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4075_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4077_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4077_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

    }

    void value_assignment() {

        study_id = "0";
        A4071 = "-1";
        A4072_u = "-1";
        A4072_a = "-1";
        A4072_b = "-1";
        A4073 = "-1";
        A4074 = "-1";
        A4075_u = "-1";
        A4075_a = "-1";
        A4075_b = "-1";
        A4076 = "-1";
        A4077_u = "-1";
        A4077_a = "-1";
        A4077_b = "-1";
        A4078 = "-1";
        A4079 = "-1";
        A4080 = "-1";
        STATUS = "0";


        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4071
        if (rb_A4071_1.isChecked()) {
            A4071 = "1";
        }
        if (rb_A4071_2.isChecked()) {
            A4071 = "2";
        }
        if (rb_A4071_DK.isChecked()) {
            A4071 = "9";
        }
        if (rb_A4071_RA.isChecked()) {
            A4071 = "8";
        }

        //A4072_u
        if (rb_A4072_u_1.isChecked()) {
            A4072_u = "1";
        }
        if (rb_A4072_u_2.isChecked()) {
            A4072_u = "2";
        }
        if (rb_A4072_u_DK.isChecked()) {
            A4072_u = "9";
        }
        if (rb_A4072_u_RA.isChecked()) {
            A4072_u = "8";
        }

        //A4072_a
        if (ed_A4072_a.getText().toString().trim().length() > 0) {
            A4072_a = ed_A4072_a.getText().toString().trim();
        }

        //A4072_b
        if (ed_A4072_b.getText().toString().trim().length() > 0) {
            A4072_b = ed_A4072_b.getText().toString().trim();
        }

        //A4073
        if (rb_A4073_1.isChecked()) {
            A4073 = "1";
        }
        if (rb_A4073_2.isChecked()) {
            A4073 = "2";
        }
        if (rb_A4073_DK.isChecked()) {
            A4073 = "9";
        }
        if (rb_A4073_RA.isChecked()) {
            A4073 = "8";
        }

        //A4074
        if (rb_A4074_1.isChecked()) {
            A4074 = "1";
        }
        if (rb_A4074_2.isChecked()) {
            A4074 = "2";
        }
        if (rb_A4074_DK.isChecked()) {
            A4074 = "9";
        }
        if (rb_A4074_RA.isChecked()) {
            A4074 = "8";
        }

        //A4075_u
        if (rb_A4075_u_1.isChecked()) {
            A4075_u = "1";
        }
        if (rb_A4075_u_2.isChecked()) {
            A4075_u = "2";
        }
        if (rb_A4075_u_DK.isChecked()) {
            A4075_u = "9";
        }
        if (rb_A4075_u_RA.isChecked()) {
            A4075_u = "8";
        }

        //A4075_a
        if (ed_A4075_a.getText().toString().trim().length() > 0) {
            A4075_a = ed_A4075_a.getText().toString().trim();
        }

        //A4075_b
        if (ed_A4075_b.getText().toString().trim().length() > 0) {
            A4075_b = ed_A4075_b.getText().toString().trim();
        }

        //A4076
        if (rb_A4076_1.isChecked()) {
            A4076 = "1";
        }
        if (rb_A4076_2.isChecked()) {
            A4076 = "2";
        }
        if (rb_A4076_DK.isChecked()) {
            A4076 = "9";
        }
        if (rb_A4076_RA.isChecked()) {
            A4076 = "8";
        }

        //A4077_u
        if (rb_A4077_u_1.isChecked()) {
            A4077_u = "1";
        }
        if (rb_A4077_u_2.isChecked()) {
            A4077_u = "2";
        }
        if (rb_A4077_u_DK.isChecked()) {
            A4077_u = "9";
        }
        if (rb_A4077_u_RA.isChecked()) {
            A4077_u = "8";
        }

        //A4077_a
        if (ed_A4077_a.getText().toString().trim().length() > 0) {
            A4077_a = ed_A4077_a.getText().toString().trim();
        }

        //A4077_b
        if (ed_A4077_b.getText().toString().trim().length() > 0) {
            A4077_b = ed_A4077_b.getText().toString().trim();
        }

        //A4078
        if (rb_A4078_1.isChecked()) {
            A4078 = "1";
        }
        if (rb_A4078_2.isChecked()) {
            A4078 = "2";
        }
        if (rb_A4078_DK.isChecked()) {
            A4078 = "9";
        }
        if (rb_A4078_RA.isChecked()) {
            A4078 = "8";
        }

        //A4079
        if (rb_A4079_1.isChecked()) {
            A4079 = "1";
        }
        if (rb_A4079_2.isChecked()) {
            A4079 = "2";
        }
        if (rb_A4079_DK.isChecked()) {
            A4079 = "9";
        }
        if (rb_A4079_RA.isChecked()) {
            A4079 = "8";
        }

        //A4080
        if (rb_A4080_1.isChecked()) {
            A4080 = "1";
        }
        if (rb_A4080_2.isChecked()) {
            A4080 = "2";
        }
        if (rb_A4080_DK.isChecked()) {
            A4080 = "9";
        }
        if (rb_A4080_RA.isChecked()) {
            A4080 = "8";
        }
    }

    void insert_data() {

        String query = "insert into A4067_A4080("

                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4067 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4068 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4069_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4069_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4069_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4069_c + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4070 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4071 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4072_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4072_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4072_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4073 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4074 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4075_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4075_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4075_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4076 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4077_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4077_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4077_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4078 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4079 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.A4080 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4067_A4080.STATUS + ")" +


                " values ('" +

                study_id + "','" +
                A4071 + "','" +
                A4072_u + "','" +
                A4072_a + "','" +
                A4072_b + "','" +
                A4073 + "','" +
                A4074 + "','" +
                A4075_u + "','" +
                A4075_a + "','" +
                A4075_b + "','" +
                A4076 + "','" +
                A4077_u + "','" +
                A4077_a + "','" +
                A4077_b + "','" +
                A4078 + "','" +
                A4079 + "','" +
                A4080 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "3rd TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4071) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4072_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4072_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4072_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4073) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4074) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4075_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4075_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4075_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4076) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4077_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4077_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4077_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4078) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4079) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_A4080) != false;
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 4);
    }
}