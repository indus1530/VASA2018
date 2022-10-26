package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.databinding.ActivitySectionA09Binding;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;
import edu.aku.abdulsajid.vasa2018.utils.InputFilterMinMax;

public class SectionA09Activity extends AppCompatActivity {

    String
            study_id,
            A4157,
            A4158,
            A4159,
            A4160,
            A4161,
            A4161_1,
            A4162,
            A4163_1,
            A4163,
            A4164,
            A4166,
            A4167,
            A4168a,
            A4168b,
            A4168c,
            A4173a,
            A4173b,
            A4173c,
            A4178a,
            A4178b,
            A4178c,
            A4179,
            A4180,
            A4181,
            A4182,
            A4183,
            A4184,
            A4185,
            A4186a,
            A4186b,
            A4187,
            A4188,
            A4189,
            A4190,
            A4191,
            A4192,
            A4193a,
            A4193b,
            A4194,
            A4195,
            A4196,
            A4197,
            A4198a,
            A4198b,
            A4198bx,
            A4200,
            A4200x,
            A4202,
            A4203,
            A4204,
            A4205a,
            A4205b,
            STATUS;

    int currentSection;
    ActivitySectionA09Binding bi;
    private final TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (bi.a178a.getText().hashCode() == s.hashCode()) {
                if (bi.a178a.getText().toString().trim().length() > 0 && Integer.parseInt(bi.a178a.getText().toString().trim()) > 0) {
                    ClearAllcontrol.ClearAll(bi.cvA178b);
                    bi.cvA178b.setVisibility(View.GONE);
                } else {
                    bi.cvA178b.setVisibility(View.VISIBLE);
                }
            }

            if (bi.a180.getText().hashCode() == s.hashCode()) {
                if (bi.a180.getText().toString().trim().length() > 0 && Integer.parseInt(bi.a180.getText().toString().trim()) < 1) {
                    ClearAllcontrol.ClearAll(bi.cvA181);
                    bi.cvA181.setVisibility(View.GONE);
                } else {
                    bi.cvA181.setVisibility(View.VISIBLE);
                }
            }
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a09);
        this.setTitle(getString(R.string.sec9));
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        bi.studyid.setText(study_id);
        bi.studyid.setEnabled(false);
        events_calls();
    }



    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


        //A4160
        if (compoundButton.getId() == R.id.rb_A4160_1
                || compoundButton.getId() == R.id.rb_A4160_2
                || compoundButton.getId() == R.id.rb_A4160_DK
                || compoundButton.getId() == R.id.rb_A4160_RA) {

            if (rb_A4160_1.isChecked()) {
                ll_A4161.setVisibility(View.VISIBLE);


            } else {
                ClearAllcontrol.ClearAll(ll_A4161);
                ll_A4161.setVisibility(View.GONE);
            }
        }


        //A4162
        if (compoundButton.getId() == R.id.rb_A4162_1
                || compoundButton.getId() == R.id.rb_A4162_2
                || compoundButton.getId() == R.id.rb_A4162_DK
                || compoundButton.getId() == R.id.rb_A4162_RA)

        {
            if (rb_A4162_1.isChecked()) {
                ll_A4163_1.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4163_1);
                ll_A4163_1.setVisibility(View.GONE);
            }
        }


        //A4163_1  
        if (compoundButton.getId() == R.id.rb_A4163_1_1
                || compoundButton.getId() == R.id.rb_A4163_1_2
                || compoundButton.getId() == R.id.rb_A4163_1_DK
                || compoundButton.getId() == R.id.rb_A4163_1_RA) {

            if (rb_A4163_1_1.isChecked() || rb_A4163_1_2.isChecked() || rb_A4163_1_DK.isChecked() || rb_A4163_1_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4163);
                ClearAllcontrol.ClearAll(ll_A4164);
                ClearAllcontrol.ClearAll(ll_A4166);
                ClearAllcontrol.ClearAll(ll_A4167);
                ClearAllcontrol.ClearAll(ll_A4168_1);
                ClearAllcontrol.ClearAll(ll_A4168_3);
                ClearAllcontrol.ClearAll(ll_A4168);
                ClearAllcontrol.ClearAll(ll_A4173_1);
                ClearAllcontrol.ClearAll(ll_A4173);
                ClearAllcontrol.ClearAll(ll_A4173_2);
                ClearAllcontrol.ClearAll(ll_A4178_1);
                ClearAllcontrol.ClearAll(ll_A4178_2);
                ClearAllcontrol.ClearAll(ll_A4178);
                ClearAllcontrol.ClearAll(ll_A4179);
                ClearAllcontrol.ClearAll(ll_A4180);
                ClearAllcontrol.ClearAll(ll_A4181);
                ClearAllcontrol.ClearAll(ll_A4182);
                ClearAllcontrol.ClearAll(ll_A4183);
                ClearAllcontrol.ClearAll(ll_A4184);
                ClearAllcontrol.ClearAll(ll_A4185);
                ClearAllcontrol.ClearAll(ll_A4186);
                ClearAllcontrol.ClearAll(ll_A4186_1);
                ClearAllcontrol.ClearAll(ll_A4187);
                ClearAllcontrol.ClearAll(ll_A4188);
                ClearAllcontrol.ClearAll(ll_A4189);
                ClearAllcontrol.ClearAll(ll_A4190);
                ClearAllcontrol.ClearAll(ll_A4191);
                ClearAllcontrol.ClearAll(ll_A4192);
                ClearAllcontrol.ClearAll(ll_A4193);
                ClearAllcontrol.ClearAll(ll_A4193_1);
                ClearAllcontrol.ClearAll(ll_A4194);
                ClearAllcontrol.ClearAll(ll_A4195);
                ClearAllcontrol.ClearAll(ll_A4196);
                ClearAllcontrol.ClearAll(ll_A4197);
                ClearAllcontrol.ClearAll(ll_A4198_1);
                ClearAllcontrol.ClearAll(ll_A4198);
                ClearAllcontrol.ClearAll(ll_A4200);
                ClearAllcontrol.ClearAll(ll_A4202);
                ClearAllcontrol.ClearAll(ll_A4203);
                ClearAllcontrol.ClearAll(ll_A4204);
                ClearAllcontrol.ClearAll(ll_A4205);
                ClearAllcontrol.ClearAll(ll_A4205_1);

                ll_A4163.setVisibility(View.GONE);
                ll_A4164.setVisibility(View.GONE);
                ll_A4166.setVisibility(View.GONE);
                ll_A4167.setVisibility(View.GONE);
                ll_A4168_1.setVisibility(View.GONE);
                ll_A4168_3.setVisibility(View.GONE);
                ll_A4168.setVisibility(View.GONE);
                ll_A4173_1.setVisibility(View.GONE);
                ll_A4173.setVisibility(View.GONE);
                ll_A4173_2.setVisibility(View.GONE);
                ll_A4178_1.setVisibility(View.GONE);
                ll_A4178_2.setVisibility(View.GONE);
                ll_A4178.setVisibility(View.GONE);
                ll_A4179.setVisibility(View.GONE);
                ll_A4180.setVisibility(View.GONE);
                ll_A4181.setVisibility(View.GONE);
                ll_A4182.setVisibility(View.GONE);
                ll_A4183.setVisibility(View.GONE);
                ll_A4184.setVisibility(View.GONE);
                ll_A4185.setVisibility(View.GONE);
                ll_A4186.setVisibility(View.GONE);
                ll_A4186_1.setVisibility(View.GONE);
                ll_A4187.setVisibility(View.GONE);
                ll_A4188.setVisibility(View.GONE);
                ll_A4189.setVisibility(View.GONE);
                ll_A4190.setVisibility(View.GONE);
                ll_A4191.setVisibility(View.GONE);
                ll_A4192.setVisibility(View.GONE);
                ll_A4193.setVisibility(View.GONE);
                ll_A4193_1.setVisibility(View.GONE);
                ll_A4194.setVisibility(View.GONE);
                ll_A4195.setVisibility(View.GONE);
                ll_A4196.setVisibility(View.GONE);
                ll_A4197.setVisibility(View.GONE);
                ll_A4198_1.setVisibility(View.GONE);
                ll_A4198.setVisibility(View.GONE);
                ll_A4200.setVisibility(View.GONE);
                ll_A4202.setVisibility(View.GONE);
                ll_A4203.setVisibility(View.GONE);
                ll_A4204.setVisibility(View.GONE);
                ll_A4205.setVisibility(View.GONE);
                ll_A4205_1.setVisibility(View.GONE);


            } else {
                ll_A4163.setVisibility(View.VISIBLE);
                ll_A4164.setVisibility(View.VISIBLE);
                ll_A4166.setVisibility(View.VISIBLE);
                ll_A4167.setVisibility(View.VISIBLE);
                ll_A4168_1.setVisibility(View.VISIBLE);
                ll_A4168_3.setVisibility(View.VISIBLE);
                ll_A4168.setVisibility(View.VISIBLE);
                ll_A4173_1.setVisibility(View.VISIBLE);
                ll_A4173.setVisibility(View.VISIBLE);
                ll_A4173_2.setVisibility(View.VISIBLE);
                ll_A4178_1.setVisibility(View.VISIBLE);
                ll_A4178_2.setVisibility(View.VISIBLE);
                ll_A4178.setVisibility(View.VISIBLE);
                ll_A4179.setVisibility(View.VISIBLE);
                ll_A4180.setVisibility(View.VISIBLE);
                ll_A4181.setVisibility(View.VISIBLE);
                ll_A4182.setVisibility(View.VISIBLE);
                ll_A4183.setVisibility(View.VISIBLE);
                ll_A4184.setVisibility(View.VISIBLE);
                ll_A4185.setVisibility(View.VISIBLE);
                ll_A4186.setVisibility(View.VISIBLE);
                ll_A4186_1.setVisibility(View.VISIBLE);
                ll_A4187.setVisibility(View.VISIBLE);
                ll_A4188.setVisibility(View.VISIBLE);
                ll_A4189.setVisibility(View.VISIBLE);
                ll_A4190.setVisibility(View.VISIBLE);
                ll_A4191.setVisibility(View.VISIBLE);
                ll_A4192.setVisibility(View.VISIBLE);
                ll_A4193.setVisibility(View.VISIBLE);
                ll_A4193_1.setVisibility(View.VISIBLE);
                ll_A4194.setVisibility(View.VISIBLE);
                ll_A4195.setVisibility(View.VISIBLE);
                ll_A4196.setVisibility(View.VISIBLE);
                ll_A4197.setVisibility(View.VISIBLE);
                ll_A4198_1.setVisibility(View.VISIBLE);
                ll_A4198.setVisibility(View.VISIBLE);
                ll_A4200.setVisibility(View.VISIBLE);
                ll_A4202.setVisibility(View.VISIBLE);
                ll_A4203.setVisibility(View.VISIBLE);
                ll_A4204.setVisibility(View.VISIBLE);
                ll_A4205.setVisibility(View.VISIBLE);
                ll_A4205_1.setVisibility(View.VISIBLE);
            }
        }


        //A4163
        if (compoundButton.getId() == R.id.rb_A4163_1
                || compoundButton.getId() == R.id.rb_A4163_2
                || compoundButton.getId() == R.id.rb_A4163_DK
                || compoundButton.getId() == R.id.rb_A4163_RA)

        {
            if (rb_A4163_1.isChecked()) {
                ll_A4164.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4164);
                ll_A4164.setVisibility(View.GONE);
            }
        }


        //A4167
        if (compoundButton.getId() == R.id.rb_A4167_1
                || compoundButton.getId() == R.id.rb_A4167_2
                || compoundButton.getId() == R.id.rb_A4167_DK
                || compoundButton.getId() == R.id.rb_A4167_RA)

        {
            if (rb_A4167_2.isChecked() || rb_A4167_DK.isChecked() || rb_A4167_RA.isChecked()) {
                ll_A4168_1.setVisibility(View.VISIBLE);
                ll_A4168_3.setVisibility(View.VISIBLE);
                ll_A4168.setVisibility(View.VISIBLE);
                ll_A4173_1.setVisibility(View.VISIBLE);
                ll_A4173.setVisibility(View.VISIBLE);
                ll_A4173_2.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4168_1);
                ClearAllcontrol.ClearAll(ll_A4168_3);
                ClearAllcontrol.ClearAll(ll_A4168);
                ClearAllcontrol.ClearAll(ll_A4173_1);
                ClearAllcontrol.ClearAll(ll_A4173);
                ClearAllcontrol.ClearAll(ll_A4173_2);

                ll_A4168_1.setVisibility(View.GONE);
                ll_A4168_3.setVisibility(View.GONE);
                ll_A4168.setVisibility(View.GONE);
                ll_A4173_1.setVisibility(View.GONE);
                ll_A4173.setVisibility(View.GONE);
                ll_A4173_2.setVisibility(View.GONE);
            }
        }


        //A4168_1
        if (compoundButton.getId() == R.id.rb_A4168_1_1
                || compoundButton.getId() == R.id.rb_A4168_1_2
                || compoundButton.getId() == R.id.rb_A4168_1_DK
                || compoundButton.getId() == R.id.rb_A4168_1_RA) {

            if (rb_A4168_1_2.isChecked() || rb_A4168_1_DK.isChecked() || rb_A4168_1_RA.isChecked()) {
                ll_A4168_3.setVisibility(View.VISIBLE);
                ll_A4168.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4168_3);
                ClearAllcontrol.ClearAll(ll_A4168);

                ll_A4168_3.setVisibility(View.GONE);
                ll_A4168.setVisibility(View.GONE);
            }
        }


        //A4168_3
        if (compoundButton.getId() == R.id.rb_A4168_3_1
                || compoundButton.getId() == R.id.rb_A4168_3_2
                || compoundButton.getId() == R.id.rb_A4168_3_DK
                || compoundButton.getId() == R.id.rb_A4168_3_RA) {

            if (rb_A4168_3_2.isChecked() || rb_A4168_3_DK.isChecked() || rb_A4168_3_RA.isChecked()) {
                ll_A4168.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4168);
                ll_A4168.setVisibility(View.GONE);
            }
        }


        //A4168
        if (compoundButton.getId() == R.id.rb_A4168_1
                || compoundButton.getId() == R.id.rb_A4168_2
                || compoundButton.getId() == R.id.rb_A4168_DK
                || compoundButton.getId() == R.id.rb_A4168_RA) {

            if (rb_A4168_1.isChecked()) {
                ll_A4173_1.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4173_1);
                ll_A4173_1.setVisibility(View.GONE);
            }
        }


        //A4173_1
        if (compoundButton.getId() == R.id.rb_A4173_1_1
                || compoundButton.getId() == R.id.rb_A4173_1_2
                || compoundButton.getId() == R.id.rb_A4173_1_DK
                || compoundButton.getId() == R.id.rb_A4173_1_RA) {

            if (rb_A4173_1_1.isChecked() || rb_A4173_1_2.isChecked() || rb_A4173_1_DK.isChecked() || rb_A4173_1_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4173);
                ClearAllcontrol.ClearAll(ll_A4173_2);
                ClearAllcontrol.ClearAll(ll_A4178_1);
                ClearAllcontrol.ClearAll(ll_A4178_2);

                ll_A4173.setVisibility(View.GONE);
                ll_A4173_2.setVisibility(View.GONE);
                ll_A4178_1.setVisibility(View.GONE);
                ll_A4178_2.setVisibility(View.GONE);
            } else {
                ll_A4173.setVisibility(View.VISIBLE);
                ll_A4173_2.setVisibility(View.VISIBLE);
                ll_A4178_1.setVisibility(View.VISIBLE);
                ll_A4178_2.setVisibility(View.VISIBLE);
            }
        }


        //A4173
        if (compoundButton.getId() == R.id.rb_A4173_1
                || compoundButton.getId() == R.id.rb_A4173_2
                || compoundButton.getId() == R.id.rb_A4173_DK
                || compoundButton.getId() == R.id.rb_A4173_RA) {

            if (rb_A4173_1.isChecked()) {
                ll_A4173_2.setVisibility(View.VISIBLE);
                ll_A4178_1.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4173_2);
                ClearAllcontrol.ClearAll(ll_A4178_1);

                ll_A4173_2.setVisibility(View.GONE);
                ll_A4178_1.setVisibility(View.GONE);
            }
        }


        //A4173_2
        if (compoundButton.getId() == R.id.rb_A4173_2_1
                || compoundButton.getId() == R.id.rb_A4173_2_2
                || compoundButton.getId() == R.id.rb_A4173_2_DK
                || compoundButton.getId() == R.id.rb_A4173_2_RA) {

            if (rb_A4173_2_1.isChecked() || rb_A4173_2_2.isChecked() || rb_A4173_2_DK.isChecked() || rb_A4173_2_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4178_1);
                ClearAllcontrol.ClearAll(ll_A4178_2);

                ll_A4178_1.setVisibility(View.GONE);
                ll_A4178_2.setVisibility(View.GONE);
            } else {
                ll_A4178_1.setVisibility(View.VISIBLE);
                ll_A4178_2.setVisibility(View.VISIBLE);
            }
        }


        //A4178_2
        if (compoundButton.getId() == R.id.rb_A4178_2_1
                || compoundButton.getId() == R.id.rb_A4178_2_2
                || compoundButton.getId() == R.id.rb_A4178_2_DK
                || compoundButton.getId() == R.id.rb_A4178_2_RA) {


            if (rb_A4178_2_1.isChecked() || rb_A4178_2_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4178_1);
                ClearAllcontrol.ClearAll(ll_A4178);
                ClearAllcontrol.ClearAll(ll_A4179);
                ClearAllcontrol.ClearAll(ll_A4180);
                ClearAllcontrol.ClearAll(ll_A4181);
                ClearAllcontrol.ClearAll(ll_A4182);
                ClearAllcontrol.ClearAll(ll_A4183);
                ClearAllcontrol.ClearAll(ll_A4184);
                ClearAllcontrol.ClearAll(ll_A4185);
                ClearAllcontrol.ClearAll(ll_A4186);
                ClearAllcontrol.ClearAll(ll_A4186_1);
                ClearAllcontrol.ClearAll(ll_A4187);
                ClearAllcontrol.ClearAll(ll_A4188);
                ClearAllcontrol.ClearAll(ll_A4189);
                ClearAllcontrol.ClearAll(ll_A4190);
                ClearAllcontrol.ClearAll(ll_A4191);
                ClearAllcontrol.ClearAll(ll_A4192);
                ClearAllcontrol.ClearAll(ll_A4193);
                ClearAllcontrol.ClearAll(ll_A4193_1);
                ClearAllcontrol.ClearAll(ll_A4194);
                ClearAllcontrol.ClearAll(ll_A4195);
                ClearAllcontrol.ClearAll(ll_A4196);
                ClearAllcontrol.ClearAll(ll_A4197);
                ClearAllcontrol.ClearAll(ll_A4198_1);
                ClearAllcontrol.ClearAll(ll_A4198);
                ClearAllcontrol.ClearAll(ll_A4200);
                ClearAllcontrol.ClearAll(ll_A4202);
                ClearAllcontrol.ClearAll(ll_A4203);
                ClearAllcontrol.ClearAll(ll_A4204);
                ClearAllcontrol.ClearAll(ll_A4205);
                ClearAllcontrol.ClearAll(ll_A4205_1);

                ll_A4178_1.setVisibility(View.GONE);
                ll_A4178.setVisibility(View.GONE);
                ll_A4179.setVisibility(View.GONE);
                ll_A4180.setVisibility(View.GONE);
                ll_A4181.setVisibility(View.GONE);
                ll_A4182.setVisibility(View.GONE);
                ll_A4183.setVisibility(View.GONE);
                ll_A4184.setVisibility(View.GONE);
                ll_A4185.setVisibility(View.GONE);
                ll_A4186.setVisibility(View.GONE);
                ll_A4186_1.setVisibility(View.GONE);
                ll_A4187.setVisibility(View.GONE);
                ll_A4188.setVisibility(View.GONE);
                ll_A4189.setVisibility(View.GONE);
                ll_A4190.setVisibility(View.GONE);
                ll_A4191.setVisibility(View.GONE);
                ll_A4192.setVisibility(View.GONE);
                ll_A4193.setVisibility(View.GONE);
                ll_A4193_1.setVisibility(View.GONE);
                ll_A4194.setVisibility(View.GONE);
                ll_A4195.setVisibility(View.GONE);
                ll_A4196.setVisibility(View.GONE);
                ll_A4197.setVisibility(View.GONE);
                ll_A4198_1.setVisibility(View.GONE);
                ll_A4198.setVisibility(View.GONE);
                ll_A4200.setVisibility(View.GONE);
                ll_A4202.setVisibility(View.GONE);
                ll_A4203.setVisibility(View.GONE);
                ll_A4204.setVisibility(View.GONE);
                ll_A4205.setVisibility(View.GONE);
                ll_A4205_1.setVisibility(View.GONE);

            } else {
                ll_A4178_1.setVisibility(View.VISIBLE);
                ll_A4178.setVisibility(View.VISIBLE);
                ll_A4179.setVisibility(View.VISIBLE);
                ll_A4180.setVisibility(View.VISIBLE);
                ll_A4181.setVisibility(View.VISIBLE);
                ll_A4182.setVisibility(View.VISIBLE);
                ll_A4183.setVisibility(View.VISIBLE);
                ll_A4184.setVisibility(View.VISIBLE);
                ll_A4185.setVisibility(View.VISIBLE);
                ll_A4186.setVisibility(View.VISIBLE);
                ll_A4186_1.setVisibility(View.VISIBLE);
                ll_A4187.setVisibility(View.VISIBLE);
                ll_A4188.setVisibility(View.VISIBLE);
                ll_A4189.setVisibility(View.VISIBLE);
                ll_A4190.setVisibility(View.VISIBLE);
                ll_A4191.setVisibility(View.VISIBLE);
                ll_A4192.setVisibility(View.VISIBLE);
                ll_A4193.setVisibility(View.VISIBLE);
                ll_A4193_1.setVisibility(View.VISIBLE);
                ll_A4194.setVisibility(View.VISIBLE);
                ll_A4195.setVisibility(View.VISIBLE);
                ll_A4196.setVisibility(View.VISIBLE);
                ll_A4197.setVisibility(View.VISIBLE);
                ll_A4198_1.setVisibility(View.VISIBLE);
                ll_A4198.setVisibility(View.VISIBLE);
                ll_A4200.setVisibility(View.VISIBLE);
                ll_A4202.setVisibility(View.VISIBLE);
                ll_A4203.setVisibility(View.VISIBLE);
                ll_A4204.setVisibility(View.VISIBLE);
                ll_A4205.setVisibility(View.VISIBLE);
                ll_A4205_1.setVisibility(View.VISIBLE);
            }

            if (rb_A4178_2_2.isChecked() || rb_A4178_2_DK.isChecked()) {
                ll_A4163.requestChildFocus(rb_A4163_1, ll_A4163);
            } else {

                ll_A4178_2.requestChildFocus(rb_A4178_2_1, ll_A4178_2);
            }
        }


        //A4178
        if (compoundButton.getId() == R.id.rb_A4178_1
                || compoundButton.getId() == R.id.rb_A4178_2
                || compoundButton.getId() == R.id.rb_A4178_DK
                || compoundButton.getId() == R.id.rb_A4178_RA) {

            if (rb_A4167_1.isChecked() || rb_A4168_1_1.isChecked() || rb_A4168_3_1.isChecked() || !rb_A4173_1_1.isChecked() || !rb_A4173_2_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4179);
                ll_A4179.setVisibility(View.GONE);

            } else {
                ll_A4179.setVisibility(View.VISIBLE);
            }
        }


        //A4186
        if (compoundButton.getId() == R.id.rb_A4186_1
                || compoundButton.getId() == R.id.rb_A4186_2
                || compoundButton.getId() == R.id.rb_A4186_DK
                || compoundButton.getId() == R.id.rb_A4186_RA) {

            if (rb_A4186_1.isChecked()) {
                ll_A4186_1.setVisibility(View.VISIBLE);
                ll_A4187.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4186_1);
                ClearAllcontrol.ClearAll(ll_A4187);
                ll_A4186_1.setVisibility(View.GONE);
                ll_A4187.setVisibility(View.GONE);

                if (rb_A4167_1.isChecked()) {
                    ClearAllcontrol.ClearAll(ll_A4188);
                    ClearAllcontrol.ClearAll(ll_A4189);
                    ClearAllcontrol.ClearAll(ll_A4190);
                    ClearAllcontrol.ClearAll(ll_A4191);
                    ClearAllcontrol.ClearAll(ll_A4192);

                    ll_A4188.setVisibility(View.GONE);
                    ll_A4189.setVisibility(View.GONE);
                    ll_A4190.setVisibility(View.GONE);
                    ll_A4191.setVisibility(View.GONE);
                    ll_A4192.setVisibility(View.GONE);
                } else {
                    ll_A4188.setVisibility(View.VISIBLE);
                    ll_A4189.setVisibility(View.VISIBLE);
                    ll_A4190.setVisibility(View.VISIBLE);
                    ll_A4191.setVisibility(View.VISIBLE);
                    ll_A4192.setVisibility(View.VISIBLE);
                }
            }
        }


        //A4193
        if (compoundButton.getId() == R.id.rb_A4193_1
                || compoundButton.getId() == R.id.rb_A4193_2
                || compoundButton.getId() == R.id.rb_A4193_DK
                || compoundButton.getId() == R.id.rb_A4193_RA) {

            if (rb_A4193_1.isChecked()) {
                ll_A4193_1.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4193_1);
                ll_A4193_1.setVisibility(View.GONE);

                if (rb_A4173_1_1.isChecked() || rb_A4173_2_1.isChecked()){
                    ClearAllcontrol.ClearAll(ll_A4194);
                    ClearAllcontrol.ClearAll(ll_A4195);
                    ClearAllcontrol.ClearAll(ll_A4196);
                    ClearAllcontrol.ClearAll(ll_A4197);
                    ClearAllcontrol.ClearAll(ll_A4198_1);

                    ll_A4194.setVisibility(View.GONE);
                    ll_A4195.setVisibility(View.GONE);
                    ll_A4196.setVisibility(View.GONE);
                    ll_A4197.setVisibility(View.GONE);
                    ll_A4198_1.setVisibility(View.GONE);
                } else {
                    ll_A4194.setVisibility(View.VISIBLE);
                    ll_A4195.setVisibility(View.VISIBLE);
                    ll_A4196.setVisibility(View.VISIBLE);
                    ll_A4197.setVisibility(View.VISIBLE);
                    ll_A4198_1.setVisibility(View.VISIBLE);
                }
            }
        }


        //A4194
        if (compoundButton.getId() == R.id.rb_A4194_1
                || compoundButton.getId() == R.id.rb_A4194_2
                || compoundButton.getId() == R.id.rb_A4194_DK
                || compoundButton.getId() == R.id.rb_A4194_RA)

        {
            if (rb_A4194_1.isChecked()) {
                ll_A4195.setVisibility(View.VISIBLE);
                ll_A4196.setVisibility(View.VISIBLE);
                ll_A4197.setVisibility(View.VISIBLE);
                ll_A4198_1.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4195);
                ClearAllcontrol.ClearAll(ll_A4196);
                ClearAllcontrol.ClearAll(ll_A4197);
                ClearAllcontrol.ClearAll(ll_A4198_1);

                ll_A4195.setVisibility(View.GONE);
                ll_A4196.setVisibility(View.GONE);
                ll_A4197.setVisibility(View.GONE);
                ll_A4198_1.setVisibility(View.GONE);
            }
        }


        //A4195
        if (compoundButton.getId() == R.id.rb_A4195_1
                || compoundButton.getId() == R.id.rb_A4195_2
                || compoundButton.getId() == R.id.rb_A4195_DK
                || compoundButton.getId() == R.id.rb_A4195_RA)

        {
            if (rb_A4195_2.isChecked() || rb_A4195_DK.isChecked() || rb_A4195_RA.isChecked()) {
                ll_A4196.setVisibility(View.VISIBLE);
                ll_A4197.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4196);
                ClearAllcontrol.ClearAll(ll_A4197);

                ll_A4196.setVisibility(View.GONE);
                ll_A4197.setVisibility(View.GONE);
            }
        }


        //A4196
        if (compoundButton.getId() == R.id.rb_A4196_1
                || compoundButton.getId() == R.id.rb_A4196_2
                || compoundButton.getId() == R.id.rb_A4196_DK
                || compoundButton.getId() == R.id.rb_A4196_RA)

        {
            if (rb_A4196_2.isChecked() || rb_A4196_DK.isChecked() || rb_A4196_RA.isChecked()) {
                ll_A4197.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4197);
                ll_A4197.setVisibility(View.GONE);
            }
        }


        //A4200
        if (compoundButton.getId() == R.id.rb_A4200_1
                || compoundButton.getId() == R.id.rb_A4200_2
                || compoundButton.getId() == R.id.rb_A4200_3
                || compoundButton.getId() == R.id.rb_A4200_4
                || compoundButton.getId() == R.id.rb_A4200_5
                || compoundButton.getId() == R.id.rb_A4200_6
                || compoundButton.getId() == R.id.rb_A4200_7
                || compoundButton.getId() == R.id.rb_A4200_DK
                || compoundButton.getId() == R.id.rb_A4200_RA) {

            if (rb_A4194_1.isChecked()  || rb_A4195_1.isChecked() || rb_A4196_1.isChecked() || rb_A4197_1.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4202);
                ClearAllcontrol.ClearAll(ll_A4203);
                ClearAllcontrol.ClearAll(ll_A4204);
                ClearAllcontrol.ClearAll(ll_A4205);

                ll_A4202.setVisibility(View.GONE);
                ll_A4203.setVisibility(View.GONE);
                ll_A4204.setVisibility(View.GONE);
                ll_A4205.setVisibility(View.GONE);

            } else {
                ll_A4202.setVisibility(View.VISIBLE);
                ll_A4203.setVisibility(View.VISIBLE);
                ll_A4204.setVisibility(View.VISIBLE);
                ll_A4205.setVisibility(View.VISIBLE);
            }
        }


        //A4202
        if (compoundButton.getId() == R.id.rb_A4202_1
                || compoundButton.getId() == R.id.rb_A4202_2
                || compoundButton.getId() == R.id.rb_A4202_DK
                || compoundButton.getId() == R.id.rb_A4202_RA) {

            if (rb_A4202_2.isChecked() || rb_A4202_DK.isChecked() || rb_A4202_RA.isChecked()) {
                ll_A4203.setVisibility(View.VISIBLE);
                ll_A4204.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4203);
                ClearAllcontrol.ClearAll(ll_A4204);

                ll_A4203.setVisibility(View.GONE);
                ll_A4204.setVisibility(View.GONE);
            }
        }


        //A4203
        if (compoundButton.getId() == R.id.rb_A4203_1
                || compoundButton.getId() == R.id.rb_A4203_2
                || compoundButton.getId() == R.id.rb_A4203_DK
                || compoundButton.getId() == R.id.rb_A4203_RA)

        {
            if (rb_A4203_2.isChecked() || rb_A4203_DK.isChecked() || rb_A4203_RA.isChecked()) {
                ll_A4204.setVisibility(View.VISIBLE);

            } else {
                ClearAllcontrol.ClearAll(ll_A4204);

                ll_A4204.setVisibility(View.GONE);
            }
        }

    }

    public void btnContinue() {
        if (!validateField()) return;
        value_assignment();
        insert_data();
        startActivity(new Intent(SectionA09Activity.this, A4206_A4207.class).putExtra("study_id", study_id));
    }

    private void events_calls() {

        bi.a159.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA160);
            Clear.clearAllFields(bi.cvA161a);
            Clear.clearAllFields(bi.cvA161b);
            Clear.clearAllFields(bi.cvA162);
            Clear.clearAllFields(bi.cvA163a);
            Clear.clearAllFields(bi.cvA163b);
            Clear.clearAllFields(bi.cvA164);
            bi.cvA160.setVisibility(View.GONE);
            bi.cvA161a.setVisibility(View.GONE);
            bi.cvA161b.setVisibility(View.GONE);
            bi.cvA162.setVisibility(View.GONE);
            bi.cvA163a.setVisibility(View.GONE);
            bi.cvA163b.setVisibility(View.GONE);
            bi.cvA164.setVisibility(View.GONE);
            if (i == bi.a159a.getId()) {
                bi.cvA160.setVisibility(View.VISIBLE);
                bi.cvA161a.setVisibility(View.VISIBLE);
                bi.cvA161b.setVisibility(View.VISIBLE);
                bi.cvA162.setVisibility(View.VISIBLE);
                bi.cvA163a.setVisibility(View.VISIBLE);
                bi.cvA163b.setVisibility(View.VISIBLE);
                bi.cvA164.setVisibility(View.VISIBLE);
            }
        });

        bi.a178a.addTextChangedListener(generalTextWatcher);
        bi.a178a.setFilters(new InputFilter[]{new InputFilterMinMax(1, 10, 99, 99)});
        bi.a180.addTextChangedListener(generalTextWatcher);

    }

    void value_assignment() {

        study_id = bi.studyid.getText().toString().length() > 0 ? bi.studyid.getText().toString().trim() : "0";

        A4157 = bi.a157a.isChecked() ? "1"
                : bi.a157b.isChecked() ? "2"
                : bi.a15798.isChecked() ? "98"
                : bi.a15799.isChecked() ? "99"
                : "-1";

        A4158 = bi.a158a.isChecked() ? "1"
                : bi.a158b.isChecked() ? "2"
                : bi.a15898.isChecked() ? "98"
                : bi.a15899.isChecked() ? "99"
                : "-1";

        A4159 = bi.a159a.isChecked() ? "1"
                : bi.a159b.isChecked() ? "2"
                : bi.a15998.isChecked() ? "98"
                : bi.a15999.isChecked() ? "99"
                : "-1";

        A4160 = bi.a160a.isChecked() ? "1"
                : bi.a160b.isChecked() ? "2"
                : bi.a16098.isChecked() ? "98"
                : bi.a16099.isChecked() ? "99"
                : "-1";

        A4161 = bi.a161aa.isChecked() ? "1"
                : bi.a161ab.isChecked() ? "2"
                : bi.a161a98.isChecked() ? "98"
                : bi.a161a99.isChecked() ? "99"
                : "-1";

        A4161_1 = bi.a161ba.isChecked() ? "1"
                : bi.a161bb.isChecked() ? "2"
                : bi.a161b98.isChecked() ? "98"
                : bi.a161b99.isChecked() ? "99"
                : "-1";

        A4162 = bi.a162a.isChecked() ? "1"
                : bi.a162b.isChecked() ? "2"
                : bi.a16298.isChecked() ? "98"
                : bi.a16299.isChecked() ? "99"
                : "-1";

        A4163_1 = bi.a163aa.isChecked() ? "1"
                : bi.a163ab.isChecked() ? "2"
                : bi.a163a98.isChecked() ? "98"
                : bi.a163a99.isChecked() ? "99"
                : "-1";

        A4163 = bi.a163ba.isChecked() ? "1"
                : bi.a163bb.isChecked() ? "2"
                : bi.a163b98.isChecked() ? "98"
                : bi.a163b99.isChecked() ? "99"
                : "-1";

        A4164 = bi.a164.getText().toString().length() > 0 ? bi.a164.getText().toString().trim() : "-1";

        A4166 = bi.a166a.isChecked() ? "1"
                : bi.a166b.isChecked() ? "2"
                : bi.a16698.isChecked() ? "98"
                : bi.a16699.isChecked() ? "99"
                : "-1";

        A4167 = bi.a167a.isChecked() ? "1"
                : bi.a167b.isChecked() ? "2"
                : bi.a16798.isChecked() ? "98"
                : bi.a16799.isChecked() ? "99"
                : "-1";

        A4168a = bi.a168aa.isChecked() ? "1"
                : bi.a168ab.isChecked() ? "2"
                : bi.a168a98.isChecked() ? "98"
                : bi.a168a99.isChecked() ? "99"
                : "-1";

        A4168b = bi.a168ba.isChecked() ? "1"
                : bi.a168bb.isChecked() ? "2"
                : bi.a168b98.isChecked() ? "98"
                : bi.a168b99.isChecked() ? "99"
                : "-1";

        A4168c = bi.a168ca.isChecked() ? "1"
                : bi.a168cb.isChecked() ? "2"
                : bi.a168c98.isChecked() ? "98"
                : bi.a168c99.isChecked() ? "99"
                : "-1";

        A4173a = bi.a173aa.isChecked() ? "1"
                : bi.a173ab.isChecked() ? "2"
                : bi.a173a98.isChecked() ? "98"
                : bi.a173a99.isChecked() ? "99"
                : "-1";

        A4173b = bi.a173ba.isChecked() ? "1"
                : bi.a173bb.isChecked() ? "2"
                : bi.a173b98.isChecked() ? "98"
                : bi.a173b99.isChecked() ? "99"
                : "-1";

        A4173c = bi.a173ca.isChecked() ? "1"
                : bi.a173cb.isChecked() ? "2"
                : bi.a173c98.isChecked() ? "98"
                : bi.a173c99.isChecked() ? "99"
                : "-1";

        A4178a = bi.a178a.getText().toString().length() > 0 ? bi.a178a.getText().toString().trim() : "-1";

        A4178b = bi.a178ba.isChecked() ? "1"
                : bi.a178bb.isChecked() ? "2"
                : bi.a178b98.isChecked() ? "98"
                : bi.a178b99.isChecked() ? "99"
                : "-1";

        A4178c = bi.a178ca.isChecked() ? "1"
                : bi.a178cb.isChecked() ? "2"
                : bi.a178c98.isChecked() ? "98"
                : bi.a178c99.isChecked() ? "99"
                : "-1";

        A4179 = bi.a179a.isChecked() ? "1"
                : bi.a179b.isChecked() ? "2"
                : bi.a17998.isChecked() ? "98"
                : bi.a17999.isChecked() ? "99"
                : "-1";

        A4180 = bi.a180.getText().toString().length() > 0 ? bi.a180.getText().toString().trim() : "-1";

        A4181 = bi.a181a.isChecked() ? "1"
                : bi.a181b.isChecked() ? "2"
                : bi.a18198.isChecked() ? "98"
                : bi.a18199.isChecked() ? "99"
                : "-1";

        A4182 = bi.a182a.isChecked() ? "1"
                : bi.a182b.isChecked() ? "2"
                : bi.a18298.isChecked() ? "98"
                : bi.a18299.isChecked() ? "99"
                : "-1";

        A4183 = bi.a183a.isChecked() ? "1"
                : bi.a183b.isChecked() ? "2"
                : bi.a18398.isChecked() ? "98"
                : bi.a18399.isChecked() ? "99"
                : "-1";

        A4184 = bi.a184a.isChecked() ? "1"
                : bi.a184b.isChecked() ? "2"
                : bi.a18498.isChecked() ? "98"
                : bi.a18499.isChecked() ? "99"
                : "-1";

        A4185 = bi.a185a.isChecked() ? "1"
                : bi.a185b.isChecked() ? "2"
                : bi.a18598.isChecked() ? "98"
                : bi.a18599.isChecked() ? "99"
                : "-1";

        A4186a = bi.a186aa.isChecked() ? "1"
                : bi.a186ab.isChecked() ? "2"
                : bi.a186a98.isChecked() ? "98"
                : bi.a186a99.isChecked() ? "99"
                : "-1";

        A4186b = bi.a186ba.isChecked() ? "1"
                : bi.a186bb.isChecked() ? "2"
                : bi.a186b98.isChecked() ? "98"
                : bi.a186b99.isChecked() ? "99"
                : "-1";

        A4187 = bi.a187a.isChecked() ? "1"
                : bi.a187b.isChecked() ? "2"
                : bi.a18798.isChecked() ? "98"
                : bi.a18799.isChecked() ? "99"
                : "-1";

        A4188 = bi.a188a.isChecked() ? "1"
                : bi.a188b.isChecked() ? "2"
                : bi.a18898.isChecked() ? "98"
                : bi.a18899.isChecked() ? "99"
                : "-1";

        A4189 = bi.a189a.isChecked() ? "1"
                : bi.a189b.isChecked() ? "2"
                : bi.a18998.isChecked() ? "98"
                : bi.a18999.isChecked() ? "99"
                : "-1";

        A4190 = bi.a190a.isChecked() ? "1"
                : bi.a190b.isChecked() ? "2"
                : bi.a19098.isChecked() ? "98"
                : bi.a19099.isChecked() ? "99"
                : "-1";

        A4191 = bi.a191a.isChecked() ? "1"
                : bi.a191b.isChecked() ? "2"
                : bi.a19198.isChecked() ? "98"
                : bi.a19199.isChecked() ? "99"
                : "-1";

        A4192 = bi.a192.getText().toString().length() > 0 ? bi.a192.getText().toString().trim() : "-1";

        A4193a = bi.a193aa.isChecked() ? "1"
                : bi.a193ab.isChecked() ? "2"
                : bi.a193a98.isChecked() ? "98"
                : bi.a193a99.isChecked() ? "99"
                : "-1";

        A4193b = bi.a193ba.isChecked() ? "1"
                : bi.a193bb.isChecked() ? "2"
                : bi.a193bc.isChecked() ? "3"
                : bi.a193bd.isChecked() ? "4"
                : bi.a193b98.isChecked() ? "98"
                : bi.a193b99.isChecked() ? "99"
                : "-1";

        A4194 = bi.a194a.isChecked() ? "1"
                : bi.a194b.isChecked() ? "2"
                : bi.a19498.isChecked() ? "98"
                : bi.a19499.isChecked() ? "99"
                : "-1";

        A4195 = bi.a195a.isChecked() ? "1"
                : bi.a195b.isChecked() ? "2"
                : bi.a19598.isChecked() ? "98"
                : bi.a19599.isChecked() ? "99"
                : "-1";

        A4196 = bi.a196a.isChecked() ? "1"
                : bi.a196b.isChecked() ? "2"
                : bi.a19698.isChecked() ? "98"
                : bi.a19699.isChecked() ? "99"
                : "-1";

        A4197 = bi.a197a.isChecked() ? "1"
                : bi.a197b.isChecked() ? "2"
                : bi.a19798.isChecked() ? "98"
                : bi.a19799.isChecked() ? "99"
                : "-1";

        A4198a = bi.a198aa.isChecked() ? "1"
                : bi.a198ab.isChecked() ? "2"
                : bi.a198a98.isChecked() ? "98"
                : bi.a198a99.isChecked() ? "99"
                : "-1";

        A4198b = bi.a198ba.isChecked() ? "1"
                : bi.a198bb.isChecked() ? "2"
                : bi.a198bc.isChecked() ? "3"
                : bi.a198bd.isChecked() ? "4"
                : bi.a198b96.isChecked() ? "96"
                : bi.a198b98.isChecked() ? "98"
                : bi.a198b99.isChecked() ? "99"
                : "-1";
        A4198bx = bi.a198b96x.getText().toString().length() > 0 ? bi.a198b96x.getText().toString().trim() : "-1";

        A4200 = bi.a200a.isChecked() ? "1"
                : bi.a200b.isChecked() ? "2"
                : bi.a200c.isChecked() ? "3"
                : bi.a200d.isChecked() ? "4"
                : bi.a200e.isChecked() ? "5"
                : bi.a200f.isChecked() ? "6"
                : bi.a20096.isChecked() ? "96"
                : bi.a20098.isChecked() ? "98"
                : bi.a20099.isChecked() ? "99"
                : "-1";
        A4200x = bi.a20096x.getText().toString().length() > 0 ? bi.a20096x.getText().toString().trim() : "-1";

        A4202 = bi.a202a.isChecked() ? "1"
                : bi.a202b.isChecked() ? "2"
                : bi.a20298.isChecked() ? "98"
                : bi.a20299.isChecked() ? "99"
                : "-1";

        A4203 = bi.a203a.isChecked() ? "1"
                : bi.a203b.isChecked() ? "2"
                : bi.a20398.isChecked() ? "98"
                : bi.a20399.isChecked() ? "99"
                : "-1";

        A4204 = bi.a204a.isChecked() ? "1"
                : bi.a204b.isChecked() ? "2"
                : bi.a20498.isChecked() ? "98"
                : bi.a20499.isChecked() ? "99"
                : "-1";

        A4205a = bi.a205aa.isChecked() ? "1"
                : bi.a205ab.isChecked() ? "2"
                : bi.a205a98.isChecked() ? "98"
                : bi.a205a99.isChecked() ? "99"
                : "-1";

        A4205b = bi.a205ba.isChecked() ? "1"
                : bi.a205bb.isChecked() ? "2"
                : bi.a205b98.isChecked() ? "98"
                : bi.a205b99.isChecked() ? "99"
                : "-1";

        STATUS = "0";


    }

    void insert_data() {

        String query = "insert into A4157_A4205("

                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4157 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4158 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4159 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4160 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4161 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4161_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4162 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4163_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4163 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4164 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4166 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4167 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4168_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4168_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4168 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4173_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4173 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4173_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4178_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4178_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4178 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4179 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4180 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4181 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4182 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4183 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4184 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4185 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4186 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4186_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4187 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4188 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4189 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4190 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4191 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4192 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4193 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4193_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4194 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4195 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4196 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4197 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4198_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4198 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4200 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4202 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4203 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4204 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4205 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.A4205_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4157_A4205.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4157 + "','" +
                A4158 + "','" +
                A4159 + "','" +
                A4160 + "','" +
                A4161 + "','" +
                A4161_1 + "','" +
                A4162 + "','" +
                A4163_1 + "','" +
                A4163 + "','" +
                A4164 + "','" +
                A4166 + "','" +
                A4167 + "','" +
                A4168a + "','" +
                A4168b + "','" +
                A4168c + "','" +
                A4173a + "','" +
                A4173b + "','" +
                A4173c + "','" +
                A4178a + "','" +
                A4178b + "','" +
                A4178c + "','" +
                A4179 + "','" +
                A4180 + "','" +
                A4181 + "','" +
                A4182 + "','" +
                A4183 + "','" +
                A4184 + "','" +
                A4185 + "','" +
                A4186a + "','" +
                A4186b + "','" +
                A4187 + "','" +
                A4188 + "','" +
                A4189 + "','" +
                A4190 + "','" +
                A4191 + "','" +
                A4192 + "','" +
                A4193a + "','" +
                A4193b + "','" +
                A4194 + "','" +
                A4195 + "','" +
                A4196 + "','" +
                A4197 + "','" +
                A4198a + "','" +
                A4198b + "','" +
                A4198bx + "','" +
                A4200 + "','" +
                A4202 + "','" +
                A4203 + "','" +
                A4204 + "','" +
                A4205a + "','" +
                A4205b + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "9th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();

    }


    boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 10);
    }


}
