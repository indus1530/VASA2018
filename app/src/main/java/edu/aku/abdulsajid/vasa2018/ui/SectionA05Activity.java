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
import edu.aku.abdulsajid.vasa2018.databinding.ActivitySectionA05Binding;
import edu.aku.abdulsajid.vasa2018.utils.InputFilterMinMax;

public class SectionA05Activity extends AppCompatActivity {

    String
            study_id,
            A4095,
            A4096,
            A4097_u,
            A4097_a,
            A4097_b,
            A4098,
            A4099_u,
            A4099_a,
            A4099_b,
            A4100,
            A4101_u,
            A4101_a,
            A4101_b,
            A4102,
            A4103,
            A4104,
            A4105,
            A4106,
            A4107,
            A4108,
            STATUS;

    int currentSection;
    ActivitySectionA05Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a05);
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
        Intent c = new Intent(SectionA05Activity.this, A4109_A4125.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }


    private void events_calls() {

        bi.a096.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cva097);
            bi.cva097.setVisibility(View.GONE);
            if (i == bi.a096a.getId()) bi.cva097.setVisibility(View.VISIBLE);
        });

        bi.a097dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a097mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        bi.a098.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cva099);
            bi.cva099.setVisibility(View.GONE);
            if (i == bi.a098a.getId()) bi.cva099.setVisibility(View.VISIBLE);
        });

        bi.a099dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a099mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        bi.a100.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cva101);
            bi.cva101.setVisibility(View.GONE);
            if (i == bi.a100a.getId()) bi.cva101.setVisibility(View.VISIBLE);
        });

        bi.a101dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        bi.a101mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        bi.a102.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA103);
            Clear.clearAllFields(bi.cvA104);
            Clear.clearAllFields(bi.cvA105);
            bi.cvA103.setVisibility(View.GONE);
            bi.cvA104.setVisibility(View.GONE);
            bi.cvA105.setVisibility(View.GONE);
            if (i == bi.a102a.getId()) {
                bi.cvA103.setVisibility(View.VISIBLE);
                bi.cvA104.setVisibility(View.VISIBLE);
                bi.cvA105.setVisibility(View.VISIBLE);
            }
        });

        bi.a106.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA107);
            Clear.clearAllFields(bi.cvA108);
            bi.cvA107.setVisibility(View.GONE);
            bi.cvA108.setVisibility(View.GONE);
            if (i == bi.a106a.getId()) {
                bi.cvA107.setVisibility(View.VISIBLE);
                bi.cvA108.setVisibility(View.VISIBLE);
            }
        });

        bi.a107.setFilters(new InputFilter[]{new InputFilterMinMax(0, 60, 88, 99)});

    }

    void value_assignment() {

        study_id = bi.studyid.getText().toString().length() > 0 ? bi.studyid.getText().toString().trim() : "0";

        A4095 = bi.a095a.isChecked() ? "1"
                : bi.a095b.isChecked() ? "2"
                : bi.a09598.isChecked() ? "98"
                : bi.a09599.isChecked() ? "99"
                : "-1";

        A4096 = bi.a096a.isChecked() ? "1"
                : bi.a096b.isChecked() ? "2"
                : bi.a09698.isChecked() ? "98"
                : bi.a09699.isChecked() ? "99"
                : "-1";

        A4097_u = bi.a097d.isChecked() ? "1"
                : bi.a097m.isChecked() ? "2"
                : bi.a09798.isChecked() ? "98"
                : bi.a09799.isChecked() ? "99"
                : "-1";
        A4097_a = bi.a097dx.getText().toString().length() > 0 ? bi.a097dx.getText().toString().trim() : "-1";
        A4097_b = bi.a097mx.getText().toString().length() > 0 ? bi.a097mx.getText().toString().trim() : "-1";

        A4098 = bi.a098a.isChecked() ? "1"
                : bi.a098b.isChecked() ? "2"
                : bi.a09898.isChecked() ? "98"
                : bi.a09899.isChecked() ? "99"
                : "-1";

        A4099_u = bi.a099d.isChecked() ? "1"
                : bi.a099m.isChecked() ? "2"
                : bi.a09998.isChecked() ? "98"
                : bi.a09999.isChecked() ? "99"
                : "-1";
        A4099_a = bi.a099dx.getText().toString().length() > 0 ? bi.a099dx.getText().toString().trim() : "-1";
        A4099_b = bi.a099mx.getText().toString().length() > 0 ? bi.a099mx.getText().toString().trim() : "-1";

        A4100 = bi.a100a.isChecked() ? "1"
                : bi.a100b.isChecked() ? "2"
                : bi.a10098.isChecked() ? "98"
                : bi.a10099.isChecked() ? "99"
                : "-1";

        A4101_u = bi.a101d.isChecked() ? "1"
                : bi.a099m.isChecked() ? "2"
                : bi.a09998.isChecked() ? "98"
                : bi.a09999.isChecked() ? "99"
                : "-1";
        A4101_a = bi.a101dx.getText().toString().length() > 0 ? bi.a101dx.getText().toString().trim() : "-1";
        A4101_b = bi.a101mx.getText().toString().length() > 0 ? bi.a101mx.getText().toString().trim() : "-1";

        A4102 = bi.a102a.isChecked() ? "1"
                : bi.a102b.isChecked() ? "2"
                : bi.a10298.isChecked() ? "98"
                : bi.a10299.isChecked() ? "99"
                : "-1";

        A4103 = bi.a103a.isChecked() ? "1"
                : bi.a103b.isChecked() ? "2"
                : bi.a10398.isChecked() ? "98"
                : bi.a10399.isChecked() ? "99"
                : "-1";

        A4104 = bi.a104a.isChecked() ? "1"
                : bi.a104b.isChecked() ? "2"
                : bi.a10498.isChecked() ? "98"
                : bi.a10499.isChecked() ? "99"
                : "-1";

        A4105 = bi.a105a.isChecked() ? "1"
                : bi.a105b.isChecked() ? "2"
                : bi.a10598.isChecked() ? "98"
                : bi.a10599.isChecked() ? "99"
                : "-1";

        A4106 = bi.a106a.isChecked() ? "1"
                : bi.a106b.isChecked() ? "2"
                : bi.a10698.isChecked() ? "98"
                : bi.a10699.isChecked() ? "99"
                : "-1";

        A4107 = bi.a107.getText().toString().length() > 0 ? bi.a107.getText().toString().trim() : "-1";

        A4108 = bi.a108a.isChecked() ? "1"
                : bi.a108b.isChecked() ? "2"
                : bi.a10898.isChecked() ? "98"
                : bi.a10899.isChecked() ? "99"
                : "-1";

        STATUS = "0";
    }

    void insert_data() {

        String query = "insert into A4095_A4108("

                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4095 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4096 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4097_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4097_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4097_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4098 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4099_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4099_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4099_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4100 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4101_u + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4101_a + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4101_b + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4102 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4103 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4104 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4105 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4106 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4107 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.A4108 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4095_A4108.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4095 + "','" +
                A4096 + "','" +
                A4097_u + "','" +
                A4097_a + "','" +
                A4097_b + "','" +
                A4098 + "','" +
                A4099_u + "','" +
                A4099_a + "','" +
                A4099_b + "','" +
                A4100 + "','" +
                A4101_u + "','" +
                A4101_a + "','" +
                A4101_b + "','" +
                A4102 + "','" +
                A4103 + "','" +
                A4104 + "','" +
                A4105 + "','" +
                A4106 + "','" +
                A4107 + "','" +
                A4108 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "5th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 6);
    }
}
