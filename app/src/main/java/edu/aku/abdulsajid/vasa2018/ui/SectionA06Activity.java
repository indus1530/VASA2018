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
import edu.aku.abdulsajid.vasa2018.databinding.ActivitySectionA06Binding;
import edu.aku.abdulsajid.vasa2018.utils.InputFilterMinMax;

public class SectionA06Activity extends AppCompatActivity {

    String
            study_id,
            A4109,
            A4110,
            A4111,
            A4112,
            A4113,
            A4114,
            A4115,
            A4116,
            A4117_u,
            A4117_a,
            A4117_b,
            A4118,
            A4119,
            A4120,
            A4121,
            A4122,
            A4123,
            A4124,
            A4125,
            STATUS;

    int currentSection;
    ActivitySectionA06Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a06);
        this.setTitle(getString(R.string.h_a_sec_9));
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
        startActivity(new Intent(SectionA06Activity.this, A4126_A4140.class).putExtra("study_id", study_id));
    }


    private void events_calls() {

        bi.a109.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA110);
            Clear.clearAllFields(bi.cvA111);
            Clear.clearAllFields(bi.cvA112);
            bi.cvA110.setVisibility(View.GONE);
            bi.cvA111.setVisibility(View.GONE);
            bi.cvA112.setVisibility(View.GONE);
            if (i == bi.a109a.getId()) {
                bi.cvA110.setVisibility(View.VISIBLE);
                bi.cvA111.setVisibility(View.VISIBLE);
                bi.cvA112.setVisibility(View.VISIBLE);
            }
        });

        bi.a113.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA114);
            bi.cvA114.setVisibility(View.GONE);
            if (i == bi.a113a.getId()) {
                bi.cvA114.setVisibility(View.VISIBLE);
            }
        });

        bi.a115.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA116);
            Clear.clearAllFields(bi.cvA117);
            bi.cvA116.setVisibility(View.GONE);
            bi.cvA117.setVisibility(View.GONE);
            if (i == bi.a115a.getId()) {
                bi.cvA116.setVisibility(View.VISIBLE);
                bi.cvA117.setVisibility(View.VISIBLE);
            }
        });

        bi.a116.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA117);
            bi.cvA117.setVisibility(View.GONE);
            if (i == bi.a116a.getId()) {
                bi.cvA117.setVisibility(View.VISIBLE);
            }
        });

        bi.a117dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a117mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        bi.a118.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA119);
            Clear.clearAllFields(bi.cvA120);
            Clear.clearAllFields(bi.cvA121);
            Clear.clearAllFields(bi.cvA122);
            bi.cvA119.setVisibility(View.GONE);
            bi.cvA120.setVisibility(View.GONE);
            bi.cvA121.setVisibility(View.GONE);
            bi.cvA122.setVisibility(View.GONE);
            if (i == bi.a118a.getId()) {
                bi.cvA119.setVisibility(View.VISIBLE);
                bi.cvA120.setVisibility(View.VISIBLE);
                bi.cvA121.setVisibility(View.VISIBLE);
                bi.cvA122.setVisibility(View.VISIBLE);
            }
        });

    }


    void value_assignment() {

        study_id = bi.studyid.getText().toString().length() > 0 ? bi.studyid.getText().toString().trim() : "0";

        A4109 = bi.a109a.isChecked() ? "1"
                : bi.a109b.isChecked() ? "2"
                : bi.a10998.isChecked() ? "98"
                : bi.a10999.isChecked() ? "99"
                : "-1";

        A4110 = bi.a110a.isChecked() ? "1"
                : bi.a110b.isChecked() ? "2"
                : bi.a11098.isChecked() ? "98"
                : bi.a11099.isChecked() ? "99"
                : "-1";

        A4111 = bi.a111a.isChecked() ? "1"
                : bi.a111b.isChecked() ? "2"
                : bi.a11198.isChecked() ? "98"
                : bi.a11199.isChecked() ? "99"
                : "-1";

        A4112 = bi.a112a.isChecked() ? "1"
                : bi.a112b.isChecked() ? "2"
                : bi.a11298.isChecked() ? "98"
                : bi.a11299.isChecked() ? "99"
                : "-1";

        A4113 = bi.a113a.isChecked() ? "1"
                : bi.a113b.isChecked() ? "2"
                : bi.a11398.isChecked() ? "98"
                : bi.a11399.isChecked() ? "99"
                : "-1";

        A4114 = bi.a114a.isChecked() ? "1"
                : bi.a114b.isChecked() ? "2"
                : bi.a11498.isChecked() ? "98"
                : bi.a11499.isChecked() ? "99"
                : "-1";

        A4115 = bi.a115a.isChecked() ? "1"
                : bi.a115b.isChecked() ? "2"
                : bi.a11598.isChecked() ? "98"
                : bi.a11599.isChecked() ? "99"
                : "-1";

        A4116 = bi.a116a.isChecked() ? "1"
                : bi.a116b.isChecked() ? "2"
                : bi.a11698.isChecked() ? "98"
                : bi.a11699.isChecked() ? "99"
                : "-1";

        A4117_u = bi.a117d.isChecked() ? "1"
                : bi.a117m.isChecked() ? "2"
                : bi.a11798.isChecked() ? "98"
                : bi.a11799.isChecked() ? "99"
                : "-1";
        A4117_a = bi.a117dx.getText().toString().length() > 0 ? bi.a117dx.getText().toString().trim() : "-1";
        A4117_b = bi.a117mx.getText().toString().length() > 0 ? bi.a117mx.getText().toString().trim() : "-1";

        A4118 = bi.a118a.isChecked() ? "1"
                : bi.a118b.isChecked() ? "2"
                : bi.a11898.isChecked() ? "98"
                : bi.a11899.isChecked() ? "99"
                : "-1";

        A4119 = bi.a119a.isChecked() ? "1"
                : bi.a119b.isChecked() ? "2"
                : bi.a119c.isChecked() ? "3"
                : bi.a119d.isChecked() ? "4"
                : bi.a11998.isChecked() ? "98"
                : bi.a11999.isChecked() ? "99"
                : "-1";

        A4120 = bi.a120a.isChecked() ? "1"
                : bi.a120b.isChecked() ? "2"
                : bi.a120c.isChecked() ? "3"
                : bi.a120d.isChecked() ? "4"
                : bi.a12098.isChecked() ? "98"
                : bi.a12099.isChecked() ? "99"
                : "-1";

        A4121 = bi.a121.getText().toString().length() > 0 ? bi.a121.getText().toString().trim() : "-1";

        A4122 = bi.a122a.isChecked() ? "1"
                : bi.a122b.isChecked() ? "2"
                : bi.a12298.isChecked() ? "98"
                : bi.a12299.isChecked() ? "99"
                : "-1";

        A4123 = bi.a123a.isChecked() ? "1"
                : bi.a123b.isChecked() ? "2"
                : bi.a12398.isChecked() ? "98"
                : bi.a12399.isChecked() ? "99"
                : "-1";

        A4124 = bi.a124a.isChecked() ? "1"
                : bi.a124b.isChecked() ? "2"
                : bi.a12498.isChecked() ? "98"
                : bi.a12499.isChecked() ? "99"
                : "-1";

        A4125 = bi.a125a.isChecked() ? "1"
                : bi.a125b.isChecked() ? "2"
                : bi.a12598.isChecked() ? "98"
                : bi.a12599.isChecked() ? "99"
                : "-1";

        STATUS = "0";


    }


    void insert_data() {

        String query = "insert into A4109_A4125("

                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4109 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4110 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4111 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4112 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4113 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4114 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4115 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4116 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4117_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4117_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4117_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4118 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4119 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4120 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4121 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4122 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4123 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4124 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.A4125 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4109_A4125.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4109 + "','" +
                A4110 + "','" +
                A4111 + "','" +
                A4112 + "','" +
                A4113 + "','" +
                A4114 + "','" +
                A4115 + "','" +
                A4116 + "','" +
                A4117_u + "','" +
                A4117_a + "','" +
                A4117_b + "','" +
                A4118 + "','" +
                A4119 + "','" +
                A4120 + "','" +
                A4121 + "','" +
                A4122 + "','" +
                A4123 + "','" +
                A4124 + "','" +
                A4125 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "6th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }


    boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 7);
    }

}
