package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.database.Cursor;
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
import edu.aku.abdulsajid.vasa2018.data.DBHelper;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.databinding.ActivitySectionA08Binding;
import edu.aku.abdulsajid.vasa2018.utils.InputFilterMinMax;

public class SectionA08Activity extends AppCompatActivity {

    String
            study_id,
            A4144,
            A4145,
            A4146,
            A4147,
            A4148,
            A4148x,
            A4149,
            A4150_u,
            A4150_a,
            A4150_b,
            A4151,
            A4152,
            A4153,
            A4154,
            A4155,
            A4156,
            STATUS;

    int currentSection;
    ActivitySectionA08Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a08);
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
        DBHelper db = new DBHelper(this);
        Cursor res = db.getData("Q1101_Q1610", study_id);
        if (res.getCount() > 0) {
            res.moveToFirst();
            if (Integer.valueOf(res.getString(res.getColumnIndex("Q1601"))).equals(1))
                startActivity(new Intent(this, A4206_A4207.class).putExtra("study_id", study_id));
            else
                startActivity(new Intent(this, SectionA09Activity.class).putExtra("study_id", study_id));
        }
    }


    private void events_calls() {

        bi.a146.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA147);
            Clear.clearAllFields(bi.cvA148);
            bi.cvA147.setVisibility(View.GONE);
            bi.cvA148.setVisibility(View.GONE);
            if (i == bi.a146a.getId()) {
                bi.cvA147.setVisibility(View.VISIBLE);
                bi.cvA148.setVisibility(View.VISIBLE);
            }
        });

        bi.a149.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA150);
            Clear.clearAllFields(bi.cvA151);
            bi.cvA150.setVisibility(View.GONE);
            bi.cvA151.setVisibility(View.GONE);
            if (i == bi.a149a.getId()) {
                bi.cvA150.setVisibility(View.VISIBLE);
                bi.cvA151.setVisibility(View.VISIBLE);
            }
        });

        bi.a150dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a150mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        bi.a154.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA155);
            bi.cvA155.setVisibility(View.GONE);
            if (i == bi.a154a.getId()) {
                bi.cvA155.setVisibility(View.VISIBLE);
            }
        });

    }

    void value_assignment() {

        study_id = bi.studyid.getText().toString().length() > 0 ? bi.studyid.getText().toString().trim() : "0";

        A4144 = bi.a144a.isChecked() ? "1"
                : bi.a144b.isChecked() ? "2"
                : bi.a14498.isChecked() ? "98"
                : bi.a14499.isChecked() ? "99"
                : "-1";

        A4145 = bi.a145a.isChecked() ? "1"
                : bi.a145b.isChecked() ? "2"
                : bi.a14598.isChecked() ? "98"
                : bi.a14599.isChecked() ? "99"
                : "-1";

        A4146 = bi.a146a.isChecked() ? "1"
                : bi.a146b.isChecked() ? "2"
                : bi.a14698.isChecked() ? "98"
                : bi.a14699.isChecked() ? "99"
                : "-1";

        A4147 = bi.a147a.isChecked() ? "1"
                : bi.a147b.isChecked() ? "2"
                : bi.a14798.isChecked() ? "98"
                : bi.a14799.isChecked() ? "99"
                : "-1";

        A4148 = bi.a148a.isChecked() ? "1"
                : bi.a148b.isChecked() ? "2"
                : bi.a148c.isChecked() ? "3"
                : bi.a148d.isChecked() ? "4"
                : bi.a148e.isChecked() ? "5"
                : bi.a148f.isChecked() ? "6"
                : bi.a148g.isChecked() ? "7"
                : bi.a14896.isChecked() ? "96"
                : bi.a14898.isChecked() ? "98"
                : bi.a14899.isChecked() ? "99"
                : "-1";
        A4148x = bi.a150dx.getText().toString().length() > 0 ? bi.a150dx.getText().toString().trim() : "-1";

        A4149 = bi.a149a.isChecked() ? "1"
                : bi.a149b.isChecked() ? "2"
                : bi.a14998.isChecked() ? "98"
                : bi.a14999.isChecked() ? "99"
                : "-1";

        A4150_u = bi.a150d.isChecked() ? "1"
                : bi.a150m.isChecked() ? "2"
                : bi.a14998.isChecked() ? "98"
                : bi.a14999.isChecked() ? "99"
                : "-1";
        A4150_a = bi.a150dx.getText().toString().length() > 0 ? bi.a150dx.getText().toString().trim() : "-1";
        A4150_b = bi.a150mx.getText().toString().length() > 0 ? bi.a150mx.getText().toString().trim() : "-1";

        A4151 = bi.a151a.isChecked() ? "1"
                : bi.a151b.isChecked() ? "2"
                : bi.a151c.isChecked() ? "3"
                : "-1";

        A4152 = bi.a152a.isChecked() ? "1"
                : bi.a152b.isChecked() ? "2"
                : bi.a15298.isChecked() ? "98"
                : bi.a15299.isChecked() ? "99"
                : "-1";

        A4153 = bi.a153a.isChecked() ? "1"
                : bi.a153b.isChecked() ? "2"
                : bi.a15398.isChecked() ? "98"
                : bi.a15399.isChecked() ? "99"
                : "-1";

        A4154 = bi.a154a.isChecked() ? "1"
                : bi.a154b.isChecked() ? "2"
                : bi.a15498.isChecked() ? "98"
                : bi.a15499.isChecked() ? "99"
                : "-1";

        A4155 = bi.a155a.isChecked() ? "1"
                : bi.a155b.isChecked() ? "2"
                : bi.a15598.isChecked() ? "98"
                : bi.a15599.isChecked() ? "99"
                : "-1";

        A4156 = bi.a156a.isChecked() ? "1"
                : bi.a156b.isChecked() ? "2"
                : bi.a15698.isChecked() ? "98"
                : bi.a15699.isChecked() ? "99"
                : "-1";

        STATUS = "0";
    }

    void insert_data() {

        String query = "insert into A4144_A4156("

                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4144 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4145 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4146 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4147 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4148 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4148x + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4149 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4150_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4150_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4150_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4151 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4152 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4153 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4154 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4155 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.A4156 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4144_A4156.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4144 + "','" +
                A4145 + "','" +
                A4146 + "','" +
                A4147 + "','" +
                A4148 + "','" +
                A4148x + "','" +
                A4149 + "','" +
                A4150_u + "','" +
                A4150_a + "','" +
                A4150_b + "','" +
                A4151 + "','" +
                A4152 + "','" +
                A4153 + "','" +
                A4154 + "','" +
                A4155 + "','" +
                A4156 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "8th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 9);
    }
}
