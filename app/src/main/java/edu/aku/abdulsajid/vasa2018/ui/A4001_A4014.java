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

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.databinding.A4001A4014Binding;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;
import edu.aku.abdulsajid.vasa2018.utils.InputFilterMinMax;

public class A4001_A4014 extends AppCompatActivity {

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

    A4001A4014Binding bi;
    private final TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (bi.edA4005.getText().hashCode() == s.hashCode()) {
                if (bi.edA4005.getText().toString().trim().length() > 0 && Integer.parseInt(bi.edA4005.getText().toString().trim()) > 7) {
                    bi.llA4006.setVisibility(View.GONE);
                    ClearAllcontrol.ClearAll(bi.llA4006);
                } else {
                    bi.llA4006.setVisibility(View.VISIBLE);
                }
            }

            if (bi.edA4011.getText().hashCode() == s.hashCode()) {
                if (bi.edA4011.getText().toString().trim().length() > 0 && Integer.parseInt(bi.edA4011.getText().toString().trim()) >= 1) {
                    bi.llA4012.setVisibility(View.GONE);
                    ClearAllcontrol.ClearAll(bi.llA4012);
                } else {
                    bi.llA4012.setVisibility(View.VISIBLE);
                }
            }

        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.a4001__a4014);
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

        bi.edA4005.addTextChangedListener(generalTextWatcher);
        bi.edA4011.addTextChangedListener(generalTextWatcher);

        //A4003
        bi.a4003.setOnCheckedChangeListener((radioGroup, i) -> {
            ClearAllcontrol.ClearAll(bi.llA4004);
            ClearAllcontrol.ClearAll(bi.llA4005);
            bi.llA4004.setVisibility(View.GONE);
            bi.llA4005.setVisibility(View.GONE);
            if (i == bi.rbA40031.getId()) {
                bi.llA4004.setVisibility(View.VISIBLE);
                bi.llA4005.setVisibility(View.VISIBLE);
            }
        });

        //A4004
        bi.a4004.setOnCheckedChangeListener((radioGroup, i) -> {
            ClearAllcontrol.ClearAll(bi.llA4005);
            bi.llA4005.setVisibility(View.GONE);
            if (i == bi.rbA40041.getId() || i == bi.rbA40042.getId() || i == bi.rbA40043.getId()) {
                bi.llA4005.setVisibility(View.VISIBLE);
            }
        });

        //A4007
        bi.a4007.setOnCheckedChangeListener((radioGroup, i) -> {
            ClearAllcontrol.ClearAll(bi.llA40071);
            bi.llA40071.setVisibility(View.GONE);
            if (i == bi.rbA40072.getId()) {
                bi.llA40071.setVisibility(View.VISIBLE);
            }
        });

        //A4009a
        bi.a4009a.setOnCheckedChangeListener((radioGroup, i) -> {
            ClearAllcontrol.ClearAll(bi.llA4010);
            ClearAllcontrol.ClearAll(bi.llA4011);
            ClearAllcontrol.ClearAll(bi.llA4012);
            bi.llA4010.setVisibility(View.GONE);
            bi.llA4011.setVisibility(View.GONE);
            bi.llA4012.setVisibility(View.GONE);
            if (i == bi.rbA4009a1.getId()) {
                bi.llA4010.setVisibility(View.VISIBLE);
                bi.llA4011.setVisibility(View.VISIBLE);
                bi.llA4012.setVisibility(View.VISIBLE);
            }
        });

        //A4010
        bi.a4010.setOnCheckedChangeListener((radioGroup, i) -> {
            ClearAllcontrol.ClearAll(bi.llA4011);
            ClearAllcontrol.ClearAll(bi.llA4012);
            bi.llA4011.setVisibility(View.GONE);
            bi.llA4012.setVisibility(View.GONE);
            if (i == bi.rbA40101.getId()) {
                bi.llA4011.setVisibility(View.VISIBLE);
                bi.llA4012.setVisibility(View.VISIBLE);
            } else if (i == bi.rbA40102.getId() || i == bi.rbA40103.getId() || i == bi.rbA40104.getId()) {
                bi.llA4012.setVisibility(View.VISIBLE);
            }
        });

        //A4013u
        bi.a4013u.setOnCheckedChangeListener((radioGroup, i) -> {
            ClearAllcontrol.ClearAll(bi.llA4013d);
            ClearAllcontrol.ClearAll(bi.llA4013m);
            ClearAllcontrol.ClearAll(bi.llA4013y);
            bi.llA4013d.setVisibility(View.GONE);
            bi.llA4013m.setVisibility(View.GONE);
            bi.llA4013y.setVisibility(View.GONE);
            if (i == bi.rbA4013u1.getId()) bi.llA4013d.setVisibility(View.VISIBLE);
            else if (i == bi.rbA4013u2.getId()) bi.llA4013m.setVisibility(View.VISIBLE);
            else if (i == bi.rbA4013u3.getId()) bi.llA4013y.setVisibility(View.VISIBLE);
        });

        bi.edA4005.setFilters(new InputFilter[]{new InputFilterMinMax(0, 22, 99, 99)});
        bi.edA4013d.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        bi.edA4013m.setFilters(new InputFilter[]{new InputFilterMinMax(1, 11, 99, 99)});
        bi.edA4013y.setFilters(new InputFilter[]{new InputFilterMinMax(1, 49, 99, 99)});

    }


    public void btnContinue(View view) {
        if (!validateField()) return;
        value_assignment();
        insert_data();
        Intent c = new Intent(A4001_A4014.this, A4051_A4066.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }


    void value_assignment() {

        study_id = bi.studyid.getText().toString().length() > 0 ? bi.studyid.getText().toString().trim() : "0";

        A4001 = bi.a4001.getText().toString().trim().length() > 0 ? bi.a4001.getText().toString().trim() : "-1";

        A4002 = bi.a002a.isChecked() ? "1"
                : bi.a002b.isChecked() ? "2"
                : bi.a002c.isChecked() ? "3"
                : bi.a002d.isChecked() ? "4"
                : bi.a002e.isChecked() ? "5"
                : bi.a002f.isChecked() ? "6"
                : bi.a00298.isChecked() ? "98"
                : bi.a00299.isChecked() ? "99"
                : "-1";

        A4003 = bi.rbA40031.isChecked() ? "1"
                : bi.rbA40032.isChecked() ? "2"
                : bi.rbA4003DK.isChecked() ? "9"
                : bi.rbA4003RA.isChecked() ? "8"
                : "-1";

        A4004 = bi.rbA40041.isChecked() ? "1"
                : bi.rbA40042.isChecked() ? "2"
                : bi.rbA40043.isChecked() ? "3"
                : bi.rbA4004DK.isChecked() ? "9"
                : bi.rbA4004RA.isChecked() ? "8"
                : "-1";

        A4005 = bi.edA4005.getText().toString().trim().length() > 0 ? bi.edA4005.getText().toString().trim() : "-1";

        A4006 = bi.rbA40061.isChecked() ? "1"
                : bi.rbA40062.isChecked() ? "2"
                : bi.rbA4006DK.isChecked() ? "9"
                : bi.rbA4006RA.isChecked() ? "8"
                : "-1";

        A4007 = bi.rbA40071.isChecked() ? "1"
                : bi.rbA40072.isChecked() ? "2"
                : bi.rbA40073.isChecked() ? "3"
                : bi.rbA40074.isChecked() ? "4"
                : bi.rbA40075.isChecked() ? "5"
                : bi.rbA40076.isChecked() ? "6"
                : bi.rbA4007DK.isChecked() ? "9"
                : bi.rbA4007RA.isChecked() ? "8"
                : "-1";

        A40071 = bi.edA40071.getText().toString().trim().length() > 0 ? bi.edA40071.getText().toString().trim() : "-1";

        A4008 = bi.rbA40081.isChecked() ? "1"
                : bi.rbA40082.isChecked() ? "2"
                : bi.rbA4008DK.isChecked() ? "9"
                : bi.rbA4008RA.isChecked() ? "8"
                : "-1";

        A4009a = bi.rbA4009a1.isChecked() ? "1"
                : bi.rbA4009a2.isChecked() ? "2"
                : bi.rbA4009aDK.isChecked() ? "9"
                : bi.rbA4009aRA.isChecked() ? "8"
                : "-1";

        A4010 = bi.rbA40101.isChecked() ? "1"
                : bi.rbA40102.isChecked() ? "2"
                : bi.rbA40103.isChecked() ? "3"
                : bi.rbA40104.isChecked() ? "4"
                : bi.rbA4010DK.isChecked() ? "9"
                : bi.rbA4010RA.isChecked() ? "8"
                : "-1";

        A4011 = bi.edA4011.getText().toString().trim().length() > 0 ? bi.edA4011.getText().toString().trim() : "-1";

        A4012 = bi.edA4012.getText().toString().trim().length() > 0 ? bi.edA4012.getText().toString().trim() : "-1";

        A4013u = bi.rbA4013u1.isChecked() ? "1"
                : bi.rbA4013u2.isChecked() ? "2"
                : bi.rbA4013u3.isChecked() ? "3"
                : bi.rbA4013uDK.isChecked() ? "9"
                : bi.rbA4013uRA.isChecked() ? "8"
                : "-1";

        A4013d = bi.edA4013d.getText().toString().trim().length() > 0 ? bi.edA4013d.getText().toString().trim() : "-1";

        A4013m = bi.edA4013m.getText().toString().trim().length() > 0 ? bi.edA4013m.getText().toString().trim() : "-1";

        A4013y = bi.edA4013y.getText().toString().trim().length() > 0 ? bi.edA4013y.getText().toString().trim() : "-1";

        A4014 = bi.rbA40141.isChecked() ? "1"
                : bi.rbA40142.isChecked() ? "2"
                : bi.rbA4014DK.isChecked() ? "9"
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


