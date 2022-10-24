package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.databinding.ActivitySectionA01Binding;
import edu.aku.abdulsajid.vasa2018.utils.InputFilterMinMax;

public class SectionA01Activity extends AppCompatActivity {

    String
            study_id,
            A4001,
            A4002,
            A4003,
            A4004,
            A4005,
            A4006,
            A4007,
            A40071,
            A4008,
            A4009a,
            A4010,
            A4011,
            A4012,
            A4013u,
            A4013d,
            A4013m,
            A4013y,
            A4014,
            STATUS;

    int currentSection;

    ActivitySectionA01Binding bi;
    private final TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (bi.a005.getText().hashCode() == s.hashCode()) {
                if (bi.a005.getText().toString().trim().length() > 0 && Integer.parseInt(bi.a005.getText().toString().trim()) > 7) {
                    bi.cvA006.setVisibility(View.GONE);
                    Clear.clearAllFields(bi.cvA006);
                } else {
                    bi.cvA006.setVisibility(View.VISIBLE);
                }
            }

            if (bi.a011.getText().hashCode() == s.hashCode()) {
                if (bi.a011.getText().toString().trim().length() > 0 && Integer.parseInt(bi.a011.getText().toString().trim()) >= 1) {
                    bi.cvA012.setVisibility(View.GONE);
                    Clear.clearAllFields(bi.cvA012);
                } else {
                    bi.cvA012.setVisibility(View.VISIBLE);
                }
            }

        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a01);
        bi.setCallback(this);
        this.setTitle(getString(R.string.h_a_sec_2_4));
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        bi.studyid.setText(study_id);
        bi.studyid.setEnabled(false);
        this.setTitle(getString(R.string.h_n_sec_2_1));
        eventCall();
    }

    void eventCall() {

        bi.a005.addTextChangedListener(generalTextWatcher);
        bi.a011.addTextChangedListener(generalTextWatcher);

        //A003
        bi.a003.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA004);
            Clear.clearAllFields(bi.cvA005);
            bi.cvA004.setVisibility(View.GONE);
            bi.cvA005.setVisibility(View.GONE);
            if (i == bi.a003a.getId()) {
                bi.cvA004.setVisibility(View.VISIBLE);
                bi.cvA005.setVisibility(View.VISIBLE);
            }
        });

        //A004
        bi.a004.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA005);
            bi.cvA005.setVisibility(View.GONE);
            if (i == bi.a004a.getId() || i == bi.a004b.getId() || i == bi.a004c.getId()) {
                bi.cvA005.setVisibility(View.VISIBLE);
            }
        });

        //A007a
        bi.a007a.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA007b);
            bi.cvA007b.setVisibility(View.GONE);
            if (i == bi.a007b.getId()) {
                bi.cvA007b.setVisibility(View.VISIBLE);
            }
        });

        //A009
        bi.a009.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA010);
            Clear.clearAllFields(bi.cvA011);
            Clear.clearAllFields(bi.cvA012);
            bi.cvA010.setVisibility(View.GONE);
            bi.cvA011.setVisibility(View.GONE);
            bi.cvA012.setVisibility(View.GONE);
            if (i == bi.a009a.getId()) {
                bi.cvA010.setVisibility(View.VISIBLE);
                bi.cvA011.setVisibility(View.VISIBLE);
                bi.cvA012.setVisibility(View.VISIBLE);
            }
        });

        //A010
        bi.a010.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA011);
            Clear.clearAllFields(bi.cvA012);
            bi.cvA011.setVisibility(View.GONE);
            bi.cvA012.setVisibility(View.GONE);
            if (i == bi.a010a.getId()) {
                bi.cvA011.setVisibility(View.VISIBLE);
                bi.cvA012.setVisibility(View.VISIBLE);
            } else if (i == bi.a010b.getId() || i == bi.a010c.getId() || i == bi.a01096.getId()) {
                bi.cvA012.setVisibility(View.VISIBLE);
            }
        });

        bi.a005.setFilters(new InputFilter[]{new InputFilterMinMax(0, 22, 99, 99)});
        bi.a013d.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        bi.a013m.setFilters(new InputFilter[]{new InputFilterMinMax(1, 11, 99, 99)});
        bi.a013y.setFilters(new InputFilter[]{new InputFilterMinMax(1, 49, 99, 99)});

    }


    public void btnContinue() {
        if (!validateField()) return;
        value_assignment();
        insert_data();
        Intent c = new Intent(SectionA01Activity.this, SectionA02Activity.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }


    void value_assignment() {

        study_id = bi.studyid.getText().toString().length() > 0 ? bi.studyid.getText().toString().trim() : "0";

        A4001 = bi.a001.getText().toString().trim().length() > 0 ? bi.a001.getText().toString().trim() : "-1";

        A4002 = bi.a002a.isChecked() ? "1"
                : bi.a002b.isChecked() ? "2"
                : bi.a002c.isChecked() ? "3"
                : bi.a002d.isChecked() ? "4"
                : bi.a002e.isChecked() ? "5"
                : bi.a002f.isChecked() ? "6"
                : bi.a00298.isChecked() ? "98"
                : bi.a00299.isChecked() ? "99"
                : "-1";

        A4003 = bi.a003a.isChecked() ? "1"
                : bi.a003b.isChecked() ? "2"
                : bi.a00398.isChecked() ? "98"
                : bi.a00399.isChecked() ? "99"
                : "-1";

        A4004 = bi.a004a.isChecked() ? "1"
                : bi.a004b.isChecked() ? "2"
                : bi.a00498.isChecked() ? "98"
                : bi.a00499.isChecked() ? "99"
                : "-1";

        A4005 = bi.a005.getText().toString().trim().length() > 0 ? bi.a005.getText().toString().trim() : "-1";

        A4006 = bi.a006a.isChecked() ? "1"
                : bi.a006b.isChecked() ? "2"
                : bi.a00698.isChecked() ? "98"
                : bi.a00699.isChecked() ? "99"
                : "-1";

        A4007 = bi.a007aa.isChecked() ? "1"
                : bi.a007ab.isChecked() ? "2"
                : bi.a007ac.isChecked() ? "3"
                : bi.a007ad.isChecked() ? "4"
                : bi.a007ae.isChecked() ? "5"
                : bi.a007a96.isChecked() ? "96"
                : bi.a007a98.isChecked() ? "98"
                : bi.a007a99.isChecked() ? "99"
                : "-1";
        A40071 = bi.a007b.getText().toString().trim().length() > 0 ? bi.a007b.getText().toString().trim() : "-1";

        A4008 = bi.a008a.isChecked() ? "1"
                : bi.a008b.isChecked() ? "2"
                : bi.a00898.isChecked() ? "98"
                : bi.a00899.isChecked() ? "99"
                : "-1";

        A4009a = bi.a009a.isChecked() ? "1"
                : bi.a009b.isChecked() ? "2"
                : bi.a00998.isChecked() ? "98"
                : bi.a00999.isChecked() ? "99"
                : "-1";

        A4010 = bi.a010a.isChecked() ? "1"
                : bi.a010b.isChecked() ? "2"
                : bi.a010c.isChecked() ? "3"
                : bi.a01096.isChecked() ? "96"
                : bi.a01098.isChecked() ? "98"
                : bi.a01099.isChecked() ? "99"
                : "-1";

        A4011 = bi.a011.getText().toString().trim().length() > 0 ? bi.a011.getText().toString().trim() : "-1";

        A4012 = bi.a012.getText().toString().trim().length() > 0 ? bi.a012.getText().toString().trim() : "-1";

        A4013u = bi.a013d.isChecked() ? "1"
                : bi.a013m.isChecked() ? "2"
                : bi.a013y.isChecked() ? "3"
                : bi.a01398.isChecked() ? "98"
                : bi.a01399.isChecked() ? "99"
                : "-1";
        A4013d = bi.a013dx.getText().toString().trim().length() > 0 ? bi.a013dx.getText().toString().trim() : "-1";
        A4013m = bi.a013mx.getText().toString().trim().length() > 0 ? bi.a013mx.getText().toString().trim() : "-1";
        A4013y = bi.a013yx.getText().toString().trim().length() > 0 ? bi.a013yx.getText().toString().trim() : "-1";

        A4014 = bi.a014a.isChecked() ? "1"
                : bi.a014b.isChecked() ? "2"
                : bi.a01498.isChecked() ? "98"
                : "-1";

        STATUS = "0";

    }


    void insert_data() {

        String query = "insert into A4001_A4014("

                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4001 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4002 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4003 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4004 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4005 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4006 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4007 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4007_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4008 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4009a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4010 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4011 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4012 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4013u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4013d + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4013m + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4013y + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.A4014 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4001_A4014.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4001 + "','" +
                A4002 + "','" +
                A4003 + "','" +
                A4004 + "','" +
                A4005 + "','" +
                A4006 + "','" +
                A4007 + "','" +
                A40071 + "','" +
                A4008 + "','" +
                A4009a + "','" +
                A4010 + "','" +
                A4011 + "','" +
                A4012 + "','" +
                A4013u + "','" +
                A4013d + "','" +
                A4013m + "','" +
                A4013y + "','" +
                A4014 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "1st TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 2);
    }

}


