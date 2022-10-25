package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.databinding.ActivitySectionA03Binding;
import edu.aku.abdulsajid.vasa2018.utils.InputFilterMinMax;

public class SectionA03Activity extends AppCompatActivity {

    //Declaration
    String
            studyId,
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
    ActivitySectionA03Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a03);
        this.setTitle(getString(R.string.sec9));
        Intent getStudyId = getIntent();
        studyId = getStudyId.getExtras().getString("study_id");
        bi.edStudyId.setText(studyId);
        bi.edStudyId.setEnabled(false);
        events_calls();
    }


    private void events_calls() {

        bi.a071.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cva072);
            Clear.clearAllFields(bi.cva073);
            bi.cva072.setVisibility(View.GONE);
            bi.cva073.setVisibility(View.GONE);
            if (i == bi.a071a.getId()) {
                bi.cva072.setVisibility(View.VISIBLE);
                bi.cva073.setVisibility(View.VISIBLE);
            }
        });

        bi.a072dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a072mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        bi.a074.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cva075);
            bi.cva075.setVisibility(View.GONE);
            if (i == bi.a074a.getId()) {
                bi.cva075.setVisibility(View.VISIBLE);
            }
        });

        bi.a075dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a075mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        bi.a076.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cva077);
            Clear.clearAllFields(bi.cva078);
            Clear.clearAllFields(bi.cva079);
            Clear.clearAllFields(bi.cva080);
            bi.cva077.setVisibility(View.GONE);
            bi.cva078.setVisibility(View.GONE);
            bi.cva079.setVisibility(View.GONE);
            bi.cva080.setVisibility(View.GONE);
            if (i == bi.a076a.getId()) {
                bi.cva077.setVisibility(View.VISIBLE);
                bi.cva078.setVisibility(View.VISIBLE);
                bi.cva079.setVisibility(View.VISIBLE);
                bi.cva080.setVisibility(View.VISIBLE);
            }
        });

        bi.a077dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a077mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

    }


    public void BtnContinue() {
        if (!validateField()) return;
        value_assignment();
        insert_data();
        startActivity(new Intent(SectionA03Activity.this, SectionA04Activity.class).putExtra("study_id", studyId));
    }


    void value_assignment() {

        studyId = bi.edStudyId.getText().toString().length() > 0 ? bi.edStudyId.getText().toString().trim() : "0";

        A4071 = bi.a071a.isChecked() ? "1"
                : bi.a071b.isChecked() ? "2"
                : bi.a07198.isChecked() ? "98"
                : bi.a07199.isChecked() ? "99"
                : "-1";

        A4072_u = bi.a072d.isChecked() ? "1"
                : bi.a072m.isChecked() ? "2"
                : bi.a07298.isChecked() ? "98"
                : bi.a07299.isChecked() ? "99"
                : "-1";
        A4072_a = bi.a072dx.getText().toString().length() > 0 ? bi.a072dx.getText().toString().trim() : "-1";
        A4072_b = bi.a072mx.getText().toString().length() > 0 ? bi.a072mx.getText().toString().trim() : "-1";

        A4073 = bi.a073a.isChecked() ? "1"
                : bi.a073b.isChecked() ? "2"
                : bi.a07398.isChecked() ? "98"
                : bi.a07399.isChecked() ? "99"
                : "-1";

        A4074 = bi.a074a.isChecked() ? "1"
                : bi.a074b.isChecked() ? "2"
                : bi.a07498.isChecked() ? "98"
                : bi.a07499.isChecked() ? "99"
                : "-1";

        A4075_u = bi.a075d.isChecked() ? "1"
                : bi.a075m.isChecked() ? "2"
                : bi.a07598.isChecked() ? "98"
                : bi.a07599.isChecked() ? "99"
                : "-1";
        A4075_a = bi.a075dx.getText().toString().length() > 0 ? bi.a072dx.getText().toString().trim() : "-1";
        A4075_b = bi.a075mx.getText().toString().length() > 0 ? bi.a072mx.getText().toString().trim() : "-1";

        A4076 = bi.a076a.isChecked() ? "1"
                : bi.a076b.isChecked() ? "2"
                : bi.a07698.isChecked() ? "98"
                : bi.a07699.isChecked() ? "99"
                : "-1";

        A4077_u = bi.a077d.isChecked() ? "1"
                : bi.a077m.isChecked() ? "2"
                : bi.a07798.isChecked() ? "98"
                : bi.a07799.isChecked() ? "99"
                : "-1";
        A4077_a = bi.a077dx.getText().toString().length() > 0 ? bi.a072dx.getText().toString().trim() : "-1";
        A4077_b = bi.a077mx.getText().toString().length() > 0 ? bi.a072mx.getText().toString().trim() : "-1";

        A4078 = bi.a078a.isChecked() ? "1"
                : bi.a078b.isChecked() ? "2"
                : bi.a07898.isChecked() ? "98"
                : bi.a07899.isChecked() ? "99"
                : "-1";

        A4079 = bi.a079a.isChecked() ? "1"
                : bi.a079b.isChecked() ? "2"
                : bi.a07998.isChecked() ? "98"
                : bi.a07999.isChecked() ? "99"
                : "-1";

        A4080 = bi.a080a.isChecked() ? "1"
                : bi.a080b.isChecked() ? "2"
                : bi.a08098.isChecked() ? "98"
                : bi.a08099.isChecked() ? "99"
                : "-1";

        STATUS = "0";
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

                studyId + "','" +
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
        Toast.makeText(this, "SectionA03Activity Saved Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, studyId, currentSection = 4);
    }
}