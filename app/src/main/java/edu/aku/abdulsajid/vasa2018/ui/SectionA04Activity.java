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
import edu.aku.abdulsajid.vasa2018.databinding.ActivitySectionA04Binding;
import edu.aku.abdulsajid.vasa2018.utils.InputFilterMinMax;

public class SectionA04Activity extends AppCompatActivity {

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
    ActivitySectionA04Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a04);
        this.setTitle(getString(R.string.sec9));
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        bi.studyId.setText(study_id);
        bi.studyId.setEnabled(false);
        events_calls();
    }


    public void BtnContinue() {
        if (!validateField()) return;
        value_assignment();
        insert_data();
        startActivity(new Intent(SectionA04Activity.this, SectionA05Activity.class).putExtra("study_id", study_id));
    }


    private void events_calls() {

        bi.a081.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cva082);
            Clear.clearAllFields(bi.cva083);
            bi.cva082.setVisibility(View.GONE);
            bi.cva083.setVisibility(View.GONE);
            if (i == bi.a081a.getId()) {
                bi.cva082.setVisibility(View.VISIBLE);
                bi.cva083.setVisibility(View.VISIBLE);
            }
        });

        bi.a082dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a082mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});
        bi.a082yx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 49, 99, 99)});

        bi.a084.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cva085);
            bi.cva085.setVisibility(View.GONE);
            if (i == bi.a084a.getId()) {
                bi.cva085.setVisibility(View.VISIBLE);
            }
        });

        bi.a085dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a085mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        bi.a086.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cva087);
            Clear.clearAllFields(bi.cva088);
            Clear.clearAllFields(bi.cva089);
            bi.cva087.setVisibility(View.GONE);
            bi.cva088.setVisibility(View.GONE);
            bi.cva089.setVisibility(View.GONE);
            if (i == bi.a086a.getId()) {
                bi.cva087.setVisibility(View.VISIBLE);
                bi.cva088.setVisibility(View.VISIBLE);
                bi.cva089.setVisibility(View.VISIBLE);
            }
        });

        bi.a087dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a087mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        bi.a091.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cva092);
            Clear.clearAllFields(bi.cva093);
            Clear.clearAllFields(bi.cva094);
            bi.cva092.setVisibility(View.GONE);
            bi.cva093.setVisibility(View.GONE);
            bi.cva094.setVisibility(View.GONE);
            if (i == bi.a091a.getId()) {
                bi.cva092.setVisibility(View.VISIBLE);
                bi.cva093.setVisibility(View.VISIBLE);
                bi.cva094.setVisibility(View.VISIBLE);
            }
        });

        bi.a094mx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 59, 99, 99)});
        bi.a094hx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 99, 99)});
        bi.a094dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});

    }

    void value_assignment() {

        study_id = bi.studyId.getText().toString().length() > 0 ? bi.studyId.getText().toString().trim() : "0";

        A4081 = bi.a081a.isChecked() ? "1"
                : bi.a081b.isChecked() ? "2"
                : bi.a08198.isChecked() ? "98"
                : bi.a08199.isChecked() ? "99"
                : "-1";

        A4082_u = bi.a082d.isChecked() ? "1"
                : bi.a082m.isChecked() ? "2"
                : bi.a082y.isChecked() ? "3"
                : bi.a08298.isChecked() ? "98"
                : bi.a08299.isChecked() ? "99"
                : "-1";
        A4082_a = bi.a082dx.getText().toString().length() > 0 ? bi.a082dx.getText().toString().trim() : "-1";
        A4082_b = bi.a082mx.getText().toString().length() > 0 ? bi.a082mx.getText().toString().trim() : "-1";
        A4082_c = bi.a082yx.getText().toString().length() > 0 ? bi.a082yx.getText().toString().trim() : "-1";

        A4083 = bi.a083a.isChecked() ? "1"
                : bi.a083b.isChecked() ? "2"
                : bi.a08398.isChecked() ? "98"
                : bi.a08399.isChecked() ? "99"
                : "-1";

        A4084 = bi.a084a.isChecked() ? "1"
                : bi.a084b.isChecked() ? "2"
                : bi.a08498.isChecked() ? "98"
                : bi.a08499.isChecked() ? "99"
                : "-1";

        A4085_u = bi.a085d.isChecked() ? "1"
                : bi.a085m.isChecked() ? "2"
                : bi.a08598.isChecked() ? "98"
                : bi.a08599.isChecked() ? "99"
                : "-1";
        A4085_a = bi.a085dx.getText().toString().length() > 0 ? bi.a085dx.getText().toString().trim() : "-1";
        A4085_b = bi.a085mx.getText().toString().length() > 0 ? bi.a085mx.getText().toString().trim() : "-1";

        A4086 = bi.a086a.isChecked() ? "1"
                : bi.a086b.isChecked() ? "2"
                : bi.a08698.isChecked() ? "98"
                : bi.a08699.isChecked() ? "99"
                : "-1";

        A4087_u = bi.a087d.isChecked() ? "1"
                : bi.a087m.isChecked() ? "2"
                : bi.a08798.isChecked() ? "98"
                : bi.a08799.isChecked() ? "99"
                : "-1";
        A4087_a = bi.a087dx.getText().toString().length() > 0 ? bi.a087dx.getText().toString().trim() : "-1";
        A4087_b = bi.a087mx.getText().toString().length() > 0 ? bi.a087mx.getText().toString().trim() : "-1";

        A4088 = bi.a088a.isChecked() ? "1"
                : bi.a088b.isChecked() ? "2"
                : bi.a08898.isChecked() ? "98"
                : bi.a08899.isChecked() ? "99"
                : "-1";

        A4089 = bi.a089a.isChecked() ? "1"
                : bi.a089b.isChecked() ? "2"
                : bi.a08998.isChecked() ? "98"
                : bi.a08999.isChecked() ? "99"
                : "-1";

        A4090 = bi.a090a.isChecked() ? "1"
                : bi.a090b.isChecked() ? "2"
                : bi.a09098.isChecked() ? "98"
                : bi.a09099.isChecked() ? "99"
                : "-1";

        A4091 = bi.a091a.isChecked() ? "1"
                : bi.a091b.isChecked() ? "2"
                : bi.a09198.isChecked() ? "98"
                : bi.a09199.isChecked() ? "99"
                : "-1";

        A4092 = bi.a092a.isChecked() ? "1"
                : bi.a092b.isChecked() ? "2"
                : bi.a09298.isChecked() ? "98"
                : bi.a09299.isChecked() ? "99"
                : "-1";

        A4093 = bi.a093.getText().toString().length() > 0 ? bi.a093.getText().toString().trim() : "-1";

        A4094_u = bi.a094m.isChecked() ? "1"
                : bi.a094h.isChecked() ? "2"
                : bi.a094d.isChecked() ? "3"
                : bi.a09498.isChecked() ? "98"
                : bi.a09499.isChecked() ? "99"
                : "-1";
        A4094_a = bi.a094mx.getText().toString().length() > 0 ? bi.a094mx.getText().toString().trim() : "-1";
        A4094_b = bi.a094hx.getText().toString().length() > 0 ? bi.a094hx.getText().toString().trim() : "-1";
        A4094_c = bi.a094dx.getText().toString().length() > 0 ? bi.a094dx.getText().toString().trim() : "-1";

        STATUS = "0";

    }


    void insert_data() {

        String query = "insert into A4081_A4094("

                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4081 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4082_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4082_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4082_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4082_c + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4083 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4084 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4085_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4085_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4085_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4086 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4087_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4087_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4087_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4088 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4089 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4090 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4091 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4092 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4093 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4094_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4094_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4094_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.A4094_c + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4081_A4094.STATUS + ")" +

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
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 5);
    }
}
