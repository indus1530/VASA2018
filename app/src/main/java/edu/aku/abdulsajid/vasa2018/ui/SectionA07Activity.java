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
import edu.aku.abdulsajid.vasa2018.databinding.ActivitySectionA07Binding;
import edu.aku.abdulsajid.vasa2018.utils.InputFilterMinMax;

public class SectionA07Activity extends AppCompatActivity {

    String
            study_id,
            A4126,
            A4127_u,
            A4127_a,
            A4127_b,
            A4128,
            A4129,
            A4130_u,
            A4130_a,
            A4130_b,
            A4131,
            A4132,
            A4133,
            A4134_u,
            A4134_a,
            A4134_b,
            A4135,
            A4136,
            A4138,
            A4139,
            A4140,
            STATUS;

    int currentSection;
    ActivitySectionA07Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a07);
        this.setTitle(getString(R.string.sec9));
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        bi.studyid.setText(study_id);
        bi.studyid.setEnabled(false);
        events_calls();
    }


    public void btnContinue() {
        if (!validateField()) return;
        value_assignment();
        insert_data();
        startActivity(new Intent(SectionA07Activity.this, SectionA08Activity.class).putExtra("study_id", study_id));
    }


    private void events_calls() {

        bi.a126.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA127);
            Clear.clearAllFields(bi.cvA128);
            bi.cvA127.setVisibility(View.GONE);
            bi.cvA128.setVisibility(View.GONE);
            if (i == bi.a126a.getId()) {
                bi.cvA127.setVisibility(View.VISIBLE);
                bi.cvA128.setVisibility(View.VISIBLE);
            }
        });

        bi.a127dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a127mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        bi.a129.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA130);
            bi.cvA130.setVisibility(View.GONE);
            if (i == bi.a129a.getId()) bi.cvA130.setVisibility(View.VISIBLE);
        });

        bi.a130dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a130mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        bi.a133.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA134);
            bi.cvA134.setVisibility(View.GONE);
            if (i == bi.a133a.getId()) bi.cvA134.setVisibility(View.VISIBLE);
        });

        bi.a134dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a134mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

    }

    void value_assignment() {

        study_id = bi.studyid.getText().toString().length() > 0 ? bi.studyid.getText().toString().trim() : "0";

        A4126 = bi.a126a.isChecked() ? "1"
                : bi.a126b.isChecked() ? "2"
                : bi.a12698.isChecked() ? "98"
                : bi.a12699.isChecked() ? "99"
                : "-1";

        A4127_u = bi.a127d.isChecked() ? "1"
                : bi.a127m.isChecked() ? "2"
                : bi.a12798.isChecked() ? "98"
                : bi.a12799.isChecked() ? "99"
                : "-1";
        A4127_a = bi.a127dx.getText().toString().length() > 0 ? bi.a127dx.getText().toString().trim() : "-1";
        A4127_b = bi.a127mx.getText().toString().length() > 0 ? bi.a127mx.getText().toString().trim() : "-1";

        A4128 = bi.a128a.isChecked() ? "1"
                : bi.a128b.isChecked() ? "2"
                : bi.a12898.isChecked() ? "98"
                : bi.a12899.isChecked() ? "99"
                : "-1";

        A4129 = bi.a129a.isChecked() ? "1"
                : bi.a129b.isChecked() ? "2"
                : bi.a12998.isChecked() ? "98"
                : bi.a12999.isChecked() ? "99"
                : "-1";

        A4130_u = bi.a130d.isChecked() ? "1"
                : bi.a130m.isChecked() ? "2"
                : bi.a13098.isChecked() ? "98"
                : bi.a13099.isChecked() ? "99"
                : "-1";
        A4130_a = bi.a130dx.getText().toString().length() > 0 ? bi.a130dx.getText().toString().trim() : "-1";
        A4130_b = bi.a130mx.getText().toString().length() > 0 ? bi.a130mx.getText().toString().trim() : "-1";

        A4131 = bi.a131a.isChecked() ? "1"
                : bi.a131b.isChecked() ? "2"
                : bi.a13198.isChecked() ? "98"
                : bi.a13199.isChecked() ? "99"
                : "-1";

        A4132 = bi.a132a.isChecked() ? "1"
                : bi.a132b.isChecked() ? "2"
                : bi.a13298.isChecked() ? "98"
                : bi.a13299.isChecked() ? "99"
                : "-1";

        A4133 = bi.a133a.isChecked() ? "1"
                : bi.a133b.isChecked() ? "2"
                : bi.a13398.isChecked() ? "98"
                : bi.a13399.isChecked() ? "99"
                : "-1";

        A4134_u = bi.a134d.isChecked() ? "1"
                : bi.a134m.isChecked() ? "2"
                : bi.a13498.isChecked() ? "98"
                : bi.a13499.isChecked() ? "99"
                : "-1";
        A4134_a = bi.a134dx.getText().toString().length() > 0 ? bi.a134dx.getText().toString().trim() : "-1";
        A4134_b = bi.a134mx.getText().toString().length() > 0 ? bi.a134mx.getText().toString().trim() : "-1";

        A4135 = bi.a135a.isChecked() ? "1"
                : bi.a135b.isChecked() ? "2"
                : bi.a13598.isChecked() ? "98"
                : bi.a13599.isChecked() ? "99"
                : "-1";

        A4136 = bi.a136a.isChecked() ? "1"
                : bi.a136b.isChecked() ? "2"
                : bi.a13698.isChecked() ? "98"
                : bi.a13699.isChecked() ? "99"
                : "-1";

        A4138 = bi.a138a.isChecked() ? "1"
                : bi.a138b.isChecked() ? "2"
                : bi.a13898.isChecked() ? "98"
                : bi.a13899.isChecked() ? "99"
                : "-1";

        A4139 = bi.a139a.isChecked() ? "1"
                : bi.a139b.isChecked() ? "2"
                : bi.a13998.isChecked() ? "98"
                : bi.a13999.isChecked() ? "99"
                : "-1";

        A4140 = bi.a140a.isChecked() ? "1"
                : bi.a140b.isChecked() ? "2"
                : bi.a14098.isChecked() ? "98"
                : bi.a14099.isChecked() ? "99"
                : "-1";

        STATUS = "0";


    }

    void insert_data() {

        String query = "insert into A4126_A4140("

                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4126 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4127_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4127_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4127_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4128 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4129 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4130_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4130_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4130_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4131 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4132 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4133 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4134_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4134_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4134_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4135 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4136 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4138 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4139 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.A4140 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4126_A4140.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4126 + "','" +
                A4127_u + "','" +
                A4127_a + "','" +
                A4127_b + "','" +
                A4128 + "','" +
                A4129 + "','" +
                A4130_u + "','" +
                A4130_a + "','" +
                A4130_b + "','" +
                A4131 + "','" +
                A4132 + "','" +
                A4133 + "','" +
                A4134_u + "','" +
                A4134_a + "','" +
                A4134_b + "','" +
                A4135 + "','" +
                A4136 + "','" +
                A4138 + "','" +
                A4139 + "','" +
                A4140 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "7th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 8);
    }
}
